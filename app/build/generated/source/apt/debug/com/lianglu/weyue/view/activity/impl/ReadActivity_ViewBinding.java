// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.lianglu.weyue.widget.page.PageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadActivity_ViewBinding implements Unbinder {
  private ReadActivity target;

  private View view2131296692;

  private View view2131296579;

  private View view2131296576;

  private View view2131296575;

  private View view2131296577;

  private View view2131296580;

  @UiThread
  public ReadActivity_ViewBinding(ReadActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReadActivity_ViewBinding(final ReadActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tv_toolbar_title, "field 'mTvToolbarTitle' and method 'onViewClicked'");
    target.mTvToolbarTitle = Utils.castView(view, R.id.tv_toolbar_title, "field 'mTvToolbarTitle'", TextView.class);
    view2131296692 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mReadAblTopMenu = Utils.findRequiredViewAsType(source, R.id.read_abl_top_menu, "field 'mReadAblTopMenu'", AppBarLayout.class);
    target.mPvReadPage = Utils.findRequiredViewAsType(source, R.id.pv_read_page, "field 'mPvReadPage'", PageView.class);
    target.mReadTvPageTip = Utils.findRequiredViewAsType(source, R.id.read_tv_page_tip, "field 'mReadTvPageTip'", TextView.class);
    view = Utils.findRequiredView(source, R.id.read_tv_pre_chapter, "field 'mReadTvPreChapter' and method 'onViewClicked'");
    target.mReadTvPreChapter = Utils.castView(view, R.id.read_tv_pre_chapter, "field 'mReadTvPreChapter'", TextView.class);
    view2131296579 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mReadSbChapterProgress = Utils.findRequiredViewAsType(source, R.id.read_sb_chapter_progress, "field 'mReadSbChapterProgress'", SeekBar.class);
    view = Utils.findRequiredView(source, R.id.read_tv_next_chapter, "field 'mReadTvNextChapter' and method 'onViewClicked'");
    target.mReadTvNextChapter = Utils.castView(view, R.id.read_tv_next_chapter, "field 'mReadTvNextChapter'", TextView.class);
    view2131296576 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.read_tv_category, "field 'mReadTvCategory' and method 'onViewClicked'");
    target.mReadTvCategory = Utils.castView(view, R.id.read_tv_category, "field 'mReadTvCategory'", TextView.class);
    view2131296575 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.read_tv_night_mode, "field 'mReadTvNightMode' and method 'onViewClicked'");
    target.mReadTvNightMode = Utils.castView(view, R.id.read_tv_night_mode, "field 'mReadTvNightMode'", TextView.class);
    view2131296577 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.read_tv_setting, "field 'mReadTvSetting' and method 'onViewClicked'");
    target.mReadTvSetting = Utils.castView(view, R.id.read_tv_setting, "field 'mReadTvSetting'", TextView.class);
    view2131296580 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mReadLlBottomMenu = Utils.findRequiredViewAsType(source, R.id.read_ll_bottom_menu, "field 'mReadLlBottomMenu'", LinearLayout.class);
    target.mRvReadCategory = Utils.findRequiredViewAsType(source, R.id.rv_read_category, "field 'mRvReadCategory'", RecyclerView.class);
    target.mReadDlSlide = Utils.findRequiredViewAsType(source, R.id.read_dl_slide, "field 'mReadDlSlide'", DrawerLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReadActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvToolbarTitle = null;
    target.mReadAblTopMenu = null;
    target.mPvReadPage = null;
    target.mReadTvPageTip = null;
    target.mReadTvPreChapter = null;
    target.mReadSbChapterProgress = null;
    target.mReadTvNextChapter = null;
    target.mReadTvCategory = null;
    target.mReadTvNightMode = null;
    target.mReadTvSetting = null;
    target.mReadLlBottomMenu = null;
    target.mRvReadCategory = null;
    target.mReadDlSlide = null;

    view2131296692.setOnClickListener(null);
    view2131296692 = null;
    view2131296579.setOnClickListener(null);
    view2131296579 = null;
    view2131296576.setOnClickListener(null);
    view2131296576 = null;
    view2131296575.setOnClickListener(null);
    view2131296575 = null;
    view2131296577.setOnClickListener(null);
    view2131296577 = null;
    view2131296580.setOnClickListener(null);
    view2131296580 = null;
  }
}
