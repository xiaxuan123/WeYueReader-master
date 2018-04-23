// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.fragment.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.gigamole.navigationtabstrip.NavigationTabStrip;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScanBookFragment_ViewBinding implements Unbinder {
  private ScanBookFragment target;

  private View view2131296418;

  private View view2131296416;

  private View view2131296417;

  @UiThread
  public ScanBookFragment_ViewBinding(final ScanBookFragment target, View source) {
    this.target = target;

    View view;
    target.mNtsScan = Utils.findRequiredViewAsType(source, R.id.nts_scan, "field 'mNtsScan'", NavigationTabStrip.class);
    target.mVpScan = Utils.findRequiredViewAsType(source, R.id.vp_scan, "field 'mVpScan'", ViewPager.class);
    view = Utils.findRequiredView(source, R.id.file_system_cb_selected_all, "field 'mCbSelectAll' and method 'onViewClicked'");
    target.mCbSelectAll = Utils.castView(view, R.id.file_system_cb_selected_all, "field 'mCbSelectAll'", CheckBox.class);
    view2131296418 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.file_system_btn_add_book, "field 'mBtnAddBook' and method 'onViewClicked'");
    target.mBtnAddBook = Utils.castView(view, R.id.file_system_btn_add_book, "field 'mBtnAddBook'", Button.class);
    view2131296416 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.file_system_btn_delete, "field 'mBtnDelete' and method 'onViewClicked'");
    target.mBtnDelete = Utils.castView(view, R.id.file_system_btn_delete, "field 'mBtnDelete'", Button.class);
    view2131296417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ScanBookFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNtsScan = null;
    target.mVpScan = null;
    target.mCbSelectAll = null;
    target.mBtnAddBook = null;
    target.mBtnDelete = null;

    view2131296418.setOnClickListener(null);
    view2131296418 = null;
    view2131296416.setOnClickListener(null);
    view2131296416 = null;
    view2131296417.setOnClickListener(null);
    view2131296417 = null;
  }
}
