package ms.com.Booktreasure.model.data.Warehouse.supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.data.localization.City;
import ms.com.Booktreasure.model.data.transaction.order.OrderTransaction;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String name;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "supplier")
    @JsonIgnore
    private List<OrderTransaction> orderTransactions;

    @CreationTimestamp
    private Date created;

}
