package com.techelevator;

public class HomeworkAssignment {

    int earnedMarks;
    int possibleMarks;
    String submitterName;



    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        String letterGrade = "";
        double percentageGrade = (double)earnedMarks/possibleMarks;
        if (percentageGrade >= 0.90) {
            letterGrade = "A";
        } else if (percentageGrade >= 0.80) {
            letterGrade = "B";
        } else if (percentageGrade >= 0.70) {
            letterGrade = "C";
        } else if (percentageGrade >= 0.60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }





}
