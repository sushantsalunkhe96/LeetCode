# Write your MySQL query statement below
SELECT id ,
        CASE
        When p_id is null then 'Root'
        when id not in (select p_id 
                        from Tree 
                        where p_id is not null)
                        then 'Leaf'
        else 'Inner'  
        END as type
from Tree;                      