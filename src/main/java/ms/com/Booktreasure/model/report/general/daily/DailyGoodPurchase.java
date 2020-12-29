package ms.com.Booktreasure.model.report.general.daily;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.data.good.Good;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailyGoodPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Good good;

    @ManyToOne
    private Warehouse warehouse;
    private String manager;

    @OneToOne
    private Day day;

}
