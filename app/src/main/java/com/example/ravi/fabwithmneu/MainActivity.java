package com.example.ravi.fabwithmneu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);

               floatingActionButton1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {



                   }
               });

               floatingActionButton2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {



                   }
               });
             floatingActionButton3.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {





                 }
             });



    }
}
