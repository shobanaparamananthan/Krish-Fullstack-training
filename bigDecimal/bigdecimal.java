import java.math.BigDecimal;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.text.NumberFormat;
  
public class bigdecimal{
      
    public static void main(String[] args) {
         
        BigDecimal amount = new BigDecimal("10000.56");
        BigDecimal tax = new BigDecimal("0.15");
          
        BigDecimal salesTax = amount.multiply(tax);
        salesTax = salesTax.setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal total = amount.add(salesTax);
          
        
  
        System.out.println(amount);
        System.out.println(total);
        System.out.println(tax);
    }
}
     