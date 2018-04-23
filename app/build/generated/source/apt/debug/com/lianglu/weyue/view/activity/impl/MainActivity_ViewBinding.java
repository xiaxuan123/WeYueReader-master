// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.lianglu.weyue.widget.ResideLayout;
import com.lianglu.weyue.widget.theme.ColorRelativeLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131296455;

  private View view2131296690;

  private View view2131296688;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.iv_avatar, "field 'mIvAvatar' and method 'onViewClicked'");
    target.mIvAvatar = Utils.castView(view, R.id.iv_avatar, "field 'mIvAvatar'", ImageView.class);
    view2131296455 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mTvDesc = Utils.findRequiredViewAsType(source, R.id.tv_desc, "field 'mTvDesc'", TextView.class);
    target.mTopMenu = Utils.findRequiredViewAsType(source, R.id.top_menu, "field 'mTopMenu'", LinearLayout.class);
    target.mRvMenu = Utils.findRequiredViewAsType(source, R.id.rv_menu, "field 'mRvMenu'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_theme, "field 'mTvTheme' and method 'onViewClicked'");
    target.mTvTheme = Utils.castView(view, R.id.tv_theme, "field 'mTvTheme'", TextView.class);
    view2131296690 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_setting, "field 'mTvSetting' and method 'onViewClicked'");
    target.mTvSetting = Utils.castView(view, R.id.tv_setting, "field 'mTvSetting'", TextView.class);
    view2131296688 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mBottomMenu = Utils.findRequiredViewAsType(source, R.id.bottom_menu, "field 'mBottomMenu'", LinearLayout.class);
    target.mMenu = Utils.findRequiredViewAsType(source, R.id.menu, "field 'mMenu'", ColorRelativeLayout.class);
    target.mContainer = Utils.findRequiredViewAsType(source, R.id.container, "field 'mContainer'", FrameLayout.class);
    target.mResideLayout = Utils.findRequiredViewAsType(source, R.id.resideLayout, "field 'mResideLayout'", ResideLayout.class);
    target.mIvToolBarMore = Utils.findRequiredViewAsType(source, R.id.iv_toolbar_more, "field 'mIvToolBarMore'", AppCompatImageView.class);
    target.mIvToolBarBack = Utils.findRequiredViewAsType(source, R.id.iv_toolbar_back, "field 'mIvToolBarBack'", AppCompatImageView.class);
    target.mTvToolBarTitle = Utils.findRequiredViewAsType(source, R.id.tv_toolbar_title, "field 'mTvToolBarTitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvAvatar = null;
    target.mTvDesc = null;
    target.mTopMenu = null;
    target.mRvMenu = null;
    target.mTvTheme = null;
    target.mTvSetting = null;
    target.mBottomMenu = null;
    target.mMenu = null;
    target.mContainer = null;
    target.mResideLayout = null;
    target.mIvToolBarMore = null;
    target.mIvToolBarBack = null;
    target.mTvToolBarTitle = null;

    view2131296455.setOnClickListener(null);
    view2131296455 = null;
    view2131296690.setOnClickListener(null);
    view2131296690 = null;
    view2131296688.setOnClickListener(null);
    view2131296688 = null;
  }
}
