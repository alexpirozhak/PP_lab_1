public class Task4 {
    public static Pair[] CountSymbols(String str){
        Pair[] pairs = new Pair[] {};
        for (int i = 0; i < str.length(); i++){
            boolean isFound = false;
            for (int j = 0; j < pairs.length; j++) {
                if (pairs[j].getSymbol().equals("" + str.charAt(i))) {
                    pairs[j].setCount(pairs[j].getCount() + 1);
                    isFound = true;
                    break;
                }
            }


            if (!isFound) {
                Pair[] temp = new Pair[pairs.length + 1];
                for (int j = 0; j < pairs.length; j++) {
                    temp[j] = pairs[j];
                }
                temp[temp.length - 1] = new Pair("" + str.charAt(i));
                pairs = temp;
            }
        }

        return pairs;
    }

    public static void PrintPairs(Pair[] pairs) {
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i].getSymbol() + ": " + pairs[i].getCount());
        }
    }
}
