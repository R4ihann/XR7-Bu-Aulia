package Looping;
import java.util.Scanner;
public class DowhilE {
    public static void main(String[] args) {
        int choice, amount=0;
        double price=0, total, temp=0;
        String addorno="y";

        do{
        Scanner s=new Scanner(System.in);
        System.out.println("List of items:");
        System.out.println("1. Book: 4000Rp\n2. Pencil: 2500Rp\n3. Eraser: 2500\n4. Ruler: 3000Rp");
        System.out.println("What would you like to purchase: ");
        choice = s.nextInt();
        

        switch (choice) {
            case 1:
                price=4000;
                break;
            case 2:
                price=2500;
                break;
            case 3:
                price=2500;
                break;
            case 4:
                price=3000;
                break;
        
            default:
                price=0;
                break;
        }
        System.out.println("Amount of items: ");
        amount=s.nextInt();

        total=amount*price;
        temp+=total;

        System.out.println("Would you like to make another purchase (Yes/No)");
        addorno=s.next();
        s.close();
    } while (addorno.equalsIgnoreCase("yes"));

    System.out.println("Total Price: "+temp);
    }
} 
