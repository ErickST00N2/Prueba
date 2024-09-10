 alter session set "_ORACLE_SCRIPT"=true;

CREATE USER DEVMASTER02 IDENTIFIED BY DEVMASTER02;
GRANT CONNECT, RESOURCE TO DEVMASTER02;


ALTER USER DEVMASTER02 quota UNLIMITED on USERS;

CREATE TABLE ROL (
    ID_ROL NUMBER,
    TIPO VARCHAR2(100),
    CONSTRAINT ID_ROL_PK PRIMARY KEY(ID_ROL)
);

INSERT INTO ROL (ID_ROL, TIPO) VALUES (1, 'ADMIN');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (2, 'USER');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (3, 'GUEST');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (4, 'MODERATOR');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (5, 'VIP');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (6, 'EDITOR');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (7, 'CONTRIBUTOR');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (8, 'ANALYST');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (9, 'MANAGER');
INSERT INTO ROL (ID_ROL, TIPO) VALUES (10, 'SUPERVISOR');

CREATE TABLE USUARIO (
    ID_USUARIO NUMBER,
    USUARIO VARCHAR2(100),
    CONTRASENIA VARCHAR2(100),
    ESTADO VARCHAR2(100),
    CONSTRAINT ID_USUARIO_PK PRIMARY KEY(ID_USUARIO)
);

INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (1, 'usuario1', 'contrasenia1', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (2, 'usuario2', 'contrasenia2', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (3, 'usuario3', 'contrasenia3', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (4, 'usuario4', 'contrasenia4', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (5, 'usuario5', 'contrasenia5', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (6, 'usuario6', 'contrasenia6', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (7, 'usuario7', 'contrasenia7', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (8, 'usuario8', 'contrasenia8', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (9, 'usuario9', 'contrasenia9', 'ACTIVO');
INSERT INTO USUARIO (ID_USUARIO, USUARIO, CONTRASENIA, ESTADO) VALUES (10, 'usuario10', 'contrasenia10', 'ACTIVO');

CREATE TABLE PERSONA (
    ID_PERSONA NUMBER PRIMARY KEY,
    NOMBRE VARCHAR2(100),
    APELLIDOS VARCHAR2(100),
    SEXO VARCHAR2(10),
    PAIS VARCHAR2(50),
    DIRECCION VARCHAR2(100),
    USUARIO_ID NUMBER,
    CONSTRAINT FK_USUARIO_ID FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO(ID_USUARIO)
);

INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (1, 'Juan', 'P�rez', 'M', 'M�xico', 'Calle 1 #123', 1);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (2, 'Mar�a', 'Garc�a', 'F', 'Espa�a', 'Calle 2 #456', 2);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (3, 'Luis', 'Gonz�lez', 'M', 'Argentina', 'Calle 3 #789', 3);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (4, 'Ana', 'Rodr�guez', 'F', 'Estados Unidos', 'Calle 4 #1011', 4);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (5, 'Carlos', 'Mart�nez', 'M', 'Brasil', 'Calle 5 #1213', 5);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (6, 'Isabel', 'Hern�ndez', 'F', 'Colombia', 'Calle 6 #1415', 6);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (7, 'Roberto', 'L�pez', 'M', 'Per�', 'Calle 7 #1617', 7);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (8, 'Laura', 'S�nchez', 'F', 'Ecuador', 'Calle 8 #1819', 8);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (9, 'Daniel', 'Cruz', 'M', 'Venezuela', 'Calle 9 #2021', 9);
INSERT INTO PERSONA (ID_PERSONA, NOMBRE, APELLIDOS, SEXO, PAIS, DIRECCION, USUARIO_ID) VALUES (10, 'Valeria', 'Flores', 'F', 'Chile', 'Calle 10 #2223', 10);

CREATE TABLE USUARIOROL (
    ID_USUARIOROL NUMBER,
    ID_USUARIO NUMBER,
    ID_ROL NUMBER,
    CONSTRAINT ID_USUARIOROL_PK PRIMARY KEY(ID_USUARIOROL),
    CONSTRAINT FK_ROL FOREIGN KEY (ID_ROL) REFERENCES ROL(ID_ROL),
    CONSTRAINT FK_USUARIO FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID_USUARIO)
);

INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (1, 1, 1);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (2, 2, 2);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (3, 3, 3);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (4, 4, 4);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (5, 5, 5);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (6, 6, 6);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (7, 7, 7);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (8, 8, 8);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (9, 9, 9);
INSERT INTO USUARIOROL (ID_USUARIOROL, ID_USUARIO, ID_ROL) VALUES (10, 10, 10);


CREATE TABLE PUBLICACION (
    ID_PUBLICACION NUMBER PRIMARY KEY,
    ID_PERSONA NUMBER,
    CUERPO CLOB,
    CONSTRAINT FK_PERSONA FOREIGN KEY (ID_PERSONA) REFERENCES PERSONA(ID_PERSONA)
);

INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (1, 1, 'Esta es la primera publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (2, 2, 'Esta es la segunda publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (3, 3, 'Esta es la tercera publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (4, 4, 'Esta es la cuarta publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (5, 5, 'Esta es la quinta publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (6, 6, 'Esta es la sexta publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (7, 7, 'Esta es la s�ptima publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (8, 8, 'Esta es la octava publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (9, 9, 'Esta es la novena publicaci�n');
INSERT INTO PUBLICACION (ID_PUBLICACION, ID_PERSONA, CUERPO) VALUES (10, 10, 'Esta es la d�cima publicaci�n');

commit;