CREATE TABLE Login (
   id VARCHAR(36) DEFAULT (UUID()) PRIMARY KEY,
   email VARCHAR(255) UNIQUE,
   senha VARCHAR(255)
);