/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.process;
import com.bookstore.entity.Book;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
/**
 *
 * @author mario
 */
@Stateless
@LocalBean
public class BookFacade extends AbstractFacade<Book, Long>{
    
  public BookFacade(){
      super(Book.class);
  }  
    
}
