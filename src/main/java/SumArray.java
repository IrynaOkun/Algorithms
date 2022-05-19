public class SumArray {

    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива

    public int sumArrayAlgorithm(int[] array) {
        if (array.length != 0) {
            int sum = 0;

            for (int i = 0; 1 < array.length; i++)
                sum += array[i];

            return sum;
        }

        return 0;
    }


}

