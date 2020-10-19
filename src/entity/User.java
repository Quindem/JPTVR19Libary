/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class User implements Serializable{
    private String login;
    private String password;
    private String role;
    private Reader reader;
    
    public User() {
    public class createrUser {
        private Scanner scanner = new Scanner(System.in);
    
    public User createUser() {
        User user = new User();
        System.out.println("--- Создание пользователя ---");
        System.out.println("Введите логин: ");
        user.setLogin(scanner.nextLine());
        System.out.println("Введите пароль: ");
        user.setPassword(scanner.nextLine());
        System.out.println("Укажите роль: ");
        user.setRole(scanner.nextLine());
        user.setReader(reader);
        System.out.println("Пользователь создан: "+user.toString());
        return user;
    }
}
    public void addBookToArray(Book book, Book[] books) {
    for (int i = 0; i < books.length; i++) {
        
    }
}

    public User(String login, String password, String role, Reader reader) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "User{"
                + "login=" + login 
                + ", password=" + password 
                + ", role=" + role 
                + ", reader=" + reader
                + '}';
    }
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
    
    
}

