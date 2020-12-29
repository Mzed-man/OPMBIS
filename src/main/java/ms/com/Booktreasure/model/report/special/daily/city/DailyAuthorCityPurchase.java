package ms.com.Booktreasure.model.report.special.daily.city;

import ms.com.Booktreasure.model.data.book.book.Author;
import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyAuthorCityPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    @ManyToOne
    private Author author;
    private long sales;

    @ManyToOne
    private City city;


}
