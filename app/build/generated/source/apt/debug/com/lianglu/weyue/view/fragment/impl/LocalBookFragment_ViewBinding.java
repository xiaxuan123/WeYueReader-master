// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.fragment.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.lianglu.weyue.widget.theme.ColorButton;
import com.weavey.loading.lib.LoadingLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LocalBookFragment_ViewBinding implements Unbinder {
  private LocalBookFragment target;

  @UiThread
  public LocalBookFragment_ViewBinding(LocalBookFragment target, View source) {
    this.target = target;

    target.mBtnScan = Utils.findRequiredViewAsType(source, R.id.btn_scan, "field 'mBtnScan'", ColorButton.class);
    target.mRvFiles = Utils.findRequiredViewAsType(source, R.id.rv_files, "field 'mRvFiles'", RecyclerView.class);
    target.loadlayout = Utils.findRequiredViewAsType(source, R.id.loadlayout, "field 'loadlayout'", LoadingLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LocalBookFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBtnScan = null;
    target.mRvFiles = null;
    target.loadlayout = null;
  }
}
