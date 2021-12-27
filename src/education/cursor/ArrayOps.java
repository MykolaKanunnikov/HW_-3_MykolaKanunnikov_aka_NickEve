package education.cursor;

import java.util.Arrays;
import java.util.Random;

public class ArrayOps {
    private int[] array;

    public ArrayOps(int[] array) {
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    //      1. Заповнити масив тільки парними числами
    public void fillArrayWithEven() {
        array = new int[array.length];
        for (int counter = 0, a = 2; counter < array.length; counter++) {
            array[counter] = a += 2;
        }
        System.out.println("1. Array of even numbers: " + Arrays.toString(array));
    }


    //      2. Заповнити масив рандомними числами
    public void fillArrayWithRandom() {
        this.array = new Random().ints(this.array.length, 0, 100).toArray();
        System.out.println("2. Array of random numbers: " + Arrays.toString(array));
    }


    //      3. Вивести середнє значення масиву
    public void showAverage() {
        double totalValue = 0, averageValue;
        for (int arrayOfRandomNumber : array) {
            totalValue += arrayOfRandomNumber;
        }
        averageValue = totalValue / array.length;
        System.out.println("3. Average value for array of random numbers is " + averageValue);

    }

    //      4. Вивести суму всіх значень кратних 3
    public void totalZeroFromDividingBy3() {
        double totalZeroFromDividingBy3 = 0;
        for (int oneOfRandom : array) {
            if (oneOfRandom % 3 == 0) {
                totalZeroFromDividingBy3 += oneOfRandom;
            }
        }
        System.out.println("4. Total of values duly divided by 3 is " + totalZeroFromDividingBy3);

    }

    //      5. Вивести значення всіх парних індексів масиву
    public void valuesOfEvenIndexes() {
        System.out.print("5. Values of even indexes: ");
        for (int counter = 2; counter < array.length; counter += 2) {
            System.out.print(array[counter] + " ");
        }
        System.out.println(" ");
    }

    //      6. Просортувати масив в порядку зростання
    public void sortArray() {
        Arrays.sort(array);
        System.out.println("6. Sorted array of random numbers: " + Arrays.toString(array));
    }

    //      7. Вивести найменше значення в масиві
    public void theSmallestValue() {
        System.out.println("7. The smallest value in the array of random numbers is "
                + array[0]);
    }

    //      8. Вивести найбільше значення масиву
    public void theHighestValue() {
        System.out.println("8. The highest value in the array of random numbers is "
                + array[array.length - 1]);
    }

    //      9. Вивести суму значень всіх парних індексів
    public void totalOfEvenIndexes() {
        int totalOfEvenIndexes = 0;
        for (int counter = 2; counter < array.length; counter += 2) {
            totalOfEvenIndexes += array[counter];
        }
        System.out.println("9. The total of even indexes values is " + totalOfEvenIndexes);
    }

    //      10. Вивести перших 20 символів з таблиці ASCII
    public void first20CharsOfASCII() {
        String[] firstTwentyChars = new String[19];
        String ASCII_Character;
        for (int counter = 0; counter < firstTwentyChars.length; counter++) {
            // convert each value into character
            char character = (char) counter;
            // check whether character is whitespace or not
            if (Character.isWhitespace(character)) {
                ASCII_Character = switch (character) {
                    case '\r' -> "\\r";
                    case '\t' -> "\\t";
                    case '\n' -> "\\n";
                    case '\f' -> "\\f";
                    // case ' ' -> "space"; // unreachable with provided array length (0-19)
                    default -> "whitespace";
                };
                // detect characters that are not letters, digits and punctuation
            } else if (Character.isISOControl(character)) {
                ASCII_Character = "control";
            } else {
                // showing others chars
                ASCII_Character = Character.toString(character);
            }
            firstTwentyChars[counter] = (ASCII_Character);
        }
        System.out.println("10. First 20 chars from ASCII table: \n" + Arrays.toString(firstTwentyChars));
    }
}