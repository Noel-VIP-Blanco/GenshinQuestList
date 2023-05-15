import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ArrangeMessyNewQuest
{
    public static void ArrangeJumbledNewQuest(){
        String messed = "Quests/0NEWQUEST.txt";
        try{
            FileReader messyFile = new FileReader(messed);
            BufferedReader messyFileOutput = new BufferedReader(messyFile);
            
            String questsString = "";
            String oldQuestPerLine;
            while((oldQuestPerLine = messyFileOutput.readLine()) != null){
                questsString += oldQuestPerLine + "\t";
            }
            messyFileOutput.close();
            messyFile.close();
            
            FileWriter newFilteredQuestFile = new FileWriter(messed);
            BufferedWriter newQuestOutput = new BufferedWriter(newFilteredQuestFile);
            
            String[] listOfQuests;
            
            listOfQuests = questsString.split("\t");
            for(String quest : listOfQuests){
                System.out.println(quest);
            }
            
            for(String element : listOfQuests){
                newQuestOutput.write(element + "\n");
            }
            
            newQuestOutput.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
