package ms.com.Booktreasure.model.report.general.yearly;

import ms.com.Booktreasure.model.dimension.period.Year;

import javax.persistence.*;

@Entity
public class YearlyPurchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private long sales;
    private long salesWithDiscount;

    @OneToOne
    private Year year;

}
