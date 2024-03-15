package Movie;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {

    @Transactional
    public Movie create(Movie movie) {
        persist(movie);
        return movie;
    }
}
