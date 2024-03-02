public final class bmu implements bmw {
   private final int a;

   public bmu(int var1) {
      this.a = var1;
   }

   public final int a() {
      switch(this.a) {
      case 0:
         return 8;
      default:
         return 16;
      }
   }

   public final void b(bmd var1, long var2, blq var4, boolean var5, boolean var6) {
      switch(this.a) {
      case 0:
         var1.getClass();
         var1.ak(var2, var4, var6);
         return;
      default:
         var1.getClass();
         var1.E(var2, var4, var5, var6);
      }
   }

   public final boolean c(bmd var1) {
      int var2 = this.a;
      boolean var4 = true;
      switch(var2) {
      case 0:
         brl var5 = var1.t();
         boolean var3 = var4;
         if (var5 != null) {
            var3 = var4;
            if (var5.c) {
               var3 = false;
            }
         }

         return var3;
      default:
         return true;
      }
   }

   public final void d(bba var1) {
      switch(this.a) {
      case 0:
         return;
      default:
         axf var5 = null;
         bba var4 = var1;

         while(true) {
            int var3;
            axf var8;
            do {
               if (var4 == null) {
                  return;
               }

               if (var4 instanceof bni) {
                  ((bni)var4).i();
                  var8 = var5;
                  break;
               }

               var8 = var5;
               if ((var4.q & 16) == 0) {
                  break;
               }

               var8 = var5;
               if (!(var4 instanceof blh)) {
                  break;
               }

               var1 = ((blh)var4).A;
               var3 = 0;
               bba var7 = var4;
               var4 = var1;

               bba var9;
               for(var8 = var5; var4 != null; var7 = var9) {
                  axf var6 = var8;
                  int var2 = var3;
                  var9 = var7;
                  if ((var4.q & 16) != 0) {
                     var2 = var3 + 1;
                     if (var2 == 1) {
                        var9 = var4;
                        var6 = var8;
                     } else {
                        var6 = var8;
                        if (var8 == null) {
                           var6 = new axf(new bba[16]);
                        }

                        if (var7 != null) {
                           var6.p(var7);
                        }

                        var6.p(var4);
                        var9 = null;
                     }
                  }

                  var4 = var4.t;
                  var8 = var6;
                  var3 = var2;
               }

               var5 = var8;
               var4 = var7;
            } while(var3 == 1);

            var4 = jj.f(var8);
            var5 = var8;
         }
      }
   }
}
