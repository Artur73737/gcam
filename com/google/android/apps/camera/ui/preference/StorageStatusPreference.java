package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.preference.Preference;
import android.text.SpannableString;
import android.text.format.Formatter;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.text.NumberFormat;

public class StorageStatusPreference extends Preference {
   private static final Typeface e = Typeface.create("sans-serif-medium", 0);
   public long a = -1L;
   public long b = -1L;
   public int c;
   public int d;
   private TextView f;
   private TextView g;
   private ProgressBar h;

   public StorageStatusPreference(Context var1) {
      super(var1);
   }

   public StorageStatusPreference(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public StorageStatusPreference(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public final void a() {
      if (this.f != null && this.g != null) {
         ProgressBar var5 = this.h;
         if (var5 != null) {
            long var3 = this.b;
            float var1;
            if (var3 == 0L) {
               var1 = 0.0F;
            } else {
               var1 = (float)this.a * 100.0F / (float)var3;
            }

            var5.setProgress(Math.round(100.0F - var1));
            Resources var7 = this.getContext().getResources();
            this.f.setText(var7.getString(2132018500, new Object[]{Formatter.formatFileSize(this.getContext(), this.a)}));
            NumberFormat var6 = NumberFormat.getInstance();
            String var9 = var6.format((long)this.c);
            String var10 = var6.format((long)this.d);
            String var11 = var7.getString(2132018498, new Object[]{var7.getQuantityString(2131886103, this.c, new Object[]{var9}), var7.getQuantityString(2131886107, this.d, new Object[]{var10})});
            SpannableString var8 = new SpannableString(var11);
            int var2 = var11.indexOf(var9);
            if (var2 != -1) {
               var8.setSpan(new TypefaceSpan(e), var2, var9.length() + var2, 33);
            }

            var2 = var11.lastIndexOf(var10);
            if (var2 != -1) {
               var8.setSpan(new TypefaceSpan(e), var2, var10.length() + var2, 33);
            }

            this.g.setText(var8);
         }
      }

   }

   protected final void onBindView(View var1) {
      super.onBindView(var1);
      this.f = (TextView)var1.findViewById(2131428280);
      this.g = (TextView)var1.findViewById(2131428279);
      this.h = (ProgressBar)var1.findViewById(2131428278);
      this.a();
   }
}
