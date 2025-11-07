# [Weighted Job Scheduling](https://www.geeksforgeeks.org/problems/weighted-job-scheduling/1)
## Medium
Given a 2D array&nbsp;jobs[][]&nbsp;of size n × 3, where each row represents a single job with the following details:

jobs[i][0] : Start time of the job
jobs[i][1] : End time of the job
jobs[i][2] : Profit earned by completing the job

Find the&nbsp;maximum profit&nbsp;you can earn by scheduling non-overlapping jobs.
Note: Two jobs are said to be non-overlapping if the end time of one job is less than or equal to the start time of the next job. If a job ends at time X, another job can start exactly at time X.
Examples:
Input: jobs[][] =  [[1, 2, 50],                  [3, 5, 20],                 [6, 19, 100],                 [2, 100, 200]] 
Output: 250
Explanation: The first and fourth jobs with the time range [1, 2] and [2, 100] can be chosen to give maximum profit of 50 + 200 = 250.
Input: jobs[][] =  [[1, 3, 60],                  [2, 5, 50],                 [4, 6, 70],                 [5, 7, 30]] 
Output: 130
Explanation: The first and third jobs with the time range [1, 3] and [4, 6] can be chosen to give maximum profit of 60 + 70 = 130.
Constraints:1 ≤ jobs.size() ≤ 1051 ≤ jobs[i][0] &lt; jobs[i][1] ≤ 1091 ≤ jobs[i][2] ≤ 104