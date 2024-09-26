package com.view;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("\nCreate---------> 1  ");
            System.out.print("Retrieve-------> 2  ");
            System.out.println("Update---------> 3");
            System.out.print("Delete---------> 4  ");
            System.out.print("Search---------> 5  ");
            System.out.println("Exit-----------> 6");
            System.out.print("\nEnter Your Choice : ");
            try {
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        Create insert = new Create();
                        insert.AddData();
                        break;
                    case 2:
                        Retrieve retrieve = new Retrieve();
                        retrieve.showData();
                        break;
                    case 3:
                        System.out.println(3);
                        break;
                    case 4:
                        System.out.println(4);
                        break;
                    case 5:
                        Search search =new Search();
                        search.searchData();
                        break;
                    case 6:
                        System.exit(0);
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please Try to Correct Input");
                sc.nextLine();
            }

        }

    }
}
