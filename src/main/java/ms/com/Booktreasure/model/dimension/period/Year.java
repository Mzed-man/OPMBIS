package ms.com.Booktreasure.model.dimension.period;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.dimension.period.special.Quarter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Year {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int year;

    @OneToMany(mappedBy = "year")
    @JsonIgnore
    private List<Month> months;

    @OneToMany(mappedBy = "year")
    @JsonIgnore
    private List<Quarter> quarters;

}
