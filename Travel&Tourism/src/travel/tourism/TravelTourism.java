/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.tourism;

import People.*;
import java.awt.Menu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mostafa
 */

public class TravelTourism {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<User> UserLib = new ArrayList<User>();
    public static HashMap<String, User> hash = new HashMap<String, User>();

    public static void savehash() throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\oopproject\\Travel&tourism\\HashMap.bin"));
        oos.writeObject(hash);
        oos.close();
    }

    public static void loadhash() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\oopproject\\Travel&tourism\\HashMap.bin"));
        hash = (HashMap<String, User>) ois.readObject();
        ois.close();
    }

    boolean Exit = false;
    Scanner read = new Scanner(System.in);

    public int getinput(int NumChoices) { 
        int choice = -1;
        while (choice < 0 || choice > NumChoices) {
            try {
                // System.out.print("please enter your \n");
                System.out.print("enter your choice: ");
                choice = Integer.parseInt(read.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("invalid selection please enter a valid one");
            }

        }
        return choice;
    }

    public void PrintHeaderLine() {

        System.out.println("|--------------------------------------------|");
        System.out.println("|---------------Welcome to ------------------|");
        System.out.println("|-----------our Travel Agency----------------|");
        System.out.println("|------------------^_^-----------------------|");
    } //welcome hehe5 ;)

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Saving_User_Data test = new Saving_User_Data();
        test.load();
        System.out.println("Users Data loaded Successfully");
        try {
            loadhash();
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            System.out.println("Error While Loading Data");
        }
//        Reservation_Data test1=new Reservation_Data();
//        test1.load();
//        System.out.println("Reservation Data loaded Successfully");
        TravelTourism ezMenu = new TravelTourism();
        ezMenu.PrintHeaderLine();

        int choice2=-1;
        
        while (!ezMenu.Exit) {
            System.out.println("1) Login ");
            System.out.println("2) Register ");
            System.out.println("0) Exit");
            int choice = ezMenu.getinput(2);
            switch (choice) {
                case 0:
                    ezMenu.Exit = true;
                    System.out.println("Thanks for using our System");
                    break;
                case 1: //NE3MEL LOGINNNN HENAAA BEYTA2KED MEN 2L DATA 2L 3ANDO
  
                    System.out.println("Username: ");
                    Scanner read = new Scanner(System.in);
                    String Take_Username = read.next();
                    System.out.println("Password: ");
                    String Take_Password = read.next();
                    User temp = new User();
                     {
                        try {
                            if (!temp.Login(Take_Username, Take_Password)) {
                                //------------------------------------------------
                                System.out.println("incorrect username or password");
                                break;
                            }
                        } catch (Exception ex) {
                            System.out.println("Account doesn't exist");

                        }
                        finally{
                            while(choice2!=0)
                            {
                                System.out.println("1)Add reservation");
                                System.out.println("2)Edit reservation");
                                System.out.println("3)Cancel reservation");
                                System.out.println("0)Logout");
                                choice2=ezMenu.getinput(4);
                                switch(choice2)
                                {
                                    case 1:
                                       // System.out.println("case 1");
                                    break;
                                    
                                    case 2:
                                       // System.out.println("case 2");
                                    break;
                                    
                                    case 3:
                                        //System.out.println("case 3");
                                    break;
                                    
                                    case 0:
                                        System.out.println("Logout Successfull");
                                    break;
                                }
                            }
                        }
                         
                        
                        
                    }
                    if ("admin".equals(Take_Username) && "password".equals(Take_Password)) {     //  manager---------------------------------------------------------

                        System.out.println("1)Set schedule");
                        System.out.println("2)Give priveliage to PR");
                        System.out.println("0)Exit");
                        choice = ezMenu.getinput(11);               //CHOICES 2L 7ATEB2A GOWA MENU 2L ADMIN WA MOMKEN KMAN NEDY PERMISSION LEL PR YE3MEL ADD
                        switch (choice) {
                            case 0:
                                ezMenu.Exit = true;
                                System.out.println("0 sha8al");
                                break;
                        }

                    }
                   
                    
                    break;
                case 2:    //NE3MEL REGISTARTION HENAAAA
                    Scanner reads = new Scanner(System.in);
                    System.out.println("New Username: ");
                    String NUsername = reads.next();
                    System.out.println("New Password: ");
                    String NPassword = reads.next();
                    Saving_User_Data x = new Saving_User_Data();
                    Boolean taken = false;
                    if (hash.get(NUsername) != null)
                    {
                        System.out.println("Username already taken");
                            taken = true;
                    }
//                    for (User i : UserLib) {
//                        if (i.getUsername() == NUsername) {
//                            System.out.println("Username already taken");
//                            taken = true;
//                        }
//                    }
                    if (taken) {
                        break;
                    }
                    temp = new User();
                    temp.setUsername(NUsername);
                    temp.setPassword(NPassword);
                    //UserLib.add(temp);
                    hash.put(NUsername, temp);
                    savehash();
                    x.save();
                    System.out.println("Username registration successfull");

                    break;

                //---------------------------------------------------------------------------------
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

}
    
    

