package com.example.android.googlemap;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void Hand (View view)
    {

            BlankFragment details =new BlankFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();

            ft.replace(R.id.fr, details);
          ft.addToBackStack(null);
          ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
          ft.commit();




    }


}
