# Write your MySQL query statement below

SELECT P.FirstName AS firstName,P.lastName, A.city, A.state FROM Person AS P LEFT JOIN Address AS A USING(personId);