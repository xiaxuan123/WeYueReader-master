// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.fragment.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookShelfFragment_ViewBinding implements Unbinder {
  private BookShelfFragment target;

  @UiThread
  public BookShelfFragment_ViewBinding(BookShelfFragment target, View source) {
    this.target = target;

    target.mRvBookShelf = Utils.findRequiredViewAsType(source, R.id.rv_book_shelf, "field 'mRvBookShelf'", RecyclerView.class);
    target.mSmartRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refresh, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookShelfFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRvBookShelf = null;
    target.mSmartRefreshLayout = null;
  }
}
