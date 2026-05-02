# 📘 Day 2 - Searching and Sorting Algorithms

## 📌 Introduction

Searching and Sorting are fundamental concepts in Data Structures and Algorithms (DSA). These algorithms are widely used in software development to organize data efficiently and retrieve information quickly.

Understanding searching and sorting algorithms improves logical thinking, problem-solving skills, and coding efficiency. These topics are also among the most frequently asked concepts in technical interviews.

---

# 🔍 Searching Algorithms

Searching algorithms are used to find a specific element in a collection of data such as an array or list.

---

# 🔹 Linear Search

## 📖 Concept

Linear Search is the simplest searching algorithm. It checks each element one by one until the target element is found.

This algorithm works on both sorted and unsorted arrays.

---

## ⚙️ Algorithm

1. Start from the first element.
2. Compare each element with the target value.
3. If the element matches, return its position.
4. If the end of the array is reached without finding the element, return "not found".

---

## 💻 Example

```java id="m8ml7o"
int[] arr = {10, 20, 30, 40, 50};
int target = 30;
```

Output:

```text id="mkr4q7"
Element found at index 2
```

---

## ⏱ Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(n)       |
| Worst Case   | O(n)       |

---

## ✅ Advantages

* Simple to understand and implement
* Works on unsorted arrays
* No additional memory required

---

## ❌ Disadvantages

* Slow for large datasets
* Less efficient compared to Binary Search

---

## 🌍 Real-world Applications

* Searching in small datasets
* Basic searching operations
* Finding records in unsorted data

---

# 🔹 Binary Search

## 📖 Concept

Binary Search is an efficient searching algorithm used only on sorted arrays.

Instead of checking elements one by one, Binary Search repeatedly divides the array into two halves until the target element is found.

---

## ⚙️ Algorithm

1. Find the middle element.
2. Compare the middle element with the target value.
3. If matched, return the index.
4. If target is smaller, search left half.
5. If target is greater, search right half.
6. Repeat until the element is found.

---

## 💻 Example

```java id="m0k5s5"
int[] arr = {10, 20, 30, 40, 50};
int target = 40;
```

Output:

```text id="o6x9ul"
Element found at index 3
```

---

## ⏱ Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(log n)   |
| Worst Case   | O(log n)   |

---

## ✅ Advantages

* Very fast for large datasets
* Efficient searching algorithm
* Reduces search space quickly

---

## ❌ Disadvantages

* Works only on sorted arrays
* Slightly more complex than Linear Search

---

## 🌍 Real-world Applications

* Database searching
* Dictionary word search
* Searching in large applications

---

# 🔃 Sorting Algorithms

Sorting algorithms arrange elements in ascending or descending order.

Sorting improves searching efficiency and data organization.

---

# 🔹 Bubble Sort

## 📖 Concept

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

After every iteration, the largest element moves to the end of the array like a bubble rising to the surface.

---

## ⚙️ Algorithm

1. Compare adjacent elements.
2. Swap if left element is greater.
3. Repeat for all elements.
4. Continue until array becomes sorted.

---

## 💻 Example

```java id="vl8q1r"
Input:  5 3 8 4 2
Output: 2 3 4 5 8
```

---

## ⏱ Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(n)       |
| Average Case | O(n²)      |
| Worst Case   | O(n²)      |

---

## ✅ Advantages

* Simple implementation
* Easy to understand

---

## ❌ Disadvantages

* Very slow for large datasets
* Not suitable for efficient applications

---

## 🌍 Real-world Applications

* Educational purposes
* Small datasets

---

# 🔹 Selection Sort

## 📖 Concept

Selection Sort repeatedly selects the smallest element from the unsorted portion and places it at the correct position.

---

## ⚙️ Algorithm

1. Find smallest element.
2. Swap with first unsorted position.
3. Repeat for remaining elements.

---

## ⏱ Time Complexity

```text id="gqv43t"
O(n²)
```

---

## ✅ Advantages

* Easy to implement
* Requires less swapping

---

## ❌ Disadvantages

* Inefficient for large datasets

---

# 🔹 Insertion Sort

## 📖 Concept

Insertion Sort places each element into its correct position similar to arranging playing cards.

---

## ⚙️ Algorithm

1. Start from second element.
2. Compare with previous elements.
3. Insert at correct position.

---

## ⏱ Time Complexity

| Case       | Complexity |
| ---------- | ---------- |
| Best Case  | O(n)       |
| Worst Case | O(n²)      |

---

## ✅ Advantages

* Efficient for small datasets
* Stable sorting algorithm

---

## ❌ Disadvantages

* Slow for large datasets

---

# 🔹 Merge Sort

## 📖 Concept

Merge Sort uses Divide and Conquer technique.

It divides the array into smaller parts, sorts them, and merges them back together.

---

## ⏱ Time Complexity

```text id="q7nm3u"
O(n log n)
```

---

## ✅ Advantages

* Efficient for large datasets
* Stable sorting algorithm

---

## ❌ Disadvantages

* Requires extra memory

---

# 🔹 Quick Sort

## 📖 Concept

Quick Sort selects a pivot element and partitions the array around it.

Elements smaller than pivot move left and larger elements move right.

---

## ⏱ Time Complexity

| Case              | Complexity |
| ----------------- | ---------- |
| Best/Average Case | O(n log n) |
| Worst Case        | O(n²)      |

---

## ✅ Advantages

* Very fast in practice
* Efficient for large datasets

---

## ❌ Disadvantages

* Worst case complexity is high
* Recursive implementation

---

# 📊 Difference Between Searching and Sorting

| Feature | Searching           | Sorting          |
| ------- | ------------------- | ---------------- |
| Purpose | Find element        | Arrange elements |
| Output  | Position of element | Ordered data     |
| Example | Linear Search       | Bubble Sort      |

---

# 🧠 Key Takeaways

* Searching helps retrieve data efficiently.
* Sorting organizes data systematically.
* Binary Search requires sorted arrays.
* Efficient algorithms improve application performance.
* Sorting and Searching are essential interview topics.

---

# ✅ Conclusion

Today I learned important Searching and Sorting algorithms including Linear Search, Binary Search, Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, and Quick Sort.

These algorithms are fundamental in Data Structures and play an important role in coding interviews, software development, and problem-solving.

