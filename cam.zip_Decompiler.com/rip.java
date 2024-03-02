import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public final class rip {
   private static final String a;
   private static final String b;

   static {
      Object var0;
      label78:
      try {
         var0 = Class.forName("quo").getCanonicalName();
      } catch (Throwable var7) {
         var0 = pwm.br(var7);
         break label78;
      }

      Object var1 = var0;
      if (qsi.a(var0) != null) {
         var1 = zBdGS.tBd;
      }

      a = (String)var1;

      label72:
      try {
         var0 = Class.forName(DzzpnVggahPIX.EiuSiIT).getCanonicalName();
      } catch (Throwable var6) {
         var0 = pwm.br(var6);
         break label72;
      }

      var1 = var0;
      if (qsi.a(var0) != null) {
         var1 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
      }

      b = (String)var1;
   }

   public static final Throwable a(Throwable var0, qur var1) {
      int var2;
      byte var3;
      int var4;
      qsg var16;
      label112: {
         Throwable var5 = var0.getCause();
         var3 = 0;
         if (var5 != null) {
            Class var6 = var0.getClass();
            if (c.E(var5.getClass(), var6)) {
               StackTraceElement[] var17 = var0.getStackTrace();
               var4 = var17.length;

               for(var2 = 0; var2 < var4; ++var2) {
                  if (d(var17[var2])) {
                     var16 = pwm.bq(var5, var17);
                     break label112;
                  }
               }

               var16 = pwm.bq(var0, new StackTraceElement[0]);
               break label112;
            }
         }

         var16 = pwm.bq(var0, new StackTraceElement[0]);
      }

      Throwable var8 = (Throwable)var16.a;
      StackTraceElement[] var9 = (StackTraceElement[])var16.b;
      Throwable var18 = g(var8);
      if (var18 == null) {
         return var0;
      } else {
         ArrayDeque var7 = new ArrayDeque();
         StackTraceElement var10 = var1.el();
         qur var19 = var1;
         if (var10 != null) {
            var7.add(var10);
            var19 = var1;
         }

         while(true) {
            var1 = var19;
            if (!(var19 instanceof qur)) {
               var1 = null;
            }

            if (var1 == null) {
               break;
            }

            var1 = var1.em();
            if (var1 == null) {
               break;
            }

            var10 = var1.el();
            var19 = var1;
            if (var10 != null) {
               var7.add(var10);
               var19 = var1;
            }
         }

         if (var7.isEmpty()) {
            return var0;
         } else {
            if (var8 != var0) {
               var4 = var9.length;
               var2 = 0;

               while(true) {
                  if (var2 >= var4) {
                     var2 = -1;
                     break;
                  }

                  if (d(var9[var2])) {
                     break;
                  }

                  ++var2;
               }

               var4 = var2 + 1;
               var2 = var9.length - 1;
               if (var4 <= var2) {
                  while(true) {
                     StackTraceElement var11 = var9[var2];
                     StackTraceElement var13 = (StackTraceElement)var7.getLast();
                     if (var11.getLineNumber() == var13.getLineNumber() && c.E(var11.getMethodName(), var13.getMethodName()) && c.E(var11.getFileName(), var13.getFileName()) && c.E(var11.getClassName(), var13.getClassName())) {
                        var7.removeLast();
                     }

                     var7.addFirst(var9[var2]);
                     if (var2 == var4) {
                        break;
                     }

                     --var2;
                  }
               }
            }

            var7.addFirst(e());
            StackTraceElement[] var14 = var8.getStackTrace();
            var4 = f(var14, a);
            if (var4 == -1) {
               var18.setStackTrace((StackTraceElement[])var7.toArray(new StackTraceElement[0]));
            } else {
               StackTraceElement[] var12 = new StackTraceElement[var7.size() + var4];

               for(var2 = 0; var2 < var4; ++var2) {
                  var12[var2] = var14[var2];
               }

               Iterator var15 = var7.iterator();

               for(var2 = var3; var15.hasNext(); ++var2) {
                  var12[var2 + var4] = (StackTraceElement)var15.next();
               }

               var18.setStackTrace(var12);
            }

            return var18;
         }
      }
   }

   public static final Throwable b(Throwable var0) {
      if (!qzx.b) {
         return var0;
      } else {
         Throwable var5 = g(var0);
         if (var5 == null) {
            return var0;
         } else {
            StackTraceElement[] var7 = var5.getStackTrace();
            int var4 = var7.length;
            int var3 = f(var7, b);
            int var1 = f(var7, a);
            byte var2 = 0;
            if (var1 == -1) {
               var1 = 0;
            } else {
               var1 = var4 - var1;
            }

            var4 = var4 - var3 - var1;
            StackTraceElement[] var6 = new StackTraceElement[var4];

            for(var1 = var2; var1 < var4; ++var1) {
               StackTraceElement var8;
               if (var1 == 0) {
                  var8 = e();
               } else {
                  var8 = var7[var3 + 1 + var1 - 1];
               }

               var6[var1] = var8;
            }

            var5.setStackTrace(var6);
            return var5;
         }
      }
   }

   public static final Throwable c(Throwable var0) {
      var0.getClass();
      Throwable var3 = var0.getCause();
      if (var3 != null) {
         Class var4 = var0.getClass();
         if (c.E(var3.getClass(), var4)) {
            StackTraceElement[] var5 = var0.getStackTrace();
            int var2 = var5.length;

            for(int var1 = 0; var1 < var2; ++var1) {
               if (d(var5[var1])) {
                  return var3;
               }
            }

            return var0;
         }
      }

      return var0;
   }

   public static final boolean d(StackTraceElement var0) {
      var0.getClass();
      return qwp.B(var0.getClassName(), "\b\b\b");
   }

   public static final StackTraceElement e() {
      return new StackTraceElement("\b\b\b(Coroutine boundary", "\b", "\b", -1);
   }

   private static final int f(StackTraceElement[] var0, String var1) {
      int var3 = var0.length;
      int var2 = 0;

      while(true) {
         if (var2 >= var3) {
            var2 = -1;
            break;
         }

         if (c.E(var1, var0[var2].getClassName())) {
            break;
         }

         ++var2;
      }

      return var2;
   }

   private static final Throwable g(Throwable var0) {
      rhv var2 = rhy.a;
      var0.getClass();
      boolean var1 = var0 instanceof qzn;
      Throwable var7;
      if (var1) {
         Object var6;
         label58:
         try {
            var6 = ((qzn)var0).a();
         } catch (Throwable var5) {
            var6 = pwm.br(var5);
            break label58;
         }

         Object var3 = var6;
         if (var6 instanceof qsh) {
            var3 = null;
         }

         var7 = (Throwable)var3;
      } else {
         var7 = (Throwable)rhy.a.a(var0.getClass()).eo(var0);
      }

      if (var7 == null) {
         return null;
      } else {
         return !var1 && !c.E(var7.getMessage(), var0.getMessage()) ? null : var7;
      }
   }
}
