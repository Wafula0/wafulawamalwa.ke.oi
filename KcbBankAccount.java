import java.util.Scanner;

public class KcbBankAccount extends BankAccount {
    KcbBankAccount(String name, int account_no, int id_no) {
        super(name, account_no, id_no);
    }

    public static void main(String[] args) {
       BankAccount NimrodsAccount = new BankAccount("jeff", 54566, 23477);

        System.out.println( "account no: " +NimrodsAccount.account_no());
        System.out.println( "id no: " + NimrodsAccount.getId_no());
        System.out.println("name: " +NimrodsAccount.name());


        Scanner Overdraw = new Scanner(System.in);
        System.out.println("enter overdrawn amount");
        int overdraw = Overdraw.nextInt(); 
        System.out.println(overdraw);
        if(overdraw<=50000)
        {
            System.out.println("overdraw allowed");
        }
        else
        {
            System.out.println("overdraw not allowed!try minimum amount");
        }


    }
}
