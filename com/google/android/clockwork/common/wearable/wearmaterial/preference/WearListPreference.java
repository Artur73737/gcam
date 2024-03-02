package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;

public class WearListPreference extends ListPreference {
   private final .lmk F;

   public WearListPreference(Context var1, AttributeSet var2) {
      int var3 = .mzx.dD(var1);
      super(var1, var2, var3, 0);
      this.F = new .lmk(this);
      TypedArray var4 = var1.obtainStyledAttributes(var2, .lfw.a, var3, 0);
      .mzx.dE(var4);
      TypedArray var5 = var1.obtainStyledAttributes(var2, .lfw.d, var3, 0);
      var5.getBoolean(0, false);
      var4.recycle();
      var5.recycle();
   }

   public final void a(.cqj var1) {
      super.a(var1);
      this.F.d(var1);
   }
}
