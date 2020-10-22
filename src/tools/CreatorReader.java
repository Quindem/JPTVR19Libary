/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;


import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreatorReader {
    private Scanner scanner = new Scanner(System.in);

    public Reader getReader() {
        Reader reader = new Reader();
        System.out.println("--- Имя читателя ---");
        System.out.print("Введите имя : ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("фамилия: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Телефон: ");
        reader.setPhone(scanner.nextLine());
        scanner.nextLine();
        return reader;
    }
    
}


