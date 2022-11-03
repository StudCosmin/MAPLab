package main;

public class Main {
    public static void main(String[] args) {
        int[] array = {22, 23, 25, 27, 37, 38, 39, 40, 51, 65, 73, 89, 95};
        int[] result = new int[array.length];

        // 1
        result = notSufficient(array);
        prettyPrint(result);
        System.out.println();

        // 2
        System.out.println(average(array));
        System.out.println();

        // 3
        result = rounded(array);
        prettyPrint(result);
        System.out.println();

        // 4
        result = rounded(array);
        System.out.println(maxRoundedGrade(result));

    }

    public static void prettyPrint(int[] arr) {
        for (int index = 0; index < arr.length; ++index) {
            if (arr[index] > 0) {
                System.out.println(arr[index]);
            }
        }
    }

    // First exercise
    public static int[] notSufficient(int[] arr) {
        int counter = 0;
        int[] result = new int[arr.length];

        for (int index = 0; index < arr.length; ++index) {
            if(arr[index] < 40) {
                result[counter++] = arr[index];
            }
        }
        return result;
    }

    // Second exercise
    public static double average(int[] arr) {
        int result = 0;
        for (int index = 0; index < arr.length; ++index) {
            result = result + arr[index];
        }
        return result / arr.length;
    }

    // Helper function used to resolve the third exercise
    public static int roundingMechanism(int grade) {
        if (grade < 38) return grade;
        else if (grade % 10 == 1 || grade % 10 == 2) {
            grade = grade - (grade % 10);
        }
        else if (grade % 10 == 3 || grade % 10 == 4) {
            grade = grade - (grade % 10) + 5;
        }
        else if (grade % 10 == 6 || grade % 10 == 7) {
            grade = grade - (grade % 10) + 5;
        }
        else if (grade % 10 == 8 || grade % 10 == 9) {
            grade = grade - (grade % 10) + 10;
        }
        return grade;
    }

    // Third exercise
    public static int[] rounded(int[] arr) {
        int counter = 0;
        int[] result = new int[arr.length];

        for (int index = 0; index < arr.length; ++index) {
            int grade = roundingMechanism(arr[index]);
            result[counter++] = grade;
        }
        return result;
    }

    // Fourth exercise
    public static int maxRoundedGrade(int[] arr) {
        int max = 0;
        int[] functionArray = rounded(arr);

        for (int index = 0; index < arr.length; ++index) {
            if (functionArray[index] > max) {
                max = functionArray[index];
            }
        }
        return max;
    }
}
