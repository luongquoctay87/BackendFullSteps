USE testdb;

CREATE TABLE tbl_user (
     id int PRIMARY KEY AUTO_INCREMENT,
     date_of_birth varchar(255) NULL,
     email varchar(255) NULL,
     first_name varchar(255) NULL,
     last_name varchar(255) NULL,
     password varchar(255) NULL,
     phone varchar(255) NULL,
     username varchar(255) NULL,
     gender ENUM('male', 'female', 'other') NULL,
     status ENUM('active', 'inactive', 'none') NULL,
     type ENUM('sysadmin', 'admin', 'manager', 'user') NULL,
     created_at timestamp(6) NULL,
     updated_at timestamp(6) NULL
);

CREATE TABLE tbl_address (
	id int PRIMARY KEY AUTO_INCREMENT,
	user_id int NOT NULL,
	apartment_number varchar(255) NULL,
	floor varchar(255) NULL,
	building varchar(255) NULL,
    street_number varchar(255) NULL,
    street varchar(255) NULL,
    city varchar(255) NULL,
    country varchar(255) NULL,
    address_type int4 NULL,
    created_at timestamp(6) NULL,
    updated_at timestamp(6) NULL
);

ALTER TABLE tbl_address ADD CONSTRAINT address_fk FOREIGN KEY (user_id) REFERENCES tbl_user (id);