public class OddIndices {

//    Написать алгоритм OddIndices, который принимает массив чисел,
//    и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    public int[] OddIndices(int[] array) {

        int oddNum = 0;

        if (array.length == 0) {

            return new int[]{};
        }

        int[] resultArr = new int[array.length / 2];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                resultArr[oddNum] = array[i];
                oddNum++;
            }
        }

        return resultArr;

    }
}

