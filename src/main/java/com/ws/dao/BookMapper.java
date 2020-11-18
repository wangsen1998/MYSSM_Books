package com.ws.dao;

import com.ws.bean.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
    //查询所有书籍
    @Select("select * from books")
    List<Book> findBooks();
    //添加书籍
    @Insert("insert into books(book_id,book_name,book_price,book_author,book_publisher) values (null,#{bookName},#{bookPrice},#{bookAuthor},#{bookPublisher})")
    Boolean addBook(Book book);
    //查询指定书籍
    @Select("select * from books where book_name like CONCAT(CONCAT('%', #{bookName}), '%')")
    List<Book> findBooksSpe(String string);
    //更新书籍
    @Update("update books set book_name = #{bookName}, book_price = #{bookPrice}, book_author = #{bookAuthor}, book_publisher = #{bookPublisher} where book_id = #{bookId}")
    Boolean updateBook(Book book);
    //删除书籍
    @Delete("delete from books where book_id=#{bookId}")
    Boolean deleteBook(Integer bookId);
    //根据id查找
    @Select(" select * from books where book_id = #{bookId}")
    Book findBookById(Integer integer);
}
