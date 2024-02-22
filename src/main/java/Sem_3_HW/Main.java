package Sem_3_HW;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    public static void task1(){
//        Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
//        методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа
//        разного типа, над которыми должна быть произведена операция.
        int intResult = Calculator.sum(5, 3).intValue();
        double doubleResult = Calculator.divide(10.5, 2);
        long longResult = Calculator.multiply(123456789L, 987654321L).longValue();
        float floatResult = Calculator.subtract(10.5f, 5.3f).floatValue();

        System.out.println("Sum: " + intResult);
        System.out.println("Division: " + doubleResult);
        System.out.println("Multiplication: " + longResult);
        System.out.println("Subtraction: " + floatResult);
    }

    public static void task2(){
        //        Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
        //        если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
        //        но должны иметь одинаковую длину и содержать элементы одного типа.
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Integer[] array3 = {1, 2, 3, 4, 5, 6};

        System.out.println("Array1 equals Array2: " + CompareArray.compareArrays(array1, array2));
        System.out.println("Array1 equals Array3: " + CompareArray.compareArrays(array1, array3));

    }

    public static void task3(){
//        Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//        Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из
//        составляющих пары, а также переопределение метода toString(), возвращающее строковое
//        представление пары.

        Pair<Integer, String> pair = new Pair<>(5, "Hi, task 3");
        System.out.println(pair);
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

    }
}
