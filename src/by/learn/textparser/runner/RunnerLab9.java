package by.learn.textparser.runner;

import by.learn.textparser.components.Text;
import by.learn.textparser.utils.Parser;
import by.learn.textparser.utils.Reader;

public class RunnerLab9 {
    public static void main(String[] args) {
        Text text = new Text(Reader.fromFile("string-templates/text.txt"));
        System.out.println(Parser.getVowel(text));
    }
}
