package by.learn.textparser.runner;

import by.learn.textparser.components.Text;
import by.learn.textparser.utils.Parser;
import by.learn.textparser.utils.Reader;

public class Runner {
    public static void main(String[] args) {
        String path = "/Users/kirusha/Documents/Java/string-templates/text1.txt";
        Text text = new Text(Reader.fromFile(path));
        System.out.println(Parser.findUniqueWord(text));
    }
}
