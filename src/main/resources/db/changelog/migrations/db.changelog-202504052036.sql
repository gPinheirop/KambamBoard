-- liquibase formatted sql

-- changeset gabriel:202504052036

-- comment: board created

CREATE TABLE BOARDS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
)ENGINE=InnoDB;

--rollback DROP TABLE BOARDS