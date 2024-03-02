import com.google.android.apps.lightcycle.panorama.vSAD.IUDuAuCIaH;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class asr {
   public static final Object a = new atv("provider");
   public static final Object b = new atv("provider");
   public static final Object c = new atv("compositionLocalMap");
   public static final Object d = new atv("providerValues");
   public static final Object e = new atv("providers");
   public static final Object f = new atv("reference");

   public static final int a(boolean var0) {
      return var0 ? 1 : 0;
   }

   public static final int b(aus var0, int var1, int var2) {
      byte var4 = 0;
      int var3 = var1;

      for(var1 = var4; var3 > 0 && var3 != var2; ++var1) {
         var3 = var0.e(var3);
      }

      return var1;
   }

   public static final int c(List var0, int var1) {
      int var2 = d(var0, var1);
      var1 = var2;
      if (var2 < 0) {
         var1 = -(var2 + 1);
      }

      return var1;
   }

   public static final int d(List var0, int var1) {
      int var3 = var0.size() - 1;
      int var2 = 0;

      while(var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         int var5 = qwp.a(((atl)var0.get(var4)).a, var1);
         if (var5 < 0) {
            var2 = var4 + 1;
         } else {
            if (var5 <= 0) {
               return var4;
            }

            var3 = var4 - 1;
         }
      }

      return -(var2 + 1);
   }

   public static final atl e(List var0, int var1, int var2) {
      var1 = c(var0, var1);
      if (var1 < var0.size()) {
         atl var3 = (atl)var0.get(var1);
         if (var3.a < var2) {
            return var3;
         }
      }

      return null;
   }

   public static final atl f(List var0, int var1) {
      var1 = d(var0, var1);
      return var1 >= 0 ? (atl)var0.remove(var1) : null;
   }

   public static final void g(aus var0, List var1, int var2) {
      if (var0.w(var2)) {
         var1.add(var0.n(var2));
      } else {
         int var3 = var2 + 1;

         for(int var4 = var0.c(var2); var3 < var2 + var4; var3 += var0.c(var3)) {
            g(var0, var1, var3);
         }

      }
   }

   public static final void h(List var0, int var1, int var2) {
      var1 = c(var0, var1);

      while(var1 < var0.size() && ((atl)var0.get(var1)).a < var2) {
         var0.remove(var1);
      }

   }

   public static final void i(boolean var0) {
      if (!var0) {
         k("Check failed");
         throw new qsc();
      }
   }

   public static final void j(auw var0, asv var1) {
      int var3 = var0.b(var0.b, var0.f(var0.o));
      int[] var4 = var0.b;
      int var2 = var0.o;
      auv var6 = new auv(var3, var0.b(var4, var0.f(var2 + var0.h(var2))), var0);

      while(var6.hasNext()) {
         Object var8 = var6.next();
         if (var8 instanceof asi) {
            asi var7 = (asi)var8;
            var7.getClass();
            List var5 = var1.c;
            Object var9 = var5;
            if (var5 == null) {
               var9 = new ArrayList();
               var1.c = (List)var9;
            }

            ((Collection)var9).add(var7);
         }

         if (var8 instanceof auq) {
            var1.c((auq)var8);
         }

         if (var8 instanceof aug) {
            ((aug)var8).b();
         }
      }

      var0.M();
   }

   public static final void k(String var0) {
      throw new asj(c.aA(var0, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", IUDuAuCIaH.JxNx));
   }
}
