# Red Light, Green Light Practice Problem in Arrays

> **Platform:** `CodeChef` | **Topic:** `Arrays` | **Languages:** `CPP` | [Problem Link](https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/DOLL)

---

## Problem Statement

### Red Light, Green Light
*“You won’t get caught if you hide behind someone.”*

Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.

Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, KKK. Many players saw this trick and also started hiding behind Ali.

Now, there are NNN players standing *between* Gi-Hun and Ali in a straight line, with the ithi^{\text{th}}ith player having height HiH_iHi​. Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.

**Note:**

* Line of sight is a straight line drawn between the topmost point of two objects. Ali is visible to Gi-Hun if nobody between them crosses this line.

* Even if there are some players who have the same height as that of Gi-Hun and Ali, Ali will be visible in Gi-Hun's line of sight.

* Gi-Hun and Ali have the same height.

### Input Format

* The first line of input contains a single integer TTT, denoting the number of test cases. The description of TTT test cases follows.

* The first line of each test case contains two space-separated integers NNN and KKK, denoting the total number of players between Gi-Hun and Ali and the height of both of them respectively.

* The second line of each test case contains NNN space-separated integers, denoting the heights of the players between Gi-Hun and Ali.

### Output Format

For each test case, output in a single line the minimum number of players who need to get shot so that Ali is visible in Gi-Hun's line of sight.

### Constraints

* 1≤T≤1051 \leq T \leq 10^51≤T≤105

* 1≤N≤1051 \leq N \leq 10^51≤N≤105

* 1≤K≤1061 \leq K \leq 10^61≤K≤106

* 1≤Hi≤1061 \leq H_i \leq 10^61≤Hi​≤106 for every 1≤i≤N1 \leq i \leq N1≤i≤N.

* The sum of NNN across all test cases does not exceed 5⋅1055\cdot 10^55⋅105.

### Sample 1:

Input**

Output**

```
3
4 10
2 13 4 16
5 8
9 3 8 8 4
4 6
1 2 3 4
```

```
2
1
0
```

### Explanation:

**Test Case 1:** Gi-Hun and Ali have height 101010. For Ali to be visible to Gi-Hun, the second person (with height 131313) and the fourth person (with height 161616) need to get shot. Hence, the minimum number of players who need to get shot is 222.

**Test Case 2:** Gi-Hun and Ali have height 888. For Ali to be visible to Gi-Hun, the first person (with height 999) needs to get shot. Hence, the minimum number of players who need to get shot is 111.

**Test Case 3:** Nobody needs to get shot because everyone is shorter than Gi-Hun and Ali.

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
wght
}
```

---

*Synced automatically with [DSASync](https://github.com/tanmay9783/DSASync).*