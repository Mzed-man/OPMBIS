package ms.com.Booktreasure.model.report.special.daily.country;

import ms.com.Booktreasure.model.data.localization.Country;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyCountryBookPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private Country country;
}
