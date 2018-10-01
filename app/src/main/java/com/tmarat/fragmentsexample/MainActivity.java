package com.tmarat.fragmentsexample;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initUI();
  }

  private void initUI() {

    if (findViewById(R.id.detail_container) != null) {

      startFragment(R.id.detail_container, new DetailFragment());
      startFragment(R.id.main_container, new MainFragment());
    } else {

      startFragment(R.id.main_container, new MainFragment());
    }
  }

  private void startFragment(@IdRes int idRes, Fragment fragment) {

    getSupportFragmentManager()
        .beginTransaction()
        .replace(idRes, fragment)
        .commit();
  }
}
