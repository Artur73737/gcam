package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class LicenseActivity extends .eh {
   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2131624069);
      .nvd var11 = (.nvd)this.getIntent().getParcelableExtra("license");
      if (this.h() != null) {
         this.h().i(var11.a);
         this.h().r();
         this.h().g(true);
         this.h().t();
      }

      TextView var6 = (TextView)this.findViewById(2131427831);
      long var3 = var11.b;
      int var2 = var11.c;
      String var7 = var11.d;
      String var13;
      if (var7.isEmpty()) {
         var13 = .npl.b(this, "third_party_licenses", var3, var2);
      } else {
         boolean var10001;
         try {
            FileInputStream var12 = new FileInputStream(var7);
            BufferedInputStream var8 = new BufferedInputStream(var12);
            var13 = .npl.a(var8, var3, var2);
         } catch (FileNotFoundException var10) {
            var10001 = false;
            throw new RuntimeException(String.valueOf(var7).concat(" does not contain res/raw/third_party_licenses"));
         }

         if (var13 == null) {
            throw new RuntimeException(String.valueOf(var7).concat(" does not contain res/raw/third_party_licenses"));
         }

         boolean var5;
         try {
            var5 = var13.isEmpty();
         } catch (FileNotFoundException var9) {
            var10001 = false;
            throw new RuntimeException(String.valueOf(var7).concat(" does not contain res/raw/third_party_licenses"));
         }

         if (var5) {
            throw new RuntimeException(String.valueOf(var7).concat(" does not contain res/raw/third_party_licenses"));
         }
      }

      if (var13 == null) {
         this.finish();
      } else {
         var6.setText(var13);
      }
   }

   public final boolean onOptionsItemSelected(MenuItem var1) {
      if (var1.getItemId() == 16908332) {
         this.finish();
         return true;
      } else {
         return super.onOptionsItemSelected(var1);
      }
   }

   public final void onRestoreInstanceState(Bundle var1) {
      super.onRestoreInstanceState(var1);
      ScrollView var3 = (ScrollView)this.findViewById(2131427830);
      int var2 = var1.getInt("scroll_pos");
      if (var2 != 0) {
         var3.post(new .on(this, var2, var3, 18, (char[])null));
      }

   }

   public final void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      ScrollView var2 = (ScrollView)this.findViewById(2131427830);
      Layout var3 = ((TextView)this.findViewById(2131427831)).getLayout();
      if (var3 != null) {
         var1.putInt("scroll_pos", var3.getLineStart(var3.getLineForVertical(var2.getScrollY())));
      }

   }
}
