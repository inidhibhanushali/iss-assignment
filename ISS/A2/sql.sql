-- Create Database
CREATE DATABASE EmployeeDB;

-- Use Database
USE EmployeeDB;

-- Create Department Table
CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);

-- Create Employee Table
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Age INT,
    DepartmentID INT,
    Salary DECIMAL(10, 2) DEFAULT 0,
    HireDate DATE,
    CONSTRAINT PK_Employee PRIMARY KEY (EmployeeID),
    CONSTRAINT FK_Employee_Department FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    CONSTRAINT CHK_Salary CHECK (Salary >= 0)
);

-- Insert data into Department table
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES (1, 'HR'), (2, 'HR'), (3, 'Finance');

-- Insert data into Employee table
INSERT INTO Employee (EmployeeID, FirstName, LastName, Age, DepartmentID, Salary, HireDate)
VALUES (1, 'Jack', 'D', 30, 1, 5000.00, '2008-01-01'),
       (2, 'Rahul', 'S', 28, 2, 5500.00, '2009-05-15'),
       (3, 'Mir', 'J', 35, 3, 6000.00, '2010-09-10');

-- Select all employees
SELECT * FROM Employee;

-- Select distinct departments
SELECT DISTINCT DepartmentName FROM Department;

-- Select employees with age greater than 30
SELECT * FROM Employee WHERE Age > 30;

-- Select employees with salary between 4000 and 6000
SELECT * FROM Employee WHERE Salary BETWEEN 4000 AND 6000;

-- Select employees with first name starting with 'M' using wildcard (%)
SELECT * FROM Employee WHERE FirstName LIKE 'M%';

-- Select employees with DepartmentID IN (1, 2)
SELECT * FROM Employee WHERE DepartmentID IN (1, 2);

-- Select employees ordered by Salary in descending order
SELECT * FROM Employee ORDER BY Salary DESC;

-- Update employee's salary
UPDATE Employee SET Salary = 5500.00 WHERE EmployeeID = 1;

-- Delete employee with EmployeeID = 3
DELETE FROM Employee WHERE EmployeeID = 3;

-- Perform SQL Injection example (unsafe)
DECLARE @sql NVARCHAR(MAX);
SET @sql = 'SELECT * FROM Employee WHERE EmployeeID = ' + @EmployeeID;
EXEC sp_executesql @sql;

-- Perform SQL Injection example with parameterized query (safe)
DECLARE @EmployeeID INT;
SET @EmployeeID = 2;
SELECT * FROM Employee WHERE EmployeeID = @EmployeeID;

-- Select top 2 employees
SELECT TOP 2 * FROM Employee;

-- Use aliases for table and column names
SELECT e.EmployeeID, e.FirstName, d.DepartmentName
FROM Employee e
JOIN Department d ON e.DepartmentID = d.DepartmentID;

-- Perform inner join
SELECT * FROM Employee INNER JOIN Department ON Employee.DepartmentID = Department.DepartmentID;

-- Perform left join
SELECT * FROM Employee LEFT JOIN Department ON Employee.DepartmentID = Department.DepartmentID;

-- Perform full join
SELECT * FROM Employee FULL JOIN Department ON Employee.DepartmentID = Department.DepartmentID;

-- Create a new table using SELECT INTO
SELECT EmployeeID, FirstName, LastName INTO NewEmployeeTable
FROM Employee
WHERE Age > 30;

-- Create a new table with schema using SELECT INTO
SELECT EmployeeID, FirstName, LastName INTO NewEmployeeTableWithSchema
FROM Employee
WHERE 1 = 0;

-- Insert data into the new table using INSERT INTO SELECT
INSERT INTO NewEmployeeTableWithSchema (EmployeeID, FirstName, LastName)
SELECT EmployeeID, FirstName, LastName
FROM Employee
WHERE Age > 30;

-- Drop table
DROP TABLE Employee;

-- Alter table, add new column
ALTER TABLE Employee ADD Email VARCHAR(100);

-- Create index on Salary column
CREATE INDEX IX_Employee_Salary ON Employee (Salary);

-- Create view
CREATE VIEW EmployeeView AS
SELECT EmployeeID, FirstName, LastName, Salary
FROM Employee
WHERE Salary > 5000;

-- Execute a stored procedure
CREATE PROCEDURE GetEmployeeByID
    @EmployeeID INT
AS
BEGIN
    SELECT * FROM Employee WHERE EmployeeID = @EmployeeID;
END;

-- Call a stored procedure
EXEC GetEmployeeByID @EmployeeID = 1;
