package com.example.alex.osiproj;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class DictionaryTermin extends AppCompatActivity {

    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Убираем панель уведомлений
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Убираем заголовок
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dictionary_termin);


        // Listview Data
        String products[] = {
                "Первое поколение компьютеров",
                "Второе поколение компьютеров",
                "Третье поколение компьютеров",
                "Компьютеры четвертого поколения",
                "Вычислительная система",
                "Уровни вычислительной системы снизу-вверх",
                "Драйвер физического устройства",
                "Логическое/виртуальное устройство (ресурс)",
                "Драйвер логического/виртуального ресурса",
                "Ресурсы вычислительной системы",
                "Операционная система",
                "Система программирование",
                "Этапы жизни программы",
                "Проектирование",
                "Объектная среда",
                "Инструментальная среда",
                "Этап кодирования",
                "Тестирование",
                "Отладка",
                "Современные разработки программного обеспечения",
                "Прототип",
                "Виртуальная машина",
                "Прикладная система",
                "Принципы работы компьютера Фон Неймана: принцип двоичного кодирования, принцип хранимой программы, принцип программного управления.",
                "Центральный процессор (ЦП)",
                "Оперативно запоминающее устройство (ОЗУ)",
                "Внешние устройства",
                "Арифметически-логическое устройство (АЛУ)",
                "Устройство управления (УУ)",
                "ОЗУ состоит из",
                "Производительность оперативной памяти",
                "Время доступа (access time- taccess)",
                "Длительность цикла памяти (cycle time - tcycle)",
                "Расслоение ОЗУ",
                "Регистровая память",
                "КЭШ память",
                "Стратегии вытеснения КЭШ памяти",
                "Процесс вытеснения",
                "Прерывание",
                "Внутреннее прерывание",
                "Внешнее прерывание",
                "Внешние запоминающие устройства (ВЗУ)",
                "Устройства ввода и отображения информации",
                "Устройства приема и передачи данных используются для",
                "ВЗУ Последовательного доступа",
                "ВЗУ Прямого доступа",
                "Поток информации",
                "Поток данных",
                "DMA (direct memory access)",
                "Иерархия памяти",
                "Мультипрограммный режим",
                "Аппаратные средства компьютера, необходимые для поддержания мультипрограммного режима",
                "Регистровые окна",
                "Аппарат виртуальной памяти",
                "Базирование адресов",
                "Страничная организация",
                "Виртуальное адресное пространство",
                "Физическое адресное пространство",
                "Классификация Флинна",
                "ОКОД",
                "ОКМД",
                "МКОД",
                "МКМД",
                "Гетерогенные",
                "Терминальный комплекс",
                "Основная вычислительная система",
                "Локальные мультиплексоры",
                "Локальные терминалы",
                "Модемы",
                "Удаленные терминалы",
                "Удаленные мультиплексоры",
                "Виды каналов",
                "Симплексные каналы",
                "Дуплексные каналы",
                "Полудуплексные каналы",
                "Компьютерная сеть",
                "Коммуникационная среда",
                "Абонентские машины (хосты)",
                "OSI",
                "Уровни взаимодействия компьтеров",
                "Протокол",
                "Интерфейс",
                "Служба или сервис",
                "Стек протоколов",
                "Сообщение",
                "Сеть коммутации каналов",
                "Сеть коммутации пакетов",
                "IP адрес",
                "Пакет",
                "Дейтаграмма",
                "Шлюз",
                "Маршрутизация",
                "Протокол контроля передачи (TCP, Transmission Control Protocol)",
                "Протокол пользовательских дейтаграмм (UDP, User Datagram Protocol)",
                "Протоколы, опирающиеся на TCP",
                "Протоколы, опирающиеся на UDP",
                "Сетевая ОС",
                "Распределенная ОС",
                "Процесс",
                "Существуют ресурсы,",
                "Выделения ресурсов процессу",
                "Любая ОС должна удовлетворять набору свойств",
                "Резидентная",
                "Ядро (kernel)",
                "Системный вызов",
                "Монолитное ядро",
                "Существует стационарное микроядро",
                "Логические функции ОС",
                "Буфер ввода процессов",
                "Буфер обрабатываемых процессов",
                "Пакет программ",
                "Квант времени ЦП",
                "Системы реального времени",
                "Системы с разделением времени",
                "Считывание информации, алгоритмы",
                "RAID система",
                "Специальные файлы устройств",
                "Файлы байториентированных устройств",
                "Файлы блокориентированных устройств",
                "Индексный дескриптор",
                "bdevsw",
                "cdevsw",
                "Существует два, традиционных способа включения драйверов новых устройств в систему",
                "Таблица индексных дескрипторов открытых файлов",
                "Таблица файлов",
                "Таблица открытых файлов",
                "Организация буферизации при обмене",
                "SYNC",
                "Основные задачи при организации работы с ОП",
                "Стратегии и методы управления",
                "TLB",
                "ХЭШ",
                "Алгоритм NRU",
                "Алгоритм FIFO",
                "Алгоритм LIFO",
                "Алгоритм LRU",
                "Алгоритм NFU",
                "Файловая система (ФС)",
                "Данные называются",
                "Правило работы с файлами",
                "Файловый дескриптор",
                "Каталог",
                "Суперблок",
                "Блок",
                "Таблица размещения файловой системы",
                "Индексные узлы или индексные дескрипторы",
                "“Жесткая” связь",
                "Символическая связь",
                "Физическая архивация",
                "Логическая архивация",
                "Файл Unix",
                "Обычный файл (regular file)",
                "Каталог (directory)",
                "Специальный файл устройств (special device file)",
                "Именованный канал (named pipe)",
                "Ссылка (link)",
                "Сокет (socket)",
                "Корневой каталог /",
                "/unix",
                "/bin",
                "/etc",
                "/tmp",
                "/mnt",
                "/dev",
                "/lib",
                "/usr",
                "Индексный дескриптор в ОС UNIX",
                "Процесс",
                "Разделяемые ресурсы",
                "Буфер ввода процесса (БВП)",
                "Буфер обрабатываемых процессов (БОП)",
                "«Полновесные процессы»",
                "Легковесные процессы",
                "Контекст процесса",
                "Процесс в ОС Unix",
                "Идентификатором процесса (PID)",
                "Сегмент кода содержит",
                "Сегмент данных",
                "Системный вызов",
                "Семейство системных вызовов exec()",
                "Квант времени",
                "Приоритет процесса",
                "Невытесняющая стратегия",
                "Вытесняющая стратегия",
                "Простой круговорот (RR – round robin)",
                "При круговороте со смещением",
                "«Эгоистический» круговорот",
                "Область свопинга",
                "Параллельные процессы",
                "Независимые процессы",
                "Взаимодействующие процессы",
                "Критические ресурсы",
                "Критическая секция, или критический интервал",
                "Взаимное исключение",
                "Тупики (deadlocks)",
                "Блокирование",
                "Семафоры",
                "Семафоры Дейкстры",
                "Монитор Хоара",
                "Сигнал",
                "Неименованный канал",
                "Именованный канал",
                "Система IPC",
                "Очередь сообщений",
                "Механизм разделяемой памяти",
                "Семафоры представляют",
                "Сокет"
        };
        String mFirstWord[];
        String tmp;
        int j = 0;
            lv = (ListView) findViewById(R.id.list_view);
            inputSearch = (EditText) findViewById(R.id.inputSearch);
            /**
             * Clickhandler
             */
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    // Получение элемента, который был нажат
                    Object obj = lv.getAdapter().getItem(position);
                    String item = obj.toString();
                    // Выводим сообщение с текстом выбранного элемента
                    Toast.makeText(getApplicationContext(), "Вы выбрали: " + item, Toast.LENGTH_SHORT).show();
                    Intent intent;
                    intent = new Intent(getApplicationContext(), TerminHandler.class);
                    intent.putExtra("mKeyTermin", item);
                    startActivity(intent);
                /*switch (position) {
                    case 0 :
                        intent.putExtra("mKeyTermin", "1");
                        startActivity(intent);
                        break;
                    case 1 :

                }*/
                }
            });
            // Adding items to listview
            adapter = new ArrayAdapter<String>(this, R.layout.termin_list_item, R.id.product_name, products);
            lv.setAdapter(adapter);

            /**
             * Enabling Search Filter
             * */
            inputSearch.addTextChangedListener(new TextWatcher() {

                @Override
                public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                    // When user changed the Text
                    DictionaryTermin.this.adapter.getFilter().filter(cs);
                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                              int arg3) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void afterTextChanged(Editable arg0) {
                    // TODO Auto-generated method stub
                }
            });
        }



}