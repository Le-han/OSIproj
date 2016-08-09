package com.example.alex.osiproj;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListKollok extends ListActivity{
    private String[] mYearArray = { "Kollol2015", "Kollok2014", "КоллВариант3" };

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
                intent = new Intent(ListKollok.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Kollok2015"); //передаю по ключу mKey(строка), данные(можно разные типы)
                //intent.putExtra("mNumOfQuestion", "1");
                startActivity(intent);
                break;
            case 1 :
                intent = new Intent(ListKollok.this, VarHandler.class);
                intent.putExtra("mKeyVar", "Kollok2014"); //передаю по ключу mKey(строка), данные(можно разные типы)
                //intent.putExtra("mNumOfQuestion", "1");
                startActivity(intent);
                break;
            default:
                Toast.makeText(getApplicationContext(),
                        "will work later", Toast.LENGTH_SHORT).show();
                /*
                intent = new Intent(ListExam.this, VarHANDLER.class);
                intent.putExtra("mKeyVar", "Exam2014"); //передаю по ключу mKey(строка), данные(можно разные типы)
                //intent.putExtra("mNumOfQuestion", "1");
                startActivity(intent);
                */
        }
    }

}
