package ms.com.Booktreasure.model.data.Warehouse.manager;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.data.Warehouse.warehouse.Warehouse;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class WManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fName;
    private String lName;

    @OneToMany(mappedBy = "manager")
    @JsonIgnore
    private List<Warehouse> warehouses;

    @CreationTimestamp
    private Date created;

}
