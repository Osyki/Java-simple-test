public class Week3Assignment {

    public static void main(String[] args) {
        //problem 1a
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        subFirstFromLast(ages);
        printArray(ages);

        //problem 1b
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 20};
        subFirstFromLast(ages2);
        printArray(ages2);

        //problem 1c
        double average = calcAvg(ages);
        System.out.println("Average of arr1 is: " + average);

        //problem 2a
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double averageLetters = calcAvgNumLetters(names);
        System.out.println("Average number of letters in arr3: " + averageLetters);

        //problem 2b
        printArray(names);

        //problem 5
        int[] nameLengths = new int[names.length];
        numOfLettersToArr(nameLengths, names);
        printArray(nameLengths);

        //problem 6
        int totalNameLengths = calcTotal(nameLengths);
        System.out.println(totalNameLengths);

        //problem 7
        String word = wordMultipleTimes("Hello",3);
        System.out.println(word);

        //problem 8
        String fullName = concatName("John","Doe");
        System.out.println(fullName);

        //problem 9
        int[] numArr = {40, 23, 43, 543};
        int[] numArr2 = {1,2,3};
        //should print true
        System.out.println(checkIfGreatThan100(numArr));
        //should print false
        System.out.println(checkIfGreatThan100(numArr2));

        //problem 10
        double[] doubleArr = {1.2,4.3,2.1,6.9};
        average = average(doubleArr);
        System.out.println(average);

        //problem 11
        double[] doubleArr2 = {1.1,1.5,1.2};
        //should print true
        System.out.println(checkIfHigherAverage(doubleArr,doubleArr2));
        //should print false
        System.out.println(checkIfHigherAverage(doubleArr2,doubleArr));

        //problem 12
        //should print true
        System.out.println(willBuyDrink(true,11.00));
        //should print false
        System.out.println(willBuyDrink(true,10.00));

        //problem 13
        //Returns product of given int array
        int[] numArr3 = {1,2,4,2};
        int productArr = calcProductArr(numArr3);
        System.out.println(productArr);
    }

    /**
     * Calculates the product of a given array.
     * @param numArr3 to calculate product.
     * @return prodcut of each integer in array.
     */
    private static int calcProductArr(int[] numArr3) {
        int total = 1;
        for (int i : numArr3) {
            total *= i;
        }
        return total;
    }

    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && (moneyInPocket > 10.50);
    }

    private static boolean checkIfHigherAverage(double[] doubleArr, double[] doubleArr2) {
        return average(doubleArr) > average(doubleArr2);
    }

    private static double average(double[] doubleArr) {
        double sum = 0.0;
        for (double i: doubleArr) {
            sum += i;
        }
        return sum / doubleArr.length;
    }

    private static boolean checkIfGreatThan100(int[] numArr) {
        int sum = 0;
        for (int j : numArr) {
            sum += j;
        }
        return sum > 100;
    }

    private static String concatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static String wordMultipleTimes(String word, int x) {
        String text = "";
        for (int i = 0; i < x; i++) {
            text += word;
        }
        return text;
    }

    private static int calcTotal(int[] nameLengths) {
        int sum = 0;
        for(int i: nameLengths) {
            sum += i;
        }
        return sum;
    }

    static void numOfLettersToArr(int[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i].length();
        }
    }

    static double calcAvgNumLetters(String[] array) {
        double sum = 0.0;
        for (String i : array) {
            sum += i.length();
        }
        return sum / array.length;
    }

    static double calcAvg(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum/array.length;
    }

    static void subFirstFromLast(int[] array) {
        array[array.length-1] -= array[0];
    }

    static void printArray(int[] array) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            text.append(array[i]);
            if (i != array.length-1) {
                text.append(", ");
            }
        }
        System.out.println(text);
    }

    static void printArray(String[] array) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            text.append(array[i]);
            if (i != array.length-1) {
                text.append(", ");
            }
        }
        System.out.println(text);
    }
}
