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

/**
 *
 * @author akin
 */
public class Pharmacist extends User{
    
    private String txt_name="pharmacist.txt";
    ArrayList<User> pharmacist = new ArrayList<>();

    public Pharmacist(String username, String password, String membership) {
        super(username, password, membership);
    }
    
    
    public Pharmacist()
    {
        
    }

    @Override
    public void updateUsersTxt(ArrayList<User> userList) {
        try {
            FileWriter fw = new FileWriter(txt_name);
            fw.write("");
            fw.write("username,password,membership");
            fw.close();
            fw=new FileWriter(txt_name,true);
            for (int i = 0; i < userList.size(); i++) {
                Pharmacist ph = (Pharmacist) userList.get(i);
                String s = "\n"+ph.getUsername()+","+ph.getPassword() + ","+ph.getMembership();
                fw.write(s);
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    @Override
    public void writeUsersTxt(User user) {
        String st = "\n"+user.getUsername()+","+user.getPassword()+","+user.getMembership();
        
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
                 User u = new Pharmacist(arr[0],arr[1],arr[2]);
                 pharmacist.add(u);
             }
        } catch (FileNotFoundException ex) {
            
        }
        return pharmacist;
    }
}
