import java.math.BigDecimal;

public class Calculator {

    public int addition(int x, int y){
        return x + y;
    }

    public int subtraction(int x, int y){
        return x  -y;
    }

    public int multiplication(int x, int y){
        System.out.println("test");
        return x * y;
    }

    public BigDecimal division(BigDecimal x, BigDecimal y){
        return     x.divide(y);
    }
}
