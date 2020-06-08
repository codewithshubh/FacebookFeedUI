package com.example.facebookfeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PostAdapter postAdapter;
    ArrayList<PostModel> postModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        postModels = new ArrayList<>();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        postAdapter = new PostAdapter(this, postModels);

        recyclerView.setAdapter(postAdapter);

        PopulateRecyclerView();
    }

    private void PopulateRecyclerView() {
        PostModel model = new PostModel(1,200,30, R.drawable.profile_pic1, R.drawable.img_post2,
                "Tom Cruise", "13 hrs", "Hey there! This is my first status on facebook.");
        postModels.add(model);
        model = new PostModel(2,166,22, R.drawable.profile_pic2, R.drawable.img_post1,
                "MS Dhoni", "4 hrs", "Hey guys! See how this car looks like. Amazing right!!!");
        postModels.add(model);
        model = new PostModel(3,278,10, R.drawable.profile_pic3, 0,
                "Mark Zukerberg", "10 hrs", "Hey there! This is my post without any image. Hows this???");
        postModels.add(model);


        model = new PostModel(4,100,50, R.drawable.profile_pic3, 0,
                "Mark Zukerberg", "10 hrs", "Hey there! I am the founder of Facebook.");
        postModels.add(model);
        postAdapter.notifyDataSetChanged();
    }
}
