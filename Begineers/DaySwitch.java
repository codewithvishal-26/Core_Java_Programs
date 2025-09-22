package Begineers;

import java.util.Scanner;

public class DaySwitch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your day number: ");
       int day = sc.nextInt();
       
       switch(day){
            case 1:
                System.out.println(" You choose the day 1 Monday");
                break;
            case 2:
                System.out.println(" You choose the day 2 Tuesday");
                break;
            case 3:
                System.out.println(" You choose the day 3 Wednesday");
                break;
            case 4:
                System.out.println(" You choose the day 4 Thursday");
                break;
            case 5:
                System.out.println(" You choose the day 5 Friday");
                break;
            case 6:
                System.out.println(" You choose the day 6 Saturday");
                break;
            case 7:
                System.out.println(" You choose the day 7 Sunday");
                break;
            default:
                System.out.println(" Invalid input choose correct input!");
       }
       sc.close();

    }
}
