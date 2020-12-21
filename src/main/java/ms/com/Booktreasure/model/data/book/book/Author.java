package ms.com.Booktreasure.model.data.book.book;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ms.com.Booktreasure.model.data.localization.City;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fName;
    private String lName;

    private String phone;
    private String zip;

    @ManyToOne
    private City city;
    @Lob
    private String address;

    @Lob
    private String contract;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Book> books;

    @CreationTimestamp
    private Date created;

}
