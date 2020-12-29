package ms.com.Booktreasure.model.report.general.monthly;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.dimension.period.Month;

import javax.persistence.*;

@Entity
public class MonthlyBookPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Warehouse warehouse;
    private String manager;

    @OneToOne
    private Month month;
}
