/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fadhil Yaafi W
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

// ------------------------------------------

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            // Membuat aliran file output
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            
            // Menulis objek ke dalam stream 
            s.writeObject(person);
            
            System.out.println("Selesai menulis objek person"); 
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}