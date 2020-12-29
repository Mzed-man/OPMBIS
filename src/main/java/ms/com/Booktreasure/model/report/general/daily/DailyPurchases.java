package ms.com.Booktreasure.model.report.general.daily;

import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyPurchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private long sales;
    private long salesWithDiscount;

    @OneToOne
    private Day day;

}
