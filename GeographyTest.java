import java.util.*;
public class GeographyTest{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome! This is the US geography testing game!");
      
      boolean resume = true;
      while(resume){
         System.out.println("Please select which game you want to play:");
         System.out.println("Press 1 to guess capitals from states.");
         System.out.println("Press 2 to guess states from capitals.");
         System.out.println("Press 3 to guess postal codes from states.");
         System.out.println("Press 4 to guess states from postal codes.");
         System.out.println("Press 5 to try and guess all 50 capitals for each state.");
         System.out.println("Press 6 to try and guess all 50 states.");
         
         int select = scan.nextInt();
         
         int rounds = 0;
         if(select >= 1 && select <= 4){
            System.out.println("How many rounds would you like to play?");
            rounds = scan.nextInt();
         }
         
         if(select == 1){
            System.out.println("You chose to guess capitals from states,");
            System.out.println("Let's begin!");
            GuessCapitalsGame game = new GuessCapitalsGame(rounds);
            game.play();
         } else if(select == 2){
            System.out.println("You chose to guess states from capitals,");
            System.out.println("Let's begin!");
            GuessStatesGame game = new GuessStatesGame(rounds);
            game.play();
         } else if(select == 3){
            System.out.println("You chose to guess postal codes from states,");
            System.out.println("Let's begin!");
            GuessPostalCodesGame game = new GuessPostalCodesGame(rounds);
            game.play();
         } else if(select == 4){
            System.out.println("You chose to guess states from postal codes,");
            System.out.println("Let's begin!");
            GuessStatesFromPCGame game = new GuessStatesFromPCGame(rounds);
            game.play();
         } else if(select == 5){
            System.out.println("You chose to guess all 50 capitals from their states,");
            System.out.println("Let's begin!");
            GuessCapitalsGame game = new GuessCapitalsGame();
            game.play();
         } else if(select == 6){
            System.out.println("You chose to try to guess all 50 states,");
            System.out.println("Let's begin!");
            GuessAllStatesGame game = new GuessAllStatesGame();
            game.play();
         } else {
            System.out.println("Please select a game mode...");
         }
         
         System.out.println();
         boolean answered = false;
         while(!answered){
            System.out.println("Would you like to play again?");
            String answer = scan.next().toUpperCase();
            if(!answer.equals("YES") && !answer.equals("NO")){
              System.out.println("Please answer yes or no.");
            } else if(answer.equals("NO")){
               resume = false;
               answered = true;
            } else {
               answered = true;
            }
         }
      }
      System.out.println();
      System.out.println("Thank you for playing!");
   }//main
}//class