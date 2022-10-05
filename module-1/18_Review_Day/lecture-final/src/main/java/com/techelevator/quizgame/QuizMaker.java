package com.techelevator.quizgame;

import java.io.FileNotFoundException;
import java.util.List;

public class QuizMaker {

	public static void main(String[] args) {

		final QuizFileReader fileReader = new QuizFileReader("path");
		try {
			List<QuizQuestion> questions = fileReader.processFile();
		} catch (FileNotFoundException e) {
			System.out.println("that file does not exists");
		}


		/**
		 * - prompt for name/path of quiz question file *ui
		 * - parse the file into questions and answers *quizfilereader
		 * - display question *ui
		 * - display answers *ui
		 * 		- attach a number for guessing
		 * - prompt for answer *ui
		 * - determine if answer is correct *gamelogic
		 * - track correct answers *gamelogic
		 *
		 * - game flow *???
		 */



	}

}
