package com.example.elevator_btn;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment insideFragment = new InsideFragment();
    private Fragment outsideFragment = new OutsideFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView_main_menu);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, outsideFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        FragmentTransaction transaction = fragmentManager.beginTransaction();

                        // 어떤 메뉴 아이템이 터치되었는지 확인합니다.
                        switch (item.getItemId()) {

                            case R.id.menuitem_bottombar_inside:

                                transaction.replace(R.id.frame_layout, insideFragment).commitAllowingStateLoss();
                                break;

                            case R.id.menuitem_bottombar_ouside:

                                transaction.replace(R.id.frame_layout, outsideFragment).commitAllowingStateLoss();
                                break;

                            case R.id.menuitem_bottombar_settings:


                                return true;
                        }
                        return false;
                    }


                });


    }
}