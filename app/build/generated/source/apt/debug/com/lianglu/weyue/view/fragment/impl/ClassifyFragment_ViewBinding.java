// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.fragment.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.weavey.loading.lib.LoadingLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ClassifyFragment_ViewBinding implements Unbinder {
  private ClassifyFragment target;

  @UiThread
  public ClassifyFragment_ViewBinding(ClassifyFragment target, View source) {
    this.target = target;

    target.mRvClassify = Utils.findRequiredViewAsType(source, R.id.rv_classify, "field 'mRvClassify'", RecyclerView.class);
    target.mLoadinglayout = Utils.findRequiredViewAsType(source, R.id.loadinglayout, "field 'mLoadinglayout'", LoadingLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ClassifyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRvClassify = null;
    target.mLoadinglayout = null;
  }
}
