--TABLE WORKER CREATION & INSERTION
CREATE TABLE Worker (
    WORKER_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    SALARY INT,
    JOINING_DATE DATE,
    DEPARTMENT VARCHAR(50)
);

INSERT INTO Worker VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-06-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 75000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 90000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan', 200000, '2011-04-14', 'Admin');

SELECT *FROM Worker;

--TABLE BONUS CREATION & INSERTION
CREATE TABLE Bonus (
    WORKER_REF_ID INT,
    BONUS_AMOUNT INT,
    BONUS_DATE DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

INSERT INTO Bonus VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16'),
(6, 4500, '2020-02-16'),
(7, 3500, '2011-02-16'),
(8, 3000, '2020-02-16');

SELECT *FROM Bonus;

--TABLE TITLE CREATION & INSERTION
CREATE TABLE Title (
    WORKER_REF_ID INT,
    WORKER_TITLE VARCHAR(50),
    AFFECTED_FROM DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

INSERT INTO Title VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(3, 'Executive', '2016-06-11'),
(4, 'Manager', '2016-06-11'),
(5, 'Lead', '2016-06-11'),
(6, 'Asst. Manager', '2016-06-11'),
(7, 'Lead', '2016-06-11'),
(8, 'Executive', '2016-06-11');

SELECT *FROM Title;

--TO DISPLAY FIRST_NAME , SALARY AND WORKER_TITLE

SELECT W.FIRST_NAME, W.SALARY, T.WORKER_TITLE
FROM Worker W
JOIN Title T ON W.WORKER_ID = T.WORKER_REF_ID;


CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INT)
RETURNS INTEGER AS $$
DECLARE
    nth_salary INT;
    worker_count INT;
BEGIN
--nth highest salary
    SELECT DISTINCT SALARY INTO nth_salary
    FROM Worker
    ORDER BY SALARY DESC
    LIMIT 1 OFFSET n - 1;
--count of workers
    SELECT COUNT(*) INTO worker_count
    FROM Worker
    WHERE SALARY = nth_salary;

    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;

SELECT get_worker_count_by_nth_highest_salary(1);






