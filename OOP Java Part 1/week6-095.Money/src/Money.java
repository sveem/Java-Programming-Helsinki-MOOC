
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int sumEuros = this.euros + added.euros;
        int sumCents = this.cents + added.cents; 
        return new Money(sumEuros, sumCents);
    }
    
    public boolean less(Money compared) {
        return this.convertToCents(this) < this.convertToCents(compared);
    }
    
    public Money minus(Money decremented) {
      if (this.less(decremented)) {
          return new Money(0, 0);
      }
        int diffSum = this.convertToCents(this) - this.convertToCents(decremented);
        int cents = diffSum % 100;
        int euros = (diffSum - cents) / 100;
        
       return new Money(euros, cents);
    }
    
    public int convertToCents(Money money) {
        return money.euros() * 100 + money.cents();
    }
}
