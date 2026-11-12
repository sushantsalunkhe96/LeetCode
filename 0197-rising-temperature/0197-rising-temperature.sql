# Write your MySQL query statement below
Select w.id 
from Weather w
where w.temperature > (select w1.temperature from Weather w1
                     where w1.recordDate= date_sub(w.recordDate, INTERVAL 1 Day));
