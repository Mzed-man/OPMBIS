package ms.com.Booktreasure.model.report.special.yearly.city;

import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.Year;

import javax.persistence.*;

@Entity
public class YearlyDiscountCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Year year;
    private long sales;

    @ManyToOne
    private City city;

}
