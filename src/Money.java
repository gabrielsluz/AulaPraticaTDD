package src;
public abstract class Money  {
   protected int amount;
    protected String currency;
   

   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }

   public static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
	
   abstract Money times(int multiplier); 

   public static Money dollar(int amount)  {
      return new Dollar(amount, "USD");
   }
   
   public static Money franc(int amount) {
      return new Franc(amount, "CHF");
    }

   public abstract String currency();

    public String currency() {
      return currency;
   }

   public Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
}