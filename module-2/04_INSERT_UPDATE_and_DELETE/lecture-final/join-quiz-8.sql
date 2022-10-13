SELECT timecard_id, employee_id, normal_hours
FROM timecard
WHERE employee_id = (SELECT * FROM employee WHERE department = 'Sales');

SELECT timecard_id, employee_id, normal_hours
FROM timecard
WHERE employee_id = (SELECT employee_id FROM employee WHERE department = 'Sales');

-- yay!!!
SELECT timecard_id, employee_id, normal_hours
FROM timecard
WHERE employee_id IN (SELECT employee_id FROM employee WHERE department = 'Sales');

-- nope!
SELECT t.timecard_id, t.employee_id, t.normal_hours
FROM employee e
	JOIN timecard t ON e.department = 'Sales'

-- yay!
SELECT t.timecard_id, t.employee_id, t.normal_hours
FROM employee e
	JOIN timecard t ON t.employee_id = e.employee_id
WHERE e.department = 'Sales'


