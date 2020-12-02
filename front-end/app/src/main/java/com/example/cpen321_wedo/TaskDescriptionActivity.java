package com.example.cpen321_wedo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class TaskDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        TextView taskType = findViewById(R.id.taskTypeText);
        TextView taskDescription = findViewById(R.id.taskDescriptionText);
        TextView taskLocation = findViewById(R.id.taskLocationText);
        TextView taskLocationLabel = findViewById(R.id.taskLocationInfo);

        getSupportActionBar().setTitle(intent.getStringExtra("title"));
        taskType.setText(intent.getStringExtra("taskType"));
        taskDescription.setText(intent.getStringExtra("taskDescription"));

        String location = intent.getStringExtra("taskLocation");

        if (!location.equals("")) {
            taskLocation.setText(location);
            taskLocationLabel.setVisibility(View.VISIBLE);
            taskLocation.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.task_activity_description_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.edit:
                Intent intent = new Intent(this, AddTaskActivity.class);
                startActivityForResult(intent, 1);
                return true;
            default:
                break;
        }
        return false;
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {

            String[] reply = data.getStringArrayExtra("task");
        }
    }
}