public final class bkd {
   public static bxy a;
   public static int b;
   public static bjf c;
   public static bml d;
   public static final bkd e = new bkd();

   static {
      a = bxy.a;
   }

   public static boolean a(bmn var0) {
      boolean var1;
      if (var0 == null) {
         c = null;
         d = null;
         var1 = false;
      } else {
         boolean var2;
         label23: {
            var1 = var0.i;
            bmn var4 = var0.F();
            if (var4 != null) {
               boolean var3 = var4.i;
               var2 = true;
               if (var3) {
                  var0.i = true;
                  break label23;
               }
            }

            var2 = var1;
         }

         d = var0.D().o;
         if (!var2 && !var0.h) {
            c = var0.B();
         } else {
            c = null;
         }
      }

      return var1;
   }

   // $FF: synthetic method
   public static void b(bke var0, int var1, int var2) {
      var0.getClass();
      long var5 = var0.e;
      int var4 = bxw.a(var5);
      int var3 = bxw.b(var5);
      var5 = car.K(var1, var2);
      var1 = bxw.b(var5);
      var0.r(car.K(bxw.a(var5) + var4, var1 + var3), (qvt)null);
   }

   public static final void c(bke var0, long var1) {
      var0.getClass();
      long var6 = var0.e;
      int var3 = bxw.a(var6);
      int var5 = bxw.b(var6);
      int var4 = bxw.b(var1);
      var0.r(car.K(bxw.a(var1) + var3, var4 + var5), (qvt)null);
   }

   public static final void d(bke var0, int var1, int var2, qvt var3) {
      var3.getClass();
      long var6 = var0.e;
      int var4 = bxw.a(var6);
      int var5 = bxw.b(var6);
      var6 = car.K(var1, var2);
      var1 = bxw.b(var6);
      var0.r(car.K(bxw.a(var6) + var4, var1 + var5), var3);
   }

   // $FF: synthetic method
   public static void e(bke var0, int var1, int var2) {
      var0.getClass();
      long var9 = car.K(var1, var2);
      long var7;
      if (a != bxy.a) {
         int var4 = b;
         if (var4 != 0) {
            int var3 = var0.a;
            int var5 = bxw.a(var9);
            int var6 = bxw.b(var9);
            var7 = var0.e;
            var2 = bxw.a(var7);
            var1 = bxw.b(var7);
            var7 = car.K(var4 - var3 - var5, var6);
            var3 = bxw.b(var7);
            var0.r(car.K(bxw.a(var7) + var2, var3 + var1), (qvt)null);
            return;
         }
      }

      var7 = var0.e;
      var0.r(car.K(bxw.a(var9) + bxw.a(var7), bxw.b(var9) + bxw.b(var7)), (qvt)null);
   }

   // $FF: synthetic method
   public static void f(bke var0, int var1, int var2) {
      qvt var11 = bkf.a;
      var0.getClass();
      long var9 = car.K(var1, var2);
      long var7;
      if (a != bxy.a) {
         int var3 = b;
         if (var3 != 0) {
            int var5 = var0.a;
            int var4 = bxw.a(var9);
            int var6 = bxw.b(var9);
            var7 = var0.e;
            var2 = bxw.a(var7);
            var1 = bxw.b(var7);
            var7 = car.K(var3 - var5 - var4, var6);
            var3 = bxw.b(var7);
            var0.r(car.K(bxw.a(var7) + var2, var3 + var1), var11);
            return;
         }
      }

      var7 = var0.e;
      var0.r(car.K(bxw.a(var9) + bxw.a(var7), bxw.b(var9) + bxw.b(var7)), var11);
   }

   // $FF: synthetic method
   public static void g(bke var0, int var1, int var2, qvt var3, int var4) {
      if ((var4 & 8) != 0) {
         var3 = bkf.a;
      }

      d(var0, var1, var2, var3);
   }
}
