// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.lianglu.weyue.R;
import com.zhy.view.flowlayout.TagFlowLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserInfoActivity_ViewBinding implements Unbinder {
  private UserInfoActivity target;

  private View view2131296455;

  private View view2131296405;

  private View view2131296406;

  private View view2131296327;

  @UiThread
  public UserInfoActivity_ViewBinding(UserInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserInfoActivity_ViewBinding(final UserInfoActivity target, View source) {
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
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mToolbarLayout = Utils.findRequiredViewAsType(source, R.id.toolbar_layout, "field 'mToolbarLayout'", CollapsingToolbarLayout.class);
    target.mAppBar = Utils.findRequiredViewAsType(source, R.id.app_bar, "field 'mAppBar'", AppBarLayout.class);
    target.mTvName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'mTvName'", TextView.class);
    target.mEtNickName = Utils.findRequiredViewAsType(source, R.id.et_nickname, "field 'mEtNickName'", EditText.class);
    target.mEtBrief = Utils.findRequiredViewAsType(source, R.id.et_brief, "field 'mEtBrief'", EditText.class);
    target.mLlTip = Utils.findRequiredViewAsType(source, R.id.ll_tip, "field 'mLlTip'", LinearLayout.class);
    target.mTvNickname = Utils.findRequiredViewAsType(source, R.id.tv_nickname, "field 'mTvNickname'", TextView.class);
    target.mTvBrief = Utils.findRequiredViewAsType(source, R.id.tv_brief, "field 'mTvBrief'", TextView.class);
    target.mTvBooks = Utils.findRequiredViewAsType(source, R.id.tv_books, "field 'mTvBooks'", TextView.class);
    target.mFlBookName = Utils.findRequiredViewAsType(source, R.id.fl_book_name, "field 'mFlBookName'", TagFlowLayout.class);
    target.mTvBookTags = Utils.findRequiredViewAsType(source, R.id.tv_book_tags, "field 'mTvBookTags'", TextView.class);
    target.mFlBookType = Utils.findRequiredViewAsType(source, R.id.fl_book_type, "field 'mFlBookType'", TagFlowLayout.class);
    target.mCvLike = Utils.findRequiredViewAsType(source, R.id.cv_like, "field 'mCvLike'", CardView.class);
    view = Utils.findRequiredView(source, R.id.fab_edit_password, "field 'mFabEditPassword' and method 'onViewClicked'");
    target.mFabEditPassword = Utils.castView(view, R.id.fab_edit_password, "field 'mFabEditPassword'", FloatingActionButton.class);
    view2131296405 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.fab_edit_userinfo, "field 'mFabEditUserinfo' and method 'onViewClicked'");
    target.mFabEditUserinfo = Utils.castView(view, R.id.fab_edit_userinfo, "field 'mFabEditUserinfo'", FloatingActionButton.class);
    view2131296406 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mFabMenu = Utils.findRequiredViewAsType(source, R.id.fab_menu, "field 'mFabMenu'", FloatingActionsMenu.class);
    view = Utils.findRequiredView(source, R.id.btn_confirm, "field 'mBtnConfirm' and method 'onViewClicked'");
    target.mBtnConfirm = Utils.castView(view, R.id.btn_confirm, "field 'mBtnConfirm'", Button.class);
    view2131296327 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.cl_root = Utils.findRequiredViewAsType(source, R.id.cl_root, "field 'cl_root'", CoordinatorLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvAvatar = null;
    target.mToolbar = null;
    target.mToolbarLayout = null;
    target.mAppBar = null;
    target.mTvName = null;
    target.mEtNickName = null;
    target.mEtBrief = null;
    target.mLlTip = null;
    target.mTvNickname = null;
    target.mTvBrief = null;
    target.mTvBooks = null;
    target.mFlBookName = null;
    target.mTvBookTags = null;
    target.mFlBookType = null;
    target.mCvLike = null;
    target.mFabEditPassword = null;
    target.mFabEditUserinfo = null;
    target.mFabMenu = null;
    target.mBtnConfirm = null;
    target.cl_root = null;

    view2131296455.setOnClickListener(null);
    view2131296455 = null;
    view2131296405.setOnClickListener(null);
    view2131296405 = null;
    view2131296406.setOnClickListener(null);
    view2131296406 = null;
    view2131296327.setOnClickListener(null);
    view2131296327 = null;
  }
}
