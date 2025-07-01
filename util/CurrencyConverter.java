package util;

public class CurrencyConverter {

    // Valor do IOF de 6%.

    public static Double converter(double dolar, double quantity) {
        return dolar * quantity + (dolar * quantity * 0.06);
    }

}
