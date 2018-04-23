// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.lianglu.weyue.widget.theme.ColorTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131296365;

  private View view2131296404;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.mActvUsername = Utils.findRequiredViewAsType(source, R.id.actv_username, "field 'mActvUsername'", AutoCompleteTextView.class);
    target.mEtPassword = Utils.findRequiredViewAsType(source, R.id.et_password, "field 'mEtPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ctv_register, "field 'mCtvRegister' and method 'onViewClicked'");
    target.mCtvRegister = Utils.castView(view, R.id.ctv_register, "field 'mCtvRegister'", ColorTextView.class);
    view2131296365 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.fab, "field 'mFab' and method 'onViewClicked'");
    target.mFab = Utils.castView(view, R.id.fab, "field 'mFab'", FloatingActionButton.class);
    view2131296404 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mActvUsername = null;
    target.mEtPassword = null;
    target.mCtvRegister = null;
    target.mFab = null;

    view2131296365.setOnClickListener(null);
    view2131296365 = null;
    view2131296404.setOnClickListener(null);
    view2131296404 = null;
  }
}
