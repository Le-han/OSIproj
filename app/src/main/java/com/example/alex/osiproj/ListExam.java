package com.example.alex.osiproj;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListExam extends ListActivity {
    private String[] mYearArray = {"Ex2014_1", "Ex2014_2", "Retake2014", "Ex2013_1", "Ex2013_2" };

    // Создадим адаптер
    private ArrayAdapter<String> mAdapterExam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Убираем панель уведомлений
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mAdapterExam = new ArrayAdapter<String>(this, R.layout.activity_list_exam, mYearArray);
        setListAdapter(mAdapterExam);
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Intent intent;
        switch (position) {

            case 0 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Exam2014_1"); //передаю по ключу mKey(строка), данные(можно разные типы)
                //intent.putExtra("mNumOfQuestion", "1");
                startActivity(intent);
                break;
            case 1 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Exam2014_2");
                startActivity(intent);
                break;
            case 2 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Retake2014");
                startActivity(intent);
                break;
            case 3 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Exam2013_1");
                startActivity(intent);
                break;
            case 4 :
                intent = new Intent(ListExam.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Exam2013_2");
                startActivity(intent);
                break;
            default:
                Toast.makeText(getApplicationContext(),
                        "will work later", Toast.LENGTH_SHORT).show();
        }
    }
}