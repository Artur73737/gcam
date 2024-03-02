package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.preference.Preference;

public class AppPreference extends Preference {
   public AppPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      super.A = 2131624148;
   }

   public final void a(.cqj var1) {
      super.a(var1);
      ((ProgressBar)var1.B(16908301)).setVisibility(8);
   }
}
