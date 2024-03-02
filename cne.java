import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class cne extends cnl implements cnj {
   private Application a;
   private final cnj b;
   private Bundle c;
   private clx d;
   private crx e;

   public cne() {
      this.b = new cni();
   }

   public cne(Application var1, cry var2, Bundle var3) {
      this.e = var2.getSavedStateRegistry();
      this.d = var2.getLifecycle();
      this.c = var3;
      this.a = var1;
      cni var4;
      if (var1 != null) {
         if (cni.a == null) {
            cni.a = new cni(var1);
         }

         var4 = cni.a;
         var4.getClass();
      } else {
         var4 = new cni();
      }

      this.b = var4;
   }

   public final cnh a(Class var1) {
      String var2 = var1.getCanonicalName();
      if (var2 != null) {
         return this.c(var2, var1);
      } else {
         throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
      }
   }

   public final cnh b(Class var1, cnp var2) {
      String var4 = (String)var2.a(cnk.d);
      if (var4 == null) {
         throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
      } else {
         cnh var6;
         if (var2.a(cnb.a) != null && var2.a(cnb.b) != null) {
            Application var5 = (Application)var2.a(cni.b);
            boolean var3 = clh.class.isAssignableFrom(var1);
            Constructor var7;
            if (var3 && var5 != null) {
               var7 = cnf.b(var1, cnf.a);
            } else {
               var7 = cnf.b(var1, cnf.b);
            }

            if (var7 == null) {
               return this.b.b(var1, var2);
            }

            if (var3 && var5 != null) {
               var6 = cnf.a(var1, var7, var5, cnb.a(var2));
            } else {
               var6 = cnf.a(var1, var7, cnb.a(var2));
            }
         } else {
            if (this.d == null) {
               throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }

            var6 = this.c(var4, var1);
         }

         return var6;
      }
   }

   public final cnh c(String var1, Class var2) {
      clx var6 = this.d;
      if (var6 == null) {
         throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
      } else {
         boolean var3 = clh.class.isAssignableFrom(var2);
         Constructor var4;
         if (var3 && this.a != null) {
            var4 = cnf.b(var2, cnf.a);
         } else {
            var4 = cnf.b(var2, cnf.b);
         }

         cnh var31;
         if (var4 == null) {
            if (this.a != null) {
               var31 = this.b.a(var2);
            } else {
               var31 = ckn.b().a(var2);
            }

            return var31;
         } else {
            cmz var35;
            label374: {
               crx var7 = this.e;
               var7.getClass();
               Bundle var8 = this.c;
               Bundle var5 = var7.a(var1);
               Class[] var9 = cmx.a;
               var35 = new cmz(var1, civ.e(var5, var8));
               var35.b(var7, var6);
               cir.f(var7, var6);
               if (var3) {
                  Application var30 = this.a;
                  if (var30 != null) {
                     var31 = cnf.a(var2, var4, var30, var35.a);
                     break label374;
                  }
               }

               var31 = cnf.a(var2, var4, var35.a);
            }

            Map var34 = var31.h;
            synchronized(var34){}

            Object var32;
            label384: {
               Throwable var10000;
               boolean var10001;
               label385: {
                  try {
                     var32 = var31.h.get("androidx.lifecycle.savedstate.vm.tag");
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     break label385;
                  }

                  if (var32 == null) {
                     try {
                        var31.h.put("androidx.lifecycle.savedstate.vm.tag", var35);
                     } catch (Throwable var28) {
                        var10000 = var28;
                        var10001 = false;
                        break label385;
                     }
                  }

                  label360:
                  try {
                     break label384;
                  } catch (Throwable var27) {
                     var10000 = var27;
                     var10001 = false;
                     break label360;
                  }
               }

               while(true) {
                  Throwable var33 = var10000;

                  try {
                     throw var33;
                  } catch (Throwable var26) {
                     var10000 = var26;
                     var10001 = false;
                     continue;
                  }
               }
            }

            if (var32 == null) {
               var32 = var35;
            }

            if (var31.j) {
               cnh.g(var32);
            }

            return var31;
         }
      }
   }

   public final void d(cnh var1) {
      clx var3 = this.d;
      if (var3 != null) {
         crx var2 = this.e;
         var2.getClass();
         cir.e(var1, var2, var3);
      }

   }
}
