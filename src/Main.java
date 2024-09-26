import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1:");
        System.out.println(Task1.decToBinary(858348534));
        System.out.println("————————————————————————————————");

        System.out.println("Task2:");
        String exp = "14 + 7";
        System.out.println(Task2.parcer(exp));
        System.out.println("————————————————————————————————");

        System.out.println("Task3:");
        System.out.println(Task3.FizzBuzz());
        System.out.println("————————————————————————————————");

        System.out.println("Task4:");
        System.out.println("Counted symbols in \"Ababagalamaga\":");
        Task4.PrintPairs(Task4.CountSymbols("Ababagalamaga"));
        System.out.println("————————————————————————————————");

        System.out.println("Task5:");
        String[][] victims = {
                {"sdffd", "adfjer", "ocsadsf"},
                {"kjdnj", "fgjkdf", "gdfgjkj"},
                {"trgfg", "kjdfkd", "kjfdafd"}
        };
        String substring = "df";
        int entrings = Task5.countOfEntrings(victims, substring);
        System.out.println("Знайдено підрядок '" + substring + "' " + entrings + " раз(и/ів).");
        System.out.println("————————————————————————————————");

        System.out.println("Task6:");
        System.out.println("Enter data in format: 'AMOUNT' + 'FIRST_CURRENCY' + 'into' + FINAL_CURRENCY");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        double convertedMoney = Converter.ConvertCurrecy(data);
        System.out.printf("Converted value: %.2f\n", convertedMoney);
        System.out.println("————————————————————————————————");


        System.out.println("Task7:");
        Task7.TestTransfers();
        System.out.println("————————————————————————————————");



    }
}