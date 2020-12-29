package ms.com.Booktreasure.model.report.general.quarterly;

import ms.com.Booktreasure.model.dimension.period.special.Quarter;

import javax.persistence.*;

@Entity
public class QuarterlyPurchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private long sales;
    private long salesWithDiscount;

    @OneToOne
    private Quarter quarter;

}
