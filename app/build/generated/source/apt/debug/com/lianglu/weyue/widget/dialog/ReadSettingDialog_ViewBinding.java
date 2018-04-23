// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.widget.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadSettingDialog_ViewBinding implements Unbinder {
  private ReadSettingDialog target;

  @UiThread
  public ReadSettingDialog_ViewBinding(ReadSettingDialog target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReadSettingDialog_ViewBinding(ReadSettingDialog target, View source) {
    this.target = target;

    target.mIvBrightnessMinus = Utils.findRequiredViewAsType(source, R.id.read_setting_iv_brightness_minus, "field 'mIvBrightnessMinus'", ImageView.class);
    target.mSbBrightness = Utils.findRequiredViewAsType(source, R.id.read_setting_sb_brightness, "field 'mSbBrightness'", SeekBar.class);
    target.mIvBrightnessPlus = Utils.findRequiredViewAsType(source, R.id.read_setting_iv_brightness_plus, "field 'mIvBrightnessPlus'", ImageView.class);
    target.mCbBrightnessAuto = Utils.findRequiredViewAsType(source, R.id.read_setting_cb_brightness_auto, "field 'mCbBrightnessAuto'", CheckBox.class);
    target.mTvFontMinus = Utils.findRequiredViewAsType(source, R.id.read_setting_tv_font_minus, "field 'mTvFontMinus'", TextView.class);
    target.mTvFont = Utils.findRequiredViewAsType(source, R.id.read_setting_tv_font, "field 'mTvFont'", TextView.class);
    target.mTvFontPlus = Utils.findRequiredViewAsType(source, R.id.read_setting_tv_font_plus, "field 'mTvFontPlus'", TextView.class);
    target.mCbFontDefault = Utils.findRequiredViewAsType(source, R.id.read_setting_cb_font_default, "field 'mCbFontDefault'", CheckBox.class);
    target.mRgPageMode = Utils.findRequiredViewAsType(source, R.id.read_setting_rg_page_mode, "field 'mRgPageMode'", RadioGroup.class);
    target.mRbSimulation = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_simulation, "field 'mRbSimulation'", RadioButton.class);
    target.mRbCover = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_cover, "field 'mRbCover'", RadioButton.class);
    target.mRbSlide = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_slide, "field 'mRbSlide'", RadioButton.class);
    target.mRbScroll = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_scroll, "field 'mRbScroll'", RadioButton.class);
    target.mRbNone = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_none, "field 'mRbNone'", RadioButton.class);
    target.mRvBg = Utils.findRequiredViewAsType(source, R.id.read_setting_rv_bg, "field 'mRvBg'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReadSettingDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvBrightnessMinus = null;
    target.mSbBrightness = null;
    target.mIvBrightnessPlus = null;
    target.mCbBrightnessAuto = null;
    target.mTvFontMinus = null;
    target.mTvFont = null;
    target.mTvFontPlus = null;
    target.mCbFontDefault = null;
    target.mRgPageMode = null;
    target.mRbSimulation = null;
    target.mRbCover = null;
    target.mRbSlide = null;
    target.mRbScroll = null;
    target.mRbNone = null;
    target.mRvBg = null;
  }
}
