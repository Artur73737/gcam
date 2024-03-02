public final class rmf extends rlx {
   public final transient byte[][] e;
   public final transient int[] f;

   public rmf(byte[][] var1, int[] var2) {
      super(rlx.a.b);
      this.e = var1;
      this.f = var2;
   }

   private final rlx i() {
      return new rlx(this.h());
   }

   private final Object writeReplace() {
      return this.i();
   }

   public final byte a(int var1) {
      qwp.O((long)this.f[this.e.length - 1], (long)var1, 1L);
      int var3 = qwp.N(this, var1);
      int var2;
      if (var3 == 0) {
         var2 = 0;
      } else {
         var2 = this.f[var3 - 1];
      }

      int[] var5 = this.f;
      byte[][] var6 = this.e;
      int var4 = var5[var6.length + var3];
      return var6[var3][var1 - var2 + var4];
   }

   public final int b() {
      return this.f[this.e.length - 1];
   }

   public final String c() {
      return this.i().c();
   }

   public final boolean e(int var1, byte[] var2, int var3, int var4) {
      var2.getClass();
      boolean var9 = false;
      if (var1 >= 0 && var1 <= this.b() - var4 && var3 >= 0 && var3 <= var2.length - var4) {
         int var6 = var4 + var1;
         int var5 = qwp.N(this, var1);
         var4 = var1;

         for(var1 = var5; var4 < var6; ++var1) {
            if (var1 == 0) {
               var1 = 0;
               var5 = 0;
            } else {
               var5 = this.f[var1 - 1];
            }

            int[] var10 = this.f;
            int var7 = var10[var1];
            int var8 = var10[this.e.length + var1];
            var7 = Math.min(var6, var7 - var5 + var5) - var4;
            if (!qwp.P(this.e[var1], var8 + (var4 - var5), var2, var3, var7)) {
               return var9;
            }

            var3 += var7;
            var4 += var7;
         }

         var9 = true;
      }

      return var9;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (var1 instanceof rlx) {
            rlx var3 = (rlx)var1;
            if (var3.b() == this.b() && this.g(var3, this.b())) {
               return true;
            }
         }

         var2 = false;
      }

      return var2;
   }

   public final byte[] f() {
      return this.h();
   }

   public final boolean g(rlx var1, int var2) {
      var1.getClass();
      int var3 = this.b();
      boolean var9 = false;
      if (var3 - var2 >= 0) {
         var3 = qwp.N(this, 0);
         int var5 = 0;

         for(int var4 = 0; var5 < var2; ++var3) {
            int var6;
            if (var3 == 0) {
               var3 = 0;
               var6 = 0;
            } else {
               var6 = this.f[var3 - 1];
            }

            int[] var10 = this.f;
            int var7 = var10[var3];
            int var8 = var10[this.e.length + var3];
            var7 = Math.min(var2, var7 - var6 + var6) - var5;
            if (!var1.e(var4, this.e[var3], var8 + (var5 - var6), var7)) {
               return var9;
            }

            var4 += var7;
            var5 += var7;
         }

         var9 = true;
      }

      return var9;
   }

   public final byte[] h() {
      byte[] var7 = new byte[this.b()];
      int var5 = this.e.length;
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(int var1 = 0; var2 < var5; var3 = var4) {
         int[] var8 = this.f;
         int var6 = var8[var5 + var2];
         var4 = var8[var2];
         byte[] var9 = this.e[var2];
         var3 = var4 - var3;
         pwm.be(var9, var7, var1, var6, var6 + var3);
         var1 += var3;
         ++var2;
      }

      return var7;
   }

   public final int hashCode() {
      int var1 = super.c;
      if (var1 == 0) {
         int var7 = this.e.length;
         int var4 = 0;
         var1 = 1;

         int var5;
         for(int var3 = 0; var4 < var7; var3 = var5) {
            int[] var8 = this.f;
            int var6 = var8[var7 + var4];
            var5 = var8[var4];
            byte[] var9 = this.e[var4];

            for(int var2 = var6; var2 < var5 - var3 + var6; ++var2) {
               var1 = var1 * 31 + var9[var2];
            }

            ++var4;
         }

         super.c = var1;
      }

      return var1;
   }

   public final String toString() {
      return this.i().toString();
   }
}
