package Chapter13;

import java.math.BigInteger;

public class Chapter13_15 {
    private BigInteger numerator;
    private BigInteger denominator;

    public Chapter13_15() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Chapter13_15(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Chapter13_15 add(Chapter13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Chapter13_15(n, d);
    }

    public Chapter13_15 subtract(Chapter13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Chapter13_15(n, d);
    }

    public Chapter13_15 multiply(Chapter13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Chapter13_15(n, d);
    }

    public Chapter13_15 divide(Chapter13_15 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Chapter13_15(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator.toString();
        else
            return numerator + "/" + denominator;
    }

    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    public float floatValue() {
        return (float) (numerator.doubleValue() / denominator.doubleValue());
    }

    public int intValue() {
        return (int) doubleValue();
    }

    public long longValue() {
        return (long) doubleValue();
    }
}
