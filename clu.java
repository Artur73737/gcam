import java.util.Map;

public final class clu {
   public static final clv a(clw var0) {
      var0.getClass();
      clw var1 = clw.a;
      switch(var0.ordinal()) {
      case 2:
         return clv.ON_DESTROY;
      case 3:
         return clv.ON_STOP;
      case 4:
         return clv.ON_PAUSE;
      default:
         return null;
      }
   }

   public static final clv b(clw var0) {
      var0.getClass();
      clw var1 = clw.a;
      switch(var0.ordinal()) {
      case 1:
         return clv.ON_CREATE;
      case 2:
         return clv.ON_START;
      case 3:
         return clv.ON_RESUME;
      default:
         return null;
      }
   }

   public static final cnh c(Class var0, gfv var1, cnj var2, cnp var3) {
      String var4 = var0.getCanonicalName();
      if (var4 != null) {
         return d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(var4), var0, var1, var2, var3);
      } else {
         throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
      }
   }

   public static final cnh d(String var0, Class var1, gfv var2, cnj var3, cnp var4) {
      cnh var5 = var2.x(var0);
      if (var1.isInstance(var5)) {
         cnl var8;
         if (var3 instanceof cnl) {
            var8 = (cnl)var3;
         } else {
            var8 = null;
         }

         if (var8 != null) {
            var5.getClass();
            var8.d(var5);
         }

         var5.getClass();
         return var5;
      } else {
         cnr var10 = new cnr(var4);
         var10.b(cnk.d, var0);

         cnh var9;
         label28: {
            cnh var11;
            try {
               var11 = var3.b(var1, var10);
            } catch (AbstractMethodError var6) {
               var9 = var3.a(var1);
               break label28;
            }

            var9 = var11;
         }

         var9.getClass();
         cnh var7 = (cnh)((Map)var2.a).put(var0, var9);
         if (var7 != null) {
            var7.d();
         }

         return var9;
      }
   }
}
