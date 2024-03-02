package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;

public class WearSwitchPreference extends SwitchPreference {
   private final .lmk c = new .lmk(this);

   public WearSwitchPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void a(.cqj var1) {
      super.a(var1);
      this.c.d(var1);
   }
}
