# 11.1 Recursive Binary Search

#### **Objective**  
In this assignment, you will implement a **binary search** using recursion. Binary search is an efficient searching algorithm that works on sorted lists by repeatedly dividing the search space in half.

---

### **Problem Description**  
You will write a recursive function that implements **binary search** to find a target value in a sorted list. The function should return the **index** of the target value if found, otherwise return `-1`.

---

### **Function Signature**  
Your function should follow this format:

```python
def binary_search_recursive(arr, target, left, right):
    """
    Recursively searches for a target value in a sorted array using binary search.

    Parameters:
        arr (list): A sorted list of numbers.
        target (int): The value to search for.
        left (int): The starting index of the search range.
        right (int): The ending index of the search range.

    Returns:
        int: The index of the target if found, otherwise -1.
    """
```

---

### **Requirements**
1. The function should use **recursion** (not loops).
2. The function should take **four parameters**:  
   - `arr` → the sorted list  
   - `target` → the value to find  
   - `left` → the starting index  
   - `right` → the ending index  
3. If the target is found, return the **index** of the target.
4. If the target is **not found**, return `-1`.
5. Implement a **test case** to verify your function.

---

### **Example Runs**
#### **Example 1**
```python
arr = [1, 3, 5, 7, 9, 11, 13, 15]
target = 7
print(binary_search_recursive(arr, target, 0, len(arr) - 1))
```
**Output:**  
```
3  # (7 is at index 3)
```

#### **Example 2**
```python
arr = [2, 4, 6, 8, 10, 12, 14, 16]
target = 5
print(binary_search_recursive(arr, target, 0, len(arr) - 1))
```
**Output:**  
```
-1  # (5 is not in the list)
```

---

