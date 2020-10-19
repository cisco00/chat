DROP USER IF EXISTS 'francisuser'@'localhost';
CREATE USER 'francisuser'@'localhost' IDENTIFIED BY 'francisuser123';
GRANT ALL PRIVILEGES ON petstore_db.* TO 'francisuser'@'localhost';
FLUSH PRIVILEGES ;

DROP DATABASE IF EXISTS petstore_db;
CREATE DATABASE petstore_db;

-- // security, mariadb, rest,