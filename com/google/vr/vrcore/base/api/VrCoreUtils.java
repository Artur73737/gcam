package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class VrCoreUtils {
   public static int a(Context var0) {
      if ("com.google.vr.vrcore".equals(var0.getPackageName())) {
         return 0;
      } else {
         boolean var1;
         label109: {
            boolean var10001;
            PackageInfo var2;
            try {
               if (!var0.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                  return 2;
               }

               var2 = var0.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
               if (.qof.a(var2, .qof.a)) {
                  return 0;
               }
            } catch (NameNotFoundException var8) {
               var10001 = false;
               break label109;
            }

            label82: {
               try {
                  if (.pgn.e != null) {
                     var1 = .pgn.e;
                     break label82;
                  }
               } catch (NameNotFoundException var7) {
                  var10001 = false;
                  break label109;
               }

               try {
                  var1 = .pgn.T(var0);
               } catch (NameNotFoundException var6) {
                  var10001 = false;
                  break label109;
               }
            }

            if (!var1) {
               return 9;
            }

            try {
               var1 = .qof.a(var2, .qof.b);
            } catch (NameNotFoundException var5) {
               var10001 = false;
               break label109;
            }

            if (var1) {
               return 0;
            }

            return 9;
         }

         List var10;
         try {
            var10 = var0.getPackageManager().getPackageInstaller().getAllSessions();
         } catch (RuntimeException var3) {
            Log.w("VrCoreUtils", "Failure querying package installer sessions: ".concat(var3.toString()));
            var10 = null;
         }

         if (var10 != null) {
            Iterator var11 = var10.iterator();

            while(var11.hasNext()) {
               if ("com.google.vr.vrcore".equals(((SessionInfo)var11.next()).getAppPackageName())) {
                  return 3;
               }
            }
         }

         PackageManager var9 = var0.getPackageManager();

         try {
            var1 = var9.getApplicationInfo("com.google.vr.vrcore", 8192).enabled;
         } catch (NameNotFoundException var4) {
            return 1;
         }

         if (var1) {
            return 3;
         } else {
            return 1;
         }
      }
   }

   public static int getVrCoreClientApiVersion(Context param0) {
      // $FF: Couldn't be decompiled
   }
}
