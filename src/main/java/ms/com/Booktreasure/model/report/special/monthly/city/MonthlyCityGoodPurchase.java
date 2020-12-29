package ms.com.Booktreasure.model.report.special.monthly.city;

import ms.com.Booktreasure.model.data.good.Good;
import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Month;

import javax.persistence.*;

@Entity
public class MonthlyCityGoodPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Month month;
    private long sales;

    @ManyToOne
    private Good good;

    @ManyToOne
    private City city;
}
