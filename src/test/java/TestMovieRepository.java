import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import Movie.MovieRepository;
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
}
