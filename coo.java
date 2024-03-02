public final class coo {
   private final byte[] a;
   private final int b;
   private int c;
   private int d;

   public coo(byte[] var1, int var2, int var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
      this.d = 0;
      this.g();
   }

   private final void g() {
      int var1 = this.c;
      boolean var4 = false;
      boolean var3 = var4;
      if (var1 >= 0) {
         label15: {
            int var2 = this.b;
            if (var1 >= var2) {
               var3 = var4;
               if (var1 != var2) {
                  break label15;
               }

               var3 = var4;
               if (this.d != 0) {
                  break label15;
               }
            }

            var3 = true;
         }
      }

      cav.f(var3);
   }

   private final boolean h(int var1) {
      if (var1 >= 2 && var1 < this.b) {
         byte[] var2 = this.a;
         if (var2[var1] == 3 && var2[var1 - 2] == 0 && var2[var1 - 1] == 0) {
            return true;
         }
      }

      return false;
   }

   public final int a(int var1) {
      this.d += var1;
      int var2 = 0;

      while(true) {
         int var5 = this.d;
         byte var3 = 2;
         byte[] var7;
         if (var5 <= 8) {
            var7 = this.a;
            int var6 = this.c;
            byte var8 = var7[var6];
            if (var5 == 8) {
               this.d = 0;
               if (!this.h(var6 + 1)) {
                  var3 = 1;
               }

               this.c = var6 + var3;
            }

            this.g();
            return -1 >>> 32 - var1 & (var2 | (var8 & 255) >> 8 - var5);
         }

         var5 -= 8;
         this.d = var5;
         var7 = this.a;
         int var4 = this.c;
         var2 |= (var7[var4] & 255) << var5;
         if (!this.h(var4 + 1)) {
            var3 = 1;
         }

         this.c = var4 + var3;
      }
   }

   public final int b() {
      int var2 = 0;

      int var1;
      for(var1 = 0; !this.f(); ++var1) {
      }

      if (var1 > 0) {
         var2 = this.a(var1);
      }

      return (1 << var1) - 1 + var2;
   }

   public final int c() {
      int var2 = this.b();
      byte var1 = 1;
      if (var2 % 2 == 0) {
         var1 = -1;
      }

      return var1 * ((var2 + 1) / 2);
   }

   public final void d() {
      int var2 = this.d;
      byte var1 = 1;
      ++var2;
      this.d = var2;
      if (var2 == 8) {
         this.d = 0;
         var2 = this.c;
         if (this.h(var2 + 1)) {
            var1 = 2;
         }

         this.c = var2 + var1;
      }

      this.g();
   }

   public final void e(int var1) {
      int var2 = this.c;
      int var4 = var1 / 8;
      int var3 = var2 + var4;
      this.c = var3;
      var4 = this.d + (var1 - var4 * 8);
      this.d = var4;
      var1 = var2;
      if (var4 > 7) {
         this.c = var3 + 1;
         this.d = var4 - 8;
         var1 = var2;
      }

      while(true) {
         var2 = var1 + 1;
         if (var2 > this.c) {
            this.g();
            return;
         }

         var1 = var2;
         if (this.h(var2)) {
            ++this.c;
            var1 = var2 + 2;
         }
      }
   }

   public final boolean f() {
      byte var2 = this.a[this.c];
      int var1 = this.d;
      this.d();
      return (var2 & 128 >> var1) != 0;
   }
}
