package ms.com.Booktreasure.model.data.book.book;

import ms.com.Booktreasure.model.data.book.category.BSubCategory;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String title;

    @ManyToOne
    private BSubCategory subCategory;

    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;

    @Lob
    private String description;

    private int price;
    private Date publicationDate;

}
