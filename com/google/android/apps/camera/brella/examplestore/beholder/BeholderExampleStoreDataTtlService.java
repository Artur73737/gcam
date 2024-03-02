package com.google.android.apps.camera.brella.examplestore.beholder;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public class BeholderExampleStoreDataTtlService extends .epm {
   public .jhe a;
   public .eqx b;
   public ExecutorService c;
   public .eqi d;

   protected final .jhe a() {
      synchronized(this){}

      .jhe var1;
      try {
         var1 = this.a;
      } finally {
         ;
      }

      return var1;
   }

   public final .psd b() {
      .epv var1 = this.e().c;
      return .pqp.j(.prx.q(.pqp.j(.prx.q(.osh.az(new .epq(var1, 0), var1.e)), new .epg(this, 0), this.c)), new .epg(this, 1), this.c);
   }

   public final .psd c() {
      .jhe var2 = this.a();
      .epv var1 = this.e().c;
      return .pqp.i(.prx.q(.osh.az(new .epo(var1), var1.e)), new .ego(var2, 3), this.c);
   }

   protected final ExecutorService d() {
      return this.c;
   }

   public final .eqi e() {
      synchronized(this){}

      .eqi var1;
      try {
         var1 = this.d;
      } finally {
         ;
      }

      return var1;
   }

   public final void onCreate() {
      super.onCreate();
      Context var1 = this.getApplicationContext();
      var1.getClass();
      ((.eph)((.gsr)var1).e(.eph.class)).c(this);
   }
}
