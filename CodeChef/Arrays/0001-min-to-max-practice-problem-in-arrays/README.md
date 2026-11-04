# MIN To MAX Practice Problem in Arrays

> **Platform:** `CodeChef` | **Topic:** `Arrays` | **Languages:** `CPP` | [Problem Link](https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/OPMIN)

---

## Problem Statement

### MIN To MAX
You are given an array AAA of size NNN.

Let MMM be the **minimum** value present in the array initially.

In one operation, you can choose an element AiA_iAi​ (1≤i≤N)(1\le i \le N)(1≤i≤N) and an integer XXX (1≤X≤100)(1\le X \le 100)(1≤X≤100), and set Ai=XA_i = XAi​=X.

Determine the **minimum** number of operations required to make MMM the **maximum** value in the array AAA.

### Input Format

* The first line of input will contain a single integer TTT, denoting the number of test cases.

Each test case consists of multiple lines of input.

* The first line of each test case contains a single integer NNN - the size of the array.

* The next line of each test case contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​ - the elements of the array.

### Output Format

For each test case, output on a new line, the **minimum** number of operations required to make MMM the **maximum** value in the array AAA.

### Constraints

* 1≤T≤1001 \leq T \leq 1001≤T≤100

* 1≤N≤1001 \leq N \leq 1001≤N≤100

* 1≤Ai≤1001 \leq A_i \leq 1001≤Ai​≤100

### Sample 1:

Input**

Output**

```
3
2
1 2
4
2 2 3 4
1
1
```

```
1
2
0
```

### Explanation:

**Test case 111:** The minimum value in the array, MMM, is initially 111. We can use one operation as following:

* Choose A2A_2A2​ and set it as X=1X = 1X=1. Thus, the final array becomes [1,1][1, 1][1,1].

Since all elements of the final array are 111, the maximum value of the array is now 111. It can be shown that this is the minimum number of operations required to do so.

**Test case 222:** The minimum value in the array, MMM, is initially 222. We can use two operations as following:

* Choose A4A_4A4​ and set it as X=2X = 2X=2. Thus, the array becomes [2,2,3,2][2, 2, 3, 2][2,2,3,2].

* Choose A3A_3A3​ and set it as X=2X = 2X=2. Thus, the array becomes [2,2,2,2][2, 2, 2, 2][2,2,2,2].

Since all elements of the final array are 222, the maximum value of the array is now 222.

**Test case 333:** The minimum value in the array, MMM, is initially 111. It is also the maximum value of the array. Hence, no operations are required.

---

## Complexity Analysis

- **Time Complexity:** `O(N) — Linear scan through the input`
- **Space Complexity:** `O(N) — Auxiliary data structure storage`

---

## Solution

### CPP (`optimal.cpp`)

```cpp
class Solution {
public:
    int countNonMinimum(vector<int>& nums) {
        // write your code here 
        
    }
};
```

---

*Synced automatically with [DSASync](https://github.com/tanmay9783/DSASync).*