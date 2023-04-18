import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    public static void main(String[] args){
        Scanner scannerInt = new Scanner(System.in);
        String filePathNewQuest = "Quests/0NEWQUEST.txt";
        String filePath = "Quests/2Dragonspine.txt";
        PrintMenu.printMenu();
        int choice = scannerInt.nextInt();
        while(true){
            switch(choice){
                case 1:
                    break;
                case 2:
                    PrintMenu.printSecondChoice();
                    int secondChoice = scannerInt.nextInt();
                    ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
                    ArrayList<String> allMergedQuest = new ArrayList<>();
                    ArrayList<String> allNewQuest = new ArrayList<>();
                    while(true){
                        switch(secondChoice){
                            case 1:
                                arrayList2D = Reader.compareQuests(filePath, filePathNewQuest);
                                break;
                            case 2:
                                allMergedQuest = arrayList2D.get(0);
                                Collections.sort(allMergedQuest);
                                for(String element : allMergedQuest){
                                    System.out.println(element);
                                }
                                break;
                            case 3:
                                allNewQuest = arrayList2D.get(1);
                                Collections.sort(allNewQuest);
                                for(String element : allNewQuest){
                                    System.out.println(element);
                                }
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        PrintMenu.printSecondChoice();
                        secondChoice = scannerInt.nextInt();
                        if(secondChoice == 0) break;
                    }
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
