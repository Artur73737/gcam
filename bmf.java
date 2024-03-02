public final class bmf implements bev {
   public final bet a;
   private bll b;

   public bmf() {
      this((byte[])null);
   }

   // $FF: synthetic method
   public bmf(byte[] var1) {
      bet var2 = new bet();
      super();
      this.a = var2;
   }

   public final float a() {
      return this.a.a();
   }

   public final float b() {
      return this.a.b();
   }

   public final float eF(float var1) {
      return car.P(this.a, var1);
   }

   public final float eG(int var1) {
      return car.Q(this.a, var1);
   }

   public final float eH(long var1) {
      return car.R(this.a, var1);
   }

   public final float eI(float var1) {
      return car.S(this.a, var1);
   }

   public final int eJ(float var1) {
      return car.T(this.a, var1);
   }

   public final long eK(long var1) {
      return car.U(this.a, var1);
   }

   public final long i() {
      return et.l(this.a.b.a());
   }

   public final long j() {
      return gf.l(this.a);
   }

   public final bxy k() {
      return this.a.k();
   }

   public final void l() {
      bcw var10 = this.m().b();
      bll var7 = this.b;
      var7.getClass();
      bba var5 = var7.n().t;
      int var1;
      bba var6;
      if (var5 == null) {
         var5 = null;
      } else {
         label88: {
            var6 = var5;
            if ((var5.r & 4) != 0) {
               while(var6 != null) {
                  var1 = var6.q;
                  if ((var1 & 2) != 0) {
                     break;
                  }

                  var5 = var6;
                  if ((var1 & 4) != 0) {
                     break label88;
                  }

                  var6 = var6.t;
               }
            }

            var5 = null;
         }
      }

      bmz var15;
      if (var5 == null) {
         bmz var14 = jj.i(var7, 4);
         var15 = var14;
         if (var14.t() == var7.n()) {
            var15 = var14.o;
            var15.getClass();
         }

         var15.y(var10);
      } else {
         axf var11 = null;
         bba var13 = var5;

         while(true) {
            int var2;
            axf var12;
            do {
               if (var13 == null) {
                  return;
               }

               if (var13 instanceof bll) {
                  var7 = (bll)var13;
                  var10.getClass();
                  var15 = jj.i(var7, 4);
                  long var3 = car.J(var15.c);
                  var15.n.o().n(var10, var3, var15, var7);
                  var12 = var11;
                  break;
               }

               var12 = var11;
               if ((var13.q & 4) == 0) {
                  break;
               }

               var12 = var11;
               if (!(var13 instanceof blh)) {
                  break;
               }

               bba var9 = ((blh)var13).A;
               var2 = 0;
               var12 = var11;
               bba var8 = var13;

               axf var17;
               for(var6 = var9; var6 != null; var12 = var17) {
                  var13 = var8;
                  var1 = var2;
                  var17 = var12;
                  if ((var6.q & 4) != 0) {
                     var1 = var2 + 1;
                     if (var1 == 1) {
                        var13 = var6;
                        var17 = var12;
                     } else {
                        axf var16 = var12;
                        if (var12 == null) {
                           var16 = new axf(new bba[16]);
                        }

                        if (var8 != null) {
                           var16.p(var8);
                        }

                        var16.p(var6);
                        var5 = null;
                        var17 = var16;
                        var13 = var5;
                     }
                  }

                  var6 = var6.t;
                  var8 = var13;
                  var2 = var1;
               }

               var13 = var8;
               var11 = var12;
            } while(var2 == 1);

            var13 = jj.f(var12);
            var11 = var12;
         }
      }
   }

   public final bes m() {
      return this.a.b;
   }

   public final void n(bcw var1, long var2, bmz var4, bll var5) {
      bll var11 = this.b;
      this.b = var5;
      bet var12 = this.a;
      bxy var14 = var4.j();
      ber var13 = var12.a;
      bxr var8 = var13.a;
      bxy var9 = var13.b;
      bcw var10 = var13.c;
      long var6 = var13.d;
      var13.b(var4);
      var13.c(var14);
      var13.a(var1);
      var13.d = var2;
      var1.e();
      var5.eu(this);
      var1.d();
      ber var15 = var12.a;
      var15.b(var8);
      var15.c(var9);
      var15.a(var10);
      var15.d = var6;
      this.b = var11;
   }

   public final void q(long var1, long var3, long var5, float var7, gf var8, int var9) {
      var8.getClass();
      this.a.q(var1, var3, var5, var7, var8, var9);
   }

   public final void r(bbf var1, long var2, gf var4) {
      bet var5 = this.a;
      var5.a.c.q(var1, bet.o(var5, var2, var4, 1.0F, 3));
   }

   public final void s(bbf var1, bcu var2, float var3, gf var4) {
      var1.getClass();
      var4.getClass();
      this.a.s(var1, var2, var3, var4);
   }

   public final void t(dmx var1, long var2, long var4, long var6, long var8, float var10, gf var11, dmw var12, int var13, int var14) {
      var11.getClass();
      this.a.t(var1, var2, var4, var6, var8, var10, var11, var12, var13, var14);
   }
}
