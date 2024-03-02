import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public abstract class quo implements Serializable, que, qur {
   public final que m;

   public quo(que var1) {
      this.m = var1;
   }

   protected abstract Object b(Object var1);

   public que c(Object var1, que var2) {
      throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
   }

   public StackTraceElement el() {
      qus var6 = (qus)this.getClass().getAnnotation(qus.class);
      StackTraceElement var3 = null;
      String var5 = null;
      if (var6 != null) {
         int var1 = var6.a();
         if (var1 > 1) {
            throw new IllegalStateException(c.aK(var1, "Debug metadata version mismatch. Expected: 1, got ", ". Please update the Kotlin standard library."));
         }

         byte var2 = -1;

         Object var13;
         label87: {
            label86: {
               label95: {
                  Integer var14;
                  boolean var10001;
                  label84: {
                     try {
                        Field var12 = this.getClass().getDeclaredField("label");
                        var12.setAccessible(true);
                        var13 = var12.get(this);
                        if (var13 instanceof Integer) {
                           var14 = (Integer)var13;
                           break label84;
                        }
                     } catch (Exception var11) {
                        var10001 = false;
                        break label95;
                     }

                     var14 = null;
                  }

                  if (var14 == null) {
                     var1 = 0;
                     break label86;
                  }

                  try {
                     var1 = var14;
                     break label86;
                  } catch (Exception var10) {
                     var10001 = false;
                  }
               }

               var1 = -1;
               break label87;
            }

            --var1;
         }

         if (var1 < 0) {
            var1 = var2;
         } else {
            var1 = var6.e()[var1];
         }

         fnu var4 = qut.b;
         fnu var17 = var4;
         if (var4 == null) {
            try {
               Method var8 = Class.class.getDeclaredMethod(DzzpnVggahPIX.DfUcyLgZm);
               Method var7 = this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor");
               Method var15 = this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name");
               var17 = new fnu(var8, var7, var15);
               qut.b = var17;
            } catch (Exception var9) {
               var17 = qut.a;
               qut.b = var17;
            }
         }

         String var19;
         if (var17 == qut.a) {
            var19 = var5;
         } else {
            Object var20 = var17.c;
            Object var18;
            if (var20 != null) {
               Class var16 = this.getClass();
               var18 = ((Method)var20).invoke(var16);
            } else {
               var18 = null;
            }

            if (var18 == null) {
               var19 = var5;
            } else {
               var20 = var17.a;
               if (var20 != null) {
                  var18 = ((Method)var20).invoke(var18);
               } else {
                  var18 = null;
               }

               if (var18 == null) {
                  var19 = var5;
               } else {
                  var13 = var17.b;
                  if (var13 != null) {
                     var18 = ((Method)var13).invoke(var18);
                  } else {
                     var18 = null;
                  }

                  var19 = var5;
                  if (var18 instanceof String) {
                     var19 = (String)var18;
                  }
               }
            }
         }

         if (var19 == null) {
            var19 = var6.b();
         } else {
            var5 = var6.b();
            StringBuilder var21 = new StringBuilder();
            var21.append(var19);
            var21.append("/");
            var21.append(var5);
            var19 = var21.toString();
         }

         var3 = new StackTraceElement(var19, var6.d(), var6.c(), var1);
      }

      return var3;
   }

   public qur em() {
      que var1 = this.m;
      return var1 instanceof qur ? (qur)var1 : null;
   }

   protected void f() {
   }

   public final void gP(Object var1) {
      Object var2 = this;

      do {
         var2.getClass();
         quo var3 = (quo)var2;
         var2 = var3.m;
         var2.getClass();

         label43: {
            qul var4;
            try {
               var1 = var3.b(var1);
               var4 = qul.a;
            } catch (Throwable var6) {
               var1 = pwm.br(var6);
               break label43;
            }

            if (var1 == var4) {
               return;
            }
         }

         var3.f();
      } while(var2 instanceof quo);

      ((que)var2).gP(var1);
   }

   public String toString() {
      Object var1 = this.el();
      if (var1 == null) {
         var1 = this.getClass().getName();
      }

      StringBuilder var2 = new StringBuilder();
      var2.append("Continuation at ");
      var2.append(var1);
      return "Continuation at ".concat(String.valueOf(var1));
   }
}
