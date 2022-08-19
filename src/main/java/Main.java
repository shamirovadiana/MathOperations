public class Main {
    public static void main(String[] args) {

        double val1 = 30;
        double val2 = 3;
        System.out.println(val1 + " + " + val2 + " = " + sum(val1, val2));
        System.out.println(val1 + " - " + val2 + " = " + subtraction(val1, val2));
        System.out.println(val1 + " * " + val2 + " = " + multiplication(val1, val2));
        System.out.println(val1 + " / " + val2 + " = " + division(val1, val2));

    }

    public static double sum(double value1, double value2){
        return value1 + value2;
    }

    public static double subtraction(double value1, double value2){
        return value1 - value2;
    }

    public static double multiplication(double value1, double value2){
        return value1 * value2;
    }

    public static double division(double value1, double value2){
        return value1 / value2;
    }
}
