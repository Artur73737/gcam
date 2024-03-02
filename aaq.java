public final class aaq implements aan {
   private final zi a;
   private zh b;
   private zh c;
   private zh d;

   public aaq(zi var1) {
      this.a = var1;
   }

   public aaq(zq var1) {
      this((zi)(new aap(var1)));
   }

   public final long a(zh var1, zh var2, zh var3) {
      var1.getClass();
      var2.getClass();
      qtj var7 = qxb.p(0, var1.b()).a();

      int var4;
      long var5;
      for(var5 = 0L; var7.a; var5 = Math.max(var5, this.a.a(var4).e(var1.a(var4), var2.a(var4), var3.a(var4)))) {
         var4 = var7.a();
      }

      return var5;
   }

   public final zh b(zh var1, zh var2, zh var3) {
      var1.getClass();
      var2.getClass();
      if (this.d == null) {
         this.d = do.y(var3);
      }

      zh var7 = this.d;
      zh var6 = var7;
      if (var7 == null) {
         qwp.b("endVelocityVector");
         var6 = null;
      }

      int var5 = var6.b();

      for(int var4 = 0; var4 < var5; ++var4) {
         var7 = this.d;
         var6 = var7;
         if (var7 == null) {
            qwp.b("endVelocityVector");
            var6 = null;
         }

         var6.e(var4, this.a.a(var4).b(var1.a(var4), var2.a(var4), var3.a(var4)));
      }

      var1 = this.d;
      if (var1 == null) {
         qwp.b("endVelocityVector");
         return null;
      } else {
         return var1;
      }
   }

   public final zh c(long var1, zh var3, zh var4, zh var5) {
      var3.getClass();
      var4.getClass();
      if (this.b == null) {
         this.b = do.y(var3);
      }

      zh var9 = this.b;
      zh var8 = var9;
      if (var9 == null) {
         qwp.b("valueVector");
         var8 = null;
      }

      int var7 = var8.b();

      for(int var6 = 0; var6 < var7; ++var6) {
         var9 = this.b;
         var8 = var9;
         if (var9 == null) {
            qwp.b("valueVector");
            var8 = null;
         }

         var8.e(var6, this.a.a(var6).c(var1, var3.a(var6), var4.a(var6), var5.a(var6)));
      }

      var3 = this.b;
      if (var3 == null) {
         qwp.b("valueVector");
         return null;
      } else {
         return var3;
      }
   }

   public final zh d(long var1, zh var3, zh var4, zh var5) {
      var3.getClass();
      var4.getClass();
      if (this.c == null) {
         this.c = do.y(var5);
      }

      zh var9 = this.c;
      zh var8 = var9;
      if (var9 == null) {
         qwp.b("velocityVector");
         var8 = null;
      }

      int var7 = var8.b();

      for(int var6 = 0; var6 < var7; ++var6) {
         var9 = this.c;
         var8 = var9;
         if (var9 == null) {
            qwp.b("velocityVector");
            var8 = null;
         }

         var8.e(var6, this.a.a(var6).d(var1, var3.a(var6), var4.a(var6), var5.a(var6)));
      }

      var3 = this.c;
      if (var3 == null) {
         qwp.b("velocityVector");
         return null;
      } else {
         return var3;
      }
   }
}
