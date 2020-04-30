package by.learn.textparser.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text implements IParse {
    private final String SENTENCE_REGEX = "\\.\\s*";
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Sentence> parse() {
        List<String> temporarySentences = Arrays.asList(this.text.split(SENTENCE_REGEX));
        List<Sentence> sentences = new ArrayList<>();
        for(String temporarySentence: temporarySentences) {
            sentences.add(new Sentence(temporarySentence));
        }
        return sentences;
    }

    @Override
    public String toString() {
        return text;
    }
}
