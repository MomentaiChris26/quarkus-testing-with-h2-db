import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import Movie.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class TestMovieRepository {

    @Inject
    MovieRepository movieRepository;


    @Test
    public void testListAll() {
        Assertions.assertEquals(4,movieRepository.listAll().size());
    }

    @Test
    public void testFindById() {
        Assertions.assertEquals("The Shawshank Redemption",movieRepository.findById(1L).getTitle());
    }

    @Test
    @TestTransaction
    public void testCreate() {
        Movie movie = new Movie();
        movie.setTitle("Wonka");
        movie.setDescription("Prequel to Charlie and the Chocolate Factory");
        movie.setDirector("Paul King");
        movie.setGenre("Fantasy, Adventure, Family");
        movie.setCountryOfOrigin("United States");
        movie.setReleaseYear(2023);
        movieRepository.create(movie);
        Assertions.assertEquals(5,movieRepository.listAll().size());
    }

}
