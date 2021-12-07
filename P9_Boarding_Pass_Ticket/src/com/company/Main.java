package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CreateFile f = new CreateFile();
        GetInformation info = new GetInformation();
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to Airport!Please provide your name");
        info.setName(scan.nextLine());
        System.out.println("Email");
        info.setEmail(scan.nextLine());
        System.out.println("phoneNum");
        info.setPhoneNum(scan.nextLine());
        System.out.println("gender (M or F)");
        info.setGender(scan.nextLine());
        System.out.println("age");
        info.setAge(scan.nextInt());
        System.out.println("Date (MM-DD-YYYY)");
        info.setDate(scan.next());
        System.out.println("Origin");
        info.setOrigin(scan.next());
        System.out.println("Destination");
        info.setDestination(scan.next());
        System.out.println("Departure time (HH:MM):");
        info.setDeparTime(scan.next());

        String name = info.getName();
        String email = info.getEmail();
        String phoneNum = info.getPhoneNum();
        String gender = info.getGender();
        String date = info.getDate();
        String formatDate = info.getData(date);
        String destination = info.getDestination();
        String deparTime = info.getDeparTime();
        String ETA = info.getETA();
        String origin = info.getOrigin();
        int age = info.getAge();
        int price = info.totalPrice(info.getAge(), info.getGender());
        int passNum = info.getPass();


        f.createPass(passNum, formatDate, origin, destination, ETA, deparTime, name, email, phoneNum, gender, age, price);


    }
}
