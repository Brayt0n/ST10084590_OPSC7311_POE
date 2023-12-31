// Generated by view binder compiler. Do not edit!
package com.example.mealmatrix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealmatrix.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCameraBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button2;

  @NonNull
  public final TextInputEditText foodNameEd;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final Toolbar toolbar3;

  @NonNull
  public final Button viewPhotos;

  private ActivityCameraBinding(@NonNull ConstraintLayout rootView, @NonNull Button button2,
      @NonNull TextInputEditText foodNameEd, @NonNull ImageButton imageButton2,
      @NonNull ImageView imageView, @NonNull Spinner spinner, @NonNull TextView textView,
      @NonNull TextView textView3, @NonNull Toolbar toolbar3, @NonNull Button viewPhotos) {
    this.rootView = rootView;
    this.button2 = button2;
    this.foodNameEd = foodNameEd;
    this.imageButton2 = imageButton2;
    this.imageView = imageView;
    this.spinner = spinner;
    this.textView = textView;
    this.textView3 = textView3;
    this.toolbar3 = toolbar3;
    this.viewPhotos = viewPhotos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.foodNameEd;
      TextInputEditText foodNameEd = ViewBindings.findChildViewById(rootView, id);
      if (foodNameEd == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.toolbar3;
      Toolbar toolbar3 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar3 == null) {
        break missingId;
      }

      id = R.id.viewPhotos;
      Button viewPhotos = ViewBindings.findChildViewById(rootView, id);
      if (viewPhotos == null) {
        break missingId;
      }

      return new ActivityCameraBinding((ConstraintLayout) rootView, button2, foodNameEd,
          imageButton2, imageView, spinner, textView, textView3, toolbar3, viewPhotos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
