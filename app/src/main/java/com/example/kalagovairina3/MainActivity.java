package com.example.kalagovairina3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.kalagovairina3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
   // Button button = new Button(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
                float dpHeight = displayMetrics.heightPixels / displayMetrics.density;

                Log.e("DisplayMetrics", dpWidth +" x " + dpHeight);

                View view = binding.textViewK;
                view.setPadding(16, 16, 16, 16); // Внутренние отступы в пикселях

                // Программная установка внешних отступов

                ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginParams.setMargins(16, 16, 16, 16); // Внешние отступы в пикселях
                view.setLayoutParams(marginParams);

            }
        });


        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Программная установка ширины и высоты

                View view = binding.imageView2;
                ViewGroup.LayoutParams params = view.getLayoutParams();
                params.height = 600; // Высота в пикселях
                view.setLayoutParams(params);
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Программная установка ширины и высоты

                View view = binding.imageView3;
                ViewGroup.LayoutParams params = view.getLayoutParams();
                params.height = 600; // Высота в пикселях
                view.setLayoutParams(params);
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Программная установка ширины и высоты

                View view = binding.imageView4;
                ViewGroup.LayoutParams params = view.getLayoutParams();
                params.height = 600; // Высота в пикселях
                view.setLayoutParams(params);
            }
        });

    }
}