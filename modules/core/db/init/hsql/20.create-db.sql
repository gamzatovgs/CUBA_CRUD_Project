-- begin TEST_CAR
alter table TEST_CAR add constraint FK_TEST_CAR_ON_OWNER foreign key (OWNER_ID) references TEST_OWNER(ID)^
alter table TEST_CAR add constraint FK_TEST_CAR_ON_GARAGE foreign key (GARAGE_ID) references TEST_GARAGE(ID)^
create unique index IDX_TEST_CAR_UNIQ_NUMBER_ on TEST_CAR (NUMBER_) ^
create index IDX_TEST_CAR_ON_OWNER on TEST_CAR (OWNER_ID)^
create index IDX_TEST_CAR_ON_GARAGE on TEST_CAR (GARAGE_ID)^
-- end TEST_CAR
-- begin TEST_GARAGE
alter table TEST_GARAGE add constraint FK_TEST_GARAGE_ON_CITY foreign key (CITY_ID) references TEST_CITY(ID)^
create index IDX_TEST_GARAGE_ON_CITY on TEST_GARAGE (CITY_ID)^
-- end TEST_GARAGE
