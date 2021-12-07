package com.company;

import javax.print.attribute.standard.Destination;
import java.io.*;
import java.util.Scanner;

public class CreateFile {

    public static void createPass(int passNum, String Date, String Origin, String destination, String ETA, String depTime, String name, String email, String phoneNum, String gender, int age, int price) {

//        try {
//            File file = new File("BoardingPassTicket.txt");
//            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        File file = new File ("/Users/alinaken/Desktop/GenSpark/Down/Boarding_Pass_Ticket/BoardingPassTicket.txt");

        String str = "ID #: " + passNum + "  Name: " + name + "  Gender: " + gender + "  Age: " + age + "  " + "Date: " + Date +
                "\n" + "Phone #: " + phoneNum + "  Email: " + email + "\n" + "Origin: " + Origin +
                "  Destination: " + destination + "\n" +
                "Departure Time: " + depTime + "  Arrival Time: " + ETA + "  Price: " + price;
        try {
            FileReader fr = new FileReader(file);
            int size = fr.read();
            Scanner scan1 = new Scanner(fr);

            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (size > -1) {
                bw.newLine();
                bw.newLine();
            }
            bw.write(str);
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }

}
