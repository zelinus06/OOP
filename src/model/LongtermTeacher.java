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
// Class LongtermTeacher inherited class Teacher - Le Minh Duc done
public class LongtermTeacher extends Teacher implements CalSalary {
    private double coefficient;
    private int numPeriod;

    public LongtermTeacher() {
    }

    public LongtermTeacher(String name, String numPhone, int year, String monthWork, String specialize, double coefficient, int numPeriod) {
        super(name, numPhone, year, monthWork, specialize);
        this.coefficient = coefficient;
        this.numPeriod = numPeriod;
    }
    
    public double getCoefficient() {
        return coefficient;
    }

    public int getNumPeriod() {
        return numPeriod;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void setNumPeriod(int numPeriod) {
        this.numPeriod = numPeriod;
    }
//Overiding method input() of parent class teacher - Le Minh Duc done
    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input coefficient : ");
        setCoefficient(sc.nextDouble());
        System.out.print("Input number of period : ");
        setNumPeriod(sc.nextInt());
    }
//    Overiding method salary() in the Interface CalSalary - Dang Hong Thai done
    @Override
    public double salary() {
        return (this.coefficient*3000000 + this.numPeriod*50000);
    }
//    Overiding method output() of parent class teacher - Le Minh Duc done
    @Override
    public void output() {
        System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%30f \n",
                getName(),getNumPhone(),getYear(),getMonthWork(),getSpecialize(),0.0,getNumPeriod(),getCoefficient(),salary());
    }
}
