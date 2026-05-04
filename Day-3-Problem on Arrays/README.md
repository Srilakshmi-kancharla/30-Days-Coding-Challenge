# 📘 Day 3 - Important Array Interview Problems

## 📌 Topics Covered

1. Maximum Subarray Sum using Kadane’s Algorithm
2. Pair Sum Problem
3. Majority Element

---

# 🔹 1. Maximum Subarray Sum using Kadane’s Algorithm

## 📖 Problem Statement

Given an integer array, find the contiguous subarray with the largest sum and return that sum.

---

## 📖 Concept

Kadane’s Algorithm is an efficient approach used to solve the Maximum Subarray Sum problem.

Instead of checking all possible subarrays, the algorithm keeps track of the current subarray sum and resets it whenever the sum becomes negative.

This helps achieve an optimized solution.

---

## ⚙️ Algorithm

1. Initialize:

   * `currentSum = 0`
   * `maxSum = Integer.MIN_VALUE`

2. Traverse the array:

   * Add current element to `currentSum`
   * Update `maxSum`
   * If `currentSum < 0`, reset it to `0`

3. Return `maxSum`

---

## 💻 Example

```java id="8mj4d8"
Input:  [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
```

Explanation:

```text id="4ngjha"
Subarray: [4, -1, 2, 1]
Sum = 6
```

---

## ⏱ Time Complexity

```text id="i8ghdc"
O(n)
```

---

## ✅ Advantages

* Efficient solution
* Optimized time complexity
* Frequently asked in interviews

---

## 🌍 Real-world Applications

* Stock market profit analysis
* Signal processing
* Data analytics

---

# 🔹 2. Pair Sum Problem

## 📖 Problem Statement

Given an array and a target value, find whether any two elements in the array add up to the target.

---

## 📖 Concept

The Pair Sum problem checks if two numbers in an array produce a given target sum.

This problem can be solved using:

* Nested loops
* HashMap
* Two Pointer technique (for sorted arrays)

---

## ⚙️ Algorithm (Brute Force)

1. Traverse the array using two loops.
2. Check if:

   ```text id="59y2vd"
   arr[i] + arr[j] == target
   ```
3. If found, return the pair.

---

## 💻 Example

```java id="0tw3lg"
Input:  [2, 7, 11, 15]
Target: 9

Output: [2, 7]
```

---

## ⏱ Time Complexity

| Approach    | Complexity |
| ----------- | ---------- |
| Brute Force | O(n²)      |
| HashMap     | O(n)       |

---

## ✅ Advantages

* Improves logical thinking
* Introduces HashMap optimization
* Important interview problem

---

## 🌍 Real-world Applications

* Financial transaction analysis
* Target matching systems
* Recommendation systems

---

# 🔹 3. Majority Element

## 📖 Problem Statement

Find the element that appears more than `n/2` times in the array.

---

## 📖 Concept

A Majority Element is an element whose frequency is greater than half the size of the array.

This problem is commonly solved using:

* HashMap counting
* Boyer-Moore Voting Algorithm

---

## ⚙️ Boyer-Moore Voting Algorithm

### Steps

1. Maintain:

   * `candidate`
   * `count`

2. Traverse the array:

   * If count becomes `0`, choose new candidate
   * Increment count if same element
   * Decrement count otherwise

3. Final candidate becomes majority element.

---

## 💻 Example

```java id="jlwmem"
Input:  [2, 2, 1, 1, 1, 2, 2]
Output: 2
```

---

## ⏱ Time Complexity

```text id="9jlwm8"
O(n)
```

---

## ✅ Advantages

* Optimized solution
* Constant space complexity
* Very important interview question

---

## 🌍 Real-world Applications

* Voting systems
* Data frequency analysis
* Trend detection systems

---

# 📊 Comparison of Problems

| Problem            | Best Time Complexity |
| ------------------ | -------------------- |
| Kadane’s Algorithm | O(n)                 |
| Pair Sum (HashMap) | O(n)                 |
| Majority Element   | O(n)                 |

---

# 🧠 Key Takeaways

* Kadane’s Algorithm solves maximum subarray problems efficiently.
* Pair Sum introduces optimization using HashMap and Two Pointers.
* Majority Element uses the Boyer-Moore Voting Algorithm.
* These are among the most frequently asked DSA interview problems.
* Time complexity optimization is important in coding interviews.

---

# ✅ Conclusion

Today I practiced three important DSA interview problems: Maximum Subarray Sum using Kadane’s Algorithm, Pair Sum, and Majority Element.

These problems improved my understanding of array traversal, optimization techniques, and efficient problem-solving approaches commonly used in coding interviews.

