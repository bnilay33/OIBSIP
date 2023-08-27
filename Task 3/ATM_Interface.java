import java.util.*;
class ATM{
    String UserID;
    String UserPIN;
    double balance=0;
    String transactionhistroy=" ";
    boolean islogin=false;

    public void register(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter UserID:");
        this.UserID=sc.next();
        System.out.print("Enter the PIN:");
        this.UserPIN=sc.next();
        System.out.print("Add Some Balance: ");
        this.balance=sc.nextDouble();
        this.transactionhistroy="Rs. " + this.balance + " added to the account \n";
        System.out.println("Registration Completed Successfully");
    }
    public void withdraw(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Amount You want to Withdraw: ");
            double a=sc.nextDouble();
            if(a<=this.balance){
                this.balance=this.balance-a;
                System.out.println("Withdrawn Successfully.");
                String s="Rs." +a+ " Withdrawn \n";
                this.transactionhistroy=this.transactionhistroy.concat(s);
            }
            else{
                System.out.println("You don't have sufficient balance to withdraw this amount.");
            }
    }

    public void deposit(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter an amount to Deposit in your account balance:");
            double a=sc.nextDouble();
            this.balance=this.balance+a;
            System.out.println("Deposit Successfully.");
            String s="Rs." +a+ " deposited \n";
            this.transactionhistroy=this.transactionhistroy.concat(s);
    }

    public void transfer(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter an Amount to transfer:");
            double a=sc.nextDouble();
            System.out.print("Enter Recipent's name:");
            String name=sc.next();
            if(a<=this.balance){
                if(a<50000){
                    this.balance=this.balance-a;
                    System.out.println("Transfered Successfully.");
                    String s="Rs."+a+" transfered to "+ name+"\n";
                    this.transactionhistroy=this.transactionhistroy.concat(s);
                }
            }
    }
    public void transactions(){
        System.out.println("Your transaction history is: "+"\n"+this.transactionhistroy);
    }
}
public class ATM_Interface {
    public static void main(String args[]){
        System.out.println("\n****    WELCOME TO MY ATM INTERFACE    ****\n");
        ATM nilay=new ATM();
        nilay.register();
        boolean flag=true;
        while(true){
                System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Transaction History \n5.Quit");
                System.out.print("Enter Your Choice:");
                Scanner sc=new Scanner(System.in);
                int choice=sc.nextInt();
                if(choice==1){
                    nilay.withdraw();
                }
                else if(choice==2){
                    nilay.deposit();
                }
                else if(choice==3){
                    nilay.transfer();
                }
                else if(choice==4){
                    nilay.transactions();
                }
                else if(choice==5){
                    break;
                }
                else{
                    System.out.println("Enter Correct choice.");
                }
        }
        }
}
