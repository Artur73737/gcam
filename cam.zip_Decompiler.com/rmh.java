import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public final class rmh {
   public static final int a = 0;

   static {
      qwp.Q(DzzpnVggahPIX.KScomnXr);
   }

   public static final boolean a(rmd var0, int var1, byte[] var2, int var3) {
      var0.getClass();
      var2.getClass();
      int var5 = var0.c;
      byte[] var9 = var0.a;

      rmd var8;
      for(int var4 = 1; var4 < var3; var0 = var8) {
         int var6 = var5;
         var8 = var0;
         int var7 = var1;
         if (var1 == var5) {
            var8 = var0.f;
            var8.getClass();
            byte[] var10 = var8.a;
            var7 = var8.b;
            var6 = var8.c;
            var9 = var10;
         }

         if (var9[var7] != var2[var4]) {
            return false;
         }

         var1 = var7 + 1;
         ++var4;
         var5 = var6;
      }

      return true;
   }
}
