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
public class Main {
    public static void main(String[] args)  {

       menu();
    }
//    Menu options - Le Minh Duc done
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        TeacherManager ls = new TeacherManager();
        int choice = 0;
        while(true) {
            System.out.println("-----------Menu--------");
            System.out.println("0. DummyData");
            System.out.println("1. Add teacher");
            System.out.println("2. Print list teacher");
            System.out.println("3. Find teachers by name");
            System.out.println("4. Find teacher by phone number");
            System.out.println("5. Find teachers by specialize");
            System.out.println("6. Find list teachers have salary more than a number");
            System.out.println("7. List teachers's salary in a month");
            System.out.println("8. Delete teacher");
            System.out.println("9. Edit information teacher");
            System.out.println("--------");
            System.out.println("You want to choice?");
            choice = sc.nextInt();
            switch(choice) {
                case 0: ls.dummyData(); break;
                case 1: ls.inputs(); break;
                case 2: ls.outputs(); break;
                case 3: 
                    System.out.print("Input teacher's name: ");
                    Scanner input = new Scanner(System.in);
                    String findName = input.nextLine();
                    int pos = ls.findByName(findName);
                    if (pos < 0) {
                        System.out.println("Cant find Teacher");
                    }
                    break;
                case 4:
                    System.out.print("Input teacher's phone number: ");
                    Scanner input1 = new Scanner(System.in);
                    String findNum = input1.nextLine();
                    int pos1 = ls.findByNumPhone(findNum);
                    if (pos1 < 0) {
                        System.out.println("Cant find teacher ");
                    }
                    break;
                case 5:
                    System.out.print("Input teacher's specialize: ");
                    Scanner input2 = new Scanner(System.in);
                    String findSpecialize = input2.nextLine();
                    int pos2 = ls.findBySpecialize(findSpecialize);
                    if (pos2 < 0) {
                        System.out.println("Cant find teacher ");
                    }
                    break;
                case 6:
                    System.out.print("Input number of salary: ");
                    ls.getSalary(Double.NaN);
                    break;
                case 7:
                    System.out.print("List teacher's salary by month: ");
                    Scanner input3 = new Scanner(System.in);
                    String findBySta = input3.nextLine();
                    int pos3 = ls.findByStat(findBySta);
                    if (pos3 < 0) {
                        System.out.println("Cant find teacher ");
                    }
                    break;
                case 8:
                    System.out.print("Input teacher's phone number: ");
                    Scanner input4 = new Scanner(System.in);
                    String delete = input4.nextLine();
                    int pos4 = ls.deleteByNumPhone(delete);
                    if (pos4 < 0) {
                        System.out.println("Cant find teacher ");
                    }
                    break;
                case 9:
                    System.out.print("Input teacher's phone number: ");
                    Scanner input5 = new Scanner(System.in);
                    String edit1 = input5.nextLine();
                    System.out.print("Input the month: ");
                    Scanner input6 = new Scanner(System.in);
                    String edit2 = input6.nextLine();
                    int pos5 = ls.Edit(edit1, edit2);
                    if (pos5 < 0) {
                        System.out.println("Cant find teacher ");
                    }
                    break;
            }
        }
    }
}