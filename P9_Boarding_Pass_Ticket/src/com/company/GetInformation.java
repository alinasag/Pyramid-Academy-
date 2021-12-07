package com.company;


import jdk.jfr.Timespan;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GetInformation {

    private String name, email, phoneNum, gender, date, origin, destination, deparTime;
    private int age, price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparTime() {
        return deparTime;
    }

    public void setDeparTime(String deparTime) {
        this.deparTime = deparTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


    public static int getPass() {
        Set<Integer> id = new HashSet<Integer>();
        id.add(3452670);
        id.add(5946872);
        id.add(2345733);
        id.add(9837425);
        id.add(5463924);
        id.add(2387569);
        id.add(7883752);
        id.add(3425925);

        Integer[] numb = id.toArray(new Integer[id.size()]);

        Random ran = new Random();

        int ranId = ran.nextInt(id.size());

        return numb[ranId];
    }

    public String getETA() {

        int randomHours = ThreadLocalRandom.current().nextInt(0, 5);
        int randomMinutes = ThreadLocalRandom.current().nextInt(0, 59);
        return LocalTime.of(randomHours, randomMinutes).format(DateTimeFormatter.ofPattern("HH:mm"));


    }

    public String getData(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
        String newDate = "";
        try {
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("EEE, d MMM yyyy");
            newDate = sdf.format(d);
        } catch (ParseException e) {
            System.out.println("Parse Exception");
        }
        return newDate;
    }

    public int totalPrice(int age, String gender) {
        int price = 1000;
        if (age <= 12) {
            price = (int) (price * 0.5);
        } else if (age >= 60) {
            price = (int) (price * 0.4);
        }

        if (gender.equals("F")) {
            price = (int) (price * 0.75);
        }
        return price;
    }

}
