package ms.com.Booktreasure.model.report.general.daily;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyBookPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Warehouse warehouse;
    private String manager;

    @OneToOne
    private Day day;

}
