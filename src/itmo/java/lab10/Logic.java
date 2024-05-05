package itmo.java.lab10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logic {

    //    Первое упражнение

    public static List<String> myMethod(File file1) {
        String myString;
        List<String> myList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            while ((myString = reader.readLine()) != null) {
                myList.add(myString);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return myList;
    }

//    Второе упражнение

    public static void writeString(String string, File file2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            writer.write(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

//    Третье упражнение

    public static void myMethod1(File file1, File file2, File file3) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file3))) {
            String string1, string2 = null;
            while ((string1 = reader1.readLine()) != null) {
                writer.write(string1);
            }
            while ((string2 = reader2.readLine()) != null) {
                writer.write(string2);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

//    Четвертое упражнение

    public static void myMethod2(File file1) {
        File tempFile = new File("files/tempFile.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String string = null;
            while ((string = reader.readLine()) != null) {
                String string1 = string.replace(" ", "$");  //("[^A-Za-zА-Яа-я0-9]", "$");
                System.out.println(string1);
                writer.write(string1);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
            String string = null;
            while ((string = reader.readLine()) != null) {
                writer.write(string);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
