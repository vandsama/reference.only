package com.techelevator.quizgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizFileReader {

    private final String path;

    public QuizFileReader(String path) {
        this.path = path;
    }

    // parse the file into questions and answers
    public List<QuizQuestion> processFile() throws FileNotFoundException {

        List<QuizQuestion> questions = new ArrayList<>();

        final File file = new File(this.path);
        final Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine()) {
            final String line = fileReader.nextLine();

        }

        return questions;
    }
}
