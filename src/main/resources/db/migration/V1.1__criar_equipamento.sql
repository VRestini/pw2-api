CREATE TABLE TBL_EQUIPAMENTO
(
    ID_EQUIPAMENTO  BIGINT PRIMARY KEY IDENTITY,
    TX_MARCA        VARCHAR(25) NOT NULL,
    TX_MODELO       VARCHAR(80),
    TX_NUMERO_SERIE VARCHAR(20) NOT NULL,
    TX_TIPO         VARCHAR(10) NOT NULL
);

INSERT INTO TBL_EQUIPAMENTO(TX_MARCA, TX_MODELO, TX_NUMERO_SERIE, TX_TIPO) VALUES ('Dell', 'Inspiron 15 3000 Intel Core i5 - 8GB', '00595-18-04423', 'NOTEBOOK');
INSERT INTO TBL_EQUIPAMENTO(TX_MARCA, TX_MODELO, TX_NUMERO_SERIE, TX_TIPO) VALUES ('Acer', 'AMD Ryzen 5 8GB', '52372208766', 'NOTEBOOK');
