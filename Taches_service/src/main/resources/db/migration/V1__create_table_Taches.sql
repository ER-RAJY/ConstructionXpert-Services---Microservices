create  table Taches(

                         id SERIAL PRIMARY KEY,
                         nom VARCHAR(255) NOT NULL,
                         description TEXT,
                         date_debut VARCHAR(20),
                         date_fin VARCHAR(20),
                         statu VARCHAR(200) NOT NULL,
                         idProjet BIGINT
);