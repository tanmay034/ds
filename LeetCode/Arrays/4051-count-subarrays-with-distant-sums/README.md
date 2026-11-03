# 4051. Count Subarrays with Distant Sums

> **Platform:** `LeetCode` | **Topic:** `Arrays` | **Difficulty:** `Hard` | **Languages:** `JAVA` | [Problem Link](https://leetcode.com/problems/count-subarrays-with-distant-sums/description/)

---

## Problem Statement

You are given an integer array `nums` and two integers `goal` and `k`.

A  `nums[i..j]` is considered **distant** if the **absolute difference** between its sum and `goal` is **at least** `k`.

Return the number of **distant** subarrays.

 

**Example 1:**

**Input:** nums = [1,2,1], goal = 4, k = 1

**Output:** 5

**Explanation:**

The distant subarrays for `k = 1` are:

`i``j``nums[i..j]`Sum`abs(sum - goal)`

00`[1]`13

11`[2]`22

22`[1]`13

01`[1, 2]`31

12`[2, 1]`31

Thus, the answer is 5.

**Example 2:**

**Input:** nums = [2,-1,3], goal = 2, k = 2

**Output:** 2

**Explanation:**

The distant subarrays for `k = 2` are:

`i``j``nums[i..j]`Sum`abs(sum - goal)`

11`[-1]`-13

02`[2, -1, 3]`42

Thus, the answer is 2.

**Example 3:**

**Input:** nums = [-3,1,2], goal = 0, k = 3

**Output:** 2

**Explanation:**

The distant subarrays for `k = 3` are:

`i``j``nums[i..j]`Sum`abs(sum - goal)`

00`[-3]`-33

12`[1, 2]`33

Thus, the answer is 2.

 

**Constraints:**

* `1 <= nums.length <= 10^5`

* `-10^9 <= nums[i] <= 10^9`

* `-10^9 <= goal <= 10^9`

* `0 <= k <= 10^9`

---

## Complexity Analysis

- **Time Complexity:** `O(N log N) — Sorting dominant`
- **Space Complexity:** `O(1) — Constant auxiliary space (in-place)`

---

## Solution

### JAVA (`solution.java`)

```java
class Solution {

    static class Fenwick {
        int[] tree;

        Fenwick(int n) {
            tree = new int[n + 1];
        }

        void add(int index, int value) {
            while (index < tree.length) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int query(int index) {
            int sum = 0;

            while (index > 0) {
                sum += tree[index];
                index -= index & -index;
            }

            return sum;
        }

        int rangeQuery(int left, int right) {
            if (left > right) {
                return 0;
            }

            return query(right) - query(left - 1);
        }
    }

    static int lowerBound(long[] arr, int size, long target) {
        int left = 0;
        int right = size;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    static int upperBound(long[] arr, int size, long target) {
        int left = 0;
        int right = size;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public long distantSubarrays(int[] nums, int goal, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long[] sorted = Arrays.copyOf(prefix, n + 1);
        Arrays.sort(sorted);

        int m = 0;

        for (int i = 0; i < sorted.length; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                sorted[m++] = sorted[i];
            }
        }

        Fenwick bit = new Fenwick(m);
        long close = 0;

        for (int j = 0; j <= n; j++) {
            long current = prefix[j];

            long lowerValue = current - ((long) goal + k);
            long upperValue = current - ((long) goal - k);

            int left = upperBound(sorted, m, lowerValue);
            int right = lowerBound(sorted, m, upperValue) - 1;

            if (left <= right) {
                close += bit.rangeQuery(left + 1, right + 1);
            }

            int position = lowerBound(sorted, m, current);
            bit.add(position + 1, 1);
        }

        long total = (long) n * (n + 1) / 2;
        return total - close;
    }
}
```

---

*Synced automatically with [DSA Vault](https://github.com/tanmay9783/dsa-vault).*