// Generated by view binder compiler. Do not edit!
package com.example.mealmatrix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealmatrix.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWorkoutListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButton6;

  @NonNull
  public final RecyclerView listOfWorkouts;

  @NonNull
  public final TextView title3;

  @NonNull
  public final Toolbar toolbar6;

  private ActivityWorkoutListBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButton6, @NonNull RecyclerView listOfWorkouts,
      @NonNull TextView title3, @NonNull Toolbar toolbar6) {
    this.rootView = rootView;
    this.imageButton6 = imageButton6;
    this.listOfWorkouts = listOfWorkouts;
    this.title3 = title3;
    this.toolbar6 = toolbar6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWorkoutListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWorkoutListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_workout_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWorkoutListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButton6;
      ImageButton imageButton6 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton6 == null) {
        break missingId;
      }

      id = R.id.list_of_workouts;
      RecyclerView listOfWorkouts = ViewBindings.findChildViewById(rootView, id);
      if (listOfWorkouts == null) {
        break missingId;
      }

      id = R.id.title3;
      TextView title3 = ViewBindings.findChildViewById(rootView, id);
      if (title3 == null) {
        break missingId;
      }

      id = R.id.toolbar6;
      Toolbar toolbar6 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar6 == null) {
        break missingId;
      }

      return new ActivityWorkoutListBinding((ConstraintLayout) rootView, imageButton6,
          listOfWorkouts, title3, toolbar6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
