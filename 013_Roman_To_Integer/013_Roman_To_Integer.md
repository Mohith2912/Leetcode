# 🚀 LeetCode Problem #13: Roman to Integer 🎯

## 📝 Problem Statement

Roman numerals are represented by seven different symbols:

| Symbol | Value |
| ------ | ----- |
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example:

* **2** is written as **II** (1 + 1)
* **12** is written as **XII** (10 + 1 + 1)
* **27** is written as **XXVII** (10 + 10 + 5 + 1 + 1)

Roman numerals are usually written from largest to smallest from left to right.

However, there are six special subtraction cases:

* IV = 4
* IX = 9
* XL = 40
* XC = 90
* CD = 400
* CM = 900

Given a Roman numeral string `s`, convert it to an integer.

---

## 📌 Example 1

### Input

```text
s = "III"
```

### Output

```text
3
```

### Explanation

```text
III = 1 + 1 + 1 = 3
```

---

## 📌 Example 2

### Input

```text
s = "LVIII"
```

### Output

```text
58
```

### Explanation

```text
L = 50
V = 5
III = 3

50 + 5 + 3 = 58
```

---

## 📌 Example 3

### Input

```text
s = "MCMXCIV"
```

### Output

```text
1994
```

### Explanation

```text
M = 1000
CM = 900
XC = 90
IV = 4

1000 + 900 + 90 + 4 = 1994
```

---

## 🔒 Constraints

```text
1 <= s.length <= 15

s contains only the characters:
('I', 'V', 'X', 'L', 'C', 'D', 'M')

It is guaranteed that s is a valid Roman numeral.
```

---

## 🎯 Goal

Convert the given Roman numeral string into its corresponding integer value while correctly handling both normal and subtraction cases.
