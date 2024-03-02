public final class abi extends bba implements bll {
   public long a;
   public bdr b;
   private bcl c;
   private bxy d;
   private bdr e;
   private bdn f;

   public abi(long var1, bdr var3) {
      this.a = var1;
      this.b = var3;
   }

   // $FF: synthetic method
   public final void es() {
   }

   public final void eu(bmf var1) {
      if (this.b == bdm.a) {
         if (!c.o(this.a, bcy.f)) {
            gf.n(var1, this.a, 0L, 0, 126);
         }
      } else {
         bdn var11;
         if (bcl.f(var1.j(), this.c) && var1.k() == this.d && c.E(this.e, this.b)) {
            var11 = this.f;
            var11.getClass();
         } else {
            var11 = this.b.a(var1.j(), var1.k(), var1);
         }

         if (!c.o(this.a, bcy.f)) {
            long var5 = this.a;
            bex var12 = bex.a;
            var11.getClass();
            if (var11 instanceof bdh) {
               bcj var13 = ((bdh)var11).a;
               var1.q(var5, es.i(var13.b, var13.c), et.k(var13.b(), var13.a()), 1.0F, var12, 3);
            } else if (var11 instanceof bdi) {
               bdi var14 = (bdi)var11;
               bbf var15 = var14.b;
               if (var15 != null) {
                  var1.r(var15, var5, var12);
               } else {
                  bck var16 = var14.a;
                  float var2 = bcg.a(var16.h);
                  long var9 = es.i(var16.a, var16.b);
                  long var3 = et.k(var16.b(), var16.a());
                  long var7 = es.k(var2, var2);
                  bet var17 = var1.a;
                  var17.a.c.l(bci.b(var9), bci.c(var9), bci.b(var9) + bcl.c(var3), bci.c(var9) + bcl.a(var3), bcg.a(var7), bcg.b(var7), bet.o(var17, var5, var12, 1.0F, 3));
               }
            } else {
               if (!(var11 instanceof bdg)) {
                  throw new qse();
               }

               var1.r(((bdg)var11).a, var5, var12);
            }
         }

         this.f = var11;
         this.c = bcl.d(var1.j());
         this.d = var1.k();
         this.e = this.b;
      }

      var1.l();
   }
}
