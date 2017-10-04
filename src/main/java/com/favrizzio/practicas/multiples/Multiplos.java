package com.favrizzio.practicas.multiples;

public class Multiplos {

    public static void main(String[] args) {

//        String ini = "";
//
//        for (int i = Integer.parseInt(args[0]); i > 0; i--) {
//
//            int numberCharacter = i - (i - 1);
//
//            for (int j = 0; j < numberCharacter; j++) {
//                ini += "#";
//            }
//
//            System.out.println(String.format("%" + Integer.parseInt(args[0]) + "s", ini));
//        }
//
//        for (int i = 1; i <= 15; i++) {
//
//            if ((i % 3) == 0 && (i % 5) == 0) {
//                System.out.println("fizzBuzz");
//            } else if ((i % 3) == 0) {
//                System.out.println("fizz");
//            } else if ((i % 5) == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        int[] numbers = {1, 1, 1, 1, 345, 765, 890, 890, 453, 37, 12, 14, 12, 15, 132, 10, 10, 10, 10, 10};

        int numberCuts = 0;

        int[] newCuts = {};

        do {

            numberCuts = countCuts(numbers);

            if (numberCuts > 0) {

                int cutLength = findMin(numbers);

                numbers = reduceNumbers(cutLength, numbers);

                newCuts = buildArray(newCuts, numberCuts);

            }

        } while (numberCuts != 0);

        showInstance(newCuts);

    }

    private static int[] buildArray(int[] newCuts, int numberCuts) {

        int[] a = new int[newCuts.length + 1];

        for (int i = 0; i < newCuts.length; i++) {
            a[i] = newCuts[i];
        }

        a[newCuts.length] = numberCuts;

        return a;
    }

    private static void showInstance(int[] fCuts) {

        for (int i = 0; i < fCuts.length; i++) {
            System.out.println(fCuts[i]);
        }
    }

    private static int[] reduceNumbers(int cutLength, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                numbers[i] -= cutLength;
            }
        }
        return numbers;
    }

    private static int findMin(int[] numbers) {

        Integer min = null;

        for (int i = 0; i < numbers.length; i++) {

            if (min == null && numbers[i] > 0) {
                min = numbers[i];
            }

            if (numbers[i] > 0 && numbers[i] < min) {
                min = numbers[i];
            }

        }

        return min == null ? 0 : min;
    }

    private static int countCuts(int[] numbers) {

        int count = 0;

        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        return count;
    }

}
