package ms.com.Booktreasure.model.report.special.monthly.city;

import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Month;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class MonthlyPriceRangeCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Month month;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;

    @ManyToOne
    private City city;
}
