package guessinggame;
        
//import java.util.Scanner;
        
public class GuessingGame {
        
    public static void main(String[] args) {
        // instantiate the model...
        Model model = new Model(); 
        
        model.Reset();
        //Scanner input = new Scanner(System.in);
        
        
        
        // instantiate the viewcontroller...
        ViewController viewController = new ViewController(model);
        viewController.setVisible(true);
        
    }
}
