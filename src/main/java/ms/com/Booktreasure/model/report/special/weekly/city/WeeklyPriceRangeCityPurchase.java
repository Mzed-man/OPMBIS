package ms.com.Booktreasure.model.report.special.weekly.city;

import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.special.Week;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class WeeklyPriceRangeCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Week week;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;

    @ManyToOne
    private City city;

}
