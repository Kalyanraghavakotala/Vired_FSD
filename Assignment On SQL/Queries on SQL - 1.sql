-- creating database with the syntax (create database database_name)
create database Employee ;

-- creating table named EmployeeDetails
create table EmployeeDetails (
    -- using int,varchar as a datatypes.
    Emp_id int,
    Emp_name varchar(30),
    Job_name varchar(30),
    Manager_id int,
    Hire_date varchar(30),
    Salary int,
    Dep_id int 
);

-- inserting values into table
insert into EmployeeDetails values(1,"Kalyan","developer",501,"20-01-02",90000,190);
insert into EmployeeDetails values(8,"prabhu","SDE Developer",528,"20-01-02",300000,190);
insert into EmployeeDetails values(7,"Raj","Manager",599,"25-01-01",700000,190);
insert into EmployeeDetails values(9,"Rama Raj","developer",556,"01-02-02",80000,190);
insert into EmployeeDetails values(4,"Madhu","software developer",590,"07-04-02",50000,190);
insert into EmployeeDetails values(6,"Kumar","organiser",543,"06-03-04",60000,190);
insert into EmployeeDetails values(5,"Harish","emlployee 2",544,"22-02-02",70000,190);
insert into EmployeeDetails values(3,"Heena","assistant manager",556,"21-05-03",80000,190);
insert into EmployeeDetails values(2,"garg","backend developer",506,"23-01-02",60000,190);
insert into EmployeeDetails values(10,"pinky","developer",529,"25-05-01",10000,890);

-- select gives the data of the table from the table EmployeeDetails
select Salary from EmployeeDetails;

-- distinct is used to get the distinct values
select distinct Job_name from EmployeeDetails;

-- updating the salary of employee Raj
update EmployeeDetails set Salary= 45000 where Emp_name ="Raj";

-- at last the table will be 
select * from EmployeeDetails;