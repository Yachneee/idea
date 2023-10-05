package day2_926.utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public static class BookHandler implements Handler<Book> {

        @Override
        public List<Book> handle(ResultSet set) throws SQLException {
            List<Book> list=new ArrayList<>();
            while (set.next()){
                Book book = new Book();
                book.setId(set.getInt("id"));
                book.setBookTitle(set.getString("book_title"));
                book.setPublicationDate(set.getDate("publication_date"));
                book.setAuthor(set.getString("author"));
                book.setPrice(set.getBigDecimal("price"));
                book.setQuantity(set.getInt("quantity"));
                list.add(book);
            }
            return list;
        }
    }
}
