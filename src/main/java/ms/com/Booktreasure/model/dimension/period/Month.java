package ms.com.Booktreasure.model.dimension.period;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.dimension.period.special.Quarter;
import ms.com.Booktreasure.model.dimension.period.special.Week;

import javax.persistence.*;
import java.util.List;

@Entity
public class Month {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int month;

    @ManyToOne
    private Quarter quarter;
    @ManyToOne
    private Year year;

    @OneToMany(mappedBy = "month")
    @JsonIgnore
    private List<Day> days;

    @OneToMany(mappedBy = "month")
    @JsonIgnore
    private List<Week> weeks;

}
