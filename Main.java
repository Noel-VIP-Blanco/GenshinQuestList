import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    public static void main(String[] args){
        Scanner scannerInt = new Scanner(System.in);
        PrintMenu.printMenu();
        int choice = scannerInt.nextInt();
        while(true){
            switch(choice){
                case 1:
                    break;
                case 2:
                    PrintMenu.printSecondChoice();
                    DragonSpineQuest.dragonSpineQuest();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            PrintMenu.printMenu();
            choice = scannerInt.nextInt();
            if(choice == 0) break;
        }
    }
}
