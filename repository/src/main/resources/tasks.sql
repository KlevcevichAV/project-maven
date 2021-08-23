-- 1 Вывести список сотрудников, получающих заработную плату большую чем у непосредственного руководителя
select employee.*
from employee
         left join employee e on e.id = employee.chief_id
where employee.salary > e.salary;

-- 2 Вывести список сотрудников, получающих максимальную заработную плату в своем отдел
SELECT *
FROM employee employee
WHERE salary = (
    SELECT MAX(salary)
    FROM employee AS max
WHERE max.department_id = employee.department_id
    );
-- group by department_id, id, chief_id, name, salary;

-- 3 Вывести список ID отделов, количество сотрудников в которых не превышает 3 человек
select department_id
from employee
group by department_id
having count(*) <= 3;

-- 4 Вывести список сотрудников, не имеющих назначенного руководителя, который работает в том-же отделе
SELECT employees.*
FROM Employee AS employees
         LEFT JOIN Employee AS chieves
                   ON (employees.chief_id = chieves.Id AND employees.department_id = chieves.department_id)
WHERE chieves.id IS NULL;

-- 5 Найти список ID отделов с максимальной суммарной зарплатой сотрудников,
WITH dep_salary AS
         (SELECT department_id, sum(salary) AS salary
          FROM employee
          GROUP BY department_id)
SELECT department_id
FROM dep_salary
WHERE dep_salary.salary = (SELECT max(salary) FROM dep_salary);