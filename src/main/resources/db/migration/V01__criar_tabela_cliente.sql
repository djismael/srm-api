CREATE TABLE cliente (

  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR (50) NOT NULL,
  limite_credito DECIMAL (10,2) NOT NULL,
  risco VARCHAR (1)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (nome, limite_credito, risco) VALUES ('José Raimundo', 105000, 'A');
INSERT INTO cliente (nome, limite_credito, risco) VALUES ('Maria Pereira', 458321, 'A');
INSERT INTO cliente (nome, limite_credito, risco) VALUES ('Jaqueline Santos', 95000, 'B');
INSERT INTO cliente (nome, limite_credito, risco) VALUES ('Walter Stafam', 15000, 'B');
INSERT INTO cliente (nome, limite_credito, risco) VALUES ('Ronaldo Joasir', 1000, 'C');
