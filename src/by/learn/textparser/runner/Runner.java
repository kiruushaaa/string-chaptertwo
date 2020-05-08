package by.learn.textparser.runner;

import by.learn.textparser.components.Text;
import by.learn.textparser.utils.Parser;
import by.learn.textparser.utils.Reader;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        String path = "string-templates/text.txt";
        Text text = new Text(Reader.fromFile(path));
        System.out.println(Parser.findUniqueWord(text,0));

//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 ,.!?-";
//        String result = "";
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            result += alphabet.charAt(new Random().nextInt(alphabet.length()));
//        }
//        System.out.println((System.currentTimeMillis() - time) * .001);
//        System.out.println(result);
//
//        StringBuilder sb = new StringBuilder();
//        time = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            sb.append(alphabet.charAt(new Random().nextInt(alphabet.length())));
//        }
//        System.out.println((System.currentTimeMillis() - time) * .001);
//        System.out.println(sb.toString());
    }
}
