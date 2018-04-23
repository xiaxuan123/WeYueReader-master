// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookSearchActivity_ViewBinding implements Unbinder {
  private BookSearchActivity target;

  private View view2131296456;

  private View view2131296458;

  @UiThread
  public BookSearchActivity_ViewBinding(BookSearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BookSearchActivity_ViewBinding(final BookSearchActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.iv_back, "field 'mIvBack' and method 'onViewClicked'");
    target.mIvBack = Utils.castView(view, R.id.iv_back, "field 'mIvBack'", ImageView.class);
    view2131296456 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mRvSearch = Utils.findRequiredViewAsType(source, R.id.rv_search, "field 'mRvSearch'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.iv_clear, "field 'mIvClear' and method 'onViewClicked'");
    target.mIvClear = Utils.castView(view, R.id.iv_clear, "field 'mIvClear'", ImageView.class);
    view2131296458 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mEtSearch = Utils.findRequiredViewAsType(source, R.id.et_search, "field 'mEtSearch'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookSearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvBack = null;
    target.mRvSearch = null;
    target.mIvClear = null;
    target.mEtSearch = null;

    view2131296456.setOnClickListener(null);
    view2131296456 = null;
    view2131296458.setOnClickListener(null);
    view2131296458 = null;
  }
}
