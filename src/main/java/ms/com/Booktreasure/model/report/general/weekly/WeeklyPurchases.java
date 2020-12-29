package ms.com.Booktreasure.model.report.general.weekly;

import ms.com.Booktreasure.model.dimension.period.special.Week;

import javax.persistence.*;

@Entity
public class WeeklyPurchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private long sales;
    private long salesWithDiscount;

    @OneToOne
    private Week week;

}
