package ms.com.Booktreasure.model.dimension.period.special;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Month;

import javax.persistence.*;
import java.util.List;

@Entity
public class Week {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Month month;

    @OneToMany(mappedBy = "week")
    @JsonIgnore
    private List<Day> days;

}
