package by.learn.textparser.runner;

import by.learn.textparser.components.Sentence;
import by.learn.textparser.components.Text;
import by.learn.textparser.components.Word;
import by.learn.textparser.utils.Reader;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String path = "/Users/kirusha/Documents/Java/string-templates/text.txt";
        Text text = new Text(Reader.fromFile(path));
        List<Sentence> sentences = text.parse();
        List<Word> words = sentences.get(0).parse();
        System.out.println(sentences.get(0));
        System.out.println(words);
    }
}
