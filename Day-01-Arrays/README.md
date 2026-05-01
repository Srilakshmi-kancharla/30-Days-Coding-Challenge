# Day 1 - Arrays in Java

# 📘 Day 1 - Arrays in Java

## 📌 Introduction to Arrays

Arrays are used to store multiple values in a single variable instead of declaring separate variables for each value.

For example, instead of creating different variables like:

```java
String car1 = "Volvo";
String car2 = "BMW";
String car3 = "Ford";
```

we can store all values inside a single array.

---

# 🔹 Declaring an Array

To declare an array, define the datatype followed by square brackets `[]`.

## Syntax

```java
String[] cars;
```

This declares an array variable named `cars` that can store multiple string values.

---

# 🔹 Initializing an Array

Values can be inserted into an array using curly braces `{}` separated by commas.

## Example

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

### Integer Array Example

```java
int[] myNum = {10, 20, 30, 40};
```

---

# 🔹 Accessing Elements of an Array

Each element in an array has an index number.

* Index starts from `0`
* First element → index `0`
* Second element → index `1`

## Example

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

System.out.println(cars[0]);
```

## Output

```text
Volvo
```

---

# 🔹 Array Length

To find the number of elements in an array, use the `length` property.

## Example

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

System.out.println(cars.length);
```

## Output

```text
4
```

---

# 🔹 Creating Arrays Using the `new` Keyword

Arrays can also be created using the `new` keyword by specifying the size.

This creates an empty array with fixed memory allocation.

## Example

```java
String[] cars = new String[4];

cars[0] = "Volvo";
cars[1] = "BMW";
cars[2] = "Ford";
cars[3] = "Mazda";

System.out.println(cars[0]);
```

## Output

```text
Volvo
```

---

# 🔹 Loop Through an Array Using `for` Loop

A regular `for` loop is commonly used to traverse array elements.

## Example

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for(int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
}
```

## Output

```text
Volvo
BMW
Ford
Mazda
```

---

# 🔹 Loop Through an Array Using `for-each` Loop

The `for-each` loop is specially designed to iterate through arrays and collections.

## Syntax

```java
for(type variable : arrayname) {
    // code
}
```

The colon `:` is read as **"in"**.

Meaning:

> For each element in the array, execute the code block.

---

## Example

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for(String car : cars) {
    System.out.println(car);
}
```

## Output

```text
Volvo
BMW
Ford
Mazda
```

---

# 🔹 Difference Between `for` Loop and `for-each` Loop

| Feature         | for Loop               | for-each Loop    |
| --------------- | ---------------------- | ---------------- |
| Uses Index      | ✅ Yes                  | ❌ No             |
| Easier to Read  | ❌ Moderate             | ✅ Yes            |
| Access Position | ✅ Yes                  | ❌ No             |
| Best For        | Index-based operations | Simple traversal |

---

# 🔹 When to Use Which Loop?

## Use `for` Loop When:

* You need index positions
* You want to modify array elements
* You need reverse traversal

## Use `for-each` Loop When:

* You only need element values
* You want cleaner and simpler code
* Read-only traversal is enough

---

# 🌍 Real-World Applications of Arrays

* Student marks management systems
* Employee record storage
* Image processing
* Game score tracking
* Searching and sorting operations

---

# 🧠 Key Takeaways

* Arrays store multiple values of the same datatype.
* Array indexing starts from `0`.
* Arrays have fixed size.
* `length` property gives array size.
* `for` loop and `for-each` loop are used for traversal.
* Arrays are one of the foundational concepts in Data Structures.

---

# 📌 Topics Covered

* Largest Element in an Array
* Smallest Element in an Array
* Second Largest Element
* Reverse an Array
* Check if Array Contains Duplicates
* Check if Array is Sorted
* Searching an Element using Linear Search

---

# 🔹 Largest Element in an Array

### Concept

The largest element is found by comparing each element with the current maximum value.

### Logic

* Assume the first element as largest.
* Traverse the array.
* Update the largest value whenever a bigger element is found.

### Time Complexity

```text id="34r44o"
O(n)
```

### Real-world Example

Finding highest marks among students.

---

# 🔹 Smallest Element in an Array

### Concept

The smallest element is found by comparing all elements with the current minimum value.

### Logic

* Assume the first element as smallest.
* Traverse the array.
* Replace minimum whenever a smaller element is found.

### Time Complexity

```text id="l01h5k"
O(n)
```

### Real-world Example

Finding the minimum temperature recorded.

---

# 🔹 Second Largest Element

### Concept

The second largest element is the value smaller than the largest element but greater than all other elements.

### Logic

* Maintain two variables:

  * largest
  * secondLargest
* Update both values while traversing the array.

### Time Complexity

```text id="s6u3gd"
O(n)
```

### Interview Importance

One of the most commonly asked array interview questions.

---

# 🔹 Reverse an Array

### Concept

Reversing an array means arranging elements in the opposite order.

### Logic

* Use two pointers:

  * one at the beginning
  * one at the end
* Swap elements until both pointers meet.

### Time Complexity

```text id="0z3w5w"
O(n)
```

### Real-world Applications

* Data processing
* String reversal
* Image manipulation algorithms

---

# 🔹 Check if Array Contains Duplicates

### Concept

This problem checks whether an array contains repeated elements.

### Logic

* Compare each element with remaining elements
  OR
* Use a HashSet for efficient duplicate detection.

### Time Complexity

```text id="u8zt2v"
O(n)
```

(using HashSet)

### Real-world Applications

* Checking duplicate usernames
* Detecting repeated records in databases

---

# 🔹 Check if Array is Sorted

### Concept

An array is sorted if every element is smaller than or equal to the next element.

### Logic

* Traverse the array.
* Compare current element with next element.
* If any element is greater than the next, array is not sorted.

### Time Complexity

```text id="0dcrxf"
O(n)
```

### Real-world Applications

* Optimized searching algorithms
* Data organization

---

# 🔹 Searching an Element (Linear Search)

### Concept

Linear Search checks each element one by one until the target element is found.

### Logic

* Start from first element.
* Compare each element with target value.
* If matched, return position.

### Time Complexity

```text id="xv5t4g"
O(n)
```

### Advantages

* Simple to implement
* Works on unsorted arrays

### Real-world Applications

* Finding records in small datasets
* Basic searching operations

---

# 🧠 Key Takeaways

* Arrays are fundamental data structures in programming.
* Traversing arrays using loops is an important skill.
* Array problems improve logical thinking and problem-solving ability.
* Many coding interviews include array-based questions.
* Time complexity plays an important role in optimization.

---

# ✅ Conclusion

Today I practiced important array concepts and problems including largest/smallest element, second largest element, reverse array, duplicate checking, sorted array checking, and linear search.

These concepts strengthen problem-solving skills and build a strong foundation for Data Structures and Algorithms.
