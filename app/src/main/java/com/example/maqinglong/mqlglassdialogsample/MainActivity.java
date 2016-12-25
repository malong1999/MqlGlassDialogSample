package com.example.maqinglong.mqlglassdialogsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 马小布 on 2016/12/23.
 * introduction：我长得真他娘的磕碜，单身未娶，求包养
 * email：maxiaobu1216@gmail.com
 * 功能：毛玻璃dialog
 * 伪码：
 * 待完成：
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        SampleSupportDialogFragment fragment
                = SampleSupportDialogFragment.newInstance(
                6,
                4.0f,
                false,
                false,false,false

        );
        fragment.show(getSupportFragmentManager(), "blur_sample");
    }
}
