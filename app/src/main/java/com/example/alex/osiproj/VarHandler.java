package com.example.alex.osiproj;

import android.support.v4.view.ScrollingView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class VarHandler extends AppCompatActivity {

    //private static final String TAG = "Var2015_1";
    //private static final String KEY_INDEX = "index";

    private ImageButton mNextButton;
    private ImageButton mPrevButton;
    private TextView mQuestionTextView;
    //функциональности подсматривания ответа
    private TextView mAnswerTextView;
    private Button mShowAnswer;
    private int mAnswerIsTrue;

    private Question [] mQuestionBank;
    private int mCurrentIndex = 0;
    private void updateQuestion() {
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }
    /* В этой версии проверять на правильность не надо
    private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
        int messageResId = 0;
        if (userPressedTrue == answerIsTrue) {
            messageResId = R.string.correct_toast;
        } else {
            messageResId = R.string.incorrect_toast;
        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT)
                .show();
    } */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_var_handler);

        String strId = getIntent().getExtras().getString("mKeyVar");
        switch (strId){
            case "Kollok2015" :
                mQuestionBank = new Question[] {
                        new Question(R.string.KollokV2015_1_1, R.string.KollokA2015_1_1),
                        new Question(R.string.KollokV2015_1_2, R.string.KollokA2015_1_2),
                        new Question(R.string.KollokV2015_1_3, R.string.KollokA2015_1_3),
                        new Question(R.string.KollokV2015_1_4, R.string.KollokA2015_1_4),
                        new Question(R.string.KollokV2015_1_5, R.string.KollokA2015_1_5),
                        new Question(R.string.KollokV2015_1_6, R.string.KollokA2015_1_6),
                        new Question(R.string.KollokV2015_1_7, R.string.KollokA2015_1_7),
                        new Question(R.string.KollokV2015_1_8, R.string.KollokA2015_1_8),
                        new Question(R.string.KollokV2015_1_9, R.string.KollokA2015_1_9),
                        new Question(R.string.KollokV2015_1_10,R.string.KollokA2015_1_10),

                };
                break;
            case "Kollok2014" :
                mQuestionBank = new Question[] {
                        new Question(R.string.KollokV2014_1_1, R.string.KollokA2014_1_1),
                        new Question(R.string.KollokV2014_1_2, R.string.KollokA2014_1_2),
                        new Question(R.string.KollokV2014_1_3, R.string.KollokA2014_1_3),
                        new Question(R.string.KollokV2014_1_4, R.string.KollokA2014_1_4),
                        new Question(R.string.KollokV2014_1_5, R.string.KollokA2014_1_5),
                        new Question(R.string.KollokV2014_1_6, R.string.KollokA2014_1_6)

                };
                break;

            case "Exam2014_1" :
                mQuestionBank = new Question[] {
                        new Question(R.string.ExamV2014_1_1, R.string.ExamA2014_1_1),
                        new Question(R.string.ExamV2014_1_2, R.string.ExamA2014_1_2),
                        new Question(R.string.ExamV2014_1_3, R.string.ExamA2014_1_3),
                        new Question(R.string.ExamV2014_1_4, R.string.ExamA2014_1_4),
                        new Question(R.string.ExamV2014_1_5, R.string.ExamA2014_1_5),
                        new Question(R.string.ExamV2014_1_6, R.string.ExamA2014_1_6),
                        new Question(R.string.ExamV2014_1_7, R.string.ExamA2014_1_7),
                        new Question(R.string.ExamV2014_1_8, R.string.ExamA2014_1_8),
                        new Question(R.string.ExamV2014_1_9, R.string.ExamA2014_1_9),
                        new Question(R.string.ExamV2014_1_10,R.string.ExamA2014_1_10)
                };
                break;
            case "Exam2014_2" :
                mQuestionBank = new Question[] {
                        new Question(R.string.ExamV2014_2_1, R.string.ExamA2014_2_1),
                        new Question(R.string.ExamV2014_2_2, R.string.ExamA2014_2_2),
                        new Question(R.string.ExamV2014_2_3, R.string.ExamA2014_2_3),
                        new Question(R.string.ExamV2014_2_4, R.string.ExamA2014_2_4),
                        new Question(R.string.ExamV2014_2_5, R.string.ExamA2014_2_5),
                        new Question(R.string.ExamV2014_2_6, R.string.ExamA2014_2_6),
                        new Question(R.string.ExamV2014_2_7, R.string.ExamA2014_2_7),
                        new Question(R.string.ExamV2014_2_8, R.string.ExamA2014_2_8),
                        new Question(R.string.ExamV2014_2_9, R.string.ExamA2014_2_9),
                        new Question(R.string.ExamV2014_2_10,R.string.ExamA2014_2_10)
                };
                break;
            case "Retake2014" :
                mQuestionBank = new Question[] {
                        new Question(R.string.RetakeV2014_1_1, R.string.RetakeA2014_1_1),
                        new Question(R.string.RetakeV2014_1_2, R.string.RetakeA2014_1_2),
                        new Question(R.string.RetakeV2014_1_3, R.string.RetakeA2014_1_3),
                        new Question(R.string.RetakeV2014_1_4, R.string.RetakeA2014_1_4),
                        new Question(R.string.RetakeV2014_1_5, R.string.RetakeA2014_1_5),
                        new Question(R.string.RetakeV2014_1_6, R.string.RetakeA2014_1_6),
                        new Question(R.string.RetakeV2014_1_7, R.string.RetakeA2014_1_7),
                        new Question(R.string.RetakeV2014_1_8, R.string.RetakeA2014_1_8),
                        new Question(R.string.RetakeV2014_1_9, R.string.RetakeA2014_1_9),
                        new Question(R.string.RetakeV2014_1_10,R.string.RetakeA2014_1_10)
                };
                break;
            case "Exam2013_1" :
                mQuestionBank = new Question[] {
                        new Question(R.string.ExamV2013_1_1, R.string.ExamA2013_1_1),
                        new Question(R.string.ExamV2013_1_2, R.string.ExamA2013_1_2),
                        new Question(R.string.ExamV2013_1_3, R.string.ExamA2013_1_3),
                        new Question(R.string.ExamV2013_1_4, R.string.ExamA2013_1_4),
                        new Question(R.string.ExamV2013_1_5, R.string.ExamA2013_1_5),
                        new Question(R.string.ExamV2013_1_6, R.string.ExamA2013_1_6),
                        new Question(R.string.ExamV2013_1_7, R.string.ExamA2013_1_7),
                        new Question(R.string.ExamV2013_1_8, R.string.ExamA2013_1_8),
                        new Question(R.string.ExamV2013_1_9, R.string.ExamA2013_1_9),
                        new Question(R.string.ExamV2013_1_10,R.string.ExamA2013_1_10)
                };
                break;

            default: Toast.makeText(getApplicationContext(), "will work later", Toast.LENGTH_SHORT).show();
        }
        //SCROLL
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        mAnswerTextView = (TextView)findViewById(R.id.answer_text_view);
        mQuestionTextView.setMovementMethod(new ScrollingMovementMethod());
        mAnswerTextView.setMovementMethod(new ScrollingMovementMethod());
        //PREV


        mPrevButton = (ImageButton)findViewById(R.id.prev_button);
        mPrevButton.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (mCurrentIndex - 1  >= 0) {
                    mCurrentIndex = mCurrentIndex - 1;
                    //mIsCheater = false;
                    int question = mQuestionBank[mCurrentIndex].getTextResId();
                    mQuestionTextView.setText(question);
                    mAnswerTextView.setVisibility(View.INVISIBLE);
                    mShowAnswer.setVisibility(View.VISIBLE);
                    updateQuestion();
                } else {
                    Toast.makeText(VarHandler.this, R.string.error_prev, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //NEXT
        mNextButton = (ImageButton)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentIndex + 1 < mQuestionBank.length) {
                    mCurrentIndex = mCurrentIndex + 1;
                    mAnswerTextView.setVisibility(View.INVISIBLE);
                    mShowAnswer.setVisibility(View.VISIBLE);
                    updateQuestion();
                } else {
                    Toast.makeText(VarHandler.this,"Вариант пройден!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //SHOW ANSWER
        mAnswerTextView = (TextView)findViewById(R.id.answer_text_view);
        mShowAnswer =(Button)findViewById(R.id.show_answer_button);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question curQuestion = mQuestionBank[mCurrentIndex];
                mAnswerIsTrue = curQuestion.isAnswerTrue();
                mAnswerTextView.setText(mAnswerIsTrue);

                mAnswerTextView.setVisibility(View.VISIBLE);
                mShowAnswer.setVisibility(View.INVISIBLE);
            }
        });

        /*
        if (savedInstanceState != null) {
            mCurrentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }
        */
        updateQuestion();
    }
    /*
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
    */
}
