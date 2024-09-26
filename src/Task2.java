public class Task2 {
    public static double parcer(String exp) {
        String[] arr = exp.split(" ");

        if (arr.length < 3) {
            throw new ArithmeticException("Too short expression");
        }
        if (arr.length > 5) {
            throw new ArithmeticException("Too long expression");
        }
        if (arr.length == 5) {
            if (!arr[4].equals("?") || !arr[3].equals("="))
                throw new ArithmeticException("Invalid expression");
        }
        if (arr.length == 4 && !arr[3].equals("="))
            throw new ArithmeticException("Invalid expression");

        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[2]);

        if (arr[1].equals("/") && num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        switch (arr[1]) {
            case "+": {
                return num1 + num2;
            }
            case "-": {
                return num1 - num2;
            }
            case "/": {
                return (double) num1 / num2;
            }
            case "*": {
                return num1 * num2;
            }
            default: throw new ArithmeticException("Invalid operator");
        }
    }
}
