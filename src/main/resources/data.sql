INSERT INTO tipo_usuario (tipo) VALUES ('Tecnico');
INSERT INTO tipo_usuario (tipo) VALUES ('RRHH');
INSERT INTO tipo_usuario (tipo) VALUES ('Area comercial');
INSERT INTO tipo_usuario (tipo) VALUES ('Mesa de ayuda');

INSERT INTO usuario (tipo_usuario_id, username, password) VALUES (1, 'javierpintos', '1234');

INSERT INTO servicio (nombre) VALUES ('Servicio 1');
INSERT INTO servicio (nombre) VALUES ('Servicio 2');

INSERT INTO cliente (cuit, mail, razon_social) VALUES ("20-12345678-1", 'jpintos@gmail.com', 'ABC');
INSERT INTO cliente (cuit, mail, razon_social) VALUES ("27-11223344-7", 'jperez@gmail.com', 'DEF');

INSERT INTO cliente_servicio (cliente_id, servicio_id) VALUES (1,2);