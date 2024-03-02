package com.google.android.apps.camera.stats.timing;

public class CameraActivityTiming extends .jrn {
   public static final .jrm a;
   public static final .jrm b;
   public boolean c = false;
   public final .jqv d;
   public final .min e;
   public .miq f;
   public .miq g;
   public .miq h;
   public .miq i;

   static {
      .jrl var0 = .jrm.a();
      var0.b(false);
      a = var0.a();
      b = j;
   }

   public CameraActivityTiming(long var1, .mxw var3, .jqv var4, .min var5) {
      super(var3, var1, .jra.values());
      this.i = .miq.b;
      this.d = var4;
      this.e = var5;
      this.f = var5.a("FirstPreviewFrame");
      this.h = var5.a("ShutterButtonEnabled");
      this.g = var5.a("FirstFrameReceived");
   }

   public final void a() {
      super.a();
      this.c = false;
   }

   public final void c() {
      this.c = true;
   }

   public final boolean d() {
      .jra[] var3 = .jra.values();
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         .jra var4 = var3[var1];
         if (var4.t && !this.k(var4)) {
            return false;
         }
      }

      return true;
   }

   public long getActivityInitializedNs() {
      return this.g(.jra.k);
   }

   public long getActivityOnCreateEndNs() {
      return this.g(.jra.b);
   }

   public long getActivityOnCreateStartNs() {
      return this.g(.jra.a);
   }

   public long getActivityOnResumeEndNs() {
      return this.g(.jra.i);
   }

   public long getActivityOnResumeStartNs() {
      return this.g(.jra.h);
   }

   public long getActivityOnStartStartNs() {
      return this.g(.jra.g);
   }

   public long getFirstPreviewFrameReceivedNs() {
      return this.g(.jra.l);
   }

   public long getFirstPreviewFrameRenderedNs() {
      return this.g(.jra.m);
   }

   public long getFirstVfePreviewFrameRenderedNs() {
      return this.g(.jra.n);
   }

   public long getPermissionStartupTaskTimeEndNs() {
      return this.g(.jra.d);
   }

   public long getPermissionStartupTaskTimeStartNs() {
      return this.g(.jra.c);
   }

   public long getShutterButtonFirstDrawnNs() {
      return this.g(.jra.o);
   }

   public long getShutterButtonFirstEnabledNs() {
      return this.g(.jra.p);
   }

   public long getWaitForCameraDevicesTaskTimeEndNs() {
      return this.g(.jra.f);
   }

   public long getWaitForCameraDevicesTaskTimeStartNs() {
      return this.g(.jra.e);
   }

   public void recordActivityOnCreateStart(long var1) {
      this.j(.jra.a, var1, a);
   }
}
