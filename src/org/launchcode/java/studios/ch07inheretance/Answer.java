package org.launchcode.java.studios.ch07inheretance;

public class Answer {
    private final String answerText;
    private final boolean _isCorrect;

    public Answer(String answerText, boolean isCorrectAnswer) {
        this.answerText = answerText;
        this._isCorrect = isCorrectAnswer;
    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect() {
        return _isCorrect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        return answerText.equals(answer.answerText);
    }

    @Override
    public int hashCode() {
        return answerText.hashCode();
    }
}
