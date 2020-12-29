package ms.com.Booktreasure.model.report.general.monthly;

import ms.com.Booktreasure.model.dimension.period.Month;

import javax.persistence.*;

@Entity
public class MonthlyPurchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    private long sales;
    private long salesWithDiscount;

    @OneToOne
    private Month month;

}
