import java.util.*;
public class GuessCapitalsGame{
   private int rounds;
   
   public GuessCapitalsGame(){
      rounds = 50;
   }
   
   public GuessCapitalsGame(int round){
      rounds = round;
   }
   
   public void play(){
      boolean[] check = new boolean[50];
   
      for(int i = 0; i < rounds; i++){
         boolean again = true;
         int tries = 1;
         
         Question q = new Question();
         boolean another = true;
         while(another){
            q = new Question();
            if(!check[q.getIndex()]){
               another = false;
               check[q.getIndex()] = true;
            }
         }
         
         while(again){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the capital of " + q.getState() + "?");
            String answer = scan.nextLine();
            String correct = q.getCapital().toUpperCase();
            answer = answer.toUpperCase();
            if(answer.equals(correct)){
               System.out.println("That's correct!");
               again = false;
            } else if(tries < 3){
               System.out.println("Try again...");
               tries++;
            } else {
               System.out.println("The correct answer was " + q.getCapital());
               again = false;
            }
         }//while    
         
      }//for
      
      System.out.println("I hope you had fun!");
   }//play
}//class