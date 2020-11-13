package com.ibm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.model.Book;
import com.ibm.demo.service.BookService;


//注意:controller层跟service层联系一起

@RestController
public class BookController {
// 导入service层，用自动装配
 @Autowired
 BookService bookService;
 
// 用get请求
 @GetMapping("/add")
 public void addBook() {
  Book b = new Book();
  b.setName("红楼梦");
  b.setId(2);
  b.setAuthor("曹雪芹");
  bookService.addBook(b);
 }
 
 @GetMapping("/findAll")
 public List<Book> getAllBooks() {
  List<Book> books = bookService.getAllBooks();
  System.out.println(books);
  return books;
 }
 

// 用post请求(postman上用body选择raw和json格式发送请求)
 @PostMapping("/book/add")
 public Book addBook(@RequestBody Book b) {
  bookService.addBook(b);
  return b;
 }
 
 
}