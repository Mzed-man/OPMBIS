package ms.com.Booktreasure.model.report.general.weekly;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.dimension.period.special.Week;

import javax.persistence.*;

@Entity
public class WeeklyBookPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Warehouse warehouse;
    private String manager;

    @OneToOne
    private Week week;
}
