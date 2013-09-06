package com.joszaynka.shop;
import java.util.*;

// Our custom class to show the Bears
class BearDisplay extends Bear {

    // Show the menu
    public void Menu() {
        int choice;
        do {
            System.out.println("1 - See your bear!");
            System.out.println("2 - Create your own Bear!");
            System.out.println("3 - See information about BearShop® and this software.");
            System.out.println("4 - Exit.");
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt()) {
                choice = 0;
            }
            else {
                choice = sc.nextInt();
            }
        } while (choice <= 0 || choice >= 5);
        switch(choice) {
            case 1:
                this.showExample();
                this.Menu();
                break;
            case 2:
                this.createBear();
                this.Menu();
                break;
            case 3:
                System.out.println("BearShop® is an international online company that provides virtual bears to everybody, for free.");
                System.out.println("This software is made with Java and is used to create and see the virtual bears.");
                System.out.printf("\n");
                System.out.println("Choose what do you want to do now: ");
                this.Menu();
                break;
            case 4:
                System.out.println("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Error #1: Logics error.");
                System.exit(1);
                break;
        }
    }

    // Show the example bear
    public void showExample() {
        String myName = this.getSVal().get("name");
        Integer myAge = this.getIVal().get("age");
        System.out.printf("Hello! My name is %s. I wanna be your friend! :) \n", myName);
        System.out.printf("I am only %d, but love has no age! :P \n", myAge);
        System.out.printf("You can hug me whenever you want :)\n");
        System.out.printf("\n");
        System.out.println("Choose what do you want to do now: ");
    }

    // Create a new bah :)
    public void createBear() {
        Scanner sc = new Scanner(System.in);
        String name;
        Integer age;
        System.out.println("Welcome to the Bear Creation Manager® by BearShop®.");
        System.out.println("Please fill the data below: ");
        System.out.print("Name: ");

        // Get name
        name = sc.nextLine();

        // Get age
        System.out.print("Age: ");
        while (!sc.hasNextInt()) {
            System.out.println("Age must be an integer!");
            System.out.print("Age: ");
            sc.next();
        }
        age = sc.nextInt();
        sc.nextLine();

        // Tune the bear!
        this.tune("name", name);
        this.tune("age", age);

        // Done!
        System.out.println("Your bear has been created! Press 1 in the menu to see him :)");
        System.out.printf("\n");
        System.out.println("Choose what do you want to do now: ");
    }

}


public class BearShop {
    public static void main(String[] args) {
        BearDisplay b = new BearDisplay();
        System.out.println("Welcome to BearShop®!");
        b.Menu();
    }

}
