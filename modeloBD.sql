-- Table: public.usuario

-- DROP TABLE public.usuario;

CREATE TABLE public.usuario
(
    id_usuario integer NOT NULL DEFAULT nextval('usuario_id_usuario_seq'::regclass),
    nombre_usuario character varying(255) COLLATE pg_catalog."default",
    password character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario
    OWNER to teledoc;





    -- Table: public.club

    -- DROP TABLE public.club;

    CREATE TABLE public.club
    (
        id_club integer NOT NULL DEFAULT nextval('club_id_club_seq'::regclass),
        liga character varying(255) COLLATE pg_catalog."default",
        nombre_club character varying(255) COLLATE pg_catalog."default",
        pais character varying(255) COLLATE pg_catalog."default",
        CONSTRAINT club_pkey PRIMARY KEY (id_club)
    )
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

    ALTER TABLE public.club
        OWNER to teledoc;





        -- Table: public.futbolista

        -- DROP TABLE public.futbolista;

        CREATE TABLE public.futbolista
        (
            id_futbolista integer NOT NULL DEFAULT nextval('futbolista_id_futbolista_seq'::regclass),
            apellido character varying(255) COLLATE pg_catalog."default",
            fec_naciomiento timestamp without time zone,
            nombre_futbolista character varying(255) COLLATE pg_catalog."default",
            posicion character varying(255) COLLATE pg_catalog."default",
            id_club integer NOT NULL,
            CONSTRAINT futbolista_pkey PRIMARY KEY (id_futbolista),
            CONSTRAINT fkhj3i1g6ne3s9wjm38i08i8yeh FOREIGN KEY (id_club)
                REFERENCES public.club (id_club) MATCH SIMPLE
                ON UPDATE NO ACTION
                ON DELETE NO ACTION
        )
        WITH (
            OIDS = FALSE
        )
        TABLESPACE pg_default;

        ALTER TABLE public.futbolista
            OWNER to teledoc;
