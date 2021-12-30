
package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



class FileOperations {
    private static HashMap<String, Integer> insuranceList;
    private static ArrayList<Medicament> medicamentList;
    private static ArrayList<BabyMotherCare> motherBabyCareList;
    private static ArrayList<Dermacosmetic> dermacosmeticList;
    private static ArrayList<User> userList;

    static ArrayList<User> setUserList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static  FileInputStream fis;
    private static  Scanner sc;
    private static FileWriter fw;
  
    
    public static HashMap<String,Integer> readInsurance(){
         try {
             insuranceList= new LinkedHashMap<>();
            fis= new FileInputStream("insurance_list.txt");
             sc = new Scanner(fis);
             sc.nextLine(); // skip first line 
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 String[] arr = line.split(",");
                 insuranceList.put(arr[0],Integer.parseInt(arr[1]));
             }
        } catch (FileNotFoundException ex) {
            
        }
        return insuranceList;
    }
    public static ArrayList<Medicament> readMedicamentList(){
        try {
            medicamentList= new ArrayList<>();
            fis= new FileInputStream("pharmacy.txt");
             sc = new Scanner(fis);
             sc.nextLine();
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 String[] arr = line.split("!");
                 //public Product(String barcode, String productName, String activeChemical, String receteType, double price, String color,int stockQ)
                 Medicament medicine = new Medicament(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),arr[5],Integer.parseInt(arr[6]));
                 medicamentList.add(medicine);
             }
        } catch (FileNotFoundException ex) {
            
        }
        return medicamentList;
    }

    public static ArrayList<Dermacosmetic> readDermacosmeticList(){
        try {
            dermacosmeticList= new ArrayList<>();
            fis= new FileInputStream("dermacosmetics.txt");
             sc = new Scanner(fis);
             sc.nextLine();
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 
                 String[] arr = line.split(",");
                 
                 //String barcode, String productName, double price, int stockQ,String category
                 Dermacosmetic dermacosmeticProduct = new Dermacosmetic(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4]);
                 dermacosmeticList.add(dermacosmeticProduct);
             }
        } catch (FileNotFoundException ex) {
            
        }
        return dermacosmeticList;
    }
    public static ArrayList<BabyMotherCare> readMotherBabyCareList(){
        try {
            motherBabyCareList= new ArrayList<>();
            fis= new FileInputStream("mother_baby_care_products.txt");
             sc = new Scanner(fis);
             sc.nextLine();
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 String[] arr = line.split(",");
                 
                 //String barcode, String productName, double price, int stockQ,String category
                 BabyMotherCare babyMomCareProduct = new BabyMotherCare(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4]);
                 motherBabyCareList.add(babyMomCareProduct);
             }
        } catch (FileNotFoundException ex) {
            
        }
        return motherBabyCareList;
    }
    
    public static void updateMedicamentTxt(ArrayList<Medicament> list){
        try {
            fw = new FileWriter("pharmacy.txt");
            fw.write("");
            fw.write("barcode,name,chemical,type,price,color,quantity");
            fw.close();
            fw=new FileWriter("pharmacy.txt",true);
            for (int i = 0; i < list.size(); i++) {
                Medicament ph = list.get(i);
                String s = "\n"+ph.getBarcode()+"!"+ph.getProductName()+"!"+ph.getActiveChemical()+"!"+ph.getPrescriptionType()+"!"+ph.getColor()+"!"+ph.getStockQ();
                fw.append(s);
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public static void updateDermacosmeticTxt(ArrayList<Dermacosmetic> list){
        try {
            fw = new FileWriter("dermacosmetics.txt");
            fw.write("");
            fw.write("barcode,productName,price,stock,category");
            fw.close();
            fw=new FileWriter("dermacosmetics.txt",true);
            for (int i = 0; i < list.size(); i++) {
                Dermacosmetic dermaProduct = list.get(i);
                String s = "\n"+dermaProduct.getBarcode()+","+dermaProduct.getProductName()+","+dermaProduct.getPrice()+","+dermaProduct.getStockQ()+","+dermaProduct.getCategory();
                fw.append(s);
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    public static void updateMomBabyTxt(ArrayList<BabyMotherCare> list){
        try {
            fw = new FileWriter("mother_baby_care_products.txt");
            fw.write("");
            fw.write("barcode,name,price,quantity,category");
            fw.close();
            fw=new FileWriter("mother_baby_care_products.txt",true);
            for (int i = 0; i < list.size(); i++) {
                BabyMotherCare bm = list.get(i);
                String s = "\n"+bm.getBarcode()+","+bm.getProductName()+","+bm.getPrice()+","+bm.getStockQ()+","+bm.getCategory();
                fw.append(s);
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static HashMap<String, Integer> getInsuranceList() {
        return insuranceList;
    }

    public static void setInsuranceList(HashMap<String, Integer> insuranceList) {
        FileOperations.insuranceList = insuranceList;
    }

    public static ArrayList<Medicament> getMedicamentList() {
        return medicamentList;
    }

    public static void setMedicamentList(ArrayList<Medicament> medicamentList) {
        FileOperations.medicamentList = medicamentList;
    }
   
    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        FileOperations.userList = userList;
    }

    public static ArrayList<BabyMotherCare> getMotherBabyCareList() {
        return motherBabyCareList;
    }

    public static void setMotherBabyCareList(ArrayList<BabyMotherCare> motherBabyCareList) {
        FileOperations.motherBabyCareList = motherBabyCareList;
    }

    public static ArrayList<Dermacosmetic> getDermacosmeticList() {
        return dermacosmeticList;
    }

    public static void setDermacosmeticList(ArrayList<Dermacosmetic> dermacosmeticList) {
        FileOperations.dermacosmeticList = dermacosmeticList;
    }

    
    
    
    
}
