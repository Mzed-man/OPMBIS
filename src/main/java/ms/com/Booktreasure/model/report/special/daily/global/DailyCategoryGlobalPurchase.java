package ms.com.Booktreasure.model.report.special.daily.global;

import ms.com.Booktreasure.model.data.book.category.BCategory;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyCategoryGlobalPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;

    @ManyToOne
    private BCategory category;
    private long sales;

}
