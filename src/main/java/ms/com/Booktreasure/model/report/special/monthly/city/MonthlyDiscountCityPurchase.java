package ms.com.Booktreasure.model.report.special.monthly.city;

import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Month;

import javax.persistence.*;

@Entity
public class MonthlyDiscountCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Month day;
    private long sales;

    @ManyToOne
    private City city;

}
