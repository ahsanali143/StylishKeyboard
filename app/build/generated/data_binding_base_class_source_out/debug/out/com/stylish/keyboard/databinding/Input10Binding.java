// Generated by view binder compiler. Do not edit!
package com.stylish.keyboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stylish.keyboard.R;
import com.stylish.keyboard.android.LatinKeyboardView;
import java.lang.NullPointerException;
import java.lang.Override;

public final class Input10Binding implements ViewBinding {
  @NonNull
  private final LatinKeyboardView rootView;

  @NonNull
  public final LatinKeyboardView keyboard;

  private Input10Binding(@NonNull LatinKeyboardView rootView, @NonNull LatinKeyboardView keyboard) {
    this.rootView = rootView;
    this.keyboard = keyboard;
  }

  @Override
  @NonNull
  public LatinKeyboardView getRoot() {
    return rootView;
  }

  @NonNull
  public static Input10Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Input10Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.input_10, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Input10Binding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LatinKeyboardView keyboard = (LatinKeyboardView) rootView;

    return new Input10Binding((LatinKeyboardView) rootView, keyboard);
  }
}
