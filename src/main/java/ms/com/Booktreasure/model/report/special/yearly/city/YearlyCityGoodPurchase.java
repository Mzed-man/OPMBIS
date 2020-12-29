package ms.com.Booktreasure.model.report.special.yearly.city;

import ms.com.Booktreasure.model.data.good.Good;
import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Year;

import javax.persistence.*;

@Entity
public class YearlyCityGoodPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Year day;
    private long sales;

    @ManyToOne
    private Good good;

    @ManyToOne
    private City city;
}
