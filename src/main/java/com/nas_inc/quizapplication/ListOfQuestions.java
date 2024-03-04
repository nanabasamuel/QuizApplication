package com.nas_inc.quizapplication;

public class ListOfQuestions {
    private  String question, alternative1, alternative2, alternative3, alternative4, answer;
    private String userSelectedAnswer;

    public ListOfQuestions(String question, String alternative1, String alternative2, String alternative3, String alternative4, String answer, String userSelectedAnswer) {
        this.question = question;
        this.alternative1 = alternative1;
        this.alternative2 = alternative2;
        this.alternative3 = alternative3;
        this.alternative4 = alternative4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }


    public String getQuestion() {
        return question;
    }

    public String getAlternative1() {
        return alternative1;
    }

    public String getAlternative2() {
        return alternative2;
    }

    public String getAlternative3() {
        return alternative3;
    }

    public String getAlternative4() {
        return alternative4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
