package com.google.android.apps.camera.legacy.app.settings;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

public class CameraMaterialSettingsActivity extends .drb {
   public static final .pds r = .pds.h("com.google.android.apps.camera.legacy.app.settings.CameraMaterialSettingsActivity");
   private final Object s = new Object();
   private .hcv t;
   private boolean u;

   public static void h(.jqs var0, Preference var1) {
      if (!var1.r.equals("pref_category_developer")) {
         boolean var3 = var1 instanceof PreferenceGroup;
         int var2 = 0;
         if (var3) {
            for(PreferenceGroup var5 = (PreferenceGroup)var1; var2 < var5.k(); ++var2) {
               h(var0, var5.o(var2));
            }
         } else if (var1.u() == null) {
            Object var4;
            if (var1 instanceof TwoStatePreference) {
               var4 = ((TwoStatePreference)var1).a;
            } else {
               if (!(var1 instanceof ListPreference)) {
                  return;
               }

               var4 = ((ListPreference)var1).i;
            }

            var1.O(new .hcs(var0, var4, 0));
            return;
         }

      }
   }

   public final void onCreate(Bundle var1) {
      if (!this.u) {
         label174: {
            Object var3 = this.s;
            synchronized(var3){}

            Throwable var10000;
            boolean var10001;
            label167: {
               try {
                  if (!this.u) {
                     ((CameraApp)this.getApplicationContext()).f();
                     this.u = true;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label167;
               }

               label164:
               try {
                  break label174;
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label164;
               }
            }

            while(true) {
               Throwable var17 = var10000;

               try {
                  throw var17;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      super.onCreate(var1);
      String var18 = this.getIntent().getStringExtra("pref_screen_title");
      if (var18 == null) {
         this.setTitle(2132018205);
      } else {
         this.setTitle(var18);
      }

      String var4 = this.getIntent().getStringExtra("pref_screen_extra");
      var18 = this.getIntent().getStringExtra("pref_open_setting_page");
      boolean var2 = this.getIntent().getBooleanExtra("pref_make_setting_page_root", false);
      this.t = new .hcv();
      Bundle var20 = new Bundle(1);
      var20.putString("pref_screen_extra", var4);
      var20.putString("pref_open_setting_page", var18);
      var20.putBoolean("pref_make_setting_page_root", var2);
      this.t.setArguments(var20);
      .cw var19 = this.fv().i();
      var19.q(2131427577, this.t);
      var19.g();
      super.g.b(new .hct(this));
   }

   public final boolean onOptionsItemSelected(MenuItem var1) {
      if (var1.getItemId() == 16908332) {
         if ((this.getIntent().getFlags() & 33554432) != 0) {
            this.setResult(-1);
         }

         this.finish();
      }

      return true;
   }

   public final void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      super.onRequestPermissionsResult(var1, var2, var3);
      if (var1 == 1) {
         int var4 = var3.length;
         var1 = 0;

         while(true) {
            if (var1 >= var4) {
               this.t.C();
               return;
            }

            if (var3[var1] == 0) {
               break;
            }

            ++var1;
         }
      }

   }
}
