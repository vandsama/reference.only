package com.techelevator.quizgame;

import java.io.FileNotFoundException;
import java.util.List;

public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {

		final QuizFileReader fileReader = new QuizFileReader("path");
		List<QuizQuestion> questions = fileReader.processFile();

		/**
		 * - prompt for name/path of quiz question file			*UI
		 * - parse the file into questions and answers			*quizFileReader
		 * - display question									*UI
		 * - display answers									*UI
		 * 		- attach a number for guessing
		 * - prompt for answer									*UI
		 * - determine if answer is correct						*gameLogic
		 * - track correct answers								*gameLogic
		 */



	}

}
