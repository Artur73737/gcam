package com.google.android.apps.camera.legacy.app.settings;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.preference.Preference;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import android.view.accessibility.AccessibilityManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CameraSearchIndexablesProvider extends SearchIndexablesProvider {
   private static final .pds a = .pds.h("com.google.android.apps.camera.legacy.app.settings.CameraSearchIndexablesProvider");
   private boolean b = false;
   private .kpb c;

   private final String a() {
      return this.getContext().getApplicationInfo().packageName;
   }

   private final Object[] b(String var1, String var2, String var3) {
      Object[] var4 = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
      var4[12] = var3;
      var4[1] = var1;
      var4[2] = var2;
      var4[8] = 2131231220;
      var4[9] = "com.android.settings.action.EXTRA_SETTINGS";
      var4[10] = this.a();
      var4[11] = CameraSettingsActivity.class.getName();
      return var4;
   }

   private final .kpb c() {
      synchronized(this){}

      Throwable var10000;
      label132: {
         boolean var10001;
         .kpb var17;
         label137: {
            label129: {
               boolean var1;
               boolean var2;
               try {
                  var2 = this.b;
                  var1 = ((AccessibilityManager)this.getContext().getSystemService("accessibility")).isTouchExplorationEnabled();
                  this.b = var1;
                  if (this.c == null) {
                     break label129;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label132;
               }

               if (var2 == var1) {
                  break label137;
               }
            }

            try {
               .gzh var3 = ((.gzy)this.getContext().getApplicationContext()).f();
               .dmw var4 = new .dmw(this.getContext(), (byte[])null);
               var17 = var3.C(var4).b();
               this.c = var17;
               var17.a(this.getContext());
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label132;
            }
         }

         label120:
         try {
            var17 = this.c;
            return var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label120;
         }
      }

      Throwable var18 = var10000;
      throw var18;
   }

   public final boolean onCreate() {
      ((.pdq)a.c().I(2140)).q("Called onCreate");
      return true;
   }

   public final Cursor queryNonIndexableKeys(String[] var1) {
      ((.pdq)a.c().I(2135)).q("Called queryNonIndexableKeys");
      MatrixCursor var5 = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
      Iterator var2 = ((List)this.c().k).iterator();

      while(var2.hasNext()) {
         String var4 = (String)var2.next();
         Object[] var3 = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
         var3[0] = var4;
         var5.addRow(var3);
      }

      return var5;
   }

   public final Cursor queryRawData(String[] var1) {
      ((.pdq)a.c().I(2137)).q("Called queryRawData");
      String var4 = this.getContext().getString(2132017252);
      MatrixCursor var2 = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
      var2.addRow(this.b(var4, this.getContext().getString(2132017934), "camera_settings"));
      .ovx var3 = (.ovx)this.c().o;
      Object var5 = var3.d;
      if (var5 == null) {
         var5 = new .ovw(var3);
         var3.d = (Collection)var5;
      }

      Iterator var6 = ((Collection)var5).iterator();

      while(var6.hasNext()) {
         Preference var7 = (Preference)var6.next();
         var7.getTitle();
         var7.getSummary();
         var7.getKey();
         var2.addRow(this.b(var7.getTitle().toString(), var7.getSummary().toString(), var7.getKey()));
      }

      return var2;
   }

   public final Cursor queryXmlResources(String[] var1) {
      ((.pdq)a.c().I(2139)).q("Called queryXmlResources");
      MatrixCursor var3 = new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
      Object[] var2 = new Object[SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS.length];
      var2[0] = 1;
      var2[1] = 2132279297;
      var2[2] = null;
      var2[3] = 0;
      var2[4] = "android.intent.action.MAIN";
      var2[5] = this.a();
      var2[6] = CameraSettingsActivity.class.getName();
      var3.addRow(var2);
      return var3;
   }
}
