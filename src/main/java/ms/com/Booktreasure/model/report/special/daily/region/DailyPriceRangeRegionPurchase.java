package ms.com.Booktreasure.model.report.special.daily.region;

import ms.com.Booktreasure.model.data.localization.Region;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class DailyPriceRangeRegionPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;

    @ManyToOne
    private Region region;
}
