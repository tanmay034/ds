# 4051. Count Subarrays with Distant Sums

> **Platform:** `LeetCode` | **Topic:** `Arrays` | **Difficulty:** `Hard` | **Languages:** `JAVA, CPP, PYTHON` | [Problem Link](https://leetcode.com/problems/count-subarrays-with-distant-sums/description/)

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

- **Time Complexity:** `O(N) — Linear scan through the input`
- **Space Complexity:** `O(1) — Constant auxiliary space (in-place)`

---

## Solution

### JAVA (`solution.java`)

```java
Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/156.0.0.0 Safari/537.36
```

### CPP (`solution.cpp`)

```cpp
class Solution:
    def distantSubarrays(self, nums: list[int], goal: int, k: int) -> int:
        #count the number of subarrays with disticnt sums


        #we are given goal ,  k 

        #the subarray is called distinct iff abs difference between its 

        #sum and goal is >= k 


        #(prefix[j]-prefix[i-1])>=k+goal is called distant 

        #pref-k-goal>=past 

        #so i need how many are greater than this 
        #find number of distant subarrays 
        #easyy sortedlist we need 
        sl=SortedList()
        pref=0
        if k==0:
            # abs(val)>=0
            return (len(nums)*(len(nums)+1))//2
        cnt=0
        sl.add(pref)
        for val in nums:
            pref+=val
            #now we need prefix greater 
            past=pref-k-goal
            cnt+=sl.bisect_right(past)
            # if k==0:
                # continue
            future=pref-goal+k
            cnt+=(len(sl)-sl.bisect_left(future))
            sl.add(pref)
        return cnt
```

### PYTHON (`solution.py`)

```python
class Solution:
    def distantSubarrays(self, nums: list[int], goal: int, k: int) -> int:
        #count the number of subarrays with disticnt sums


        #we are given goal ,  k 

        #the subarray is called distinct iff abs difference between its 

        #sum and goal is >= k 


        #(prefix[j]-prefix[i-1])>=k+goal is called distant 

        #pref-k-goal>=past 

        #so i need how many are greater than this 
        #find number of distant subarrays 
        #easyy sortedlist we need 
        sl=SortedList()
        pref=0
        if k==0:
            # abs(val)>=0
            return (len(nums)*(len(nums)+1))//2
        cnt=0
        sl.add(pref)
        for val in nums:
            pref+=val
            #now we need prefix greater 
            past=pref-k-goal
            cnt+=sl.bisect_right(past)
            # if k==0:
                # continue
            future=pref-goal+k
            cnt+=(len(sl)-sl.bisect_left(future))
            sl.add(pref)
        return cnt
```

---

*Synced automatically with [DSASync](https://github.com/tanmay9783/DSASync).*