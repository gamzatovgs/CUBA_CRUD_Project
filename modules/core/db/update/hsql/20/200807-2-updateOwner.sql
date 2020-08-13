alter table TEST_OWNER add column GENDER varchar(50) ^
update TEST_OWNER set GENDER = 'Male' where GENDER is null ;
alter table TEST_OWNER alter column GENDER set not null ;
