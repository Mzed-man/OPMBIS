package ms.com.Booktreasure.model.data.localization;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String name;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<Region> regions;

    public Country() {
    }
}
