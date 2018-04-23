// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookDownloadActivity_ViewBinding implements Unbinder {
  private BookDownloadActivity target;

  @UiThread
  public BookDownloadActivity_ViewBinding(BookDownloadActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BookDownloadActivity_ViewBinding(BookDownloadActivity target, View source) {
    this.target = target;

    target.mRvBookDownload = Utils.findRequiredViewAsType(source, R.id.rv_book_download, "field 'mRvBookDownload'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookDownloadActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRvBookDownload = null;
  }
}
