package myPractise;

public class AccountingSystem {
    int accno;
    String name;
    float amount;
void insert(int a,String n,float amt){
    a=accno;
    n=name;
    amt=amount;
}
void deposite(float amt){
    amount=amount+amt;
    System.out.println("thanks for depositing "+ amt);
}
void WithDraw(float  amt) {
    if (amount < amt) {
        System.out.println("insufficient ballance");
    } else {
        amount = amount - amt;
        System.out.println(amt + "successfully withdrawn from the account number" + accno);
    }
}
void CheckBalance(){
    System.out.println(" current Balance present is "+ amount +" in account number "+ accno);
}

    public static void main(String[] args) {
    AccountingSystem obj= new AccountingSystem();
    obj.insert(234432,"Rituraj",54000.500f);
    obj.deposite(55000.500f);
    obj.CheckBalance();


    }




}