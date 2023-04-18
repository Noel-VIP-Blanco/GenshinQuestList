import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Reader
{
    public static ArrayList<ArrayList<String>> compareQuests(String filePath, String filePathNewQuest){
        ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
        try {
            ArrayList<String> allMergedQuest = new ArrayList<>();
            ArrayList<String> allNewQuest = new ArrayList<>();
            String line;
            String lineNewQuest;
            FileReader oldQuestReader = new FileReader(filePath);
            BufferedReader oldQuestOutput = new BufferedReader(oldQuestReader);
            FileReader newQuestReader = new FileReader(filePathNewQuest);
            BufferedReader newQuestOutput = new BufferedReader(newQuestReader);
            
            while((line = oldQuestOutput.readLine()) != null){
                allMergedQuest.add(line.trim());
                if((lineNewQuest = newQuestOutput.readLine()) != null){
                    allMergedQuest.add(lineNewQuest.trim());
                    allNewQuest.add(lineNewQuest.trim());
                }
            }
            arrayList2D.add(allMergedQuest);
            arrayList2D.add(allNewQuest);
            oldQuestOutput.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        return arrayList2D;
    }
}
