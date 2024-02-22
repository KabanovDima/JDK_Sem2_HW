package Sem_3_HW;

public class CompareArray {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        if (!array1.getClass().getComponentType().equals(array2.getClass().getComponentType())) {
            return false;
        }

        // Проверяем, содержат ли массивы одинаковые элементы
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
