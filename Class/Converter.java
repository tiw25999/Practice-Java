public class Converter {
    String fromCurrency;
    String toCurrency;
    double amount;
    String currencyName;
    double rate;

    public void exchange(String fromCurrency, String toCurrency){
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public void SetAmount(double amount){
        this.amount = amount;
    }

    public String getfromCurrency(){
        return fromCurrency;
    }

    public String gettoCurrency(){
        return toCurrency;
    }

    public void setRate(String currencyName, double rate){
        this.currencyName = currencyName;
        this.rate = rate;
    }

    public double getRate(){
        return rate;
    }

    public double getAmount(){
        return amount;
    }

    public String getcurrencyName(){
        return currencyName;
    }

    public double convert(){
        double result = 0.0;
        return result;
    }

    public String toString(){
        return fromCurrency + " " + toCurrency + " " + amount;
    }
}
