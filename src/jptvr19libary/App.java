/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19libary;

import entity.Book;
import java.util.Scanner;


/**
 *
 * @author pupil
 */
 class App {
    public void run(Book[] books){
        System.out.println("---Библиотека---");
        boolean repeat = true;
        do{
        System.out.println("Задачи");
        System.out.println("1. добавить новую книгу");
        System.out.println("2.список книг");
        System.out.println("3.Зарегистрировать читателя");
        System.out.println("4.список читателей");
        System.out.println("5.выдать книгу читателю");
        System.out.println("6.вернуть книгу в библиотеку");
        System.out.println("выйти из программы");
        System.out.println("выбирите задание");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        switch (task){
            case "0":
                System.out.println("---- Конец программы ----");
                    repeat = false;
                break;
            case"1":
                System.out.println("добавить новую книгу");
                Book book = new Book("Voina i Mir", "L.Tolstoy", 2010);
                books[0] = book;
                    
                break;
            case "2":
                System.out.println("список книг");
                break;
            case "3":
                System.out.println("Зарегистрировать читателя");
                break;
            case "4":
               System.out.println("выдать книгу читателю");
                break;
            case "5":
                System.out.println("вернуть книгу в библиотеку");
                break;
            case "6":
                System.out.println("вернуть книгу в библиотеку");
                break;
            default:
                System.out.println("нет такой задачи");
                
        }
    }while(repeat);
}
}
        

