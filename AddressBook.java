package com.bl.csvFile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.*;

public class AddressBook {

    public static void writeCSV(String filePath) {

        List<Contact> cr = new ArrayList<>();
        Contact c1= new Contact();

          c1.addContact();
          cr.add(c1);
            System.out.println("record added ");
            FileWriter fw = null;
            try{
                fw= new FileWriter("C:\\Users\\dell\\IdeaProjects\\CSVProject\\src\\main\\resources\\Contact.csv");
                fw.append("FirstName,Last Name, City, State, PhoneNumber , Email, Zip\n");
                for(Contact c : cr){
                    fw.append(c.getFirstName());
                    fw.append(",");
                    fw.append(c.getLastName());
                    fw.append(",");
                    fw.append(c.getCity());
                    fw.append(",");
                    fw.append(c.getState());
                    fw.append(",");
                    fw.append((char) c.getPhoneNumber());
                    fw.append(",");
                    fw.append(c.getEmail());
                    fw.append(",");
                    fw.append((char) c.getZip());
                    fw.append("\n");
                    System.out.println("");
                }
            }catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    fw.flush();
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }



    public static void readCsv(String filePath) throws IOException, CsvValidationException {

        CSVReader cr = new CSVReader(new FileReader("C:\\Users\\dell\\IdeaProjects\\CSVProject\\src\\main\\resources\\Contact.csv"));
        String[] data;
        while ((data = cr.readNext()) != null){
            for(String var : data){
                System.out.print(var + " ");
            }
            System.out.println();
        }
        cr.close();
    }



    public static void main(String[] args) throws CsvValidationException, IOException {

        String filePath = "C:\\Users\\dell\\IdeaProjects\\CSVProject\\src\\main\\resources\\Contact.csv";

        System.out.println("starting write user.csv file: " + filePath);
        writeCSV(filePath);

        System.out.println("starting read user.csv file");
        readCsv(filePath);
    }
}
