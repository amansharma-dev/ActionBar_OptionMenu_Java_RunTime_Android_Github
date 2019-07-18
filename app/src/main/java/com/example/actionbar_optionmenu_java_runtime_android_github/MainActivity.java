package com.example.actionbar_optionmenu_java_runtime_android_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuItem menuItemOne = menu.add(Menu.NONE,Menu.NONE,101,"Menu Item One");

        menuItemOne.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(),"Menu 1 Clicked",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        MenuItem menuItemTwo = menu.add(Menu.NONE,Menu.NONE,102,"Menu Item Two");
        menuItemTwo.setEnabled(false);

        MenuItem menuItemThree = menu.add(Menu.NONE,Menu.NONE,103,"Menu Item Three");
        menuItemThree.setEnabled(false);

        MenuItem menuItemFour = menu.add(Menu.NONE,Menu.NONE,104,"Menu Item Four");
        menuItemFour.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(),"Menu 4 Clicked",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        MenuItem menuItemFive = menu.add(Menu.NONE,Menu.NONE,105,"Menu Item Five");
        menuItemFive.setEnabled(false);


        return true;
    }
}
