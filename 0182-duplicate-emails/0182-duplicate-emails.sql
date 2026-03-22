# Write your MySQL query statement below

SElECT DISTINCT(email) as Email FROM Person AS p1 WHERE email IN(
    SELECT email FROM Person AS p2 WHERE p1.email = p2.email AND p1.id != p2.id
);
