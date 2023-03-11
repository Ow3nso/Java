//Java project after learning basics and methods
//Checks the age then if qualifies you can proceed to make purchases
public class Tutorial{

    //method that runs only when called 
    static void Checks(){

        //local variables
        int age = 21;
        int bank_bal = 40000;

        //if statements to check the conditions
        if (age > 18){
            System.out.println("Your account balance is " + bank_bal);
            System.out.println("Proceed to make purchase");
            
            int price = 15000;
            if (bank_bal > price){
                int new_bank_bal = bank_bal - price;
                System.out.println("Yoour new aaccount balance is " + new_bank_bal);
            }else{
                System.out.println("You have insufficient balance");
            }
        }else{
            System.out.println("Grow up first");
        }
    }

    //the main function where the methods are called
    public static void main(String[] args){
        Checks();
    }
}