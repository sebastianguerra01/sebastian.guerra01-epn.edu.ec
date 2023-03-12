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

CREATE TABLE IF NOT EXISTS COORDENADAS
(    CAP                INTEGER NOT NULL 
    ,GEO                VARCHAR(10) NOT NULL
    ,TIPO_ARSENAL       VARCHAR(20) NOT NULL
);

------------------------------------------------------------------------
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (1, 'GPS1', 'bc'); 
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (7, 'GSP7','aaabbct'); 
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (5, 'GSP5', 'bct'); 
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (6, 'GSP6', 'act');
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (1, 'GSP1', 'bc');
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (6, 'GSP6', 'act');
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (8, 'GSP8', 'abbccdt');
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (0, 'GSP0', 'ab');
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (5, 'GSP5', 'bct');
INSERT INTO COORDENADAS   (CAP, GEO, TIPO_ARSENAL)
            VALUES      (8, 'GSP8', 'abbccdt');                                                                                    
------------------------------------------------------------------------
SELECT * FROM COORDENADAS;