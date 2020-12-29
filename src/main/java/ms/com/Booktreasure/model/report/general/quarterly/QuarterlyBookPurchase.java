package ms.com.Booktreasure.model.report.general.quarterly;

import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import ms.com.Booktreasure.model.dimension.period.special.Quarter;

import javax.persistence.*;

@Entity
public class QuarterlyBookPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Warehouse warehouse;
    private String manager;

    @OneToOne
    private Quarter quarter;

}
