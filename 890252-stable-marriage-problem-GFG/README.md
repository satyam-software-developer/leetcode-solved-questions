# [Stable Marriage Problem](https://www.geeksforgeeks.org/problems/stable-marriage-problem/1)
## Medium
You are given two arrays men[] and women[], each of length n, where:

men[i] represents the preference list of the i-th man, ranking all women in order of preference.
women[i] represents the preference list of the i-th woman, ranking all men in order of preference.

The task is to form n pairs (marriages) such that:

Each man is matched with exactly one woman, and each woman is matched with exactly one man.

The matching is stable, meaning there is no pair (man, woman) who both prefer each other over their current partners.It is guaranteed that a stable matching always exists. Return the stable matching from the men’s perspective, i.e., the one where men are considered for the final output.Return an array result[] of size n, where result[i] denotes the index (0-based) of the woman matched with the i-th man.
Examples:&nbsp;
Input: n = 2, men[] = [[0, 1], [0, 1], women[] = [[0, 1], [0, 1]]Output:&nbsp;[0, 1]Explanation:Man 0 is married to Woman 0 (his first choice and her first choice).Man 1 is married to Woman 1 (his second choice and her second choice).
Input: n = 3, men[] = [[0, 1, 2], [0, 1, 2], [0, 1, 2]], women[] = [[2, 1, 0], [2, 1, 0], [2, 1, 0]]Output:&nbsp;[2, 1, 0]Explanation:Man 0 is married to Woman 2 (his third choice and her third choice).Man 1 is married to Woman 1 (his second choice and her second choice).Man 2 is married to Woman 0 (his first choice and her first choice).
Constraints:&nbsp;2 ≤ n ≤ 1030 ≤ men[i] ≤ n - 10 ≤ women[i] ≤ n - 1