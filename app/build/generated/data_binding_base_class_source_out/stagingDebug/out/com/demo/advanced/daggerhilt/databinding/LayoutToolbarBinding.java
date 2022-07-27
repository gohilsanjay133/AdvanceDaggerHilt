// Generated by view binder compiler. Do not edit!
package com.demo.advanced.daggerhilt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.demo.advanced.daggerhilt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutToolbarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final ImageView imgMoreOption;

  @NonNull
  public final TextView tvTitle;

  private LayoutToolbarBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgBack,
      @NonNull ImageView imgMoreOption, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.imgBack = imgBack;
    this.imgMoreOption = imgMoreOption;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgBack;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.imgMoreOption;
      ImageView imgMoreOption = ViewBindings.findChildViewById(rootView, id);
      if (imgMoreOption == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new LayoutToolbarBinding((ConstraintLayout) rootView, imgBack, imgMoreOption, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
