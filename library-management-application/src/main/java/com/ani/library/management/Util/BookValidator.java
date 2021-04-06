package com.ani.library.management.Util;


import com.ani.library.management.DataAccessLayer.Book;

public class BookValidator {

    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle()==null)
            return false;
        return true;
    }
}
