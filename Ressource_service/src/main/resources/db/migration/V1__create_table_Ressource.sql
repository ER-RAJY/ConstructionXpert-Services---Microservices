create  table Ressources(

                         id SERIAL PRIMARY KEY,
                         nom VARCHAR(255) NOT NULL,
                         typee VARCHAR(200) NOT NULL ,
                         quantité FLOAT,
                         idTache BIGINT
);