# 📘 Day 5 - LeetCode Problems

## 📌 Problems Covered

1. LeetCode 1 - Two Sum
2. LeetCode 217 - Contains Duplicate
3. LeetCode 219 - Contains Duplicate II
4. LeetCode 242 - Valid Anagram
5. LeetCode 49 - Group Anagrams

---

# 🔹 1. Two Sum (LeetCode 1)

## 📖 Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

---

## 📖 Concept

The optimized approach uses a `HashMap` to store elements and their indices while traversing the array.

This avoids using nested loops and improves efficiency.

---

## ⚙️ Algorithm

1. Create a HashMap.
2. Traverse the array.
3. Calculate:

   ```text id="9v80f6"
   complement = target - nums[i]
   ```
4. Check if complement exists in HashMap.
5. If found, return indices.
6. Otherwise, store current element.

---

## ⏱ Time Complexity

```text id="zq89lq"
O(n)
```

---

## 💾 Space Complexity

```text id="c7s7p7"
O(n)
```

---

# 🔹 2. Contains Duplicate (LeetCode 217)

## 📖 Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, otherwise return `false`.

---

## 📖 Concept

This problem checks whether duplicate elements exist in the array.

A `HashSet` is used because it stores only unique elements.

---

## ⚙️ Algorithm

1. Create a HashSet.
2. Traverse the array.
3. If element already exists in HashSet:

   * Return true.
4. Otherwise, add element to HashSet.
5. If traversal completes:

   * Return false.

---

## ⏱ Time Complexity

```text id="l6tm70"
O(n)
```

---

## 💾 Space Complexity

```text id="mjlwm0"
O(n)
```

---

## 🌍 Key Learning

* Efficient duplicate detection
* HashSet usage
* Optimized searching

---

# 🔹 3. Contains Duplicate II (LeetCode 219)

## 📖 Problem Statement

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` such that:

```text id="sh59d2"
nums[i] == nums[j]
```

and

```text id="4azl0i"
|i - j| <= k
```

---

## 📖 Concept

This problem checks whether duplicate elements exist within a specific distance.

A `HashMap` is used to store the latest index of elements.

---

## ⚙️ Algorithm

1. Traverse array.
2. If element already exists:

   * Check index difference.
3. If difference ≤ k:

   * Return true.
4. Update latest index.

---

## ⏱ Time Complexity

```text id="0a2bcm"
O(n)
```

---

## 💾 Space Complexity

```text id="jfy6m7"
O(n)
```

---

# 🔹 4. Valid Anagram (LeetCode 242)

## 📖 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`.

---

## 📖 Concept

Two strings are anagrams if they contain the same characters with the same frequency.

This problem can be solved using frequency counting.

---

## ⚙️ Algorithm

1. Check string lengths.
2. Create frequency array.
3. Increment counts for first string.
4. Decrement counts for second string.
5. If all counts become zero:

   * Strings are anagrams.

---

## ⏱ Time Complexity

```text id="p8nm3m"
O(n)
```

---

## 💾 Space Complexity

```text id="zkkhpf"
O(1)
```

---

## 🌍 Key Learning

* Frequency counting
* String traversal
* Character manipulation

---

# 🔹 5. Group Anagrams (LeetCode 49)

## 📖 Problem Statement

Given an array of strings, group all anagrams together.

---

## 📖 Concept

Words that become identical after sorting belong to the same anagram group.

A `HashMap` stores grouped strings.

---

## ⚙️ Algorithm

1. Traverse each string.
2. Sort characters of string.
3. Use sorted string as key.
4. Store original strings in same group.

---

## ⏱ Time Complexity

```text id="s81c8l"
O(n × k log k)
```

Where:

* `n` = number of strings
* `k` = maximum string length

---

## 💾 Space Complexity

```text id="17e7wm"
O(n × k)
```

---

## 🌍 Key Learning

* HashMap grouping
* Sorting strings
* Pattern recognition

---

# 📊 Problems and Concepts Used

| Problem               | Main Concept             |
| --------------------- | ------------------------ |
| Two Sum               | HashMap                  |
| Contains Duplicate    | HashSet                  |
| Contains Duplicate II | HashMap + Index Tracking |
| Valid Anagram         | Frequency Counting       |
| Group Anagrams        | HashMap + Sorting        |

---

# 🧠 Key Takeaways

* HashMap and HashSet are powerful data structures.
* Frequency counting is useful for string problems.
* Optimization reduces unnecessary computations.
* LeetCode problems improve coding and logical thinking skills.
* Understanding patterns helps solve multiple interview questions efficiently.

---

# ✅ Conclusion

Today I solved five important LeetCode problems: Two Sum, Contains Duplicate, Contains Duplicate II, Valid Anagram, and Group Anagrams.

These problems improved my understanding of HashMap, HashSet, frequency counting, string manipulation, and optimized problem-solving techniques commonly used in coding interviews.
