INSERT INTO movie (id,title, description, director, genre, countryOfOrigin, releaseYear)
VALUES (1,'The Shawshank Redemption', 'Two imprisoned', 'Frank Darabont', 'Drama', 'United States', 1994),
       (2,'The Godfather', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', 'Francis Ford Coppola', 'Crime', 'USA', 1972),
       (3,'The Dark Knight', 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.', 'Christopher Nolan', 'Action', 'USA', 2008),
       (4,'The Godfather: Part II', 'The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.', 'Francis Ford Coppola', 'Crime', 'USA', 1974);

ALTER SEQUENCE movie_seq RESTART WITH 5;
