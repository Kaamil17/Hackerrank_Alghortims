
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Sortingg {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] data = {3,3,2,1,3};
    }


    // differene between smalles and biggest;
    static int computeDifference( int[] elements) {
        Arrays.sort(elements);
        return Math.abs(elements[0] - elements[elements.length - 1]);
    }

  static int countingFreq(int array[]) {
        int count = 0;
      for (int value : array) {
          for (int i : array) {
              if (value == i) {
                  count++;
              }
          }
      }

        return count;
    }


    static int runningTime(int[] array) {

        int j, temp;
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            j = i;
            temp = array[i];

            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
                counter++;
            }
            array[j] = temp;
        }
        return counter;
    }


    // too slow
    static int insertionSort(int[] arr) {
        int counter = 0;
        int j, temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
                counter++;
            }
            arr[j] = temp;
        }
        return counter;
    }


    static void insertionSort1(int n, int[] arr) {
        int temp, j;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
                for (int element : arr) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            arr[j] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    // main method;
    public static int[] insertionSort(int n, int[] array) {
        int j, temp;
        for (int i = 1; i < n; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
                for (int element : array) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            array[j] = temp;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        return array;
    }

    static int introTutorial(int V, int[] arr) {
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                position = i;
            }
        }
        return position;
    }

    static int findMedian(int[] arr) {
        int result = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                result = arr[(arr.length) / 2];
            } else {
                result = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
            }
        }
        return result;
    }

    static void conditional() {
        int number = scanner.nextInt();
        if (number % 2 == 1 || (number > 5 && number < 21)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }

    static int factorial(int number) {
        if (number >= 1) {
            return number * factorial(number - 1);
        } else
            return 1;
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int flag = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
