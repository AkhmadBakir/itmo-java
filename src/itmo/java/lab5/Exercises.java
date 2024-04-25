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
        int i1 = 0;
        int i2 = text.length() - 1;
        while (i2 > i1) {
            if (text.charAt(i1) != text.charAt(i2)) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

    //    Третье упражнение

    public static String myCensor(String text) {
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }


}
