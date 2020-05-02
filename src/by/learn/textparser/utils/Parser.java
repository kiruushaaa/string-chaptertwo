package by.learn.textparser.utils;

import by.learn.textparser.components.Sentence;
import by.learn.textparser.components.Text;
import by.learn.textparser.components.Word;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Word> findUniqueWord(Text text, int index) {
        List<Word> uniqueWords = new ArrayList<>();
        List<Sentence> sentences = text.parse();
        for(Word currentWord : sentences.get(index).parse()) {
            boolean flag = false;
            for (int i = 0; i < sentences.size(); i++) {
                if (i == index) continue;
                flag = sentences.get(i).parse().contains(currentWord);
            }
            if (!flag) uniqueWords.add(currentWord);
        }
        return uniqueWords;
    }
    public static List<Sentence> getSentences(Text text) {
        List<Sentence> sentences = text.parse();
        for (int i = 0; i < sentences.size(); i++) {
            boolean flag = Parser.findUniqueWord(text,i).size() == sentences.get(i).parse().size() ||
                            Parser.findUniqueWord(text,i).size() == sentences.get(i).parse().size() - 1;
            if (flag) sentences.remove(i);
        }
        return sentences;
    }
}
