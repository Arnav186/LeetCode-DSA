/* Write your PL/SQL query statement below */
select e1.employee_id 
from Employees e1
where e1.salary <30000
and e1.manager_id 
not in (Select e2.employee_id from employees e2)
order by e1.employee_id
