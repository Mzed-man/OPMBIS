package ms.com.Booktreasure.model.report.special.daily.global;

import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class DailyPriceRangeGlobalPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;
}
