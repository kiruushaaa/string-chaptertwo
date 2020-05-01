package by.learn.textparser.utils;

import by.learn.textparser.components.Sentence;
import by.learn.textparser.components.Text;
import by.learn.textparser.components.Word;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Word> findUniqueWord(Text text) {
        List<Word> uniqueWords = new ArrayList<>();
        List<Sentence> sentences = text.parse();
        for(Word currentWord : sentences.get(0).parse()) {
            boolean flag = false;
            for (int i = 1; i < sentences.size(); i++) {
                flag = sentences.get(i).parse().contains(currentWord);
            }
            if (!flag) uniqueWords.add(currentWord);
        }
        return uniqueWords;
    }
}
