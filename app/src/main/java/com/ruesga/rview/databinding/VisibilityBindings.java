package com.ruesga.rview.databinding;

import android.view.View;
import androidx.databinding.BindingAdapter;

public class VisibilityBindings {

    @BindingAdapter("android:visibility")
    public static void setVisibility(View view, Object value) {

        if (value == null) {
            view.setVisibility(View.GONE);
            return;
        }

        // If already int (VISIBLE, INVISIBLE, GONE)
        if (value instanceof Integer) {
            view.setVisibility((Integer) value);
            return;
        }

        // Boolean handling
        if (value instanceof Boolean) {
            view.setVisibility((Boolean) value ? View.VISIBLE : View.GONE);
            return;
        }

        // Fallback
        view.setVisibility(View.GONE);
    }
}

