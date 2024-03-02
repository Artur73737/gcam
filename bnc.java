public final class bnc {
   public final Object a;
   public Object b;

   public bnc() {
      this.a = new axf(new bmd[16]);
   }

   public bnc(qza var1) {
      this.a = var1;
      this.b = null;
   }

   public bnc(vj var1) {
      this.a = var1;
   }

   public final void a(bmd var1) {
      int var2 = var1.ag();
      byte var4 = 0;
      int var3;
      if (var2 == 5 && !var1.Z() && !var1.ac() && var1.d()) {
         bmr var6 = var1.n;
         if ((var6.a() & 256) != 0) {
            for(bba var7 = var6.e; var7 != null; var7 = var7.t) {
               if ((var7.q & 256) != 0) {
                  bba var10 = var7;
                  axf var9 = null;

                  label77:
                  while(true) {
                     axf var14;
                     do {
                        if (var10 == null) {
                           break label77;
                        }

                        if (var10 instanceof bln) {
                           bln var15 = (bln)var10;
                           var15.f(jj.i(var15, 256));
                           var14 = var9;
                           break;
                        }

                        var14 = var9;
                        if ((var10.q & 256) == 0) {
                           break;
                        }

                        var14 = var9;
                        if (!(var10 instanceof blh)) {
                           break;
                        }

                        bba var8 = ((blh)var10).A;
                        var3 = 0;

                        for(var14 = var9; var8 != null; var3 = var2) {
                           bba var16 = var10;
                           axf var11 = var14;
                           var2 = var3;
                           if ((var8.q & 256) != 0) {
                              var2 = var3 + 1;
                              if (var2 == 1) {
                                 var16 = var8;
                                 var11 = var14;
                              } else {
                                 var9 = var14;
                                 if (var14 == null) {
                                    var9 = new axf(new bba[16]);
                                 }

                                 if (var10 != null) {
                                    var9.p(var10);
                                 }

                                 var9.p(var8);
                                 var6 = null;
                                 var11 = var9;
                                 var16 = var6;
                              }
                           }

                           var8 = var8.t;
                           var10 = var16;
                           var14 = var11;
                        }

                        var9 = var14;
                     } while(var3 == 1);

                     var10 = jj.f(var14);
                     var9 = var14;
                  }
               }

               if ((var7.r & 256) == 0) {
                  break;
               }
            }
         }
      }

      var1.q = false;
      axf var12 = var1.m();
      int var5 = var12.b;
      if (var5 > 0) {
         Object[] var13 = var12.a;
         var2 = var4;

         do {
            this.a((bmd)var13[var2]);
            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var5);
      }

   }

   public final void b(bmd var1) {
      var1.getClass();
      ((axf)this.a).p(var1);
      var1.q = true;
   }
}
