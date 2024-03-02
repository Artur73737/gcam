package com.android.settingslib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;

public class AppHeaderPreference extends Preference {
   public AppHeaderPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
      super.A = 2131623971;
      this.af();
   }

   public final void a(.cqj var1) {
      super.a(var1);
      TextView var2 = (TextView)var1.B(2131427782);
      if (var2 != null) {
         var2.setVisibility(8);
      }

      TextView var3 = (TextView)var1.B(2131428172);
      if (var3 != null) {
         if (!TextUtils.isEmpty((CharSequence)null)) {
            var3.setText((CharSequence)null);
            var3.setVisibility(0);
            return;
         }

         var3.setVisibility(8);
      }

   }
}
