public class Task3 {
    public static String FizzBuzz() {
        String result = "";
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FizzBuzz\n";
            }
            else if (i % 3 == 0) {
                result += "Fizz ";
            }
            else if (i % 5 == 0) {
                result += "Buzz ";
            }
            else {
                result += i + " ";
            }
        }
        return result;
    }
}

