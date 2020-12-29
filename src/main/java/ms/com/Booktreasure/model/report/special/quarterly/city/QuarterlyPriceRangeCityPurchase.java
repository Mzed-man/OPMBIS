package ms.com.Booktreasure.model.report.special.quarterly.city;

import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.special.Quarter;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class QuarterlyPriceRangeCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Quarter quarter;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;

    @ManyToOne
    private City city;
}
