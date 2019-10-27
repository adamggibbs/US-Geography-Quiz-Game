import java.util.*;
public class GuessStatesFromPCGame{
   private int rounds;
   
   public GuessStatesFromPCGame(){
      rounds = 50;
   }
   
   public GuessStatesFromPCGame(int round){
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
            System.out.println("What state has the postal code " + q.getPostalCode() + "?");
            String answer = scan.nextLine();
            String correct = q.getState().toUpperCase();
            answer = answer.toUpperCase();
            if(answer.equals(correct)){
               System.out.println("That's correct!");
               again = false;
            } else if(tries < 3){
               System.out.println("Try again...");
               tries++;
            } else {
               System.out.println("The correct answer was " + q.getState());
               again = false;
            }
         }//while    
         
      }//for
      
      System.out.println("I hope you had fun!");
   }//play
}//class