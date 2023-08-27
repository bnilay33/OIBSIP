package com.company;
import java.util.*;
class Game{
    int num;
    int a;
    int UserScore=0;
    public void setNum(int n){
        num=n;
    }
    public void Generate(){
        Random random=new Random();
        a=random.nextInt(100);
    }
    public void isCorrect(){
        if(a==num){
            System.out.println("Correct");
            UserScore++;
        }
        else if(a<num){
            System.out.println("Entered Number is Greater");
        }
        else if(num<=0){
            System.out.println("Entered Number is Invalid.Please enter a no. between 1 to 100.");
        }
        else{
            System.out.println("Entered Number is Lower");
        }
        System.out.println("Your choosen number: "+ num + "  and The Computer Generate Number is: "+ a);
        System.out.println("Your Score is: "+ UserScore);
        System.out.println("<---------------------------------------------------------------->");
    }
}
public class GuesstheNumber {
    public static void main(String args[]){
        Game obj=new Game();
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter the number of rounds: ");
        int a=scc.nextInt();
        System.out.println("<----------------------------------------->LET's PLAY<----------------------------------------->");
        for(int i=0;i<a;i++){
            System.out.println("<----------------------------------------->Enter a Number between 1-100<----------------------------------------->");
            int b=scc.nextInt();
            obj.setNum(b);
            obj.Generate();
            obj.isCorrect();
            System.out.println();
        }

    }
}