public class Task1 {
    public static String decToBinary(int n)
    {
        String result = "";
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                result += 1;
            else
                result += 0;
        }
        return result;
    }
}
