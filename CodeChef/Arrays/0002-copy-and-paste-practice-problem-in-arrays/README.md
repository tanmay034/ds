# Copy and Paste Practice Problem in Arrays

> **Platform:** `CodeChef` | **Topic:** `Arrays` | **Languages:** `CPP` | [Problem Link](https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/NCOPIES)

---

## Problem Statement

### Copy and Paste
Chef has binary string AAA of length NNN. He constructs a new binary string BBB by concatenating MMM copies of AAA together. For example, if A="10010"A = \texttt{"10010"}A="10010", M=3M = 3M=3, then B="100101001010010"B = \texttt{"100101001010010"}B="100101001010010".

Chef calls an index iii (1≤i≤N⋅M)(1 \le i \le N \cdot M)(1≤i≤N⋅M) *good* if:

* prefi=sufi+1pref_i = suf_{i + 1}prefi​=sufi+1​.

Here, prefj=B1+B2+…+Bjpref_j = B_1 + B_2 + \ldots + B_jprefj​=B1​+B2​+…+Bj​ and
sufj=Bj+Bj+1+…+BN⋅Msuf_j = B_{j} + B_{j + 1} + \ldots + B_{N \cdot M}sufj​=Bj​+Bj+1​+…+BN⋅M​ (Note that sufN⋅M+1=0suf_{N \cdot M + 1} = 0sufN⋅M+1​=0 by definition)

Chef wants to find the number of good indices in BBB. Can you help him do so?

### Input Format

* The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

* The first line of each test case contains two space-separated integers NNN and MMM — the length of the binary string AAA and the number of times AAA is concatenated to form BBB.

* The second line of each test case contains a binary string AAA of length NNN containing 000s and 111s only.

### Output Format

For each test case, output the number of good indices in BBB.

### Constraints

* 1≤T≤1051 \leq T \leq 10^51≤T≤105

* 1≤N,M≤1051 \leq N, M \leq 10^51≤N,M≤105

* AAA is a binary string, i.e, contains only the characters 000 and 111.

* The sum of NNN over all test cases does not exceed 2⋅1052 \cdot 10^52⋅105.

* The sum of MMM over all test cases does not exceed 2⋅1052 \cdot 10^52⋅105.

### Sample 1:

Input**

Output**

```
3
2 2
00
2 4
11
3 3
101
```

```
4
1
2
```

### Explanation:

**Test case 111:** B="0000"B = \texttt{"0000"}B="0000". In this string, all the indices are good.

**Test case 222:** B="11111111"B = \texttt{"11111111"}B="11111111". In this string, only i=4i = 4i=4 is good.

**Test case 333:** B="101101101"B = \texttt{"101101101"}B="101101101". In this string, i=4i = 4i=4 and i=5i = 5i=5 are good.

---

## Complexity Analysis

- **Time Complexity:** `O(N) — Linear scan through the input`
- **Space Complexity:** `O(1) — Constant auxiliary space (in-place)`

---

## Solution

### CPP (`optimal.cpp`)

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here 
hjghfcxfbsdgbdsgba
int
}
```

---

*Synced automatically with [DSASync](https://github.com/tanmay9783/DSASync).*