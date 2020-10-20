DROP USER IF EXISTS 'root'@'localhost';
CREATE USER 'root'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON root.* TO 'root'@'localhost';
FLUSH PRIVILEGES ;

DROP DATABASE IF EXISTS chat_db;
CREATE DATABASE chat_db;

-- // security, mariadb, rest,