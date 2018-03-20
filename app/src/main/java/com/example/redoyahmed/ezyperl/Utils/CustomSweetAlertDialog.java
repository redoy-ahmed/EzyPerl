package com.example.redoyahmed.ezyperl.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog.Builder;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class CustomSweetAlertDialog {

    public static SweetAlertDialog getProgressDialog(Context context, String contextText) {
        SweetAlertDialog pDialog = new SweetAlertDialog(context, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText(contextText);
        pDialog.setCancelable(false);
        pDialog.show();

        return pDialog;
    }

    public static SweetAlertDialog getAlertDialog(Context context, int dialogType, String titleText, String contextText) {
        SweetAlertDialog alertDialog = new SweetAlertDialog(context, dialogType);
        alertDialog.setTitleText(titleText);
        alertDialog.setContentText(contextText);
        alertDialog.show();
        return alertDialog;
    }

    public static void showMessageDialog(final Context context, String message) {
        Builder alertDialogBuilder = new Builder(context);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setNegativeButton("Close", null);
        alertDialogBuilder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                context.startActivity(new Intent(context, MainActivity.class));
                ((Activity) context).finish();
            }
        });
        alertDialogBuilder.create().show();
    }
}
