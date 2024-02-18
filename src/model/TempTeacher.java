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
// Class TempTeacher inherited class Teacher - Le Minh Duc done
public class TempTeacher extends Teacher implements CalSalary {
    private int numHour;

    public TempTeacher() {
    }

    public TempTeacher(String name, String numPhone, int year, String monthWork, String specialize, int numHour) {
        super(name, numPhone, year, monthWork, specialize);
        this.numHour = numHour;
    }


    public int getNumHour() {
        return numHour;
    }

    public void setNumHour(int numHour) {
        this.numHour = numHour;
    }
//Overiding method input() of parent class teacher - Le Minh Duc done
    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of hours: ");
        setNumHour(sc.nextInt());
    }
    //    Overiding method salary() in the Interface CalSalary - Dang Hong Thai done
    public double salary() {
        return (this.numHour*500000 + 1000000);
    }
    //    Overiding method output() of parent class teacher - Le Minh Duc done
    @Override
    public void output() { 
         System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%30f \n",
                getName(),getNumPhone(),getYear(),getMonthWork(),getSpecialize(),getNumHour(),0.0,0.0,salary());
               
    }
}
