// Generated by view binder compiler. Do not edit!
package com.stylish.keyboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.AdView;
import com.stylish.keyboard.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView aboutTextView;

  @NonNull
  public final AdView adView;

  @NonNull
  public final TextView addLanguages;

  @NonNull
  public final TextView chooseInputTextView;

  @NonNull
  public final TextView chooseThemeTextView;

  @NonNull
  public final TextView enableSettingsTextView;

  @NonNull
  public final ImageView imageView1;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final LinearLayout layoutAbout;

  @NonNull
  public final LinearLayout layoutAddLanguages;

  @NonNull
  public final LinearLayout layoutChooseInput;

  @NonNull
  public final LinearLayout layoutChooseTheme;

  @NonNull
  public final LinearLayout layoutEnableSetting;

  @NonNull
  public final LinearLayout layoutManageDictionary;

  @NonNull
  public final TextView manageDictionaryTextView;

  @NonNull
  public final RelativeLayout relativeLayout;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull TextView aboutTextView,
      @NonNull AdView adView, @NonNull TextView addLanguages, @NonNull TextView chooseInputTextView,
      @NonNull TextView chooseThemeTextView, @NonNull TextView enableSettingsTextView,
      @NonNull ImageView imageView1, @NonNull ImageView imageView2, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6,
      @NonNull LinearLayout layoutAbout, @NonNull LinearLayout layoutAddLanguages,
      @NonNull LinearLayout layoutChooseInput, @NonNull LinearLayout layoutChooseTheme,
      @NonNull LinearLayout layoutEnableSetting, @NonNull LinearLayout layoutManageDictionary,
      @NonNull TextView manageDictionaryTextView, @NonNull RelativeLayout relativeLayout) {
    this.rootView = rootView;
    this.aboutTextView = aboutTextView;
    this.adView = adView;
    this.addLanguages = addLanguages;
    this.chooseInputTextView = chooseInputTextView;
    this.chooseThemeTextView = chooseThemeTextView;
    this.enableSettingsTextView = enableSettingsTextView;
    this.imageView1 = imageView1;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.layoutAbout = layoutAbout;
    this.layoutAddLanguages = layoutAddLanguages;
    this.layoutChooseInput = layoutChooseInput;
    this.layoutChooseTheme = layoutChooseTheme;
    this.layoutEnableSetting = layoutEnableSetting;
    this.layoutManageDictionary = layoutManageDictionary;
    this.manageDictionaryTextView = manageDictionaryTextView;
    this.relativeLayout = relativeLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_textView;
      TextView aboutTextView = ViewBindings.findChildViewById(rootView, id);
      if (aboutTextView == null) {
        break missingId;
      }

      id = R.id.adView;
      AdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.add_languages;
      TextView addLanguages = ViewBindings.findChildViewById(rootView, id);
      if (addLanguages == null) {
        break missingId;
      }

      id = R.id.choose_input_textView;
      TextView chooseInputTextView = ViewBindings.findChildViewById(rootView, id);
      if (chooseInputTextView == null) {
        break missingId;
      }

      id = R.id.choose_theme_textView;
      TextView chooseThemeTextView = ViewBindings.findChildViewById(rootView, id);
      if (chooseThemeTextView == null) {
        break missingId;
      }

      id = R.id.enable_settings_textView;
      TextView enableSettingsTextView = ViewBindings.findChildViewById(rootView, id);
      if (enableSettingsTextView == null) {
        break missingId;
      }

      id = R.id.imageView1;
      ImageView imageView1 = ViewBindings.findChildViewById(rootView, id);
      if (imageView1 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.layout_about;
      LinearLayout layoutAbout = ViewBindings.findChildViewById(rootView, id);
      if (layoutAbout == null) {
        break missingId;
      }

      id = R.id.layout_AddLanguages;
      LinearLayout layoutAddLanguages = ViewBindings.findChildViewById(rootView, id);
      if (layoutAddLanguages == null) {
        break missingId;
      }

      id = R.id.layout_ChooseInput;
      LinearLayout layoutChooseInput = ViewBindings.findChildViewById(rootView, id);
      if (layoutChooseInput == null) {
        break missingId;
      }

      id = R.id.layout_ChooseTheme;
      LinearLayout layoutChooseTheme = ViewBindings.findChildViewById(rootView, id);
      if (layoutChooseTheme == null) {
        break missingId;
      }

      id = R.id.layout_EnableSetting;
      LinearLayout layoutEnableSetting = ViewBindings.findChildViewById(rootView, id);
      if (layoutEnableSetting == null) {
        break missingId;
      }

      id = R.id.layout_ManageDictionary;
      LinearLayout layoutManageDictionary = ViewBindings.findChildViewById(rootView, id);
      if (layoutManageDictionary == null) {
        break missingId;
      }

      id = R.id.manage_dictionary_textView;
      TextView manageDictionaryTextView = ViewBindings.findChildViewById(rootView, id);
      if (manageDictionaryTextView == null) {
        break missingId;
      }

      RelativeLayout relativeLayout = (RelativeLayout) rootView;

      return new ActivityMainBinding((RelativeLayout) rootView, aboutTextView, adView, addLanguages,
          chooseInputTextView, chooseThemeTextView, enableSettingsTextView, imageView1, imageView2,
          imageView3, imageView4, imageView5, imageView6, layoutAbout, layoutAddLanguages,
          layoutChooseInput, layoutChooseTheme, layoutEnableSetting, layoutManageDictionary,
          manageDictionaryTextView, relativeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
