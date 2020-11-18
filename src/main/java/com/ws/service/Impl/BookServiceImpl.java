package com.ws.service.Impl;

import com.ws.bean.Book;
import com.ws.dao.BookMapper;
import com.ws.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> findBooks(){
        return bookMapper.findBooks();
    }

    public Boolean addBook(Book book){

        return bookMapper.addBook(book);
    }

    public List<Book> findBooksSpe(String string) {
        return bookMapper.findBooksSpe(string);
    }

    public Boolean updateBook(Book book) {
       return bookMapper.updateBook(book);
    }

    public Boolean deleteBook(Integer bookId) {
        return bookMapper.deleteBook(bookId);
    }

    public Book findBookById(Integer integer) {
        return bookMapper.findBookById(integer);
    }
}
