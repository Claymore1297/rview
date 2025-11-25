package com.ruesga.rview.binding;

import android.view.View;

import androidx.databinding.BindingAdapter;

public class VisibilityAdapters {

    @BindingAdapter("visibleGone")
    public static void setVisibleGone(View view, boolean visible) {
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter("visibleInvisible")
    public static void setVisibleInvisible(View view, boolean visible) {
        view.setVisibility(visible ? View.VISIBLE : View.INVISIBLE);
    }
}

