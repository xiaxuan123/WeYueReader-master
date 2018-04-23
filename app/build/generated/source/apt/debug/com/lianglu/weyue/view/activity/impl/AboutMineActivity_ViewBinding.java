// Generated code from Butter Knife. Do not modify!
package com.lianglu.weyue.view.activity.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lianglu.weyue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutMineActivity_ViewBinding implements Unbinder {
  private AboutMineActivity target;

  @UiThread
  public AboutMineActivity_ViewBinding(AboutMineActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutMineActivity_ViewBinding(AboutMineActivity target, View source) {
    this.target = target;

    target.mIvAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'mIvAvatar'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutMineActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvAvatar = null;
  }
}
