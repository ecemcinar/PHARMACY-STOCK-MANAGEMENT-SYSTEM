package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Customer extends User {
    private long id;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String bloodGroup;
    private String insurance;
    
    
    private String txt_name="customer.txt";
    ArrayList<User> customer;
    
    public Customer()
    {
        
    }

    public Customer(long id, String username, String password,String name, String surname, int age, String gender, String bloodGroup, String insurance, String membership) {
        super(username, password, membership);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.insurance = insurance;
    }
    
    @Override
    public void updateUsersTxt(ArrayList<User> user) {
       try {
            FileWriter fw = new FileWriter(txt_name);
            fw.write("");
            fw.write("id,username,password,name,surname,age,gender,bloodgroup,insurance,membership");
            fw.close();
            fw=new FileWriter(txt_name,true);
            for (int i = 0; i < user.size(); i++) {
                Customer cs = (Customer) user.get(i);
                String s = "\n"+cs.getId() + ","+cs.getUsername()+","+cs.getPassword()+","+cs.getName()+","+cs.getSurname()+","+cs.getAge()+","+cs.getGender()+","+cs.getBloodGroup()+","+
                cs.getInsurance()+","+cs.getMembership();
                fw.append(s);
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void writeUsersTxt(User user) {
        //long id, String username, String password,String name, String surname, int age, String gender, String bloodGroup, String insurance, String membership
        
        Customer cs = (Customer) user;
        String st = "\n"+cs.getId()+","+cs.getUsername()+","+cs.getPassword()+","+cs.getName()+","+cs.getSurname()+","+cs.getAge()+","+cs.getGender()+","+cs.getBloodGroup()+","+
                cs.getInsurance()+","+cs.getMembership();       
        
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
            customer= new ArrayList<>();
             FileInputStream fis= new FileInputStream(txt_name);
             Scanner sc = new Scanner(fis);
             sc.nextLine(); // skip first line 
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 String[] arr = line.split(",");
                 //public User      (long id, String username, String password, String name, String surname, String gender, int age, String bloodGroup, String insurance, String membership)
                 //newUser = new User(IDInput,usernameInput,passwordInput,nameInput,surnameInput,genderInput,ageInput,bloodGroupInput,insuranceInput,membershipInput);
                 Customer u = new Customer(Long.parseLong(arr[0]),arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]),arr[6],arr[7],arr[8],arr[9]);
                 customer.add(u);
             }
        } catch (FileNotFoundException ex) {
            
        }
        return customer;
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
    public void setUsername(String username) {
        super.setUsername(username); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return super.getUsername(); //To change body of generated methods, choose Tools | Templates.
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

        
    }

