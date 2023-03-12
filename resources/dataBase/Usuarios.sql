/* Copyright (C) 2K23, pat_mic
------------------------------
Creacion de la tabla Localidad con datos
30.ene.2k23
Version 1.0
*/


.version
.database
.show
.tables

DROP TABLE IF EXISTS USUARIOS_REGISTRADOS;

CREATE TABLE IF NOT EXISTS USUARIOS_REGISTRADOS
(    USUARIO            VARCHAR(75) NOT NULL 
    ,CONTRASENA         VARCHAR(10) NOT NULL
);

------------------------------------------------------------------------
INSERT INTO USUARIOS_REGISTRADOS   (USUARIO, CONTRASENA)
            VALUES      ('sebastian.guerra01@epn.edu.ec', '1756168058'); 
INSERT INTO USUARIOS_REGISTRADOS   (USUARIO, CONTRASENA)
            VALUES      ('gustavoguerra.1999@gmail.com', '0400692380'); 
INSERT INTO USUARIOS_REGISTRADOS   (USUARIO, CONTRASENA)
            VALUES      ('profe', '1234'); 
------------------------------------------------------------------------
SELECT * FROM USUARIOS_REGISTRADOS;