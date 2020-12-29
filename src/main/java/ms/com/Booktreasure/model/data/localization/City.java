package ms.com.Booktreasure.model.data.localization;

import javax.persistence.*;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String name;

    @ManyToOne
    private Region region;

}
