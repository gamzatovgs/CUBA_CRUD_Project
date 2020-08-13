-- begin TEST_CITY
create table TEST_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    IS_DEFAULT boolean not null,
    --
    primary key (ID)
)^
-- end TEST_CITY
-- begin TEST_OWNER
create table TEST_OWNER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(255) not null,
    FIRST_NAME varchar(255) not null,
    PATRONYMIC varchar(255) not null,
    GENDER varchar(50) not null,
    BIRTHDATE date not null,
    --
    primary key (ID)
)^
-- end TEST_OWNER
-- begin TEST_CAR
create table TEST_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    NUMBER_ varchar(10) not null,
    COLOR varchar(50) not null,
    OWNER_ID varchar(36) not null,
    GARAGE_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TEST_CAR
-- begin TEST_GARAGE
create table TEST_GARAGE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CITY_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TEST_GARAGE
