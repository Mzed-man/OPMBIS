package ms.com.Booktreasure.model.data.management;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AuthorizationManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String token;
    @ManyToOne
    private Account account;

    @CreationTimestamp
    private Date created;

}
