package sample;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.MutableAttributeSet;
import java.awt.event.MouseAdapter;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.ToIntFunction;

public class Implementations {



    // Hackerrank
    static void kaprekarNumbers(int lowerLimit, int higherLimit) {

        String result = "";
        for (int i = lowerLimit; i < higherLimit; i++) {
            long square = Long.parseUnsignedLong(String.valueOf(i * i));
            String string = String.valueOf(square);
            String left = string.substring(0, (string.length()/ 2));
            String right = string.substring((string.length() / 2));

            int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
            int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);

             if (numL + numR == i) {
                result = i + " ";
                System.out.print(result);
            }

        }
        if (result.isEmpty()) {
            System.out.println("INVALID RANGE");
        }
    }




    static int jumpingOnClouds(int[] array) {

        int counter = 0;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                counter++;
            } else if (array[i] == array[i + 2]) {
                counter++;
            }
        }
        return counter;
    }

    // hackerrank
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 < y2) return 0;

        if (y1 == y2 && m1 == m2 && d1 > d2) {
            return 15 * Math.abs(d1 - d2);
        } else if (y1 == y2 && m1 > m2) {
            return 500 * Math.abs(m1 - m2);
        } else {
            return 10000 * Math.abs(y1 - y2);
        }
    }


    // hackerrank implementation;
    static int viralAdvertising(int n) {
        int people = 5;
        int total = 0;

        for (int i = 0; i < n; i++) {
            people = (int) Math.floor(people / 2);
            total += people;
            people *= 3;
        }
        return total;
    }

    // hackerrank implementation
    static int beautifulDays(int firstNumber, int secondNumber, int k) {
        int counter = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            if ((Math.abs(i - reverseNumber(i)) % k == 0)) {
                counter++;
            }
        }
        return counter;
    }

    // with the beautiful function;
    static int reverseNumber(int number) {
        String string = String.valueOf(number);
        String result = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            result = result + string.charAt(i);
        }
        return Integer.parseInt(result);
    }


    // hackerreank
    static int designerPdfViewer(int[] h, String word) {
        int length = word.length();
        int tempor = 0;

        for (int i = 0; i < length; i++) {
            int asciiNumber = word.charAt(i);
            int height = h[asciiNumber - 97];
            if (tempor < height) {
                tempor = height;
            }
        }
        return length * tempor;
    }

    // hackerrank implementation;
    static String angryProfessor(int atLeastAttenedence, int[] array) {
        int counter = 0;

        for (int value : array) {
            if (value <= 0) {
                counter++;
            }
        }
        if (counter >= atLeastAttenedence) {
            return "NO";
        } else
            return "YES";
    }


    // hackerrank implement
    static int hurdleRace(int ability, int[] height) {
        int result;

        Arrays.sort(height);
        int max = height[height.length - 1];
        if (max > ability) {
            result = Math.abs(max - ability);
        } else {
            return 0;
        }
        return result;
    }

    //hackerrenak implement
    static String catAndMouse(int catA, int catB, int mouseC) {
        int catAdiff = Math.abs(mouseC - catA);
        int catBdiff = Math.abs(mouseC - catB);

        if (catAdiff == catBdiff) {
            return "Mouse C";
        }

        if (catAdiff > catBdiff) {
            return "Cat B";
        } else
            return "Cat A";
    }

    //Hackerrank. implement
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= b && keyboard + drive > max) {
                    max = keyboard + drive;
                }
            }
        }
        return max;
    }

    static void sockMerchantHash() {
        int[] c = {1, 2, 1, 2, 1, 3, 2};
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int value : c) {
            if (!colors.contains(value)) {
                colors.add(value);
            } else {
                pairs++;
                colors.remove(value);
            }
        }
        System.out.println(pairs);
    }

    // hackerrank;
    static int sockMerchant(int n, int[] ar) {
        int total = 0;
        int[] counterArray = new int[ar.length - 1];

        for (int elements : ar) {
            counterArray[elements]++;
        }

        for (int value : counterArray) {
            if (value % 2 == 0) {
                total += (value / 2);
            } else if ((value - 1) % 2 == 0 && (value - 1) != 0) {
                total += (value / 2);
            }
        }
        return total;
    }

    // hacekrrank
    static int migratoryBirds(List<Integer> arr) {

        int[] arrayCounter = new int[arr.size()];

        for (int value : arr) {
            arrayCounter[value]++;
        }

        int maxNumber = arrayCounter[0];
        int maxIndex = 0;
        for (int i = 0; i < arrayCounter.length; i++) {
            if (maxNumber < arrayCounter[i]) {
                maxNumber = arrayCounter[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        for (int i = 0; i < s.size() - m + 1; i++) {
            if (sum == d) {
                counter++;
            }
            if (i + m < s.size()) {
                sum = sum - s.get(i) + s.get(i + m);
            }
        }
        return counter;

    }

    // breakingRecords implementations;
    static int[] breakingRecords(int[] scores) {
        int highScore = scores[0];
        int lowScore = scores[0];

        int[] array = new int[2];
        int highCounter = 0;
        int lowCounter = 0;
        for (int score : scores) {
            if (highScore < score) {
                highScore = score;
                highCounter++;
            }

            if (lowScore > score) {
                lowScore = score;
                lowCounter++;
            }
        }
        array[0] = highCounter;
        array[1] = lowCounter;
        return array;
    }


    //Kangaroos;
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2 > v1) return "NO";
        if (v1 == v2 && x1 < x2) return "NO";
        int result = (x2 - x1) % (v2 - v1);
        if (result == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    // hackerrank implementations;
    static void countApplesAndOranges(int homeLeft, int homeRight, int appleTreeLoc, int orangeTreeLoc, int[] apples, int[] oranges) {

        int appleCounter = 0;
        int orangeCounter = 0;
        // adding apply to the array
        int[] appleResult = new int[apples.length];

        for (int i = 0; i < apples.length; i++) {
            appleResult[i] = apples[i] + appleTreeLoc;
        }
        // adding oranges

        int[] orangeResult = new int[oranges.length];

        for (int i = 0; i < oranges.length; i++) {
            orangeResult[i] = orangeTreeLoc + oranges[i];
        }

        for (int value : orangeResult) {
            if (value >= homeLeft && value <= homeRight) {
                orangeCounter++;
            }
        }

        for (int value : appleResult) {
            if (value >= homeLeft && value <= homeRight) {
                appleCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }


    static int findDigits(int number) {
        String[] array = String.valueOf(number).split("");
        int count = 0;

        for (String s : array) {
            if (Integer.parseInt(s) != 0) {
                if (number % Integer.parseInt(s) == 0) {
                    count++;
                }
            }
        }
        return count;
    }


    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }


    static int anagram(String s) {
        int size = s.length() / 2;
        String s1 = s.substring(0, size);
        String s2 = s.substring(size);

        int count = 0;

        int[] char_count = new int[26];

        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - 'a']++;

        for (int i = 0; i < s2.length(); i++)
            if (char_count[s2.charAt(i) - 'a']-- <= 0)
                count++;

        return count;
    }


    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double result = 0;

        double tip = ((meal_cost * tip_percent) / 100);
        double tax = ((meal_cost * tax_percent) / 100);

        result = meal_cost + tax + tip;

        System.out.println(Math.round(result));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aliceCounter = 0;
        int bobCounter = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceCounter++;
            } else if (b.get(i) > a.get(i)) {
                bobCounter++;
            }
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(aliceCounter);
        arrlist.add(bobCounter);

        return arrlist;
    }


    static String funnyString(String s) {
        byte[] ascii = s.getBytes(StandardCharsets.US_ASCII);
        int[] array = new int[ascii.length - 1];

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s).reverse();

        byte[] ascii2 = stringBuilder.toString().getBytes(StandardCharsets.US_ASCII);
        int[] array2 = new int[ascii2.length - 1];

        for (int i = 0; i < ascii.length - 1; i++) {
            array[i] = Math.abs(ascii[i] - ascii[i + 1]);
            array2[i] = Math.abs(ascii2[i] - ascii2[i + 1]);
        }
        if (Arrays.equals(array, array2)) {
            return "Funny";
        } else {
            return "Not Funny";
        }
    }

    static int palindromeIndex(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s).reverse();

        if (s.contentEquals(stringBuilder)) return -1;

        return -1;

    }

    static int marsExploration(String s) {
        String message = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != message.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }

    static String pangrams(String s) {
        String newString = s.replaceAll("[^A-Za-z]", "").toLowerCase();

        HashSet<String> set = new HashSet<>(Arrays.asList(newString.split("")));

        if (set.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }


    public static boolean check(String sentence) {
        //code
        String newest = sentence.replaceAll("[^A-Za-z]", "").toLowerCase();
        Set<String> sets = new HashSet<>();

        for (String element : newest.split("")) {
            sets.add(String.valueOf(element));
        }
        return sets.size() >= 26;
    }


    static int camelcase(String s) {
        int total = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(s.substring(i, i + 1).toUpperCase())) {
                total++;
            }
        }
        return total;
    }

    static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    static String superReducedString(String s) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(String.valueOf(s.charAt(i)));
        }
        return s;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        Integer[][] numbersArray;
        int d1 = 0, d2 = 0;

        numbersArray = arr.stream().map(x -> x.toArray(new Integer[0])).toArray(Integer[][]::new);
        int rows = numbersArray.length;
        int columns = numbersArray[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == j)
                    d1 += numbersArray[i][j];

                if (i == rows - j - 1)
                    d2 += numbersArray[i][j];
            }
        }
        return Math.abs(d1 - d2);
    }

    static String timeConversion(String s) {

        String[] time = s.split(":");
        int hour = Integer.parseInt(time[0]);

        String min = time[1];
        String secWithAmPm = time[2];
        String sec = time[2].substring(0, secWithAmPm.length() - 2);
        String period = time[2].substring(secWithAmPm.length() - 2);

        String militaryTime = "";

        if ((hour >= 0 && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            militaryTime = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((hour >= 0 && hour < 12) && (period.equalsIgnoreCase("PM"))) {
            militaryTime = (hour + 12) + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            militaryTime = "00" + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            militaryTime = hour + ":" + min + ":" + sec;
        }
        return militaryTime;

    }


    public static int difference(int[][] arr, int n) {
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minTotal = 0;
        long maxTotal = 0;

        for (int i = 1; i < arr.length; i++) {
            minTotal += arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            maxTotal += arr[i];
        }
        System.out.println(maxTotal + " " + minTotal);
    }


    static int birthdayCakeCandles(int[] ar) {
        int total = 0;
        Arrays.sort(ar);
        int bigNum = ar[ar.length - 1];

        for (int element : ar) {
            if (element == bigNum) {
                total++;
            }
        }
        return total;
    }

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print("");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (long l : ar) {
            result += l;
        }
        return result;
    }

    static void plusMinus(int[] arr) {
        double countPos = 0;
        double countNegative = 0;
        double countZero = 0;

        for (int elements : arr) {
            if (elements > 0) {
                countPos++;
            } else if (elements < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.printf("%.6f %n", countPos / arr.length);
        System.out.printf("%.6f %n", countNegative / arr.length);
        System.out.printf("%.6f %n", countZero / arr.length);

    }


    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;

        char[] firstArray = a.toCharArray();
        char[] sec = b.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(sec);

        return Arrays.equals(firstArray, sec);
    }


    public static void palindrome(String string) {
        String result = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        if (result.equals(string)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public static String[] solution(String s) {
        //Write your code here
        String[] array = s.split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length - 1; i++) {
            if (array.length % 2 == 0) {
                if (i == array.length - 2) {
                    result.append(array[i]).append(array[array.length - 1]);
                } else {
                    result.append(array[i]).append(array[i + 1]).append(", ");
                    i++;
                }
            } else {
                result.append(array[i]).append(array[i + 1]).append(", ");
                i++;
                if (i == array.length - 2) {
                    result.append(array[array.length - 1]).append("_");
                }
            }
        }
        return new String[]{result.toString()};
    }


    public static String camelCase(String input) {

        //return input.replaceAll("([A-Z])", " $1");

        String result = "";
        String[] array = input.split("");
        for (int i = 0; i < input.length(); i++) {
            if (array[i].equals(array[i].toUpperCase())) {
                result += " " + array[i];
            } else {
                result += array[i];
            }
        }
        return result;
    }


    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static String greet(String name) {
        String greet = "Hello ";
        String newName = name.toLowerCase();
        return greet + newName.substring(0, 1).toUpperCase() + newName.substring(1) + "!";
    }


    public static String[] wave(String str) {
        String[] array = new String[str.length()];
        for (int i = 0; i < array.length; i++) {
            if (!str.startsWith(" ", i)) {
                String s = str.substring(i, i + 1).toUpperCase();
                array[i] = s + str.substring(i + 1);
                if (i >= 1) {
                    array[i] = str.substring(0, i) + s + str.substring(i + 1);
                }
            } else if (str.startsWith(" ", i)) {
            }
        }
        return array;
    }

    public static long findNextSquare(long sq) {
        long newNumber = (long) Math.sqrt(sq);
        if (sq == newNumber * newNumber) {
            return (long) Math.pow(newNumber + 1, 2.0);
        } else {
            return -1;
        }
    }


    public static int squareDigits(int n) {
        // TODO Implement me

        String string = String.valueOf(n);

        char[] charArray = string.toCharArray();
        int[] array = new int[charArray.length];

        for (int i = 0, a = 0; i < charArray.length; i++) {
            array[a] = (int) charArray[i] - 48;
            a++;
        }
        String result = "";

        for (int value : array) {
            result += value * value;
        }
        return Integer.parseInt(result);
    }


    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // your code goes here

        int[] array = {age1, age2, age3, age4, age5, age6, age7, age8};
        int total = 0;

        for (int value : array) {
            total += value * value;
        }
        long square = (long) Math.sqrt(total);

        return Math.toIntExact(square / 2);
    }


    public static int maVanVlaue(int[] values) {
        Set<Integer> sets = new HashSet<>();
        for (int elements : values) {
            sets.add(elements);
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer numbers : sets) {
            stringBuilder.append(numbers);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static int minValue(int[] values) {
        Arrays.sort(values);
        int[] tempArray = new int[values.length];

        int j = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] != values[i + 1]) {
                tempArray[j] = values[i];
                j++;
            }
        }
        tempArray[j] = values[values.length - 1];

        int k = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] != 0) {
                tempArray[k++] = tempArray[i];
            }
        }
        int[] newArray = new int[k];
        System.arraycopy(tempArray, 0, newArray, 0, k);

        StringBuilder stringBuilder = new StringBuilder();

        for (int number : newArray) {
            stringBuilder.append(number);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static List<String> number(List<String> lines) {
        String[] string = lines.toArray(new String[0]);
        String result = "";

        for (int i = 1; i < string.length + 1; i++) {
            result += ": " + string[i];
        }
        List<String> myList = new ArrayList<String>(Arrays.asList(result.split("")));
        return myList;
    }

    public static String disemvowel(String str) {
        // Code away...
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static String showSequence(int value) {
        int total = 0;
        StringBuilder string = new StringBuilder();
        if (value == 0) return "0" + "=" + "0";
        if (value < 0) return value + "<" + "0";

        for (int i = 0; i <= value; i++) {
            total += i;
            string.append(i);
            if (i < value) {
                string.append("+");
            }
        }
        return (string + " = " + total).trim();
    }

    public static String highAndLow(String numbers) {
        // Code here or
        // string to int array

        String[] numberArray = numbers.split(" ");
        int[] array = Arrays.stream(numberArray).
                mapToInt(Integer::parseInt).toArray();

        Arrays.sort(array);
        return array[array.length - 1] + " " + array[0];
    }


}


