package itmo.java.lab5;

import java.util.Arrays;

public class Exercises {

//    Первое упражнение

    public String longWord(String text) {
        String[] array = text.split(" ");
        int x = 0;
        String temp = "";
        for (String s : array) {
            if (s.length() > x) {
                x = s.length();
                temp = s;
            }
        }
        //System.out.println(Arrays.toString(array));
        return temp;
    }

//    Второе упражнение

    public static Boolean palindromCheck(String text) {
        String text1 = text.toLowerCase();
        int i1 = 0;
        int i2 = text1.length() - 1;
        while (i2 > i1) {
            if (text1.charAt(i1) != text1.charAt(i2)) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

    //    Третье упражнение

    public static String myCensor(String text, String text1, String text2) {
        return text.replaceAll(text1, text2);
    }

    //    Четвертое упражнение

    public static int countString(String firstString, String secondString) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = firstString.indexOf(secondString, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += secondString.length();
            }
        }
        return count;
    }

    //    Пятое упражнение

    public static String backString(String text) {
        String[] array = new StringBuilder(text).reverse().toString().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(" ");
        }
        return result.toString();
    }

}
