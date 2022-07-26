// Generated by view binder compiler. Do not edit!
package com.stylish.keyboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stylish.keyboard.R;
import github.ankushsachdeva.emojicon.EmojiconTextView;
import java.lang.NullPointerException;
import java.lang.Override;

public final class EmojiListviewLayoutBinding implements ViewBinding {
  @NonNull
  private final EmojiconTextView rootView;

  private EmojiListviewLayoutBinding(@NonNull EmojiconTextView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public EmojiconTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static EmojiListviewLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EmojiListviewLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.emoji_listview_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EmojiListviewLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new EmojiListviewLayoutBinding((EmojiconTextView) rootView);
  }
}
