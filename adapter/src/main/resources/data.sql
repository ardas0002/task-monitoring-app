CREATE TABLE `USERS` (
`id` int NOT NULL AUTO_INCREMENT,
`username` varchar(100) NOT NULL,
`email` varchar(100) NOT NULL,
`password` varchar(255) NOT NULL,
`mobile_number` varchar(2555) NOT NULL,
`create_dt` date NOT NULL,
`update_dt` date NOT NULL
);

INSERT INTO `USERS` VALUES (1, 'John Doe', 'johndoe231@gmail.com', '$2a$12$K.ec9/5bZkFsd5oBU2CYIOofNnh99Nxab7uig6tYYpg6df3Q/B6tG'
,'441553663', '2022-05-21', '2022-05-21');