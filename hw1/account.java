package hw1;

public class account {
	
	public static void main(String[] args) {
		
		
		Account a1 = new Account(100);
		Account a2 = new Account(200,"miradamad");
		
		a1.withdraw(300);
		System.out.println(a1.withdraw(300));
	}

	public static class Account {
		 
		 private int balance;
		 private String branch;
		 private boolean locked;
		 private long lastTransaction;

		 public Account(int balance) {
		  this.balance = balance;
		 }

		 public Account(int balance, String branch) {
		  this.balance = balance;
		  this.branch = branch;
		 }

		 public void print() {
		  System.out.println("Balance: " + balance + ", Branch: " + branch + ", Locked: " + locked + ", Last Transaction: " + lastTransaction);
		 }

		 public boolean withdraw(int amount) {
		  if (balance < amount)
		   return false;
		  balance -= amount;
		  lastTransaction = System.currentTimeMillis();
		  return true;
		 }

		 public void setBalance(int balance) {
		  this.balance = balance;
		 }

		 public int getBalance() {
		  return balance;
		 }

		 public void setBranch(String branch) {
		  this.branch = branch;
		 }

		 public String getBranch() {
		  return branch;
		 }

		 public void setLocked(boolean locked) {
		  this.locked = locked;
		 }

		 public boolean isLocked() {
		  return locked;
		 }

		 public long getLastTransaction() {
		  return lastTransaction;
		 }
		}
	
}
