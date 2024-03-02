package com.google.android.apps.camera.legacy.app.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

public class CaptureActivity extends CameraActivity {
   private static final .pds A = .pds.h("com.google.android.apps.camera.legacy.app.activity.CaptureActivity");

   protected final void onCreate(Bundle var1) {
      boolean var3;
      int var4;
      String var8;
      PackageInfo var12;
      label61: {
         super.onCreate(var1);
         .ega.f(this.getIntent());
         var8 = this.getCallingPackage();
         Intent var11 = this.getIntent();
         var3 = false;
         var4 = 0;
         var11.putExtra("include_location_in_exif", false);
         var12 = null;
         boolean var10001;
         if (var8 != null) {
            label57: {
               PackageInfo var7;
               try {
                  var7 = this.getPackageManager().getPackageInfo(var8, 4096);
               } catch (NameNotFoundException var9) {
                  var10001 = false;
                  break label57;
               }

               var12 = var7;
               break label61;
            }
         } else {
            try {
               ((.pdq)A.c().I(1995)).q("getCallingPackage() returned null.");
               break label61;
            } catch (NameNotFoundException var10) {
               var10001 = false;
            }
         }

         ((.pdq)A.c().I(2000)).t("Unable to get PackageInfo for %s", var8);
      }

      boolean var2;
      label52: {
         if (var12 != null) {
            String[] var14 = var12.requestedPermissions;
            int[] var13 = var12.requestedPermissionsFlags;
            if (var14 != null && var13 != null) {
               var3 = false;
               var2 = false;

               while(true) {
                  if (var4 >= var14.length) {
                     break label52;
                  }

                  boolean var5 = var3;
                  if (var14[var4].equals("android.permission.ACCESS_COARSE_LOCATION")) {
                     var5 = var3;
                     if ((var13[var4] & 2) != 0) {
                        ((.pdq)A.c().I(1999)).t("Coarse location is granted to %s", var8);
                        var5 = true;
                     }
                  }

                  boolean var6 = var2;
                  if (var14[var4].equals("android.permission.ACCESS_FINE_LOCATION")) {
                     var6 = var2;
                     if ((var13[var4] & 2) != 0) {
                        ((.pdq)A.c().I(1998)).t("Fine location is granted to %s", var8);
                        var6 = true;
                     }
                  }

                  ++var4;
                  var3 = var5;
                  var2 = var6;
               }
            }
         }

         var2 = false;
      }

      if (!var3 && !var2) {
         ((.pdq)A.c().I(1997)).t("Package %s doesn't have location permissions, location info won't be included in EXIF", var8);
      } else {
         ((.pdq)A.c().I(1996)).q("Allowing location in intent");
         this.getIntent().putExtra("include_location_in_exif", true);
      }
   }
}
