# Write your MySQL query statement below
SELECT IFNULL((SELECT DISTINCT salary  FROM Employee AS e1 WHERE 2 = (
    SELECT COUNT(DISTINCT salary) FROM Employee AS e2 WHERE e1.salary<=e2.salary
)),NULL) AS SecondHighestSalary