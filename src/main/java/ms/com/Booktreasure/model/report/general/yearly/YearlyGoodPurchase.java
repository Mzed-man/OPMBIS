package ms.com.Booktreasure.model.report.general.yearly;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.data.good.Good;
import ms.com.Booktreasure.model.dimension.period.Year;

import javax.persistence.*;

@Entity
public class YearlyGoodPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Good good;

    @ManyToOne
    private Warehouse warehouse;
    private String manager;

    @OneToOne
    private Year year;

}
