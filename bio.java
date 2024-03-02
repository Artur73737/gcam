import java.util.List;

public final class bio {
   public static final int a = 0;
   private static final att b = sg.d(false);

   public static final float a(float[] var0, float[] var1) {
      int var4 = var0.length;
      int var3 = 0;

      float var2;
      for(var2 = 0.0F; var3 < var4; ++var3) {
         var2 += var0[var3] * var1[var3];
      }

      return var2;
   }

   public static final void b(bin var0, bhw var1) {
      var0.getClass();
      var1.getClass();
      boolean var9 = c();
      byte var3 = 0;
      int var2 = 0;
      long var5;
      if (var9) {
         if (iy.l(var1)) {
            var0.b = 0L;
            var0.a = var1.c;
            var0.b();
         } else {
            if (!iy.n(var1) && !iy.l(var1)) {
               var0.b = var1.b;
               if (var1.a().isEmpty()) {
                  var5 = bci.e(var1.c, var0.a);
                  var5 = bci.f(var0.a, var5);
                  var0.a = var5;
                  var0.a(var1.b, var5);
               } else {
                  List var13 = var1.a();

                  for(int var12 = var13.size(); var2 < var12; ++var2) {
                     bhg var14 = (bhg)var13.get(var2);
                     var5 = bci.e(var14.b, var0.a);
                     var5 = bci.f(var0.a, var5);
                     var0.a = var5;
                     var0.a(var14.a, var5);
                  }
               }
            }

            if (iy.n(var1) && var1.b - var0.b > 40L) {
               var0.b();
            }

         }
      } else {
         if (iy.l(var1)) {
            var0.a = var1.c;
            var0.b();
         }

         var5 = var1.g;
         List var11 = var1.a();
         int var4 = var11.size();

         for(var2 = var3; var2 < var4; ++var2) {
            bhg var10 = (bhg)var11.get(var2);
            long var7 = bci.e(var10.b, var5);
            var5 = var10.b;
            var7 = bci.f(var0.a, var7);
            var0.a = var7;
            var0.a(var10.a, var7);
         }

         var5 = bci.e(var1.c, var5);
         var5 = bci.f(var0.a, var5);
         var0.a = var5;
         var0.a(var1.b, var5);
      }
   }

   public static final boolean c() {
      return (Boolean)b.a();
   }
}
