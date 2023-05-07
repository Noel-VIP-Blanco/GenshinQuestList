import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class AreaQuest
{
    public static void areaQuest(String areaQuestFilePath){
        Scanner scannerInt = new Scanner(System.in); 
        int secondChoice = scannerInt.nextInt();
        if(secondChoice == 0) return;
        String newQuestFilePath = "Quests/0NEWQUEST.txt";
        String filteredNewQuestFilePath = "Quests/00FILTEREDNEWQUEST.txt"; // Newly Added Quest Update
        ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
        ArrayList<String> oldQuestArray = new ArrayList<>();
        ArrayList<String> newQuestArray = new ArrayList<>();
        while(true){
            switch(secondChoice){
            case 1:
                arrayList2D = Reader.compareQuests(areaQuestFilePath, newQuestFilePath);
                oldQuestArray = arrayList2D.get(0);
                newQuestArray = arrayList2D.get(1);
                Collections.sort(oldQuestArray);
                Collections.sort(newQuestArray);
                System.out.println("Array has been populated\n");
                break;
            case 2:
                if(arrayList2D.isEmpty()){
                    System.out.println("The list is empty\n");
                    break;
                }
                for(String element : oldQuestArray){
                    System.out.println(element);
                }
                break;
            case 3:
                if(arrayList2D.isEmpty()){
                    System.out.println("The list is empty\n");
                    break;
                }
                for(String element : newQuestArray){
                    System.out.println(element);
                }
                break;
            case 4:
                if(newQuestArray.isEmpty()){
                    System.out.println("New quest Array is empty!!!\n");
                    break;
                }
                if(newQuestArray.isEmpty()){
                    System.out.println("New quest Array is empty!!!\n");
                    break;
                }
                Writer.saveMergeQuest(areaQuestFilePath, newQuestFilePath);
                break;
            case 5:
                if(newQuestArray.isEmpty()){
                    System.out.println("New quest Array is empty!!!\n");
                    break;
                }
                Writer.saveFilteredQuest(filteredNewQuestFilePath, newQuestArray);
                break;
            default:
                System.out.println("Invalid input\n");
                break;
        }
        PrintMenu.printSecondChoice();
        secondChoice = scannerInt.nextInt();
        if(secondChoice == 0) break;
        }
    }
}
