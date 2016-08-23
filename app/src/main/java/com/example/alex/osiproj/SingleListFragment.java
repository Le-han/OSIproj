package com.example.alex.osiproj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class SingleListFragment extends ListFragment {
    final String[] Names = new String[]{"Экзамены прошлых лет", "Коллоквиумы прошлых лет","Словарь", "О программе"};
    //метод onActivityCreated() свяжет массив с адаптером и передаст его списочному фрагменту.
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListAdapter adapter = new ArrayAdapter<>(getActivity(), R.layout.line_style, Names);
        setListAdapter(adapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listfragment, null);
    }
    //обработка нажатия на элемент списка
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //Toast.makeText(getActivity(), "position = " + position, Toast.LENGTH_SHORT).show(); //check position
        switch (position){
            case 0 :
                Intent intent = new Intent(getActivity().getApplicationContext(), ListExam.class);
                startActivity(intent);
                break;
            case 1 :
                intent = new Intent(getActivity().getApplicationContext(), ListKollok.class);
                startActivity(intent);
                break;
            case 2 :
                intent = new Intent(getActivity().getApplicationContext(), DictionaryTermin.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(getActivity(), "will work later", Toast.LENGTH_SHORT).show();//lol
        }
    }
}

