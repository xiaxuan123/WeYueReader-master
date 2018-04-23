// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedBackActivity_ViewBinding implements Unbinder {
  private FeedBackActivity target;

  private View view2131296326;

  @UiThread
  public FeedBackActivity_ViewBinding(FeedBackActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FeedBackActivity_ViewBinding(final FeedBackActivity target, View source) {
    this.target = target;

    View view;
    target.mEtQq = Utils.findRequiredViewAsType(source, R.id.et_qq, "field 'mEtQq'", EditText.class);
    target.mEtFeedback = Utils.findRequiredViewAsType(source, R.id.et_feedback, "field 'mEtFeedback'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_commit, "method 'onViewClicked'");
    view2131296326 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FeedBackActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEtQq = null;
    target.mEtFeedback = null;

    view2131296326.setOnClickListener(null);
    view2131296326 = null;
  }
}
