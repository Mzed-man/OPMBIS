package ms.com.Booktreasure.model.dimension.period.special;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.dimension.period.Month;
import ms.com.Booktreasure.model.dimension.period.Year;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quarter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Year year;

    @OneToMany(mappedBy = "quarter")
    @JsonIgnore
    private List<Month> months;

}
