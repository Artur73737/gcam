package com.google.android.apps.camera.videoplayer;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;

public class VideoPlayerActivity extends .eh {
   private final BroadcastReceiver r = new .kvm(this);

   private final .kvn n() {
      return (.kvn)this.fv().d(2131428411);
   }

   private final void o(Uri var1) {
      Bundle var2 = new Bundle();
      var2.putBoolean("no_seek_bar", false);
      var2.putBoolean("auto_loop_enabled", false);
      .kvn var3 = .kvn.c(var2, var1);
      .cw var4 = this.fv().i();
      var4.l(2131428411, var3);
      var4.g();
   }

   protected final void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2131624241);
      if (this.n() == null) {
         Uri var2 = this.getIntent().getData();
         var2.getClass();
         this.o(var2);
      }

      IntentFilter var3 = new IntentFilter("android.intent.action.SCREEN_OFF");
      this.registerReceiver(this.r, var3);
   }

   protected final void onDestroy() {
      this.unregisterReceiver(this.r);
      super.onDestroy();
   }

   protected final void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      .kvn var2 = this.n();
      if (var2 != null) {
         .cw var3 = this.fv().i();
         var3.j(var2);
         var3.g();
      }

      Uri var4 = var1.getData();
      var4.getClass();
      this.o(var4);
   }
}
