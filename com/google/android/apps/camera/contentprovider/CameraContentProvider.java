package com.google.android.apps.camera.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextUtils;
import com.google.lullaby.modules.audio.nwj.OtvMV;
import java.util.Arrays;
import java.util.HashSet;

public class CameraContentProvider extends ContentProvider {
   private .fnt a;
   private ProviderInfo b;
   private volatile .fns c;

   private final .fns b() {
      .fns var2 = this.c;
      .fns var1 = var2;
      if (var2 == null) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label206: {
            try {
               var2 = this.c;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label206;
            }

            var1 = var2;
            if (var2 == null) {
               try {
                  ProviderInfo var26 = this.b;
                  var26.getClass();
                  .fnu var23 = new .fnu(this, var26);
                  HasCameraContentProviderComponent var27 = (HasCameraContentProviderComponent)this.getContext();
                  var27.getClass();
                  .fnq var24 = var27.cameraContentProviderComponent(var23);
                  var24.b().a();
                  var1 = var24.a();
                  this.c = var1;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label206;
               }
            }

            label193:
            try {
               return var1;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label193;
            }
         }

         while(true) {
            Throwable var25 = var10000;

            try {
               throw var25;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               continue;
            }
         }
      } else {
         return var1;
      }
   }

   protected final void a() {
      .fnt var2 = this.a;
      if (var2 != null) {
         String var1 = this.getCallingPackage();
         var1.getClass();
         if (var2.a(var1)) {
            return;
         }
      }

      throw new SecurityException();
   }

   public final void attachInfo(Context var1, ProviderInfo var2) {
      this.b = var2;
      super.attachInfo(var1, var2);
   }

   public final Bundle call(String var1, String var2, Bundle var3) {
      this.a();
      String var5 = OtvMV.pzlfcpkDEuGNap;
      if (TextUtils.equals(var5, var1)) {
         .fns var6 = this.b();
         Bundle var7 = new Bundle();
         byte var4;
         if (!((.flx)var6.f).m(.fmr.a)) {
            var4 = 4;
         } else {
            var4 = 5;
         }

         var7.putInt(var5, var4);
         return var7;
      } else {
         return super.call(var1, var2, var3);
      }
   }

   public final int delete(Uri var1, String var2, String[] var3) {
      return 1;
   }

   public final String getType(Uri var1) {
      return null;
   }

   public final Uri insert(Uri var1, ContentValues var2) {
      throw new UnsupportedOperationException("Insert not allowed on the CameraContentProvider");
   }

   public final boolean onCreate() {
      Trace.beginSection("GCA_CameraContentProvider#onCreate");
      Context var2 = this.getContext();
      var2.getClass();
      HasCameraContentProviderComponent var1 = (HasCameraContentProviderComponent)this.getContext();
      var1.getClass();
      var1.initAppComponent();
      this.a = new .fnt(var2, new HashSet(Arrays.asList(var2.getResources().getStringArray(2130903068))));
      Trace.endSection();
      return true;
   }

   public final ParcelFileDescriptor openFile(Uri param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
      this.a();
      Trace.beginSection("GCA_SpecialTypes#query");
      .fns var9 = this.b();
      ((.min)var9.e).e("SpecialTypesQuery");
      .fwf var7 = (.fwf)var9.g;
      Object var8;
      switch(((UriMatcher)var7.b).match(var1)) {
      case 1:
         var8 = var7.a;
         break;
      case 2:
         var8 = var7.d;
         break;
      case 3:
      case 4:
      case 5:
      case 6:
      default:
         throw new IllegalArgumentException("Unrecognized uri: ".concat(String.valueOf(String.valueOf(var1))));
      case 7:
      case 8:
         var8 = var7.c;
         break;
      case 9:
      case 10:
         var8 = var7.e;
      }

      Cursor var6 = ((.gdk)var8).a(var1, var2);
      ((.min)var9.e).f();
      Trace.endSection();
      return var6;
   }

   public final int update(Uri var1, ContentValues var2, String var3, String[] var4) {
      throw new UnsupportedOperationException("Update not allowed on the CameraContentProvider");
   }
}
