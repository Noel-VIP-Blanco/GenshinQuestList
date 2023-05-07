import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
public class Writer
{
    public static void saveMergeQuest(String oldQuestFilePath, String newQuestFilePath){
        try{
            FileWriter oldQuestFile = new FileWriter(oldQuestFilePath);
            BufferedWriter oldQuestOutput = new BufferedWriter(oldQuestFile);
            
            FileReader newQuestReader = new FileReader(newQuestFilePath);
            BufferedReader newQuestOutput = new BufferedReader(newQuestReader);
            
            String newQuestPerLine;
            ArrayList<String> newQuestArray = new ArrayList<>();
            
            while((newQuestPerLine = newQuestOutput.readLine()) != null){
                newQuestArray.add(newQuestPerLine.trim());
            }
            Collections.sort(newQuestArray);
            for(String element : newQuestArray){
                oldQuestOutput.write(element + "\n");
            }
            System.out.println("New quest Array Merged!!!");
            newQuestOutput.close();
            oldQuestOutput.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
    
    public static void saveFilteredQuest(String filteredNewQuestFilePath, ArrayList<String> newQuestArray){
        try{
            FileWriter newFilteredQuestFile = new FileWriter(filteredNewQuestFilePath);
            BufferedWriter newQuestOutput = new BufferedWriter(newFilteredQuestFile);
            for(String element : newQuestArray){
                System.out.println(element);
            }
            Collections.sort(newQuestArray);
            for(String element : newQuestArray){
                newQuestOutput.write(element + "\n");
            }
            System.out.println("New Filtered quest Array Saved!!!");
            newQuestOutput.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
