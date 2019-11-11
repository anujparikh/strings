# Strings Data Structure

#### Introduction
- Strings are defined as an array of characters. 
- The difference between a character array and a string is the string is terminated with a special character `\0`
- In java, objects of String are immutable which means a constant and cannot be changed once created

#### Some of constructor functions for Strings
- `String(byte[] byte_arr)`
- `String(char[] char_arr)`
- `String(char[] char_array, int start_index, int count)`
- `String(StringBuffer s_buffer)`
- `String(StringBuilder s_builder)`

#### Methods in `java.util.String` Class
| Methods | Description | Returns | Notes | 
| ------- | ----------- | ------- | ---- |
| length | Returns the number of characters in the String | int | 
| charAt(int i) | Returns the character at ith index | Char | 
| substring(int i) | Return the substring from the ith  index character to end | String | 
| substring(int i, int j) | Returns the substring from i to j-1 index | String |
| concat(String str) | Concatenates specified string to the end of this string | String |
| indexOf(String str) | Returns the index within the string of the first occurrence of the specified string | int | If not present will return -1 |
| indexOf(String str, int i) | Returns the index within the string of the first occurrence of the specified string, starting at the specified index | int |
| lastIndexOf(String str) | Returns the index within the string of the last occurrence of the specified string | int |
| equals(String s) | Compares this string to the specified string | boolean |
| equalsIgnoreCase(String s) | Compares string to another string, ignoring case considerations | boolean |
| toLowerCase(String s) | Converts all the characters in the String to lower case | String
| toUpperCase(String s) | Converts all the characters in the String to upper case | String
| trim | Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle | String
| replace(char oldChar, char newChar) | Returns new string by replacing all occurrences of oldChar with newChar | String

- Some other methods are
    - compareTo(String s)
    - compareToIgnoreCase(String s) 


#### Common syntax
- Creating a String
```java
String s = “Random String”;
String s = new String (“Random String”);
```

### Examples
- [`Reverse String:`](https://leetcode.com/problems/reverse-string/) [Solution](./src/practice/examples/ReverseString.java) (Easy)