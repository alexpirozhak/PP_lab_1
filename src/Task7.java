public class Task7 {
    private static Bank[] banks = {
            new Bank("Universal", "USD"),
            new Bank("Privat", "UAH"),
            new Bank("Royal Bank of Canada", "CAD"),
            new Bank("Credit Agricole", "EUR")
    };

    private static User[] users = {
            new User("Alex", "Piroshak"),
            new User("Serhii", "Maksymiv"),
            new User("Ivan", "Ivanio"),
            new User("Andrew", "Nazarkevich")
    };

    public static void Transfer(BankAccount from, BankAccount to, double amount) {
        try {
            String fromCurrency = "", toCurrency = "";
            for (int i = 0; i < banks.length; i++) {
                if (banks[i].getId() == from.getBankId()) {
                    fromCurrency = banks[i].getCurrency();
                }
                if (banks[i].getId() == to.getBankId()) {
                    toCurrency = banks[i].getCurrency();
                }
            }

            final double convertedAmount = Converter.ConvertCurrecy(
                    amount + " " + fromCurrency + " into " + toCurrency);

            double amountWithCommission = amount;
            if (from.getUserId() == to.getUserId()) {
                if (from.getBankId() != to.getBankId()) {
                    amountWithCommission += amount * 0.02;
                }
            }
            else {
                if (from.getBankId() == to.getBankId()) {
                    amountWithCommission += amount * 0.03;
                }
                else {
                    amountWithCommission += amount * 0.06;
                }
            }

            if (from.getBalance() < amountWithCommission) {
                throw new Exception("Not enough money to perform the operation");
            }

            from.setBalance(from.getBalance() - amountWithCommission);
            to.setBalance(to.getBalance() + convertedAmount);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void PrintBalance(BankAccount ba) {
        System.out.println("Bank account: " + ba.getAccountNumber());
        System.out.println("Balance: " + ba.getBalance());
        for (int i = 0; i < banks.length; i++) {
            if (banks[i].getId() == ba.getBankId()) {
                System.out.println("Bank: " + banks[i].getName());
                System.out.println("Currency: " + banks[i].getCurrency());
                break;
            }
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == ba.getUserId()) {
                System.out.println("User: " + users[i].getName() + " " + users[i].getSurname());
                break;
            }
        }
        System.out.println();
    }

    public static void TestTransfers() {
        BankAccount ba1 = new BankAccount("1234432112344321", banks[0].getId(), users[0].getId());
        ba1.setBalance(1000);
        BankAccount ba2 = new BankAccount("2345543223455432", banks[0].getId(), users[0].getId());
        ba2.setBalance(1100);
        BankAccount ba3 = new BankAccount("3456654334566543", banks[1].getId(), users[1].getId());
        ba3.setBalance(1200);
        BankAccount ba4 = new BankAccount("4567765445677654", banks[2].getId(), users[1].getId());
        ba4.setBalance(1300);
        BankAccount ba5 = new BankAccount("5678876556788765", banks[0].getId(), users[2].getId());
        ba5.setBalance(1400);
        BankAccount ba6 = new BankAccount("6789987667899876", banks[3].getId(), users[3].getId());
        ba6.setBalance(1500);

        System.out.println("From bank account before transfer:");
        PrintBalance(ba1);
        System.out.println("To bank account before transfer:");
        PrintBalance(ba2);
        Transfer(ba1, ba2, 100);
        System.out.println("From bank account after transfer:");
        PrintBalance(ba1);
        System.out.println("To bank account after transfer:");
        PrintBalance(ba2);

        System.out.println("From bank account before transfer:");
        PrintBalance(ba3);
        System.out.println("To bank account before transfer:");
        PrintBalance(ba4);
        Transfer(ba3, ba4, 500);
        System.out.println("From bank account after transfer:");
        PrintBalance(ba3);
        System.out.println("To bank account after transfer:");
        PrintBalance(ba4);

        System.out.println("From bank account before transfer:");
        PrintBalance(ba2);
        System.out.println("To bank account before transfer:");
        PrintBalance(ba5);
        Transfer(ba2, ba5, 50);
        System.out.println("From bank account after transfer:");
        PrintBalance(ba2);
        System.out.println("To bank account after transfer:");
        PrintBalance(ba5);

        System.out.println("From bank account before transfer:");
        PrintBalance(ba6);
        System.out.println("To bank account before transfer:");
        PrintBalance(ba3);
        Transfer(ba6, ba3, 430);
        System.out.println("From bank account after transfer:");
        PrintBalance(ba6);
        System.out.println("To bank account after transfer:");
        PrintBalance(ba3);
    }
}
