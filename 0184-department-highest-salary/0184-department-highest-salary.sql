# Write your MySQL query statement below
SELECT d.name AS Department ,Temp.name AS Employee, Temp.salary AS Salary FROM Department AS d INNER JOIN (SELECT * FROM Employee AS e1 WHERE 1 = (
    SELECT COUNT(DISTINCT(salary))FROM Employee AS e2 WHERE e1.departmentId = e2.departmentId AND e1.salary <= e2.salary
)) AS Temp ON Temp.departmentId = d.id