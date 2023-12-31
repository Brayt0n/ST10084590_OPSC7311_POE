// Generated by view binder compiler. Do not edit!
package com.example.mealmatrix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealmatrix.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AchievmentToastBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llWrapper;

  @NonNull
  public final ImageView trophyImg;

  @NonNull
  public final TextView tvAchievement;

  private AchievmentToastBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llWrapper,
      @NonNull ImageView trophyImg, @NonNull TextView tvAchievement) {
    this.rootView = rootView;
    this.llWrapper = llWrapper;
    this.trophyImg = trophyImg;
    this.tvAchievement = tvAchievement;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AchievmentToastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AchievmentToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.achievment_toast, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AchievmentToastBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout llWrapper = (LinearLayout) rootView;

      id = R.id.trophyImg;
      ImageView trophyImg = ViewBindings.findChildViewById(rootView, id);
      if (trophyImg == null) {
        break missingId;
      }

      id = R.id.tv_achievement;
      TextView tvAchievement = ViewBindings.findChildViewById(rootView, id);
      if (tvAchievement == null) {
        break missingId;
      }

      return new AchievmentToastBinding((LinearLayout) rootView, llWrapper, trophyImg,
          tvAchievement);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
