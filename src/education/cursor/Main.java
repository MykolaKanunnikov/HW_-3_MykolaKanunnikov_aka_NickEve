package education.cursor;

public class Main {

    public static void main(String[] args) {

        int[] initArray = new int[20];
        ArrayOps array = new ArrayOps(initArray);

        array.fillArrayWithEven();
        array.fillArrayWithRandom();
        array.showAverage();
        array.totalZeroFromDividingBy3();
        array.valuesOfEvenIndexes();
        array.sortArray();
        array.theSmallestValue();
        array.theHighestValue();
        array.totalOfEvenIndexes();
        array.first20CharsOfASCII();

    }
}
