/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author group15
 */
public class TeacherManager {
    static ArrayList<Teacher> lsTC = new ArrayList<>();
    static ArrayList<Teacher> ls1 = new ArrayList<>();
    static ArrayList<Teacher> ls2 = new ArrayList<>();
//    Input information of long-term teacher or temp teacher - Le Minh Duc done
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        int type = 1;
        Teacher tc = null;
        do {
            System.out.println("1. Long term Teacher");
            System.out.println("2. Temp Teacher");
            System.out.println("");
            System.out.println("-------------------------");
            System.out.print("Your choice: ");
            type = sc.nextInt();
            switch(type) {
                case 1:
//                  upcasting
                    tc = new LongtermTeacher();
                    break;
                case 2:
//                  upcasting
                    tc = new TempTeacher();
                    break;        
            }
            tc.input();
            lsTC.add(tc);
            System.out.println("Continue?(Y/N)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
    }
//    Dummy Data - Le Minh Duc done
    public void dummyData(){
           lsTC.add(new LongtermTeacher("hong thai","098999",2019,"01/2022","cntt",1.5,25));
           lsTC.add(new LongtermTeacher("le duc","096217",2018,"01/2022","math",2.0,25));
           lsTC.add(new LongtermTeacher("hong thai","098999",2019,"03/2022","cntt",1.5,35));
           lsTC.add(new LongtermTeacher("le duc","096217",2018,"02/2022","math",2.0,30));
           lsTC.add(new LongtermTeacher("hong thai","098999",2019,"02/2022","cntt",1.5,30));
           lsTC.add(new LongtermTeacher("le duc","096217",2018,"03/2022","math",2.0,35));
           lsTC.add(new LongtermTeacher("duc nghia","097538",2020,"01/2022","llct",1.0,25));
          
           lsTC.add(new LongtermTeacher("duc nghia","097538",2020,"03/2022","llct",1.0,35));
           lsTC.add(new LongtermTeacher("thu thao","099523",2020,"01/2022","gdtc",1.0,25));
           
           lsTC.add(new LongtermTeacher("thu thao","099523",2020,"03/2022","gdtc",1.0,35));
           lsTC.add(new TempTeacher("tien dat","099212",2020,"01/2022","cntt",20));
           lsTC.add(new LongtermTeacher("thu thao","099523",2020,"02/2022","gdtc",1.0,30));
           lsTC.add(new TempTeacher("tien dat","099212",2020,"02/2022","cntt",25));
           
           lsTC.add(new TempTeacher("tien dat","099212",2020,"03/2022","cntt",20));
           
            lsTC.add(new LongtermTeacher("duc nghia","097538",2020,"02/2022","llct",1.0,30));
            lsTC.add(new TempTeacher("duc nam","01111",2020,"01/2022","math",20));
           lsTC.add(new TempTeacher("duc nam","01111",2020,"02/2022","math",25));
           lsTC.add(new TempTeacher("duc nam","01111",2020,"03/2022","math",20));
           lsTC.add(new TempTeacher("hao thien","094328",2021,"01/2022","llct",20));
           
           lsTC.add(new TempTeacher("hao thien","094328",2021,"03/2022","llct",20));
           lsTC.add(new TempTeacher("ha tien","093523",2021,"01/2022","gdtc",20));
           lsTC.add(new TempTeacher("hao thien","094328",2021,"02/2022","llct",25));
           lsTC.add(new TempTeacher("ha tien","093523",2021,"02/2022","gdtc",25));
           lsTC.add(new TempTeacher("ha tien","093523",2021,"03/2022","gdtc",20));
        }
//    Print list of teachers - Le Minh Duc done
    public void outputs(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%20s \n",
                "NAME","NUMPPHONE","YEAR JOIN", "MONTH WORK", "SPECIALIZE", "NUMHOUR", "NUMPERIOD", "COEFFICIENT", "SALARY");
        for (Teacher teacher : lsTC) {
            teacher.output();
        System.out.println("--------------------------------------------------------------------------");
        }
    }
//    Find teachers by name - Dang Hong Thai done
    public int findByName(String name){
        ls2 = (ArrayList<Teacher>)ls1.clone();
        System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%20s \n",
                "NAME","NUMPPHONE","YEAR JOIN", "MONTH WORK", "SPECIALIZE", "NUMHOUR", "NUMPERIOD", "COEFFICIENT", "SALARY");
        for (int i = 0; i < lsTC.size(); i++) {
            Teacher q = lsTC.get(i);
            if (q.getName().equalsIgnoreCase(name)) {
                q.output();
                ls1.add(q);
            }
        }
        if ( (ls1.size()) != (ls2.size()) ) {
            return 1;
        }
        return -1;
    }
//    Find teachers by the phone number - Dang Hong Thai done
    public int findByNumPhone(String numPhone){
        ls2 = (ArrayList<Teacher>)ls1.clone();
        System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%20s \n",
                "NAME","NUMPPHONE","YEAR JOIN", "MONTH WORK", "SPECIALIZE", "NUMHOUR", "NUMPERIOD", "COEFFICIENT", "SALARY");
        for (int j = 0; j < lsTC.size(); j++) {
            Teacher Tt = lsTC.get(j);
            if (Tt.getNumPhone().equalsIgnoreCase(numPhone)) {
                Tt.output();
                ls1.add(Tt);
            }
    }
        if ( (ls1.size()) != (ls2.size()) ) {
            return 1;
        }
        return -1 ;
    }
//    Delete teacher - Dang Hong Thai done
    public int deleteByNumPhone(String numPhone){
        ls2 = (ArrayList<Teacher>)ls1.clone();
        for (int j = 0; j < lsTC.size(); j++) {
            Teacher Tt = lsTC.get(j);
            if (Tt.getNumPhone().equalsIgnoreCase(numPhone)) {
                System.out.println("Deleted successful");
                lsTC.remove(j);
                j = j - 1;
                ls1.add(Tt);
            }
    }
        if ( (ls1.size()) != (ls2.size()) ) {
            return 1;
        }
        return -1 ;
    }
//    Find teachers by the specialize - Dang Hong Thai done
    public int findBySpecialize(String specialize){
        ls2 = (ArrayList<Teacher>)ls1.clone();
        System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%20s \n",
                "NAME","NUMPPHONE","YEAR JOIN", "MONTH WORK", "SPECIALIZE", "NUMHOUR", "NUMPERIOD", "COEFFICIENT", "SALARY");
        for (int k = 0; k < lsTC.size(); k++) {
            Teacher TT = lsTC.get(k);
            if (TT.getSpecialize().equalsIgnoreCase(  specialize)) {
                TT.output();
                ls1.add(TT);
                }
            }
        if ( (ls1.size()) != (ls2.size()) ) {
            return 1;
        }
        return -1 ;
    }
//    List teachers's salary by month - Dang Hong Thai done
    public int findByStat(String monthWork){
        ls2 = (ArrayList<Teacher>)ls1.clone();
        System.out.printf("%20s|%20s \n",
                "NAME", "SALARY");
        for (int j = 0; j < lsTC.size(); j++) {
            Teacher Tt = lsTC.get(j);
            if (Tt.getMonthWork().equalsIgnoreCase(monthWork)) {          
                Tt.outputst();
                ls1.add(Tt);
            }
    }
        if ( (ls1.size()) != (ls2.size()) ) {
            return 1;
        }
        return -1 ;
    }
//    Edit information of teacher - Dang Hong Thai done
    public int Edit(String numPhone, String monthWork){
         TeacherManager ls = new TeacherManager();
        for (int j = 0; j < lsTC.size(); j++) {
            Teacher Tt = lsTC.get(j);
            if ((Tt.getNumPhone().equalsIgnoreCase(numPhone)) && (Tt.getMonthWork().equalsIgnoreCase(monthWork))) {
                   int choice = 0;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("What kind of teacher do you want to edit to be?");
                    System.out.println("1. Long-Term Teacher");
                    System.out.println("2. Temporary Teacher");
            
                    choice = scanner.nextInt();
                    switch(choice) {
//                          Downcasting
                        case 1:
                            Teacher tc1 = new LongtermTeacher();
                            LongtermTeacher tc2 = (LongtermTeacher) tc1;
                            tc2.input();
                            lsTC.set(j, tc2);
                            break;
                        case 2:
                            Teacher tc3 = new TempTeacher();
                            TempTeacher tc4 = (TempTeacher) tc3;
                            tc4.input();
                            lsTC.set(j, tc4);
                            break;
                    }
                return 1;
            }
            
    }
        return -1 ;
    }
// Find list of teachers have salary more than a number - Le Minh Duc done
    public void getSalary (Double a){
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.printf("%20s|%8s|%8s|%10s|%10s|%8s|%8s|%8s|%20s \n",
                "NAME","NUMPPHONE","YEAR JOIN", "MONTH WORK", "SPECIALIZE", "NUMHOUR", "NUMPERIOD", "COEFFICIENT", "SALARY");
        for (Teacher tt : lsTC){
            if (tt.salary()>= a){
                tt.output();
            }
        }
    }
}