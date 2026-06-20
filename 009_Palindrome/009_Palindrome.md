# 🔢 LeetCode Problem #9: Palindrome Number 🪞

## 📝 Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number is a number that reads the same forward and backward.

---

## 📌 Example 1

### Input

```text
x = 121
```

### Output

```text
true
```

### Explanation

```text
121 → Forward
121 → Backward
```

Both are the same, so it is a palindrome.

---

## 📌 Example 2

### Input

```text
x = -121
```

### Output

```text
false
```

### Explanation

```text
Forward  = -121
Backward = 121-
```

Since they are not the same, it is not a palindrome.

---

## 📌 Example 3

### Input

```text
x = 10
```

### Output

```text
false
```

### Explanation

```text
Forward  = 10
Backward = 01
```

Since they are not the same, it is not a palindrome.

---

## 🔒 Constraints

```text
-2³¹ <= x <= 2³¹ - 1
```

---

## 🎯 Goal

Determine whether the given integer remains the same when its digits are reversed.

If it remains the same, return `true`; otherwise, return `false`.
