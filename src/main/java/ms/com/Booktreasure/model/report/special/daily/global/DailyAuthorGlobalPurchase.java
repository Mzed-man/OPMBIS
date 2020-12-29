package ms.com.Booktreasure.model.report.special.daily.global;

import ms.com.Booktreasure.model.data.book.book.Author;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyAuthorGlobalPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    @ManyToOne
    private Author author;
    private long sales;
}
