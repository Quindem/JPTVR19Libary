/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import entity.Book;
import entity.History;
import entity.Reader;
import entity.User;
import java.util.Scanner;
import jptvr19libary.App;
import security.SecureManager;
import tools.creators.BookManager;
import tools.creators.LibaryManager;
import tools.creators.ReaderManager;
import tools.savers.BookSaver;
import tools.savers.HistorySaver;
import tools.savers.ReaderSaver;
import tools.savers.UserSaver;

/**
 *
 * @author pupil
 */
public class ReaderUI {
    private BookManager bookManager = new BookManager();
    private ReaderManager readerManager = new ReaderManager();
    private LibaryManager libaryManager = new LibaryManager();
    private BookSaver bookSaver = new BookSaver();
    private ReaderSaver readerSaver = new ReaderSaver();
    private HistorySaver historySaver = new HistorySaver();
    private SecureManager secureManager = new SecureManager();
    private UserSaver userSaver = new UserSaver();
    
    public void getReaderUI(Reader[] readers, User[] users, Book[] books, History[] histories){
        boolean repeat = true;
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Список книг");
            System.out.println("2. Выдать книгу читателю");
            System.out.println("3. Вернуть книгу в библиотеку");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Список книг ---");
                    bookManager.printListBooks(books);
                    break;
                case "2":
                    System.out.println("--- Выдать книгу читателю ---");
                    History history = libaryManager.takeOnBook(books, readers);
                    libaryManager.addHistoryToArray(history,histories);
                    historySaver.saveHistories(histories);
                    break;
                case "3":
                    System.out.println("--- Вернуть книгу в библиотеку ---");
                    libaryManager = new LibaryManager();
                    libaryManager.returnBook(histories);
                    historySaver = new HistorySaver();
                    historySaver.saveHistories(histories);
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}
    

