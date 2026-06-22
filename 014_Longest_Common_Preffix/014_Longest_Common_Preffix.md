# 🚀 LeetCode Problem #14: Longest Common Prefix 🎯

## 📝 Problem Statement

Write a function to find the **longest common prefix string** amongst an array of strings.

If there is no common prefix, return an empty string `""`.

---

## 📌 Example 1

### Input

```text
strs = ["flower","flow","flight"]
```

### Output

```text
"fl"
```

### Explanation

```text
flower
flow
flight

Common Prefix = "fl"
```

---

## 📌 Example 2

### Input

```text
strs = ["dog","racecar","car"]
```

### Output

```text
""
```

### Explanation

```text
dog
racecar
car

No common starting characters.
So return ""
```

---

## 📌 Example 3

### Input

```text
strs = ["interview","internet","internal","into"]
```

### Output

```text
"int"
```

### Explanation

```text
interview
internet
internal
into

Common Prefix = "int"
```

---

## 🔒 Constraints

```text
1 <= strs.length <= 200

0 <= strs[i].length <= 200

strs[i] consists of only lowercase English letters.
```

---

## 🎯 Goal

Find the **longest common prefix** among all strings in the given array.

A prefix is a sequence of characters that appears at the beginning of a string.

Return the longest prefix shared by every string in the array.

If no common prefix exists, return an empty string `""`.

---

## 💡 LeetCode Function Signature

### Python

```python
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
```

---

## ✅ Expected Results

| Input | Output |
|--------|--------|
| `["flower","flow","flight"]` | `"fl"` |
| `["dog","racecar","car"]` | `""` |
| `["apple","app","application"]` | `"app"` |
| `["coding","code","coder"]` | `"cod"` |

---

## 🧠 Hint

```text
Take the first string as a reference.

Compare each character with the corresponding
character in all other strings.

As soon as a mismatch is found,
stop and return the prefix built so far.

If the first characters themselves do not match,
return an empty string.
```