package game;
import java.util.*;
class Gaming{
    Scanner sc = new Scanner(System.in);
    int computer;
    int userinput;
    int count=1;
    public Gaming(){
        Random random= new Random();
        this.computer = random.nextInt(200);

    }
    public void totakeuserinput(){
        System.out.println("Enter your number ");
        userinput = sc.nextInt();
    }
    public boolean iscorrectnumber(){
        int flag=0;
        if (userinput==computer){
            System.out.println("number is found");
            System.out.format("You guessed the number in %d", count);
            flag=1;
        }
        else if (userinput>computer){
            System.out.println("Your number is greater");
            count++;
        }
        else{
            System.out.println("your number is lesser");
            count++;

        }
        if (flag==0){
            return false;
        }
        else{
            return true;
        }

    }


}
public class Guessing__number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gaming User = new Gaming();

        boolean b=false;
        while(!b){
            User.totakeuserinput();
            b = User.iscorrectnumber();
        }
    }
}
