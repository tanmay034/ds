# 4051. Count Subarrays with Distant Sums

> **Platform:** `LeetCode` | **Topic:** `Arrays` | **Difficulty:** `Hard` | **Languages:** `JAVA` | [Problem Link](https://leetcode.com/problems/count-subarrays-with-distant-sums/solutions/)

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
    int countGoodRotations(vector<int>& nums) {
        
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countGoodRotations(vector<int>& nums) {
        
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countGoodRotations(vector<int>& nums) {
        
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size(), same = 0;
        for (int i = 0; i < n; ++i) 
            same += s[i] == s[(i + 1) % n];
        return k == same - 1 ? same : k == same ? n - same : 0;
    }
};
```

---

*Synced automatically with [DSA Vault](https://github.com/tanmay9783/dsa-vault).*