package com.cmonbaby.hotfix.demo.activities;

import android.os.Bundle;
import android.view.View;

import com.cmonbaby.hotfix.demo.BaseActivity;
import com.cmonbaby.hotfix.demo.R;
import com.cmonbaby.hotfix.demo.utils.ParamsSort;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void show(View view) {
        ParamsSort sort = new ParamsSort();
        sort.math(this);
    }

    public void fix(View view) {
        fixBug();
    }

    // classes2.dex ---> /storage/emulated/0/classes2.dex
    private void fixBug() {
    }
}
