CREATE TABLE projets (
                         id BIGSERIAL PRIMARY KEY,
                         nom VARCHAR(255) NOT NULL,
                         description TEXT,
                         date_debut DATE,
                         date_fin DATE,
                         budget DOUBLE PRECISION
);
