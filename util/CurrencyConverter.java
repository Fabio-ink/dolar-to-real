package util;

public class CurrencyConverter {

    public static Double converter(double dolar, double quantity) {
        return dolar * quantity + (dolar * quantity * 0.06);
    }

}
