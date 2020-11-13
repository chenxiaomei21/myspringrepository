package com.ibm.demo.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import com.ibm.demo.model.Book;

//用注解形式
@Mapper
public interface BookMapper {
 public int addBook(Book book);

 public int deleteBookById(int id);

 public int updateBookById(Book book);

 public Book getbookById();

 public List<Book> getAllBooks();

 public List<Book> queryBooksBySql(Map<String, Object> data);
}