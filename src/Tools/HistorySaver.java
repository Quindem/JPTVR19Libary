/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import entity.Book;
import entity.History;
import entity.Reader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pupil
 */
public class HistorySaver {
     public class readerSaver {
    public void saveReaders(Reader[]readers){
}
    {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("readers");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(histories);
            oos.flush();
        }catch (FileNotFoundException ex){
            System.out.println("Не найден файл");
        }catch (IOException ex){
            System.out.println("Ошибка ввода/вывода");
        
   
    public History[] loadHistories(){
    History[] readers = new Reader[10];
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("histories");
            ois = new ObjectInputStream(fis);
         readers = (Reader[]) ois.readObject();
        } catch (FileNotFoundException ex) {
           System.out.println("Не найден файл");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс");
        }
        return histories;
    }
        

