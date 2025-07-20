
public class ATM{
private double balance;
private double depositAmount;
private double withdrawAmount;
//default constructor
public ATM(){
}
	public static void main(String[] args){
		System.out.println("ATM class is Working!");
}
//getter setter
public double getBalance(){
return balance;
}
public void setBalance(double balance){
this.balance=balance;
}
public double getDepositAmount(){
return depositAmount;
}
public void setDepositAmount(double depositeAmount){
this.depositAmount=depositAmount;
}
public double getWithdrawAmount(){
return withdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount){
this.withdrawAmount=withdrawAmount;
}
}