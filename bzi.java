public final class bzi extends bzf {
   public float a = -1.0F;
   public int as;
   private boolean at;
   public int b = -1;
   public int c = -1;
   public bze d;

   public bzi() {
      this.d = this.L;
      int var1 = 0;
      this.as = 0;
      this.T.clear();
      this.T.add(this.d);

      for(int var2 = this.S.length; var1 < 6; ++var1) {
         this.S[var1] = this.d;
      }

   }

   public final void S(boolean var1) {
      if (super.V != null) {
         int var2 = byv.o(this.d);
         if (this.as == 1) {
            super.aa = var2;
            super.ab = 0;
            this.A(super.V.h());
            this.F(0);
         } else {
            super.aa = 0;
            super.ab = var2;
            this.F(super.V.j());
            this.A(0);
         }
      }
   }

   public final void a(int var1) {
      this.d.e(var1);
      this.at = true;
   }

   public final void b(byv var1, boolean var2) {
      bzf var8 = super.V;
      if (var8 != null) {
         bze var6 = var8.m(bzd.b);
         bze var7 = var8.m(bzd.d);
         bzf var9 = this.V;
         boolean var5 = true;
         boolean var4;
         if (var9 != null && var9.ar[0] == 2) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (this.as == 0) {
            var6 = var8.m(bzd.c);
            var7 = var8.m(bzd.e);
            var8 = this.V;
            if (var8 != null && var8.ar[1] == 2) {
               var4 = var5;
            } else {
               var4 = false;
            }
         }

         byz var11;
         byz var13;
         if (this.at) {
            bze var12 = this.d;
            if (var12.c) {
               var13 = var1.b(var12);
               var1.f(var13, this.d.a());
               if (this.b != -1) {
                  if (var4) {
                     var1.g(var1.b(var7), var13, 0, 5);
                  }
               } else if (this.c != -1 && var4) {
                  var11 = var1.b(var7);
                  var1.g(var13, var1.b(var6), 0, 5);
                  var1.g(var11, var13, 0, 5);
               }

               this.at = false;
               return;
            }
         }

         if (this.b != -1) {
            var13 = var1.b(this.d);
            var1.m(var13, var1.b(var6), this.b, 8);
            if (var4) {
               var1.g(var1.b(var7), var13, 0, 5);
               return;
            }
         } else if (this.c != -1) {
            var13 = var1.b(this.d);
            var11 = var1.b(var7);
            var1.m(var13, var11, -this.c, 8);
            if (var4) {
               var1.g(var13, var1.b(var6), 0, 5);
               var1.g(var11, var13, 0, 5);
               return;
            }
         } else if (this.a != -1.0F) {
            byz var10 = var1.b(this.d);
            var11 = var1.b(var7);
            float var3 = this.a;
            byu var14 = var1.a();
            var14.e.g(var10, -1.0F);
            var14.e.g(var11, var3);
            var1.e(var14);
            return;
         }

      }
   }

   public final void c(int var1) {
      if (this.as != var1) {
         this.as = var1;
         this.T.clear();
         if (this.as == 1) {
            this.d = this.K;
         } else {
            this.d = this.L;
         }

         this.T.add(this.d);
         var1 = this.S.length;

         for(var1 = 0; var1 < 6; ++var1) {
            this.S[var1] = this.d;
         }

      }
   }

   public final boolean d() {
      return true;
   }

   public final boolean e() {
      return this.at;
   }

   public final boolean f() {
      return this.at;
   }

   public final bze m(bzd var1) {
      bzd var2 = bzd.a;
      switch(var1.ordinal()) {
      case 0:
      case 5:
      case 6:
      case 7:
      case 8:
      default:
         break;
      case 1:
      case 3:
         if (this.as == 1) {
            return this.d;
         }
         break;
      case 2:
      case 4:
         if (this.as == 0) {
            return this.d;
         }
      }

      return null;
   }
}
