/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19libary;

import Tools.ReaderSaver;
import Tools.BookSaver;
import entity.Book;
import entity.Reader;
import java.util.Scanner;
import Tools.CreatorBook;
import Tools.CreatorHistory;
import Tools.CreatorReader;
import Tools.HistorySaver;
import entity.History;



/**
 *
 * @author pupil
 */
 class App {
    private Book[] books = new Book[10];
    private Reader[] readers = new Reader[10];
    private History[] histories = new History[10];
    public App(){
        BookSaver bookSaver = new BookSaver();
        books = bookSaver.loadBooks();
        ReaderSaver readerSaver = new ReaderSaver();
        readers = readerSaver.loadReaders();
        HistorySaver historySaver = new HistorySaver();
        histories = historySaver.loadHistories();
    }
    public void run(){
        boolean repeat = true;
        System.out.println("--- Библиотека ---");
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Список книг");
            System.out.println("3. Зарегистрировать читателя");
            System.out.println("4. Список читателей");
            System.out.println("5. Выдать книгу читателю");
            System.out.println("6. Вернуть книгу в библиотеку");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новую книгу ---");
//                    Book book = new Book("Voina i mir", "L.Tolstoy", 2010, "123-1234");
                    CreatorBook creatorBook = new CreatorBook();
                    Book book = creatorBook.getBook();
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] == null){
                            books[i] = book;
                            break;
                        }
                    }
                    BookSaver bookSaver = new BookSaver();
                    bookSaver.saveBooks(books);
                    System.out.println("Создана книга: "+book.getName());
                    //System.out.println(book.toString());
                    break;
                case "2":
                    System.out.println("--- Список книг ---");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null){
                            System.out.println(i+1+". " + books[i].toString());
                        }
                    }
                    break;
                case "3":
                    System.out.println("--- Зарегистрировать читателя ---");
                      CreatorReader creatorReader = new CreatorReader();
                     Reader reader = creatorReader.getReader();
                     System.out.println("Имя читателя: "
                            +reader.getFirstname()
                            +" "
                            + reader.getLastname()
                    );
                    System.out.println(reader.toString());
                    ReaderSaver readerSaver =  new ReaderSaver();
                    break;
                case "4":
                    System.out.println("--- Список читателей ---");
                    for(int i = 0; i < readers.length; i++) {
                        if (readers[i] != null){
                            System.out.println(i+1+"." + readers[i].toString());
                                    }
                    }
                    break;
                case "5":
                    System.out.println("--- Выдать книгу читателю ---");
                    CreatorHistory creatorHistory = new CreatorHistory();
                    History history = creatorHistory.takeOnBook(books, readers);
                    for (int i = 0; i < histories.length;i++){
                     if(histories[i] == null){
                         histories[i] = history;
                         break;   
                    }
                    
                     } 
                    HistorySaver historySaver = new HistorySaver();
                    historySaver.saveHistories(readers);
                    break;
                case "6":
                    System.out.println("--- Вернуть книгу в библиотеку ---");
                    break;
                case "7":
                    System.out.println("--- Список выданных книг ---");
                    for(int i = 0; i < histories.length; i++) {
                        if (histories[i] != null){
                            System.out.println(i+1+"." + histories[i].toString());
                                    }
                    }
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}
      
     
        
     

   

   
