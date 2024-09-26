public class Converter {
    public static double ConvertCurrecy(String data){
        try {
            String[] splitData = data.split(" ");

            if (splitData.length != 4){
                throw new Exception("Invalid input format");
            }

            if(!splitData[2].equals("into")){
                throw new Exception("Invalid input format");
            }
            final double money = Double.parseDouble(splitData[0]);

            double moneyInUAH = switch (splitData[1]){
                case "UAH" -> money;
                case "USD" -> money * 41.08;
                case "CAD" -> money * 30.57;
                case "EUR" -> money * 45.95;
                default -> throw new Exception("Invalid currency");
            };

            return switch (splitData[3]){
                case "UAH" -> moneyInUAH;
                case "USD" -> moneyInUAH / 41.08;
                case "CAD" -> moneyInUAH / 30.57;
                case "EUR" -> moneyInUAH / 45.95;
                default -> throw new Exception("Invalid currency");
            };
        }
        catch (Exception ex){
            System.out.println("Error:" + ex.getMessage());
            return 0;
        }

    }
}
