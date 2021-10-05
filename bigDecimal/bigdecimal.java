
import java.math.BigDecimal;

  
public class bigdecimal{
      
    public static void main(String[] args) {
         
    double d1 = 0.3;
    double d2 = 0.2;
    System.out.println("Double:"+ (d1 - d2));

    float f1 = 0.3f;
    float f2 = 0.2f;
    System.out.println("Float: " + (f1 - f2));

    BigDecimal bd1 = new BigDecimal("0.3");
    BigDecimal bd2 = new BigDecimal("0.2");
    System.out.println("BigDec: " + (bd1.subtract(bd2)));
    }
}
     