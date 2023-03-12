/* Copyright (C) 2K23, sebastian.guerra01@epn.edu.ec
------------------------------
Creacion de la tabla Usuarios_Registrados con datos
12.marzo.2023
Version 1.0
*/


.version
.database
.show
.tables

CREATE TABLE IF NOT EXISTS USUARIOS_REGISTRADOS
(    USUARIO            VARCHAR(75) NOT NULL 
    ,CONTRASENA         VARCHAR(10) NOT NULL
    ,FECHA_CREACION      VARCHAR(20) DEFAULT(datetime('now'))
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