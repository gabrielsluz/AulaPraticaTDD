package src;
public class Money  {
   protected int amount;
   protected String currency;
   

   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && currency().equals(money.currency());
   }

   public Money times(int multiplier) {
      return new Money(amount * multiplier, currency);
   } 

   public static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }
   
   public static Money franc(int amount) {
      return new Money(amount, "CHF");
    }

    public String currency() {
      return currency;
   }

   public Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
}