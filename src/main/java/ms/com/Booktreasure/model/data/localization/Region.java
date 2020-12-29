package ms.com.Booktreasure.model.data.localization;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String name;

    @ManyToOne
    private Country country;
    @OneToMany(mappedBy = "region")
    @JsonIgnore
    private List<City> cities;

}
