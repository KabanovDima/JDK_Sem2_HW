package Sem_3_HW;

public class Calculator {
    public static <T extends Number> Double sum(T num1, T num2) {
        return Double.valueOf(num1.doubleValue() + num2.doubleValue());
    }

    public static <T extends Number> Double multiply(T num1, T num2) {
        return Double.valueOf(num1.doubleValue() * num2.doubleValue());
    }

    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> Double subtract(T num1, T num2) {
        return Double.valueOf(num1.doubleValue() - num2.doubleValue());
    }
}
