package com.example.javalearningexampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button); // Привязка к кнопке

        button.setOnClickListener(listener); //Обработка нажатия кнопки
    }

    //Создаем слушателя кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class); //Создание намерения переключения на другой экран
            startActivity(intent); //Запуск дополнительной активности

        }
    };

}