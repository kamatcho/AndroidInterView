package com.kamatcho.example.androidinterview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.net.URI;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void ChangePage(View view){
        if (view.getId()== R.id.Simple){
            Intent simple = new Intent(this,Simple_Ques.class);
            startActivity(simple);

        }else if (view.getId()== R.id.Tough){

        }else if (view.getId()== R.id.See){
         try {
             //kamatcho Is Apublisher Name
             Uri SeeUri = Uri.parse("market://search?q=+Kamatcho");
             Intent SeeIntent = new Intent(Intent.ACTION_VIEW, SeeUri);
             startActivity(SeeIntent);
         }catch (Exception e){
             //kamatcho Is Apublisher Name
             Uri SeeUri = Uri.parse("http://play.google.com/store/search?q=Kamatcho");
             Intent SeeIntent = new Intent(Intent.ACTION_VIEW, SeeUri);
             startActivity(SeeIntent);
         }

        }else if (view.getId()== R.id.Rate){
            try {
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(goToMarket);
            }catch (Exception e){
                Uri BrowserUri = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                Intent BrowserMarket = new Intent(Intent.ACTION_VIEW,BrowserUri);
                startActivity(BrowserMarket);

            }


        }
    }

}
