CREATE DATABASE hello
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Russian_Russia.1251'
       LC_CTYPE = 'Russian_Russia.1251'
       CONNECTION LIMIT = -1;

CREATE TABLE IF NOT EXISTS public.contact
(
  id integer NOT NULL DEFAULT nextval('contact_id_seq'::regclass),
  name character varying(255),
  CONSTRAINT contact_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.contact
  OWNER TO postgres;

INSERT INTO contact (name) VALUES ('Aleksey');
INSERT INTO contact (name) VALUES ('Aleksandr');
INSERT INTO contact (name) VALUES ('Avrora');
INSERT INTO contact (name) VALUES ('Ali');
INSERT INTO contact (name) VALUES ('Artemiy');
INSERT INTO contact (name) VALUES ('Alisa');
INSERT INTO contact (name) VALUES ('Anatoliy');
INSERT INTO contact (name) VALUES ('Boris');
INSERT INTO contact (name) VALUES ('Bogdan');
INSERT INTO contact (name) VALUES ('Denis');
INSERT INTO contact (name) VALUES ('Dmitriy');
INSERT INTO contact (name) VALUES ('Diana');
INSERT INTO contact (name) VALUES ('Roman');
INSERT INTO contact (name) VALUES ('Robert');
INSERT INTO contact (name) VALUES ('Ruslan');
INSERT INTO contact (name) VALUES ('Sergey');
INSERT INTO contact (name) VALUES ('Eva');
INSERT INTO contact (name) VALUES ('Evgeniy');
INSERT INTO contact (name) VALUES ('Elena');
INSERT INTO contact (name) VALUES ('Ekaterina');


