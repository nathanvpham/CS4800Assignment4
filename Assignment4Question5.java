import java.util.Random;

public abstract class AccountHolder{
   protected int id;
   protected String address;
   AccountHolder(int id,String address){
       this.id=id;
       this.address=address;
   }
   public int nextID() {
       return id++;
   }

   public getNextID() {
       return random.nextInt(1000000) + 1; 
   }
}

public interface Util {
    public String convertNameUpperCase(String name);
}

public class IndividualHolder extends AccountHolder implements Util{

   private String name;
   private String SSN;
   IndividualHolder(int id, String address,String name,String SSN) {
       super(id, address);
       this.name=name;
       this.SSN=SSN;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getSSN() {
       return SSN;
   }
   public void setSSN(String sSN) {
       SSN = sSN;
   }  
}

public class CorporateHolder extends AccountHolder{
   private String contact;
   CorporateHolder(int id, String address,String contact) {
       super(id, address);
       this.contact=contact;
   }
   public String getContact() {
       return contact;
   }
   public void setContact(String contact) {
       this.contact = contact;
   }
}

public class Account{
   private AccountHolder holder;
   private double balance=0.0;
   Account(double amt, AccountHolder holder){
       this.holder=holder;
       this.balance=amt;
   }
   public double deposit(double amt) {
       return balance+amt;
   }
   public double withdraw(double amt) {
       return balance-amt;
   }
   public AccountHolder getHolder() {
       return holder;
   }
   public void setHolder(AccountHolder holder) {
       this.holder = holder;
   }
   public double getBalance() {
       return balance;
   }
   public void setBalance(double balance) {
       this.balance = balance;
   }
}