package com.example.manreet.customedittext_library;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.customedittext_lib.CustomEditText;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
     RelativeLayout container;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container=findViewById(R.id.container);
        ActionBar m_myActionBar=getSupportActionBar(); // to get activity actionbar
        //For hiding actionbar
        m_myActionBar.hide();
        final CustomEditText edt = new CustomEditText(this);
        edt.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
        ((LinearLayout.LayoutParams) edt.getLayoutParams()).setMargins(20, 20, 20, 0);
        edt.changedesign(Color.BLACK,R.drawable.edittext_background,"Gotham-Font/GothamMedium.ttf");
        edt.setCursorVisible(true);
        edt.setHint("email");
        edt.requestFocus();
        container.addView(edt);

    }
}
