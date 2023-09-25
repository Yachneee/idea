package day1_925.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String bookTitle;
    private Date publicationDate;
    private String author;
    private BigDecimal price;
    private int quantity;
}
