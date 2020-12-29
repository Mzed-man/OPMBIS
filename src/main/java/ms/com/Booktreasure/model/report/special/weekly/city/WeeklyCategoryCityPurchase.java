package ms.com.Booktreasure.model.report.special.weekly.city;

import ms.com.Booktreasure.model.data.book.category.BCategory;
import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.special.Week;

import javax.persistence.*;

@Entity
public class WeeklyCategoryCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Week week;

    @ManyToOne
    private BCategory category;
    private long sales;

    @ManyToOne
    private City city;
}
