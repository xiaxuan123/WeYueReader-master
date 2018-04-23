// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import com.lianglu.weyue.widget.theme.ColorRelativeLayout;
import com.lianglu.weyue.widget.theme.ColorTextView;
import com.zhy.view.flowlayout.TagFlowLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookDetailActivity_ViewBinding implements Unbinder {
  private BookDetailActivity target;

  private View view2131296472;

  private View view2131296360;

  @UiThread
  public BookDetailActivity_ViewBinding(BookDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BookDetailActivity_ViewBinding(final BookDetailActivity target, View source) {
    this.target = target;

    View view;
    target.mIvBookImage = Utils.findRequiredViewAsType(source, R.id.iv_book_image, "field 'mIvBookImage'", ImageView.class);
    target.mTvBookName = Utils.findRequiredViewAsType(source, R.id.tv_book_name, "field 'mTvBookName'", TextView.class);
    target.mCtvBookAuthor = Utils.findRequiredViewAsType(source, R.id.ctv_book_author, "field 'mCtvBookAuthor'", ColorTextView.class);
    target.mTvBookClassify = Utils.findRequiredViewAsType(source, R.id.tv_book_classify, "field 'mTvBookClassify'", TextView.class);
    target.mTvWordUpdatetime = Utils.findRequiredViewAsType(source, R.id.tv_word_updatetime, "field 'mTvWordUpdatetime'", TextView.class);
    target.mCtvScore = Utils.findRequiredViewAsType(source, R.id.ctv_score, "field 'mCtvScore'", ColorTextView.class);
    target.mTvFowNum = Utils.findRequiredViewAsType(source, R.id.tv_fow_num, "field 'mTvFowNum'", TextView.class);
    target.mTvGoodNum = Utils.findRequiredViewAsType(source, R.id.tv_good_num, "field 'mTvGoodNum'", TextView.class);
    target.mTvWordCount = Utils.findRequiredViewAsType(source, R.id.tv_word_count, "field 'mTvWordCount'", TextView.class);
    target.mTvBookBrief = Utils.findRequiredViewAsType(source, R.id.tv_book_brief, "field 'mTvBookBrief'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_fow, "field 'mLlFow' and method 'onViewClicked'");
    target.mLlFow = Utils.castView(view, R.id.ll_fow, "field 'mLlFow'", LinearLayout.class);
    view2131296472 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.crl_start_read, "field 'mCrlStartRead' and method 'onViewClicked'");
    target.mCrlStartRead = Utils.castView(view, R.id.crl_start_read, "field 'mCrlStartRead'", ColorRelativeLayout.class);
    view2131296360 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mCtvAddbook = Utils.findRequiredViewAsType(source, R.id.ctv_addbook, "field 'mCtvAddbook'", TextView.class);
    target.mTvEvaluate = Utils.findRequiredViewAsType(source, R.id.tv_evaluate, "field 'mTvEvaluate'", TextView.class);
    target.mFlTags = Utils.findRequiredViewAsType(source, R.id.fl_tags, "field 'mFlTags'", TagFlowLayout.class);
    target.mLlTag = Utils.findRequiredViewAsType(source, R.id.ll_tag, "field 'mLlTag'", LinearLayout.class);
    target.mTvCopyRight = Utils.findRequiredViewAsType(source, R.id.tv_copyright, "field 'mTvCopyRight'", TextView.class);
    target.mTvRead = Utils.findRequiredViewAsType(source, R.id.tv_read, "field 'mTvRead'", TextView.class);
    target.rl_rootview = Utils.findRequiredViewAsType(source, R.id.rl_rootview, "field 'rl_rootview'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvBookImage = null;
    target.mTvBookName = null;
    target.mCtvBookAuthor = null;
    target.mTvBookClassify = null;
    target.mTvWordUpdatetime = null;
    target.mCtvScore = null;
    target.mTvFowNum = null;
    target.mTvGoodNum = null;
    target.mTvWordCount = null;
    target.mTvBookBrief = null;
    target.mLlFow = null;
    target.mCrlStartRead = null;
    target.mCtvAddbook = null;
    target.mTvEvaluate = null;
    target.mFlTags = null;
    target.mLlTag = null;
    target.mTvCopyRight = null;
    target.mTvRead = null;
    target.rl_rootview = null;

    view2131296472.setOnClickListener(null);
    view2131296472 = null;
    view2131296360.setOnClickListener(null);
    view2131296360 = null;
  }
}
