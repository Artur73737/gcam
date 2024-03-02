package com.google.android.apps.camera.brella.examplestore.beholder;

import android.content.Context;

public class BeholderExampleStoreService extends .epn {
   public .eqi a;

   protected final .epl a(Context var1, .eqc var2, .eqa var3) {
      .eqi var4 = this.b(var1);
      return new .epl(var4.c, var2, var3, var4.b);
   }

   protected final .eqi b(Context var1) {
      synchronized(this){}

      .eqi var4;
      try {
         if (this.a == null) {
            ((.epi)((.gsr)var1.getApplicationContext()).e(.epi.class)).d(this);
         }

         var4 = this.a;
      } finally {
         ;
      }

      return var4;
   }
}
