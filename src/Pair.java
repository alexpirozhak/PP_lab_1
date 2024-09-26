public class Pair {
    private String symbol;
    private int count;
    public String getSymbol() {
        return symbol;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public Pair(){
        symbol = " ";
        count = 0;
    }

    public Pair(String symbol) {
        this.symbol = symbol;
        count = 1;
    }

    public Pair(String symbol, int count) {
        this.symbol = symbol;
        this.count = count;
    }
}
