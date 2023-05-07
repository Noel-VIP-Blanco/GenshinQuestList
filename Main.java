import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    public static void main(String[] args){
        Scanner scannerInt = new Scanner(System.in);
        PrintMenu.printMenu();
        int choice = scannerInt.nextInt();
        String areaQuestFilePath;
        while(true){
            switch(choice){
                case 1:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/1Mondstadt.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
                    break;
                case 2:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/2Dragonspine.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
                    break;
                case 3:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/3Liyue.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
                    break;
                case 4:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/4TheChasm.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
                    break;
                case 5:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/5Inazuma.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
                    break;
                case 6:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/6Enkanomiya.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
                    break;
                case 7:
                    PrintMenu.printSecondChoice();
                    areaQuestFilePath = "Quests/7Sumeru.txt"; // Old Quest File
                    AreaQuest.areaQuest(areaQuestFilePath);
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
