# [Wildcard Pattern Matching](https://www.geeksforgeeks.org/problems/wildcard-pattern-matching/1)
## Medium
Given two strings&nbsp;pat&nbsp;and&nbsp;txt&nbsp;which may be of different sizes, You have to return&nbsp;true&nbsp;if the wildcard pattern i.e.&nbsp;pat,&nbsp;matches&nbsp;with&nbsp;txt&nbsp;else return&nbsp;false.
The wildcard pattern&nbsp;pat&nbsp;can include the characters '?' and '*'.

'?' – matches any single character.
'*' – matches any sequence of characters (including the empty sequence).

Note:&nbsp;The matching should cover the entire&nbsp;txt&nbsp;(not partial&nbsp;txt).
Examples:
Input: txt = "abcde", pat = "a?c*"
Output: true
Explanation: '?' matches with 'b' and '*' matches with "de".

Input: txt = "baaabab", pat = "a*ab"
Output: false
Explanation: The pattern starts with a, but the text starts with b, so the pattern does not match the text.
Input: txt = "abc", pat = "*"
Output: true
Explanation: '*' matches with whole text "abc".
Constraints:1&nbsp;≤ txt.size(), pat.size()&nbsp;≤ 100