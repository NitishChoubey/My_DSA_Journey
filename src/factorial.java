import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {

        BigInteger ans = (factorialOfANumber(BigInteger.valueOf(1)));
        System.out.println(ans);
    }

    public static BigInteger factorialOfANumber(BigInteger num) {
        if (num.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return num.multiply(factorialOfANumber(num.subtract(BigInteger.ONE)));
    }
}
