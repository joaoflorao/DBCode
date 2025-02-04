CREATE DATABASE IF NOT EXISTS DBCode;
USE DBCode;

CREATE TABLE IF NOT EXISTS `USER` (
 ID BIGINT PRIMARY KEY AUTO_INCREMENT,
 EMAIL VARCHAR(255) NOT NULL UNIQUE,
 USERNAME VARCHAR(255) NOT NULL UNIQUE,
 PASSWORD VARCHAR(255) NOT NULL,
 RESET_CODE VARCHAR(20),
 PROFILE VARCHAR(255) NOT NULL,
 RESET_CODE VARCHAR(12),
INDEX IDX_EMAIL(EMAIL),
INDEX IDX_USERNAME(USERNAME)

    );

-- Cria a tabela de cadastro de bugs
CREATE TABLE IF NOT EXISTS `BUG` (
    ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    TITULO VARCHAR(25) NOT NULL,
    STATUS VARCHAR(25) NOT NULL,
    DESCRICAO VARCHAR(100) NOT NULL,
    REPRODUCAO VARCHAR(200) NOT NULL,
    FILE varchar(255),
    CLASSIFICACAO VARCHAR(25) NOT NULL,
    PRIORIDADE VARCHAR(25) NOT NULL,
    DATA_CADASTRO date NOT NULL

    );