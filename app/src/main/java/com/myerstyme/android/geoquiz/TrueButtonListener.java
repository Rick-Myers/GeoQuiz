package com.myerstyme.android.geoquiz;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by D on 8/27/2017.
 */

public class TrueButtonListener implements View.OnClickListener {

    Activity context;

    public TrueButtonListener(Activity context){
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
    }
}
