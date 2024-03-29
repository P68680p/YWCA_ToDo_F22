package com.example.ywca_todo_f22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class AddToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);

        TextView todoTask = findViewById(R.id.add_task);
        DatePicker todoDate = findViewById(R.id.add_date);
        Button save = findViewById(R.id.add_save);
        Button cancel = findViewById(R.id.add_cancel);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!todoTask.getText().toString().isEmpty()) {
                    String taskDate = todoDate.getDayOfMonth() + "/" + (todoDate.getMonth() + 1) + "/" + todoDate.getYear();
                    ToDo newTodo = new ToDo(todoTask.getText().toString(), taskDate, false);
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("newtodo", newTodo);
                    setResult(MyApp.saveCode, resultIntent);
                    finish();
                } else {
                    Toast.makeText(AddToDoActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                setResult(MyApp.cancelCode, resultIntent);
                finish();
            }
        });
    }
}