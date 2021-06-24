package com.example.logutilmylibrary;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;

import com.google.android.material.textview.MaterialTextView;

public class AlertUtil {
    private Activity activity;
    private AlertDialog alertDialog;
    private MaterialTextView textViewTitle, textViewMessage;

    public AlertUtil(Activity activity) {
        this.activity = activity;

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        final View view = inflater.inflate(R.layout.dialog_layout, null);
        builder.setView(view);
        builder.setCancelable(false);
        alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        textViewTitle = view.findViewById(R.id.textViewTitle);
        textViewMessage = view.findViewById(R.id.textViewMessage);
    }

    public void showWaitDialog(String title, String message) {
        textViewTitle.setText(title);
        textViewMessage.setText(message);
        alertDialog.show();
    }

    public void dismissWaitDialog() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                alertDialog.dismiss();
            }
        }, 1000);
    }
}
