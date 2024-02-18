/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author group15
 */
// All Le Minh Duc done
public class Teacher {
    private String name;
    private String numPhone;
    private int year;
    private String monthWork;
    private String specialize;
    private double salary;
    public Teacher() {
    }

    public Teacher(String name, String numPhone, int year, String monthWork, String specialize) {
        this.name = name;
        this.numPhone = numPhone;
        this.year = year;
        this.monthWork = monthWork;
        this.specialize = specialize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonthWork(String monthWork) {
        this.monthWork = monthWork;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }


    public String getName() {
        return name;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public int getYear() {
        return year;
    }

    public String getMonthWork() {
        return monthWork;
    }

    public String getSpecialize() {
        return specialize;
    }
    public double salary() {
        return salary;
    }
//    Input information of parent class teacher
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input name: ");
        setName(sc.nextLine());
        System.out.println("input numPhone: ");
        sc = new Scanner(System.in);
        setNumPhone(sc.nextLine());
        System.out.println("input year: ");
        sc = new Scanner(System.in);
        setYear(sc.nextInt());
        System.out.println("input monthWork: ");
        sc = new Scanner(System.in);
        setMonthWork(sc.nextLine());
        System.out.println("input specialize: ");
        sc = new Scanner(System.in);
        setSpecialize(sc.nextLine());
    }
//    Print information of parent class teacher
    public void output(){
        System.out.print("=>"+getName()+" - "+getNumPhone()+" - "+getYear()+" - "+getMonthWork()+" - "+getSpecialize());
    }
    public void outputst(){
        System.out.printf("%20s|%20f \n",
         getName(),salary());
        
    }
}

