package ms.com.Booktreasure.model.report.special.daily.country;

import ms.com.Booktreasure.model.data.book.category.BCategory;
import ms.com.Booktreasure.model.data.localization.Country;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyCategoryCountryPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;

    @ManyToOne
    private BCategory category;
    private long sales;

    @ManyToOne
    private Country country;
}
