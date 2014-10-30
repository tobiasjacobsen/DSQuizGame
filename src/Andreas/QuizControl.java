
package Andreas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andreas Styltsvig
 */
public class QuizControl {
    
    String question;
    ArrayList<String> answer;
    FileHandler fileHandler = new FileHandler();
    ArrayList<String> file;
    ArrayList<String> pictureURL;
    
    Random random = new Random();
    
    public void getFile(String filename){
        file = new ArrayList();
        answer = new ArrayList();
        pictureURL = new ArrayList();
        
        file = fileHandler.load(filename);
        question = file.get(0).substring(file.get(0).indexOf(":")+2, file.get(0).indexOf("?")+1);
        
        for (int i = 0; i < 4; i++) { 
            answer.add(file.get(i+1));
        }
        for (int i = 0; i < 4; i++) { 
            pictureURL.add(file.get(i+5));
        }
        
        
        
        
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }
    
    public String getRandomFile(){
        String randomFile = "Question"+random.ints(2).toString();
        return randomFile;
    }
    
    public ArrayList<String> getURLS(){
        return pictureURL;
    }
    
    
    
    
    
    
}
           