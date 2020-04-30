package by.learn.textparser.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence implements IParse {
    private final String WORD_REGEX = "\\s";
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Word> parse() {
        List<String> temporaryWords = Arrays.asList(this.sentence.split(WORD_REGEX));
        List<Word> words = new ArrayList<>();
        for(String temporaryWord: temporaryWords) {
            words.add(new Word(temporaryWord));
        }
        return words;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
