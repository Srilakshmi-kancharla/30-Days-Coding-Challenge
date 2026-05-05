# 📘 Day 4 - Time Complexity & Space Complexity

## 📌 Introduction

Time Complexity and Space Complexity are important concepts in Data Structures and Algorithms (DSA). They help measure how efficient an algorithm is in terms of execution time and memory usage.

Understanding complexity analysis is essential for writing optimized programs and solving coding interview problems efficiently.

---

# ⏱ Time Complexity

## 📖 Definition

Time Complexity measures the amount of time an algorithm takes to execute as the input size increases.

It describes the growth rate of an algorithm rather than the exact execution time.

Time Complexity is represented using **Big O Notation**.

---

# 🔹 Why Time Complexity is Important

* Helps compare different algorithms
* Improves program performance
* Reduces unnecessary computations
* Important for coding interviews
* Useful for handling large datasets

---

# 🔹 Big O Notation

Big O Notation represents the worst-case complexity of an algorithm.

It shows how the running time grows with input size.

---

# 🔹 Common Time Complexities

| Complexity | Name              | Example                 |
| ---------- | ----------------- | ----------------------- |
| O(1)       | Constant Time     | Accessing array element |
| O(log n)   | Logarithmic Time  | Binary Search           |
| O(n)       | Linear Time       | Linear Search           |
| O(n log n) | Linearithmic Time | Merge Sort              |
| O(n²)      | Quadratic Time    | Bubble Sort             |
| O(2ⁿ)      | Exponential Time  | Recursive Fibonacci     |

---

# 🔹 O(1) - Constant Time

## 📖 Concept

Execution time remains constant regardless of input size.

## Example

```java id="x1bz7g"
int[] arr = {10, 20, 30};
System.out.println(arr[0]);
```

### Time Complexity

```text id="2yt3q9"
O(1)
```

---

# 🔹 O(n) - Linear Time

## 📖 Concept

Execution time increases linearly with input size.

## Example

```java id="8l0jfh"
for(int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Time Complexity

```text id="of87yo"
O(n)
```

---

# 🔹 O(n²) - Quadratic Time

## 📖 Concept

Execution time increases quadratically because of nested loops.

## Example

```java id="x8f6a4"
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

### Time Complexity

```text id="59lg8s"
O(n²)
```

---

# 🔹 O(log n) - Logarithmic Time

## 📖 Concept

Input size reduces by half in every step.

## Example

Binary Search Algorithm

### Time Complexity

```text id="x3fzf7"
O(log n)
```

---

# 🔹 O(n log n) - Linearithmic Time

## 📖 Concept

Combination of linear and logarithmic operations.

## Example

* Merge Sort
* Quick Sort (average case)

### Time Complexity

```text id="5r3qqd"
O(n log n)
```

---

# 🧠 Best, Average, and Worst Case Complexity

| Case         | Meaning                |
| ------------ | ---------------------- |
| Best Case    | Minimum execution time |
| Average Case | Typical execution time |
| Worst Case   | Maximum execution time |

---

# 💾 Space Complexity

## 📖 Definition

Space Complexity measures the amount of memory used by an algorithm during execution.

It includes:

* Input space
* Auxiliary space

---

# 🔹 Why Space Complexity is Important

* Helps optimize memory usage
* Important for large-scale applications
* Prevents memory overflow
* Improves application efficiency

---

# 🔹 Common Space Complexities

| Complexity | Meaning                    |
| ---------- | -------------------------- |
| O(1)       | Constant memory usage      |
| O(n)       | Memory grows linearly      |
| O(n²)      | Memory grows quadratically |

---

# 🔹 O(1) Space Complexity

## 📖 Concept

Algorithm uses fixed memory regardless of input size.

## Example

```java id="53i2zg"
int a = 10;
int b = 20;
int sum = a + b;
```

### Space Complexity

```text id="o5y7v0"
O(1)
```

---

# 🔹 O(n) Space Complexity

## 📖 Concept

Memory usage grows with input size.

## Example

```java id="dr5o7y"
int[] arr = new int[n];
```

### Space Complexity

```text id="ys3grg"
O(n)
```

---

# 📊 Difference Between Time Complexity and Space Complexity

| Feature  | Time Complexity | Space Complexity |
| -------- | --------------- | ---------------- |
| Measures | Execution time  | Memory usage     |
| Focus    | Speed           | Storage          |
| Example  | O(n)            | O(n)             |

---

# 🌍 Real-world Importance

* Used in software optimization
* Important in competitive programming
* Helps design scalable applications
* Improves performance of applications handling large data

---

# 🧠 Key Takeaways

* Time Complexity measures execution speed.
* Space Complexity measures memory usage.
* Big O Notation represents algorithm efficiency.
* Efficient algorithms improve performance.
* Complexity analysis is essential in coding interviews.

---

# ✅ Conclusion

Today I learned about Time Complexity and Space Complexity, which are essential concepts in Data Structures and Algorithms.

I understood different types of complexities such as O(1), O(n), O(log n), O(n²), and O(n log n), along with their importance in optimizing algorithms and improving program performance.
