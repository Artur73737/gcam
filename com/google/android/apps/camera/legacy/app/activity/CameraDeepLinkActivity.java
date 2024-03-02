package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.contentprovider.Eboh.wAtBWCNpqMjxj;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import java.util.Iterator;
import java.util.Locale;

public class CameraDeepLinkActivity extends Activity {
   private static final .pds a = .pds.h("com.google.android.apps.camera.legacy.app.activity.CameraDeepLinkActivity");
   private boolean b;

   private final void a() {
      Intent var1 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.GoogleCamera"));
      var1.setPackage("com.android.vending");
      this.startActivity(var1);
      this.b = true;
   }

   protected final void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.b = false;
      Intent var8 = new Intent(this, CameraActivity.class);
      var8.setAction("android.media.action.STILL_IMAGE_CAMERA");
      var8.addFlags(268435456);
      Uri var4 = this.getIntent().getData();
      if (var4 == null) {
         ((.pdq)a.c().I(1992)).q("Received intent to launch DeepLinkActivity with null intentUri");
         this.startActivity(var8);
         this.b = true;
      } else {
         Iterator var3 = var4.getQueryParameterNames().iterator();

         String var6;
         label40:
         while(true) {
            while(var3.hasNext()) {
               String var5 = (String)var3.next();
               if ("mode".equalsIgnoreCase(var5)) {
                  var6 = var4.getQueryParameter(var5);
                  var6.getClass();
                  .otw var9 = .oto.a(.ksm.class, var6.toUpperCase(Locale.ROOT));
                  if (!var9.h()) {
                     break label40;
                  }

                  .ksm var7 = (.ksm)var9.c();
                  int var2 = .ksj.a;
                  if (!.ozr.I(.ksm.g, .ksm.b).contains(var7)) {
                     break label40;
                  }

                  if (!"android.media.action.STILL_IMAGE_CAMERA".equals(var8.getAction())) {
                     throw new UnsupportedOperationException("Unreachable: only still-image modes supported");
                  }

                  var5 = ((.ksm)var9.c()).toString();
                  var8.putExtra(wAtBWCNpqMjxj.teJnnIibNa, var5);
               } else if ("timer".equalsIgnoreCase(var5)) {
                  var5 = var4.getQueryParameter(var5);
                  var5.getClass();
                  var8.putExtra("android.intent.extra.TIMER_DURATION_SECONDS", Integer.parseInt(var5));
               } else {
                  if (!"use-front-camera".equalsIgnoreCase(var5)) {
                     ((.pdq)a.c().I(1991)).B("Unknown query parameter %s, with value %s", var5, var4.getQueryParameter(var5));
                     this.a();
                     return;
                  }

                  var5 = var4.getQueryParameter(var5);
                  var5.getClass();
                  var8.putExtra("android.intent.extra.USE_FRONT_CAMERA", Boolean.parseBoolean(var5));
               }
            }

            this.startActivity(var8);
            this.b = true;
            return;
         }

         ((.pdq)a.c().I(1993)).t("Unsupported mode '%s', perhaps you need to upgrade", var6);
         this.a();
      }
   }

   protected final void onResume() {
      super.onResume();
      if (this.b) {
         this.finish();
      }

   }
}
