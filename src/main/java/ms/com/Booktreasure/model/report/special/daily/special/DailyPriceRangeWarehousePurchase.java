package ms.com.Booktreasure.model.report.special.daily.special;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.price.PriceRange;

import javax.persistence.*;

@Entity
public class DailyPriceRangeWarehousePurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private PriceRange priceRange;

    @ManyToOne
    private Warehouse warehouse;

}
