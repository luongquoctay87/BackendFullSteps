USE testdb;
-- testdb.tbl_user definition

CREATE TABLE `tbl_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `gender` enum('male','female','other') DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO tbl_user (id,created_at,updated_at,country,date_of_birth,email,first_name,`language`,last_name,password,phone,username,gender,status) VALUES
    (1,'2024-10-14 10:56:46.683000','2024-10-14 10:56:46.683000','Việt Nam','1987-30-06','quoctay87@gmail.com','Manager','vi','Role','$2a$10$y7bsUeqfE8VlAF/L9JgKaeEWLWtCs9OOJdw.vsJgdAkKX3tlj0nxe','0975118228','admin','male','active');
