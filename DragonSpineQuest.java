import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DragonSpineQuest
{
    public static void dragonSpineQuest(){
        Scanner scannerInt = new Scanner(System.in); 
        int secondChoice = scannerInt.nextInt();
        String newQuestFilePath = "Quests/0NEWQUEST.txt";
        String dragonSpineQuestFilePath = "Quests/2Dragonspine.txt";
        ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
        ArrayList<String> oldQuestArray = new ArrayList<>();
        ArrayList<String> newQuestArray = new ArrayList<>();
        while(true){
            switch(secondChoice){
            case 1:
                arrayList2D = Reader.compareQuests(dragonSpineQuestFilePath, newQuestFilePath);
                break;
            case 2:
                if(arrayList2D.isEmpty()){
                    System.out.println("The list is empty");
                    break;
                }
                oldQuestArray = arrayList2D.get(0);
                Collections.sort(oldQuestArray);
                for(String element : oldQuestArray){
                    System.out.println(element);
                }
                break;
            case 3:
                if(arrayList2D.isEmpty()){
                    System.out.println("The list is empty");
                    break;
                }
                newQuestArray = arrayList2D.get(1);
                Collections.sort(newQuestArray);
                for(String element : newQuestArray){
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
    }
}
