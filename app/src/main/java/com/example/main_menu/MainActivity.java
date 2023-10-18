package com.example.main_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.toolbar);
        switch(id){
            case R.id.CALL:
                headerView.setText("Call");
                return true;
            case R.id.CAMERA:
                headerView.setText("Camera");
                return true;
            case R.id.VIDEO:
                headerView.setText("Video");
                return true;
            case R.id.SMS:
                headerView.setText("Email");
                return true;
            case R.id.CART:
                headerView.setText("Add");
                return true;
            case R.id.COPY:
                headerView.setText("Copy");
                return true;
            case R.id.PASTE:
                headerView.setText("Paste");
                return true;
            case R.id.HELP:
                headerView.setText("Help");
                return true;
        }
        //headerView.setText(item.getTitle());
        return super.onOptionsItemSelected(item);
    }

}
