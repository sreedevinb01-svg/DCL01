class Demo {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Demo <number1> <operator> <number2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Unsupported operator: " + operator);
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
