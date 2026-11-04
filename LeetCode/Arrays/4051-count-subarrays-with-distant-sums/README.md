# 4051. Count Subarrays with Distant Sums

> **Platform:** `LeetCode` | **Topic:** `Arrays` | **Difficulty:** `Hard` | **Languages:** `JAVA, CPP` | [Problem Link](https://leetcode.com/problems/count-subarrays-with-distant-sums/)

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

- **Time Complexity:** `O(N²) — Nested loop traversal`
- **Space Complexity:** `O(N) — Auxiliary data structure storage`

---

## Solution

### JAVA (`solution.java`)

```java
class Solution {
public:
    long long int sol = 0;
    void merge(vector<long long int>& st, vector<long long int>& temp,
               int l, int mid, int r, int goal, int k) {

        int p1 = l;
        int p2 = l;

        for (int j = mid + 1; j <= r; j++) {
            long long int x = st[j] - goal + k;

            while (p1 <= mid && st[p1] < x) {
                p1++;
            }

            sol += mid - p1 + 1;

            x = st[j] - goal - k;

            while (p2 <= mid && st[p2] <= x) {
                p2++;
            }

            sol += p2 - l;
        }

        int i = l;
        int j = mid + 1;
        int idx = l;

        while (i <= mid && j <= r) {
            if (st[i] <= st[j]) {
                temp[idx++] = st[i++];
            } else {
                temp[idx++] = st[j++];
            }
        }

        while (i <= mid) {
            temp[idx++] = st[i++];
        }

        while (j <= r) {
            temp[idx++] = st[j++];
        }

        for (int i = l; i <= r; i++) {
            st[i] = temp[i];
        }
    }
    void solve(vector<long long int>& st, vector<long long int>& temp, int l, int r, int goal, int k){
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        solve(st, temp, l, mid, goal, k);
        solve(st, temp, mid + 1, r, goal, k);
        merge(st, temp, l, mid, r, goal, k);
    }
    long long distantSubarrays(vector<int>& nums, int goal, int k) {
        long long int n = nums.size();
        if (k == 0) {
            return 1ll * n * (n + 1) / 2;
        }
        vector<long long int> st;
        vector<long long int> temp(n + 1);
        long long int pre = 0;
        st.push_back(0);
        for (auto it : nums) {
            pre += it;
            st.push_back(pre);
        }
        solve(st, temp, 0, n, goal, k);
        return sol;
    }
};
```

### CPP (`solution.cpp`)

```cpp
class Solution {
public:
    long long int sol = 0;
    void merge(vector<long long int>& st, vector<long long int>& temp,
               int l, int mid, int r, int goal, int k) {

        int p1 = l;
        int p2 = l;

        for (int j = mid + 1; j <= r; j++) {
            long long int x = st[j] - goal + k;

            while (p1 <= mid && st[p1] < x) {
                p1++;
            }

            sol += mid - p1 + 1;

            x = st[j] - goal - k;

            while (p2 <= mid && st[p2] <= x) {
                p2++;
            }

            sol += p2 - l;
        }

        int i = l;
        int j = mid + 1;
        int idx = l;

        while (i <= mid && j <= r) {
            if (st[i] <= st[j]) {
                temp[idx++] = st[i++];
            } else {
                temp[idx++] = st[j++];
            }
        }

        while (i <= mid) {
            temp[idx++] = st[i++];
        }

        while (j <= r) {
            temp[idx++] = st[j++];
        }

        for (int i = l; i <= r; i++) {
            st[i] = temp[i];
        }
    }
    void solve(vector<long long int>& st, vector<long long int>& temp, int l, int r, int goal, int k){
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        solve(st, temp, l, mid, goal, k);
        solve(st, temp, mid + 1, r, goal, k);
        merge(st, temp, l, mid, r, goal, k);
    }
    long long distantSubarrays(vector<int>& nums, int goal, int k) {
        long long int n = nums.size();
        if (k == 0) {
            return 1ll * n * (n + 1) / 2;
        }
        vector<long long int> st;
        vector<long long int> temp(n + 1);
        long long int pre = 0;
        st.push_back(0);
        for (auto it : nums) {
            pre += it;
            st.push_back(pre);
        }
        solve(st, temp, 0, n, goal, k);
        return sol;
    }
};
```

---

*Synced automatically with [DSASync](https://github.com/tanmay9783/DSASync).*