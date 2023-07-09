// Generated by view binder compiler. Do not edit!
package com.example.mealmatrix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealmatrix.R;
import com.github.mikephil.charting.charts.BarChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTimerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLap;

  @NonNull
  public final Button btnReset;

  @NonNull
  public final Button btnstartStop;

  @NonNull
  public final BarChart chart;

  @NonNull
  public final ImageButton imageButton7;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView title2;

  @NonNull
  public final Toolbar toolbar5;

  @NonNull
  public final TextView tvTime;

  @NonNull
  public final TextView tvlapTime;

  private ActivityTimerBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLap,
      @NonNull Button btnReset, @NonNull Button btnstartStop, @NonNull BarChart chart,
      @NonNull ImageButton imageButton7, @NonNull TextView title, @NonNull TextView title2,
      @NonNull Toolbar toolbar5, @NonNull TextView tvTime, @NonNull TextView tvlapTime) {
    this.rootView = rootView;
    this.btnLap = btnLap;
    this.btnReset = btnReset;
    this.btnstartStop = btnstartStop;
    this.chart = chart;
    this.imageButton7 = imageButton7;
    this.title = title;
    this.title2 = title2;
    this.toolbar5 = toolbar5;
    this.tvTime = tvTime;
    this.tvlapTime = tvlapTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTimerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTimerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_timer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTimerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLap;
      Button btnLap = ViewBindings.findChildViewById(rootView, id);
      if (btnLap == null) {
        break missingId;
      }

      id = R.id.btnReset;
      Button btnReset = ViewBindings.findChildViewById(rootView, id);
      if (btnReset == null) {
        break missingId;
      }

      id = R.id.btnstartStop;
      Button btnstartStop = ViewBindings.findChildViewById(rootView, id);
      if (btnstartStop == null) {
        break missingId;
      }

      id = R.id.chart;
      BarChart chart = ViewBindings.findChildViewById(rootView, id);
      if (chart == null) {
        break missingId;
      }

      id = R.id.imageButton7;
      ImageButton imageButton7 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton7 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.title2;
      TextView title2 = ViewBindings.findChildViewById(rootView, id);
      if (title2 == null) {
        break missingId;
      }

      id = R.id.toolbar5;
      Toolbar toolbar5 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar5 == null) {
        break missingId;
      }

      id = R.id.tvTime;
      TextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      id = R.id.tvlapTime;
      TextView tvlapTime = ViewBindings.findChildViewById(rootView, id);
      if (tvlapTime == null) {
        break missingId;
      }

      return new ActivityTimerBinding((ConstraintLayout) rootView, btnLap, btnReset, btnstartStop,
          chart, imageButton7, title, title2, toolbar5, tvTime, tvlapTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
