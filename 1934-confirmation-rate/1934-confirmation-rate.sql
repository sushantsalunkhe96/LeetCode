# Write your MySQL query statement below
SELECT s.user_id , round(
    ifnull (
        avg(
            case when 
            action='confirmed' then 1 else 0
            END 
        ) ,0
    ),2 ) as confirmation_rate
From Signups s left join Confirmations c 
on s.user_id = c.user_id
group by s.user_id;