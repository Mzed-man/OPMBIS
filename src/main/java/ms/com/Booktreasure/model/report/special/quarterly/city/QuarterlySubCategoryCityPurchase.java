package ms.com.Booktreasure.model.report.special.quarterly.city;

import ms.com.Booktreasure.model.data.book.category.BSubCategory;
import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;
import ms.com.Booktreasure.model.dimension.period.special.Quarter;

import javax.persistence.*;

@Entity
public class QuarterlySubCategoryCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Quarter quarter;
    private long sales;

    @ManyToOne
    private BSubCategory subCategory;

    @ManyToOne
    private City city;
}
