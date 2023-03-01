-- syntax is create database database_name
create database Football;

-- creating  table
create table FootballVenue(
 venue_id int not null primary key,
 venue_name varchar(30) not null,
 city_id int not null,
 capacity int not null
 );
 
 -- inserting values
insert into FootballVenue values(1,"India",101,1000);
insert into FootballVenue values(2,"USA",102,1001);
insert into FootballVenue values(3,"France",103,1002);
insert into FootballVenue values(4,"Switzerland",104,1003);
insert into FootballVenue values(5,"Pakistan",105,1004);
insert into FootballVenue values(6,"West Germany",106,1005);
insert into FootballVenue values(7,"Mexico",107,1006);
insert into FootballVenue values(8,"Sweden",108,1007);
insert into FootballVenue values(9,"Bangladesh",109,1008);
insert into FootballVenue values(10,"Canada",120,1009);


-- count() is used to get the count for the given value inside the function parameter
select count(venue_name)  from footballvenue;

select  venue_name as Location , capacity as Volume from footballvenue;

-- delete delets the data on the basis of given condition
delete from  footballvenue where venue_name="Russia";

-- finally our data will be
select * from FootballVenue;
