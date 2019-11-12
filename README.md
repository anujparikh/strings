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
    
#### Methods in `java.util.Character` Class
| Methods | Description | Returns | Notes | 
| ------- | ----------- | ------- | ---- | 
| isLetter(char c) | This method is used to determine whether the specified char value(ch) is a letter or not | boolean | only within [A-Za-z] |
| isDigit(char c) | This method is used to determine whether the specified char value(ch) is a digit or not | boolean |
| isWhitespace(char c) | It determines whether the specified char value(ch) is white space | boolean |

- Some other methods are
    - isUpperCase(char c)
    - toUpperCase(char c)
    - isLowerCase(char c)
    - toLowerCase(char c) 


#### Common syntax
- Creating a String
```java
String s = “Random String”;
String s = new String (“Random String”);
```

- Replace non-alphanumeric characters within String
```java
s.replaceAll("[^A-Za-z0-9]", "");
``` 

### Examples
- [`Reverse String:`](https://leetcode.com/problems/reverse-string/) [Solution](./src/practice/examples/ReverseString.java) (Easy)
- [`Reverse Integer:`](https://leetcode.com/problems/reverse-integer/) [Solution](./src/practice/examples/ReverseInteger.java) (Easy)
- [`First Unique Character:`](https://leetcode.com/problems/first-unique-character-in-a-string/) [Solution](./src/practice/examples/FirstUniqueChar.java) (Easy)
- [`Valid Anagram:`](https://leetcode.com/problems/valid-anagram/) [Solution](./src/practice/examples/ValidAnagram.java) (Easy)
- [`Valid Palindrome:`](https://leetcode.com/problems/valid-palindrome/) [Solution](./src/practice/examples/ValidPalindrome.java) (Easy)
- [`String to Integer (atoi):`](https://leetcode.com/problems/string-to-integer-atoi/) [Solution](./src/practice/examples/StringToInteger.java) (Easy)