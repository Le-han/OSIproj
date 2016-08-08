package com.example.alex.osiproj;

public class Question {

    private int mTextResId;
    private int mAnswerResId;

    public Question(int textResId, int answerTrue) {
        mTextResId = textResId;
        mAnswerResId = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int isAnswerTrue() {
        return mAnswerResId;
    }

    public void setAnswerTrue(int answerTrue) {
        mAnswerResId = answerTrue;
    }
}
