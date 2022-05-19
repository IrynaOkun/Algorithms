public class AscendingSequence {

    //0, 1, 2, 3, 4, 5

    public int[] ascendingSequenceTestAlgorithm(int start, int end, int step) {

        if (step > 0 && start < end) {

            int[] result = new int[((end - start)/step)+1];

//проходим по индексам
            for(int i = 0; i < result.length; i++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }

            return result;

            // идем по значениям
//            int j = 0;
//
//            for(int i = start; i < result.length; i +=step) {
//                if (j < result.length) {
//                    result [j] = i;
//                    j++;
//                }
//
//            }

//            return result;

        }

        return new int[]{};

    }

}
