package com.example.alex.osiproj;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListExam extends ListActivity {
    private String[] mYearArray = { "ЭкзВариант1", "ЭкзВариант2", "ЭкзВариант3", "ЭкзВариант4" };

    // Создадим адаптер
    private ArrayAdapter<String> mAdapterExam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapterExam = new ArrayAdapter<String>(this, R.layout.activity_list_exam, mYearArray);
        setListAdapter(mAdapterExam);
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Intent intent;
        switch (position) {
            case 0 :
                Toast.makeText(getApplicationContext(),
                        "Не нашел вариант экзамена за 2015 год, пожалуйста, отправьте его нам в ВК", Toast.LENGTH_SHORT).show();
                break;
            case 1 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Exam2014"); //передаю по ключу mKey(строка), данные(можно разные типы)
                //intent.putExtra("mNumOfQuestion", "1");
                startActivity(intent);
                break;
            /*case 2 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Exam2013");
                //intent.putExtra("mNumOfQuestion", "1");
                startActivity(intent);
                break; */
            default:
                Toast.makeText(getApplicationContext(),
                        "will work later", Toast.LENGTH_SHORT).show();
        }
    }
}