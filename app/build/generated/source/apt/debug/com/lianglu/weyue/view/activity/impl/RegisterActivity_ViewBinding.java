// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target, View source) {
    this.target = target;

    target.mActvUsername = Utils.findRequiredViewAsType(source, R.id.actv_username, "field 'mActvUsername'", AutoCompleteTextView.class);
    target.mEtPassword = Utils.findRequiredViewAsType(source, R.id.et_password, "field 'mEtPassword'", EditText.class);
    target.mEtPasswordConfirm = Utils.findRequiredViewAsType(source, R.id.et_password_confirm, "field 'mEtPasswordConfirm'", EditText.class);
    target.mFab = Utils.findRequiredViewAsType(source, R.id.fab, "field 'mFab'", FloatingActionButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mActvUsername = null;
    target.mEtPassword = null;
    target.mEtPasswordConfirm = null;
    target.mFab = null;
  }
}
