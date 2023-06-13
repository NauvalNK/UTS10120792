package com.example.uts10120792;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Music extends AppCompatActivity {

    Context contextVideo, context;
    RecyclerView recyclerViewVideo, recyclerViewMusic;
    RecyclerView.Adapter recyclerViewAdapterVideo, recyclerViewAdapterMusic;
    RecyclerView.LayoutManager recylerViewLayoutManagerVideo, recylerViewLayoutManagerMusic;
    VideoView videoView;
    String[] subjectValuesVideo = {
            "If u could see me crying in my room", "AMAZING", "Losing us"
    };
    String[] subjectUrlVideo;
    String[] subjectValuesMusic = {
            "ONE IN A MILLION - Rex Orange County",
            "I Wanna Be Yours - Arctic Monkeys",
            "Stuck On You - Giveon",
            "Be My Mistake - The 1975",
            "The Most Beautiful Thing - Bruno Major",
            "This Side of Paradise - Coyote Theory",
            "Shouldn't Be - Luke Chiang",
            "Line Without a Hook - Ricky Montgomery",
            "keepyousafe - Yahya",
            "Every Summertime - NIKI",
            "Best Part (feat. Daniel Caesar) - H.E.R",
            "Die For You - The Weeknd",
            "i <3 u - Boy Pablo"
};
    DrawerLayout drawerLayout;
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        subjectUrlVideo=new String[]{
        "android.resource://"+getPackageName()+"/"+R.raw.video,
        "android.resource://"+getPackageName()+"/"+R.raw.video2,
        "android.resource://"+getPackageName()+"/"+R.raw.video3
        };
        contextVideo=getApplicationContext();
        recyclerViewVideo=findViewById(R.id.recyclerViewVideo);
        recylerViewLayoutManagerVideo=new LinearLayoutManager(this);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewVideo.setLayoutManager(recylerViewLayoutManagerVideo);
        recyclerViewAdapterVideo=new com.example.uts10120792.AdapterRecycleViewVideo(subjectValuesVideo,subjectUrlVideo,this);
        recyclerViewVideo.setAdapter(recyclerViewAdapterVideo);

        context=getApplicationContext();
        recyclerViewMusic=findViewById(R.id.recyclerViewMusic);
        recylerViewLayoutManagerMusic=new LinearLayoutManager(context);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewMusic.setLayoutManager(recylerViewLayoutManagerMusic);
        recyclerViewAdapterMusic=new com.example.uts10120792.AdapterRecycleViewMusic(subjectValuesMusic,context);
        recyclerViewMusic.setAdapter(recyclerViewAdapterMusic);

        //ass
        drawerLayout=findViewById(R.id.DrawerLayout);
        }
public void ClickMenu(View view){
        //Open drawer
        com.example.uts10120792.HomeActivity.openDrawer(drawerLayout);

        }
public void ClickLogo(View view){
        com.example.uts10120792.HomeActivity.closeDrawer(drawerLayout);
        }
public void ClickHome(View view){
        //redirect to home
        com.example.uts10120792.HomeActivity.redirectActivity(this, com.example.uts10120792.HomeActivity.class);
        }
public void ClickGallery(View view){
        //redirect to gallery
        com.example.uts10120792.HomeActivity.redirectActivity(this, com.example.uts10120792.Gallery.class);
        }

public void ClickDaily(View view){
        //redirect to gallery
        com.example.uts10120792.HomeActivity.redirectActivity(this, com.example.uts10120792.Daily.class);
        }
public void ClickMusic(View view){

        //recreate
        recreate();
        }
public void ClickProfile(View view){
        //redirect to profile
        com.example.uts10120792.HomeActivity.redirectActivity(this, com.example.uts10120792.Profile.class);
        }
public void ClickLogout(View view){
        //close
        com.example.uts10120792.HomeActivity.logout(this);
        }

@Override
protected void onPause(){
        super.onPause();
        //close drawer
        com.example.uts10120792.HomeActivity.closeDrawer(drawerLayout);
        }
        }