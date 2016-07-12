/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CollectionExample;

import com.leapfrog.CollectionExample.entity.Students;

import com.leapfrog.CollectionExample.entitydaoImpl.StudentDAOImpl;
import com.leapfrog.CollectionExampledao.StudentDAO;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      StudentDAO stdDAO= new StudentDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Students");
            System.out.println("2. Show all Students");
            System.out.println("3. Delete Students");
            System.out.println("4. Search BY Id");
            System.out.println("5. Exit");
            System.out.println("6. Enter your choice[1-6]");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Students std = new Students();
                    System.out.println("Enter Id:");
                    std.setId(input.nextInt());
                    System.out.println("Enter the First Name:");
                    std.setFirstName(input.next());
                    System.out.println("Enter the last Name:");
                    std.setLastName(input.next());
                    System.out.println("Enter the Email:");
                    std.setEmail(input.next());
                    System.out.println("Enter the ContactNo:");
                    std.setContactNo(input.next());
                    System.out.println("Enter the Status:");
                    std.setStatus(input.nextBoolean());
                    stdDAO.insert(std);
                    break;

                case 2:
                    System.out.println("Showing list of Students");
                    for (Students s : stdDAO.getall()) {
                        System.out.println(s.toString());
                    }
                    break;

                case 3:
                    System.out.println("Enter the id for delete:");
                    int Id= input.nextInt();
                    stdDAO.delete(Id);
                    break;

                case 4:
                    System.out.println("Enter the id for search:");
                    int id=input.nextInt();
                   Students s= stdDAO.getById(id);
                   if(s!=null){
                       System.out.println(s.toString());
                   }else
                        System.out.println("Student not found");
                    
                    break;

                case 5:
                    System.exit(0);
                    break;

                case 6:
                    break;
            }
        }

    }
}
