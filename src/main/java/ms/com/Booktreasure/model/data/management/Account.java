package ms.com.Booktreasure.model.data.management;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 0 = transactional account
     * 1 = administrative account
     */
    private int type;

    private String userName;
    @Lob
    private String password;

    @CreationTimestamp
    private Date created;

}
