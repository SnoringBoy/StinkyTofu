package com.example.zhoulu.stinkytofu;

import android.content.Intent;
import android.graphics.Path;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListerner);

        //added this if statement to make the initial fragment to be home
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListerner =
            // use switch statement to compare and handle the bottom navigation select
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch(menuItem.getItemId()) { // case when home menu item is select
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_menu: // case when menu menuitem is select
                            selectedFragment = new MenuFragment();
                            break;
                        case R.id.nav_cart: // case when cart menuitem is select
                            selectedFragment = new CartFragment();
                            break;
                        case R.id.nav_more: // case when more menuitem is select
                            selectedFragment = new MoreFragment();
                            break;
                    }
                    // dont know much about this, but just do it.  I think this is the code to change the frament.
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    return true;
                }
            };
}
