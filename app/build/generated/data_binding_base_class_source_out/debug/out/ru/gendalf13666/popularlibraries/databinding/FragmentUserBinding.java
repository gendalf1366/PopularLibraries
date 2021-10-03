// Generated by view binder compiler. Do not edit!
package ru.gendalf13666.popularlibraries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.gendalf13666.popularlibraries.R;

public final class FragmentUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvLogin;

  @NonNull
  public final RecyclerView userRepos;

  private FragmentUserBinding(@NonNull ConstraintLayout rootView, @NonNull TextView tvLogin,
      @NonNull RecyclerView userRepos) {
    this.rootView = rootView;
    this.tvLogin = tvLogin;
    this.userRepos = userRepos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_login;
      TextView tvLogin = rootView.findViewById(id);
      if (tvLogin == null) {
        break missingId;
      }

      id = R.id.user_repos;
      RecyclerView userRepos = rootView.findViewById(id);
      if (userRepos == null) {
        break missingId;
      }

      return new FragmentUserBinding((ConstraintLayout) rootView, tvLogin, userRepos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
