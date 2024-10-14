USE
testdb;
-- testdb.tbl_user definition

CREATE TABLE `tbl_user`
(
    `id`            int NOT NULL AUTO_INCREMENT,
    `first_name`    varchar(255) DEFAULT NULL,
    `last_name`     varchar(255) DEFAULT NULL,
    `date_of_birth` varchar(255) DEFAULT NULL,
    `gender`        enum('male','female','other') DEFAULT NULL,
    `email`         varchar(255) DEFAULT NULL,
    `phone`         varchar(255) DEFAULT NULL,
    `username`      varchar(255) DEFAULT NULL,
    `password`      varchar(255) DEFAULT NULL,
    `country`       varchar(255) DEFAULT NULL,
    `language`      varchar(255) DEFAULT NULL,
    `created_at`    datetime(6) DEFAULT NULL,
    `updated_at`    datetime(6) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE tbl_role
(
    `id`          int          NOT NULL AUTO_INCREMENT,
    `name`        varchar(255) NOT NULL,
    `description` varchar(1000) DEFAULT NULL,
    CONSTRAINT tbl_role_pkey PRIMARY KEY (id)
);

INSERT INTO tbl_user (id, created_at, updated_at, country, date_of_birth, email, first_name, `language`, last_name,
                      password, phone, username, gender, status)
VALUES (1, '2024-10-14 10:56:46.683000', '2024-10-14 10:56:46.683000', 'Việt Nam', '1987-30-06', 'quoctay87@gmail.com',
        'Manager', 'vi', 'Role', '$2a$10$y7bsUeqfE8VlAF/L9JgKaeEWLWtCs9OOJdw.vsJgdAkKX3tlj0nxe', '0975118228', 'admin',
        'male', 'active');

CREATE TABLE tbl_user_has_role
(
    `id`    int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    role_id int NOT NULL,
    CONSTRAINT tbl_user_has_role_pkey PRIMARY KEY (id)
);
ALTER TABLE tbl_user_has_role ADD CONSTRAINT fk_user_has_role_to_role FOREIGN KEY (role_id) REFERENCES tbl_role(id);
ALTER TABLE tbl_user_has_role ADD CONSTRAINT fk_user_has_role_to_user FOREIGN KEY (user_id) REFERENCES tbl_user(id);

INSERT INTO tbl_role (id, name, description)
VALUES (1, 'role_admin', 'role admin'),
       (2, 'role_manager', 'role manager'),
       (3, 'role_user', 'role user');

INSERT INTO tbl_user (id, created_at, updated_at, country, date_of_birth, email, first_name, `language`, last_name,
                      password, phone, username, gender, status)
VALUES (1, '2024-10-14 10:56:46.683000', '2024-10-14 10:56:46.683000', 'Việt Nam', '1987-30-06', 'quoctay87@gmail.com',
        'Admin', 'vi', 'Role', '$2a$10$y7bsUeqfE8VlAF/L9JgKaeEWLWtCs9OOJdw.vsJgdAkKX3tlj0nxe', '0975118228', 'admin',
        'male', 'active'),
       (2, '2024-10-14 11:29:25.171000', '2024-10-14 11:29:25.171000', 'Việt Nam', '1987-30-06', 'quoctay87@gmail.com',
        'Manager', 'vi', 'Role', '$2a$10$.fWxPsgdjQo2.EYRS9Ej1.A4pQABz7N1WYkmt2XljR3fwST4sXI9i', '0975118228',
        'manager', 'male', 'active'),
       (3, '2024-10-14 11:29:31.219000', '2024-10-14 11:29:31.219000', 'Việt Nam', '1987-30-06', 'quoctay87@gmail.com',
        'User', 'vi', 'Role', '$2a$10$L84Yfi05KUSPEGFMu7SapurII/9MX18n3NYQNTZRVArfSVriPp7Nm', '0975118228', 'user',
        'male', 'active');

INSERT INTO tbl_user_has_role (id, user_id, role_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3);

