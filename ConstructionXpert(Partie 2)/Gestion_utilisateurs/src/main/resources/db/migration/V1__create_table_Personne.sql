CREATE TABLE Personne (
                          id BIGSERIAL PRIMARY KEY,
                          username VARCHAR(255) NOT NULL,
                          email VARCHAR(200) NOT NULL,
                          password VARCHAR(200) NOT NULL
);
