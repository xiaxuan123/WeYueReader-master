// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.fragment.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FileCategoryFragment_ViewBinding implements Unbinder {
  private FileCategoryFragment target;

  @UiThread
  public FileCategoryFragment_ViewBinding(FileCategoryFragment target, View source) {
    this.target = target;

    target.mTvPath = Utils.findRequiredViewAsType(source, R.id.file_category_tv_path, "field 'mTvPath'", TextView.class);
    target.mTvBackLast = Utils.findRequiredViewAsType(source, R.id.file_category_tv_back_last, "field 'mTvBackLast'", TextView.class);
    target.mRvFileCategory = Utils.findRequiredViewAsType(source, R.id.rv_file_category, "field 'mRvFileCategory'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FileCategoryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvPath = null;
    target.mTvBackLast = null;
    target.mRvFileCategory = null;
  }
}
