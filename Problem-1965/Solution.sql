SELECT e.employee_id
FROM Employees e
WHERE NOT EXISTS (
SELECT 1
FROM Salaries s
WHERE s.employee_id = e.employee_id
)

UNION

SELECT s.employee_id
FROM Salaries s
WHERE NOT EXISTS (
SELECT 1
FROM Employees e
WHERE e.employee_id = s.employee_id
)
ORDER BY employee_id
;
