package ms.com.Booktreasure.model.report.special.daily.global;

import ms.com.Booktreasure.model.data.Warehouse.supplier.Supplier;
import ms.com.Booktreasure.model.dimension.period.Day;

import javax.persistence.*;

@Entity
public class DailySupplierGlobalPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Day day;
    private long sales;

    @ManyToOne
    private Supplier supplier;
}
