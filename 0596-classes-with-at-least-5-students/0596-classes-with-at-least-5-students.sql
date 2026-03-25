# Write your MySQL query statement below
SElECT class FROM Courses GROUP BY class HAVING COUNT(*)>=5;