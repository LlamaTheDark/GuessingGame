
package guessinggame;

import java.util.Random;

public class Model {
    
    int number = getRandomNumber();
    
    void test(String text){
        System.out.println(text);
        
    }
    
    int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt();
    }
    
    String evaluationOfGuess(){
        
        return "poop";
    }
    
    String getStatus(int guess){
        
        return "status";
    }
}
