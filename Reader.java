import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Reader{
    public static ArrayList<ArrayList<String>> compareQuests(String oldQuestFilePath, String newQuestFilePath){
        ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
        try{
            ArrayList<String> oldQuestArray = new ArrayList<>();
            ArrayList<String> newQuestArray = new ArrayList<>();
            String oldQuestPerLine;
            String newQuestPerLine;
            FileReader oldQuestReader = new FileReader(oldQuestFilePath);
            BufferedReader oldQuestOutput = new BufferedReader(oldQuestReader);
            FileReader newQuestReader = new FileReader(newQuestFilePath);
            BufferedReader newQuestOutput = new BufferedReader(newQuestReader);
            
            while((oldQuestPerLine = oldQuestOutput.readLine()) != null){
                oldQuestArray.add(oldQuestPerLine.trim());
            }
            while((newQuestPerLine = newQuestOutput.readLine()) != null){
                newQuestArray.add(newQuestPerLine.trim());
            }
            //Filter new Quest from old quest
            for(int x = 0; x < newQuestArray.size(); x++){
                for(int y = 0; y < oldQuestArray.size(); y++){
                    if(newQuestArray.get(x).equals(oldQuestArray.get(y))){
                        newQuestArray.remove(x);
                        x--;
                        break;
                    }
                }
            }
            arrayList2D.add(oldQuestArray);
            arrayList2D.add(newQuestArray);
            oldQuestOutput.close();
            newQuestOutput.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        return arrayList2D;
    }
}