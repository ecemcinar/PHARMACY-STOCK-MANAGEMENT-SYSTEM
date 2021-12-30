/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Supplier extends User{
    ArrayList<User> supplier = new ArrayList<>();
    private String txt_name="supplier.txt";
    private String name;
    private String surname;

    public Supplier(String username, String password,String name, String surname, String membership) {
        super(username, password, membership);
        this.name = name;
        this.surname = surname;
    }
    
    
    
    public Supplier()
    {
        
    }

    @Override
    public void updateUsersTxt(ArrayList<User> user) {
         try {
            FileWriter fw = new FileWriter(txt_name);
            fw.write("");
            fw.write("username,password,name,surname,membership");
            fw.close();
            fw=new FileWriter(txt_name,true);
            for (int i = 0; i < user.size(); i++) {
                Supplier cs = (Supplier) user.get(i);
                String s = "\n"+cs.getUsername()+","+cs.getPassword()+","+cs.getName()+","+cs.getSurname() +","+cs.getMembership();
                fw.append(s);
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void writeUsersTxt(User user) {
        Supplier cs = (Supplier) user;
        String st = "\n"+cs.getUsername()+","+cs.getPassword()+","+cs.getName()+","+cs.getSurname()+","+cs.getMembership();       
        
        try {
             FileWriter fw = new FileWriter(txt_name,true);
             fw.append(st);
             fw.close();
        } catch (IOException ex) {
             System.err.println("IOException: " + ex.getMessage());
        }
    }

    @Override
    public  ArrayList<User> read_txt() {
        try {
             FileInputStream fis= new FileInputStream(txt_name);
             Scanner sc = new Scanner(fis);
             sc.nextLine(); // skip first line 
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 String[] arr = line.split(",");
                 User u = new Supplier(arr[0],arr[1],arr[2],arr[3],arr[4]);
                 supplier.add(u);
             }
        } catch (FileNotFoundException ex) {
            
        }
        return supplier;
    }

    public ArrayList<User> getSupplier() {
        return supplier;
    }

    public void setSupplier(ArrayList<User> supplier) {
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    @Override
    public void setMembership(String membership) {
        super.setMembership(membership); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMembership() {
        return super.getMembership(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return super.getUsername(); //To change body of generated methods, choose Tools | Templates.
    }
    

   
    
    
    
    
}
