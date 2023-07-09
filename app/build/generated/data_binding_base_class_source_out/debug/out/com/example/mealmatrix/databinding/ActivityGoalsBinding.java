// Generated by view binder compiler. Do not edit!
package com.example.mealmatrix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealmatrix.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGoalsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextInputEditText actualWorkout;

  @NonNull
  public final Button dateGraphSelect;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final TextInputEditText maxValueEditText;

  @NonNull
  public final TextInputEditText minValueEditText;

  @NonNull
  public final Button progressButton;

  @NonNull
  public final Button startDateButton;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final Toolbar toolbar4;

  @NonNull
  public final Button viewButton;

  private ActivityGoalsBinding(@NonNull RelativeLayout rootView,
      @NonNull TextInputEditText actualWorkout, @NonNull Button dateGraphSelect,
      @NonNull ImageButton imageButton, @NonNull TextInputEditText maxValueEditText,
      @NonNull TextInputEditText minValueEditText, @NonNull Button progressButton,
      @NonNull Button startDateButton, @NonNull Button submitButton, @NonNull TextView textView15,
      @NonNull Toolbar toolbar4, @NonNull Button viewButton) {
    this.rootView = rootView;
    this.actualWorkout = actualWorkout;
    this.dateGraphSelect = dateGraphSelect;
    this.imageButton = imageButton;
    this.maxValueEditText = maxValueEditText;
    this.minValueEditText = minValueEditText;
    this.progressButton = progressButton;
    this.startDateButton = startDateButton;
    this.submitButton = submitButton;
    this.textView15 = textView15;
    this.toolbar4 = toolbar4;
    this.viewButton = viewButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGoalsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGoalsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_goals, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGoalsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actualWorkout;
      TextInputEditText actualWorkout = ViewBindings.findChildViewById(rootView, id);
      if (actualWorkout == null) {
        break missingId;
      }

      id = R.id.dateGraphSelect;
      Button dateGraphSelect = ViewBindings.findChildViewById(rootView, id);
      if (dateGraphSelect == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.maxValueEditText;
      TextInputEditText maxValueEditText = ViewBindings.findChildViewById(rootView, id);
      if (maxValueEditText == null) {
        break missingId;
      }

      id = R.id.minValueEditText;
      TextInputEditText minValueEditText = ViewBindings.findChildViewById(rootView, id);
      if (minValueEditText == null) {
        break missingId;
      }

      id = R.id.progressButton;
      Button progressButton = ViewBindings.findChildViewById(rootView, id);
      if (progressButton == null) {
        break missingId;
      }

      id = R.id.startDateButton;
      Button startDateButton = ViewBindings.findChildViewById(rootView, id);
      if (startDateButton == null) {
        break missingId;
      }

      id = R.id.submitButton;
      Button submitButton = ViewBindings.findChildViewById(rootView, id);
      if (submitButton == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.toolbar4;
      Toolbar toolbar4 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar4 == null) {
        break missingId;
      }

      id = R.id.viewButton;
      Button viewButton = ViewBindings.findChildViewById(rootView, id);
      if (viewButton == null) {
        break missingId;
      }

      return new ActivityGoalsBinding((RelativeLayout) rootView, actualWorkout, dateGraphSelect,
          imageButton, maxValueEditText, minValueEditText, progressButton, startDateButton,
          submitButton, textView15, toolbar4, viewButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
