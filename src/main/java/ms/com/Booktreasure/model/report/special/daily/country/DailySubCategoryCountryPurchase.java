package ms.com.Booktreasure.model.report.special.daily.country;

import ms.com.Booktreasure.model.data.book.category.BSubCategory;
import ms.com.Booktreasure.model.data.localization.Country;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailySubCategoryCountryPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private BSubCategory subCategory;

    @ManyToOne
    private Country country;
}
