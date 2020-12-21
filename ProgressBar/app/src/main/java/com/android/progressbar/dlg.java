package com.android.progressbar;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ProgressBar;

public class dlg extends Dialog {
    public dlg(Context context){
        super(context, R.style.Dlg);
    }

    public static dlg getInstance(Context context){
        dlg dlg = new dlg(context);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.ic_list_dlg));
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dlg.addContentView(progressBar, params);
        return dlg;
    }
}
