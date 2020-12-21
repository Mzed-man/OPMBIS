package ms.com.Booktreasure.model.data.good;

import javax.persistence.*;

@Entity
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @Lob
    private String description;

    private int price;

}
