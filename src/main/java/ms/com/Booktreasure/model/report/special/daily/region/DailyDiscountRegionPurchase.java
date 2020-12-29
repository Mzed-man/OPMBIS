package ms.com.Booktreasure.model.report.special.daily.region;

import ms.com.Booktreasure.model.data.localization.Region;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyDiscountRegionPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private Region region;
}
