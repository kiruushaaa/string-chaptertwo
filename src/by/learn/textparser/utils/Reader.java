package by.learn.textparser.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static String fromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return reader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
