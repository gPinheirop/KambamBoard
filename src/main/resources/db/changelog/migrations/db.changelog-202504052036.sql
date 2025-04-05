-- liquibase formatted sql

-- changeset: gabriel:202504052036

-- comment: kambam created

CREATE TABLE kambamBoard (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
)ENGINE = InnoDB;