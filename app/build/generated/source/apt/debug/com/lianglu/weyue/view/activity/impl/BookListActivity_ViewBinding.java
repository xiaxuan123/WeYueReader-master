// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

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

public class BookListActivity_ViewBinding implements Unbinder {
  private BookListActivity target;

  @UiThread
  public BookListActivity_ViewBinding(BookListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BookListActivity_ViewBinding(BookListActivity target, View source) {
    this.target = target;

    target.mViewpager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'mViewpager'", ViewPager.class);
    target.mTabStrip = Utils.findRequiredViewAsType(source, R.id.tabStrip, "field 'mTabStrip'", NavigationTabStrip.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mViewpager = null;
    target.mTabStrip = null;
  }
}
