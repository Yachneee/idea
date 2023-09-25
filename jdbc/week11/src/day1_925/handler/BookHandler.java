package day1_925.handler;

import java.math.BigDecimal;
import java.sql.Date;

public class BookHandler implements Handler<Book> {

    @Override
    public Book getOne(Object... objects) {
        Book book = new Book();
        book.setId((int) objects[0]);
        book.setBookTitle((String) objects[1]);
        book.setPublicationDate((Date) objects[2]);
        book.setAuthor((String) objects[3]);
        book.setPrice((BigDecimal) objects[4]);
        book.setQuantity((Integer) objects[5]);
        return book;
    }
}