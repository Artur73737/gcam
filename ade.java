public final class ade extends bba implements blu {
   public aez a;
   public afw b;
   public boolean c;
   public acz d;
   public bjf e;
   public boolean f;
   public long g;
   public boolean h;
   public final ahe i;
   public final lmk j;
   private bjf k;
   private bcj l;

   public ade(aez var1, afw var2, boolean var3, acz var4) {
      var1.getClass();
      var2.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.j = new lmk((short[])null, (byte[])null, (byte[])null);
      this.g = 0L;
      this.i = new ahe(((acx)this.d).a);
   }

   // $FF: synthetic method
   public static final void j(ade var0) {
      var0.f = false;
   }

   // $FF: synthetic method
   public static boolean k(ade var0, bcj var1) {
      return var0.l(var1, var0.g);
   }

   private final boolean l(bcj var1, long var2) {
      var2 = this.d(var1, var2);
      return Math.abs(bci.b(var2)) <= 0.5F && Math.abs(bci.c(var2)) <= 0.5F;
   }

   public final float a() {
      if (c.o(this.g, 0L)) {
         return 0.0F;
      } else {
         axf var8 = (axf)this.j.a;
         int var2 = var8.b;
         Object var11 = null;
         long var4;
         Object var9;
         Object var14;
         aez var15;
         if (var2 > 0) {
            Object[] var12 = var8.a;
            --var2;
            var9 = null;

            int var3;
            do {
               Object var10 = ((ada)var12[var2]).a.a();
               var14 = var9;
               if (var10 != null) {
                  long var6 = ((bcj)var10).d();
                  var4 = car.J(this.g);
                  var15 = this.a;
                  aez var13 = aez.a;
                  switch(var15.ordinal()) {
                  case 0:
                     var3 = Float.compare(bcl.a(var6), bcl.a(var4));
                     break;
                  case 1:
                     var3 = Float.compare(bcl.c(var6), bcl.c(var4));
                     break;
                  default:
                     throw new qse();
                  }

                  if (var3 > 0) {
                     var14 = var9;
                     if (var9 == null) {
                        var14 = var10;
                     }
                     break;
                  }

                  var14 = var10;
               }

               var3 = var2 - 1;
               var2 = var3;
               var9 = var14;
            } while(var3 >= 0);
         } else {
            var14 = null;
         }

         var9 = var14;
         if (var14 == null) {
            bcj var18;
            if (this.f) {
               var18 = this.f();
            } else {
               var18 = (bcj)var11;
            }

            if (var18 == null) {
               return 0.0F;
            }

            var9 = var18;
         }

         var4 = car.J(this.g);
         aez var16 = this.a;
         var15 = aez.a;
         float var1;
         bcj var17;
         acz var19;
         switch(var16.ordinal()) {
         case 0:
            var19 = this.d;
            var17 = (bcj)var9;
            var1 = var17.c;
            var1 = var19.a(var1, var17.e - var1, bcl.a(var4));
            break;
         case 1:
            var19 = this.d;
            var17 = (bcj)var9;
            var1 = var17.b;
            var1 = var19.a(var1, var17.d - var1, bcl.c(var4));
            break;
         default:
            throw new qse();
         }

         return var1;
      }
   }

   public final long d(bcj var1, long var2) {
      var2 = car.J(var2);
      aez var6 = this.a;
      aez var5 = aez.a;
      float var4;
      acz var7;
      switch(var6.ordinal()) {
      case 0:
         var7 = this.d;
         var4 = var1.c;
         var2 = es.i(0.0F, var7.a(var4, var1.e - var4, bcl.a(var2)));
         break;
      case 1:
         var7 = this.d;
         var4 = var1.b;
         var2 = es.i(var7.a(var4, var1.d - var4, bcl.c(var2)), 0.0F);
         break;
      default:
         throw new qse();
      }

      return var2;
   }

   public final bcj f() {
      bjf var2 = this.k;
      if (var2 != null) {
         bjf var1 = var2;
         if (!var2.k()) {
            var1 = null;
         }

         if (var1 != null) {
            bjf var3 = this.e;
            if (var3 != null) {
               var2 = var3;
               if (!var3.k()) {
                  var2 = null;
               }

               if (var2 != null) {
                  return var1.h(var2, false);
               }
            }
         }
      }

      return null;
   }

   public final void g(bjf var1) {
      this.k = var1;
   }

   public final void h(long var1) {
      long var4 = this.g;
      this.g = var1;
      aez var7 = this.a;
      aez var6 = aez.a;
      int var3;
      switch(var7.ordinal()) {
      case 0:
         var3 = qwp.a(bxx.a(var1), bxx.a(var4));
         break;
      case 1:
         var3 = qwp.a(bxx.b(var1), bxx.b(var4));
         break;
      default:
         throw new qse();
      }

      if (var3 < 0) {
         bcj var10 = this.f();
         if (var10 != null) {
            bcj var8 = this.l;
            bcj var9 = var8;
            if (var8 == null) {
               var9 = var10;
            }

            if (!this.h && !this.f && this.l(var9, var4) && !this.l(var10, var1)) {
               this.f = true;
               this.i();
            }

            this.l = var10;
         }

      }
   }

   public final void i() {
      if (!this.h) {
         qwo.o(this.o(), (qui)null, 4, new add(this, (que)null), 1);
      } else {
         throw new IllegalStateException("launchAnimation called when previous animation was running");
      }
   }
}
