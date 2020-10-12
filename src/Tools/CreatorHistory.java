/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreatorHistory {
    public History takeOnBook(Book[] books, Reader[] readers){
        History history = new History();
        System.out.println("--- Список читателей ---");
                    for(int i = 0; i < readers.length; i++) {
                        if (readers[i] != null){
                            System.out.println(i+1+"." + readers[i].toString());
                                    }
                    }
        Scanner  scanner = new Scanner (System.in);
        System.out.print("Выбирите номер читателя");
        int readerNumber = scanner.nextInt();
        scanner.nextLine();
        Reader reader = readers[readerNumber-1];
        history.setReader(reader);
        System.out.println("--- Список книг ---");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null){
                            System.out.println(i+1+". " + books[i].toString());
                        }
                    }
        
        System.out.print("Выбирите номер Книги");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();
        Book book = books[bookNumber-1];
        history.setBook(book);
        Calendar calendar = new  GregorianCalendar();
        history.setGiveOutDate(calendar.getTime());
        return history;
    }
}
