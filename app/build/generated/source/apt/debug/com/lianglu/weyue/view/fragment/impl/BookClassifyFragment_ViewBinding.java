// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.fragment.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.gigamole.navigationtabstrip.NavigationTabStrip;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookClassifyFragment_ViewBinding implements Unbinder {
  private BookClassifyFragment target;

  @UiThread
  public BookClassifyFragment_ViewBinding(BookClassifyFragment target, View source) {
    this.target = target;

    target.mNtsClassify = Utils.findRequiredViewAsType(source, R.id.nts_classify, "field 'mNtsClassify'", NavigationTabStrip.class);
    target.mVpClassify = Utils.findRequiredViewAsType(source, R.id.vp_classify, "field 'mVpClassify'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookClassifyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNtsClassify = null;
    target.mVpClassify = null;
  }
}
