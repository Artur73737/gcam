package com.google.android.apps.camera.stats.timing;

public class OneCameraTiming extends .jrn {
   public final .min a;
   public .miq b;

   public OneCameraTiming(.mxu var1, .min var2) {
      super(var1, .jrg.values());
      this.b = .miq.b;
      this.a = var2;
   }

   public long getOneCameraCreateNs() {
      return this.g(.jrg.b);
   }

   public long getOneCameraCreatedNs() {
      return this.g(.jrg.c);
   }
}
