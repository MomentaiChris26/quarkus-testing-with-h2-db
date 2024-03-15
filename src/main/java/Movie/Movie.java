package Movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "movie")
public class Movie  {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private String director;
    private String genre;
    private String countryOfOrigin;
    private int releaseYear;

}
