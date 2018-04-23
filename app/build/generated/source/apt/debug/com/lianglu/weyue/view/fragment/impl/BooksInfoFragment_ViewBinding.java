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
import com.weavey.loading.lib.LoadingLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BooksInfoFragment_ViewBinding implements Unbinder {
  private BooksInfoFragment target;

  @UiThread
  public BooksInfoFragment_ViewBinding(BooksInfoFragment target, View source) {
    this.target = target;

    target.mRvBookinfo = Utils.findRequiredViewAsType(source, R.id.rv_bookinfo, "field 'mRvBookinfo'", RecyclerView.class);
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refresh, "field 'mRefreshLayout'", SmartRefreshLayout.class);
    target.mLoadinglayout = Utils.findRequiredViewAsType(source, R.id.loadinglayout, "field 'mLoadinglayout'", LoadingLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BooksInfoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRvBookinfo = null;
    target.mRefreshLayout = null;
    target.mLoadinglayout = null;
  }
}
