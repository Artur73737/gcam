package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;

public class WearPreferenceCategory extends PreferenceCategory {
   private final int e;

   public WearPreferenceCategory(Context var1, AttributeSet var2) {
      super(var1, var2);
      Resources var4 = var1.getResources();
      int var3 = var4.getDisplayMetrics().widthPixels;
      this.e = Math.round(.ccz.a(var4, 2131167440) * (float)var3);
   }

   public final void a(.cqj var1) {
      super.a(var1);
      CharSequence var4 = super.q;
      TextView var5 = (TextView)var1.a;
      if (TextUtils.isEmpty(var4)) {
         var5.setVisibility(8);
         var5.setLayoutParams(new .ly(0, 0));
      } else {
         var5.setText(var4);
         boolean var3 = super.x;
         int var2 = 1;
         if (!var3) {
            var2 = Integer.MAX_VALUE;
         }

         var5.setMaxLines(var2);
         var5.setPadding(this.e, var5.getPaddingTop(), this.e, var5.getPaddingBottom());
      }
   }
}
