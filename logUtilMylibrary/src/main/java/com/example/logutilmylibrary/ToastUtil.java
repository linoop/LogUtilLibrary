package com.example.logutilmylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public void toastMessage(String message, Context context) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
