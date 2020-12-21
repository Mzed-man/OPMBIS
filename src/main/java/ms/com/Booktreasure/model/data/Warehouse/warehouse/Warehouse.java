package ms.com.Booktreasure.model.data.Warehouse.warehouse;

import ms.com.Booktreasure.model.data.Warehouse.manager.WManager;
import ms.com.Booktreasure.model.data.localization.City;

import javax.persistence.*;

@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String name;

    @ManyToOne
    private City city;
    @Lob
    private String address;

    private String postalCode;
    private String fax;
    private String phone;

    @ManyToOne
    private WManager manager;

}
