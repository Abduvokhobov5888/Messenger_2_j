package com.example.a542j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }



    void initViews(){
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter(getAllChats());
    }

    void refreshAdapter(ArrayList<Story> chats){
        Adapter adapter = new Adapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Story> getAllChats() {
        ArrayList<Story> chats = new ArrayList<Story>();

        chats.add(new Story(R.drawable.plus, R.drawable.nissan, R.drawable.one, "Add to Story"));
        chats.add(new Story(R.drawable.nissan, R.drawable.nissan, R.drawable.one, "Jonny Deep"));
        chats.add(new Story(R.drawable.volkswagen, R.drawable.mbw, R.drawable.one, "Maykel Jacken"));
        chats.add(new Story(R.drawable.mbw, R.drawable.nissan, R.drawable.one,"Leo Messi"));
        chats.add(new Story(R.drawable.mercedes, R.drawable.nissan, R.drawable.one, "Bek Bekbola"));
        chats.add(new Story(R.drawable.nissan, R.drawable.nissan, R.drawable.one, "Maykel Jacken"));
        chats.add(new Story(R.drawable.volkswagen, R.drawable.nissan, R.drawable.one, "Bek Bekbola"));
        chats.add(new Story(R.drawable.mbw, R.drawable.mbw, R.drawable.one, "Leo Messi"));
        chats.add(new Story(R.drawable.mercedes, R.drawable.nissan, R.drawable.one, "Cristiano Ronaldo"));
        chats.add(new Story(R.drawable.nissan, R.drawable.nissan, R.drawable.one,"Real Madrid"));
        chats.add(new Story(R.drawable.volkswagen,R.drawable.nissan, R.drawable.one, "Kross"));
        chats.add(new Story(R.drawable.mbw,R.drawable.mbw, R.drawable.one, "Modrich"));

        return chats;

    }
}