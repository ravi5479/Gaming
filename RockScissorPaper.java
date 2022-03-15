package game;
import java.util.*;
public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 for Rock
        // 1 for Scissor
        // 2 for Paper
        System.out.println("0 for rock ");
        System.out.println("1 for Scissor");
        System.out.println("2 for Paper");
        System.out.println("Your choice :");
        int userinput = sc.nextInt();
        Random computerinput = new Random();
        int system = computerinput.nextInt(3);

        if (userinput==system){
            System.out.println("Draw");
        }
        else if((userinput==0 && system==1) || (userinput==1 && system==2) || (userinput==2 && system==0 )){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer wins");
        }
        if(system==0){
            System.out.println("computer choice :"+ "Rock" );
        }
        else if(system==1){
            System.out.println("computer choice :"+ "Scissor" );
        }
        else{
            System.out.println("computer choice :"+ "Paper" );
        }
    }
}
