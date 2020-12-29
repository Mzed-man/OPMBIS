package ms.com.Booktreasure.model.report.special.yearly.city;

import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Year;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class YearlyPriceRangeCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Year year;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;

    @ManyToOne
    private City city;

}
