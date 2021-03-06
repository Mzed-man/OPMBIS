package ms.com.Booktreasure.model.dimension.period;

import ms.com.Booktreasure.model.dimension.period.special.Week;

import javax.persistence.*;

@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int day;
    @ManyToOne
    private Week week;
    @ManyToOne
    private Month month;

}
