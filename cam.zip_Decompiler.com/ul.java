import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

public final class ul {
   public static final lg a = new lg();
   private final nl b;
   private final blj c;
   private final bpe d;
   private final nwu e;
   private final lmk f;

   public ul(nwu var1, blj var2, bpe var3, nl var4, lmk var5) {
      var2.getClass();
      var4.getClass();
      var5.getClass();
      super();
      this.e = var1;
      this.c = var2;
      this.d = var3;
      this.b = var4;
      this.f = var5;
   }

   public final Object a(String var1, qvt var2, que var3) {
      int var6;
      uk var30;
      label616: {
         if (var3 instanceof uk) {
            uk var13 = (uk)var3;
            var6 = var13.d;
            if ((var6 & Integer.MIN_VALUE) != 0) {
               var13.d = var6 + Integer.MIN_VALUE;
               var30 = var13;
               break label616;
            }
         }

         var30 = new uk(this, var3);
      }

      uf var45;
      label610: {
         Object var33 = var30.b;
         qul var14 = qul.a;
         int var7;
         long var8;
         long var10;
         boolean var12;
         String var17;
         qul var18;
         ul var27;
         qul var28;
         Object var29;
         qwx var34;
         ul var37;
         Object var40;
         StringBuilder var41;
         nwu var42;
         nl var44;
         lg var46;
         lmk var48;
         switch(var30.d) {
         case 0:
            pwm.bs(var33);
            var8 = SystemClock.elapsedRealtimeNanos();
            var34 = new qwx();
            qvt var38 = var2;
            var28 = var14;
            qvt var36 = var38;
            var6 = var34.a + 1;
            var34.a = var6;
            var42 = this.e;
            var30.e = this;
            var30.f = var1;
            var30.h = (ou)var38;
            var30.g = var34;
            var30.a = var8;
            var30.d = 1;
            var40 = var42.y(var1, var6, var8, var30);
            if (var40 == var28) {
               return var28;
            }

            var18 = var28;
            var37 = this;
            var1 = var1;
            var29 = var36;
            var14 = var18;
            var45 = (uf)var40;
            var44 = this.b;
            var10 = SystemClock.elapsedRealtimeNanos() - var8;
            if (var45.a != null) {
               return var45;
            }

            if (var45.b == null) {
               break label610;
            }

            (Boolean)((qvt)var29).eo(qsn.a);
            var46 = a;
            var7 = var45.b.a;
            var6 = var34.a;
            var48 = this.f;

            try {
               Trace.beginSection("DevicePolicyManager#getCameraDisabled");
               var12 = ((DevicePolicyManager)var48.a).getCameraDisabled((ComponentName)null);
               break;
            } catch (Throwable var25) {
               Trace.endSection();
            }
         case 1:
            var8 = var30.a;
            qwx var47 = var30.g;
            var29 = var30.h;
            var1 = var30.f;
            var37 = var30.e;
            pwm.bs(var33);
            var40 = var33;
            var34 = var47;
            var45 = (uf)var40;
            var44 = var37.b;
            var10 = SystemClock.elapsedRealtimeNanos() - var8;
            if (var45.a != null) {
               return var45;
            }

            if (var45.b == null) {
               break label610;
            }

            (Boolean)((qvt)var29).eo(qsn.a);
            var46 = a;
            var7 = var45.b.a;
            var6 = var34.a;
            var48 = var37.f;

            try {
               Trace.beginSection("DevicePolicyManager#getCameraDisabled");
               var12 = ((DevicePolicyManager)var48.a).getCameraDisabled((ComponentName)null);
               break;
            } catch (Throwable var24) {
               Trace.endSection();
            }
         case 2:
            var8 = var30.a;
            qwx var15 = var30.g;
            ou var16 = var30.h;
            var17 = var30.f;
            var27 = var30.e;
            pwm.bs(var33);
            var28 = var14;
            ou var35 = var16;
            var40 = var33;
            var34 = var15;
            if (!(Boolean)var40) {
               var41 = new StringBuilder();
               var41.append("Timeout expired, retrying camera open for camera ");
               var41.append(qu.b(var17));
            }

            var6 = var15.a + 1;
            var15.a = var6;
            var42 = var27.e;
            var30.e = var27;
            var30.f = var17;
            var30.h = (ou)var35;
            var30.g = var15;
            var30.a = var8;
            var30.d = 1;
            var40 = var42.y(var17, var6, var8, var30);
            if (var40 == var28) {
               return var28;
            }

            var18 = var28;
            var37 = var27;
            var1 = var17;
            var29 = var35;
            var14 = var18;
            var45 = (uf)var40;
            var44 = var37.b;
            var10 = SystemClock.elapsedRealtimeNanos() - var8;
            if (var45.a != null) {
               return var45;
            }

            if (var45.b == null) {
               break label610;
            }

            (Boolean)((qvt)var29).eo(qsn.a);
            var46 = a;
            var7 = var45.b.a;
            var6 = var34.a;
            var48 = var37.f;

            try {
               Trace.beginSection("DevicePolicyManager#getCameraDisabled");
               var12 = ((DevicePolicyManager)var48.a).getCameraDisabled((ComponentName)null);
               break;
            } catch (Throwable var26) {
               Trace.endSection();
            }
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         while(true) {
            StringBuilder var49;
            if (var10 == 10000000000L) {
               if (c.n(var7, 1)) {
                  var12 = true;
               } else if (c.n(var7, 2)) {
                  var12 = true;
               } else if (c.n(var7, 3)) {
                  if (var12) {
                     if (var6 <= 1) {
                        var12 = true;
                     } else {
                        var12 = false;
                     }
                  } else {
                     var12 = true;
                  }
               } else if (c.n(var7, 4)) {
                  var12 = true;
               } else if (c.n(var7, 5)) {
                  var12 = true;
               } else if (c.n(var7, 6)) {
                  var12 = true;
               } else if (c.n(var7, 7)) {
                  var12 = true;
               } else if (c.n(var7, 8)) {
                  if (var6 <= 1) {
                     var12 = true;
                  } else {
                     var12 = false;
                  }
               } else if (c.n(var7, 10)) {
                  var12 = false;
               } else {
                  var49 = new StringBuilder();
                  var49.append("Unexpected CameraError: ");
                  var49.append(var46);
                  Log.e("CXCP", "Unexpected CameraError: ".concat(var46.toString()));
                  var12 = false;
               }
            } else if (var10 >= 10000000000L) {
               var12 = false;
            } else if (c.n(var7, 1)) {
               var12 = true;
            } else if (c.n(var7, 2)) {
               var12 = true;
            } else if (c.n(var7, 3)) {
               if (var12) {
                  if (var6 <= 1) {
                     var12 = true;
                  } else {
                     var12 = false;
                  }
               } else {
                  var12 = true;
               }
            } else if (c.n(var7, 4)) {
               var12 = true;
            } else if (c.n(var7, 5)) {
               var12 = true;
            } else if (c.n(var7, 6)) {
               var12 = true;
            } else if (c.n(var7, 7)) {
               var12 = true;
            } else if (c.n(var7, 8)) {
               if (var6 <= 1) {
                  var12 = true;
               } else {
                  var12 = false;
               }
            } else if (c.n(var7, 10)) {
               var12 = false;
            } else {
               var49 = new StringBuilder();
               var49.append("Unexpected CameraError: ");
               var49.append(var46);
               Log.e("CXCP", "Unexpected CameraError: ".concat(var46.toString()));
               var12 = false;
            }

            double var4;
            nl var31;
            StringBuilder var32;
            Object var39;
            String var43;
            ul var50;
            bpe var51;
            Object var52;
            qul var53;
            if (var12) {
               if (var34.a > 1) {
                  var37.c.k(var1, var45.b.a, var12);
                  if (!var12) {
                     var32 = new StringBuilder();
                     var32.append("Failed to open camera ");
                     var32.append(qu.b(var1));
                     var32.append(" after ");
                     var32.append(var34.a);
                     var32.append(" attempts and ");
                     var31 = var37.b;
                     var4 = (double)(SystemClock.elapsedRealtimeNanos() - var8);
                     Double.isNaN(var4);
                     var1 = String.format((Locale)null, "%.3f ms", Arrays.copyOf(new Object[]{quy.c(var4 / 1000000.0D)}, 1));
                     var1.getClass();
                     var32.append(var1);
                     var32.append(". Last error was ");
                     var32.append(var45.b);
                     var32.append('.');
                     Log.e("CXCP", var32.toString());
                     return var45;
                  }

                  var51 = var37.d;
                  var6 = var45.b.a;
                  var30.e = var37;
                  var30.f = var1;
                  var30.h = (ou)var29;
                  var30.g = var34;
                  var30.a = var8;
                  var30.d = 2;
                  var52 = var51.j(var1, 500L, var30);
                  if (var52 == var14) {
                     return var14;
                  }

                  var50 = var37;
                  var53 = var14;
                  var39 = var29;
                  var43 = var1;
                  var27 = var50;
                  var28 = var53;
                  if (!(Boolean)var52) {
                     var41 = new StringBuilder();
                     var41.append("Timeout expired, retrying camera open for camera ");
                     var41.append(qu.b(var43));
                  }
               } else {
                  var51 = var37.d;
                  var6 = var45.b.a;
                  var30.e = var37;
                  var30.f = var1;
                  var30.h = (ou)var29;
                  var30.g = var34;
                  var30.a = var8;
                  var30.d = 2;
                  var52 = var51.j(var1, 500L, var30);
                  if (var52 == var14) {
                     return var14;
                  }

                  var50 = var37;
                  var53 = var14;
                  var39 = var29;
                  var43 = var1;
                  var27 = var50;
                  var28 = var53;
                  if (!(Boolean)var52) {
                     var41 = new StringBuilder();
                     var41.append("Timeout expired, retrying camera open for camera ");
                     var41.append(qu.b(var43));
                  }
               }
            } else {
               var37.c.k(var1, var45.b.a, var12);
               if (!var12) {
                  var32 = new StringBuilder();
                  var32.append("Failed to open camera ");
                  var32.append(qu.b(var1));
                  var32.append(" after ");
                  var32.append(var34.a);
                  var32.append(" attempts and ");
                  var31 = var37.b;
                  var4 = (double)(SystemClock.elapsedRealtimeNanos() - var8);
                  Double.isNaN(var4);
                  var1 = String.format((Locale)null, "%.3f ms", Arrays.copyOf(new Object[]{quy.c(var4 / 1000000.0D)}, 1));
                  var1.getClass();
                  var32.append(var1);
                  var32.append(". Last error was ");
                  var32.append(var45.b);
                  var32.append('.');
                  Log.e("CXCP", var32.toString());
                  return var45;
               }

               var51 = var37.d;
               var6 = var45.b.a;
               var30.e = var37;
               var30.f = var1;
               var30.h = (ou)var29;
               var30.g = var34;
               var30.a = var8;
               var30.d = 2;
               var52 = var51.j(var1, 500L, var30);
               if (var52 == var14) {
                  return var14;
               }

               var50 = var37;
               var53 = var14;
               var39 = var29;
               var43 = var1;
               var27 = var50;
               var28 = var53;
               if (!(Boolean)var52) {
                  var41 = new StringBuilder();
                  var41.append("Timeout expired, retrying camera open for camera ");
                  var41.append(qu.b(var43));
               }
            }

            var6 = var34.a + 1;
            var34.a = var6;
            var42 = var27.e;
            var30.e = var27;
            var30.f = var43;
            var30.h = (ou)var39;
            var30.g = var34;
            var30.a = var8;
            var30.d = 1;
            var40 = var42.y(var43, var6, var8, var30);
            if (var40 == var28) {
               return var28;
            }

            var17 = var43;
            var18 = var28;
            var37 = var27;
            var1 = var17;
            var29 = var39;
            var14 = var18;
            var45 = (uf)var40;
            var44 = var37.b;
            var10 = SystemClock.elapsedRealtimeNanos() - var8;
            if (var45.a != null) {
               return var45;
            }

            if (var45.b == null) {
               break;
            }

            (Boolean)((qvt)var29).eo(qsn.a);
            var46 = a;
            var7 = var45.b.a;
            var6 = var34.a;
            var48 = var37.f;

            try {
               Trace.beginSection("DevicePolicyManager#getCameraDisabled");
               var12 = ((DevicePolicyManager)var48.a).getCameraDisabled((ComponentName)null);
            } finally {
               Trace.endSection();
            }
         }
      }

      Log.w("CXCP", "Camera open failed without an error. The CameraGraph may have been stopped or closed. Abandoning the camera open attempt.");
      return var45;
   }
}
