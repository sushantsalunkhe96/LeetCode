# Write your MySQL query statement below
SELECT e.name 
from Employee e join Employee e1
on e.id=e1.managerId
group by e.id , e.name
having count(*)>=5;