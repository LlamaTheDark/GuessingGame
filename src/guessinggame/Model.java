
package guessinggame;

import java.util.Random;

public class Model {
    
    int number;
    static int turns;
    
    void Reset(){
        number = getRandomNumber();
        turns = 0;
    }
        
        
    void test(String text){
        System.out.println(text);
    }
    
    int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
    
    String getStatus(int guess){
        if (guess > number){
            turns += 1;
            return "That number is too high!";
        }else if(guess < number){
            turns += 1;
            return "That number is too low!";
        }else{
            return "Congratulations, that's right!";
        }
    }
    
    int getTurns(){
        return turns;
    }
}
