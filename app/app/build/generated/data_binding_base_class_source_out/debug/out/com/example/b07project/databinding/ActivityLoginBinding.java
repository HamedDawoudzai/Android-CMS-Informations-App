// Generated by view binder compiler. Do not edit!
package com.example.b07project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.b07project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView adminlog;

  @NonNull
  public final AppCompatButton loginBtn;

  @NonNull
  public final EditText loginusername;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextView registerBtn;

  @NonNull
  public final TextView useless;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull TextView adminlog,
      @NonNull AppCompatButton loginBtn, @NonNull EditText loginusername,
      @NonNull EditText password, @NonNull TextView registerBtn, @NonNull TextView useless) {
    this.rootView = rootView;
    this.adminlog = adminlog;
    this.loginBtn = loginBtn;
    this.loginusername = loginusername;
    this.password = password;
    this.registerBtn = registerBtn;
    this.useless = useless;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adminlog;
      TextView adminlog = ViewBindings.findChildViewById(rootView, id);
      if (adminlog == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      AppCompatButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.loginusername;
      EditText loginusername = ViewBindings.findChildViewById(rootView, id);
      if (loginusername == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.registerBtn;
      TextView registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.useless;
      TextView useless = ViewBindings.findChildViewById(rootView, id);
      if (useless == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, adminlog, loginBtn, loginusername,
          password, registerBtn, useless);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}