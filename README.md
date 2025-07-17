# Palindrome Validator (Java)

# Problem Description

Write a Java method that takes a string as input and returns a boolean indicating whether the string is a palindrome. The method should:

Handle null or empty strings (return false).
Ignore case sensitivity (e.g., "Racecar" and "racecar" are valid palindromes).
Ignore spaces and punctuation (e.g., commas, colons, periods).
Return true if the string is a palindrome, false otherwise.

Write test cases which validate the correctness of your implementation.

#  Solution Summary

- Uses a two-pointer technique to validate the palindrome efficiently.
- Skips non-alphanumeric characters.
- Case-insensitive comparisons.
- Comprehensive test coverage using JUnit 5.
