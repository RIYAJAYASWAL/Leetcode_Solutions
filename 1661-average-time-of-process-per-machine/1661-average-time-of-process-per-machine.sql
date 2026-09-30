# Write your MySQL query statement below
SELECT m1.machine_id,ROUND(AVG(m2.timestamp-m1.timestamp),3) AS processing_time 
FROM Activity m2 JOIN Activity m1
WHERE m2.activity_type='end' AND m1.activity_type='start'AND m1.machine_id=m2.machine_id GROUP BY m1.machine_id 