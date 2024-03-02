public final class atc extends baj {
   public static final Object a = new Object();
   public int b;
   public int c;
   public Object d;
   public int e;
   public dhq f;

   public atc() {
      this.d = a;
   }

   public final baj a() {
      return new atc();
   }

   public final void b(baj var1) {
      var1.getClass();
      atc var2 = (atc)var1;
      this.f = var2.f;
      this.d = var2.d;
      this.e = var2.e;
   }

   public final Object[] c() {
      dhq var1 = this.f;
      if (var1 != null) {
         Object var2 = var1.b;
         if (var2 != null) {
            return (Object[])var2;
         }
      }

      return new Object[0];
   }

   public final int d(azk var1) {
      Object var9 = azp.b;
      synchronized(var9){}

      dhq var10;
      try {
         var10 = this.f;
      } finally {
         ;
      }

      byte var3 = 7;
      int var2 = var3;
      int var56;
      if (var10 != null) {
         label689: {
            axf var11 = avg.c();
            int var7 = var11.b;
            byte var6 = 0;
            byte var5 = 0;
            int var4;
            Object[] var58;
            if (var7 > 0) {
               var58 = var11.a;
               var2 = 0;

               do {
                  ((atf)var58[var2]).b();
                  var4 = var2 + 1;
                  var2 = var4;
               } while(var4 < var7);
            }

            Throwable var10000;
            label679: {
               boolean var10001;
               try {
                  var7 = var10.a;
               } catch (Throwable var53) {
                  var10000 = var53;
                  var10001 = false;
                  break label679;
               }

               var4 = 0;
               var2 = var3;

               while(true) {
                  if (var4 >= var7) {
                     int var57 = var11.b;
                     var56 = var2;
                     if (var57 <= 0) {
                        return var56;
                     }

                     Object[] var55 = var11.a;
                     var56 = var5;

                     do {
                        ((atf)var55[var56]).a();
                        var4 = var56 + 1;
                        var56 = var4;
                     } while(var4 < var57);
                     break label689;
                  }

                  int var8;
                  bai var59;
                  try {
                     var9 = ((Object[])var10.b)[var4];
                     var9.getClass();
                     var8 = ((Number)((Object[])var10.c)[var4]).intValue();
                     var59 = (bai)var9;
                  } catch (Throwable var51) {
                     var10000 = var51;
                     var10001 = false;
                     break;
                  }

                  var56 = var2;
                  if (var8 == 1) {
                     label654: {
                        try {
                           if (var59 instanceof ate) {
                              ate var60 = (ate)var59;
                              var9 = var60.b((atc)azp.f(var60.c, var1), var1, false, var60.a);
                              break label654;
                           }
                        } catch (Throwable var52) {
                           var10000 = var52;
                           var10001 = false;
                           break;
                        }

                        try {
                           var9 = azp.f(var59.c(), var1);
                        } catch (Throwable var50) {
                           var10000 = var50;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var8 = System.identityHashCode(var9);
                        var56 = ((baj)var9).g;
                     } catch (Throwable var49) {
                        var10000 = var49;
                        var10001 = false;
                        break;
                     }

                     var56 += (var2 * 31 + var8) * 31;
                  }

                  ++var4;
                  var2 = var56;
               }
            }

            Throwable var54 = var10000;
            var56 = var11.b;
            if (var56 > 0) {
               var58 = var11.a;
               var2 = var6;

               while(true) {
                  ((atf)var58[var2]).a();
                  ++var2;
                  if (var2 < var56) {
                     continue;
                  }
               }
            }

            throw var54;
         }
      }

      var56 = var2;
      return var56;
   }

   public final boolean e(azk var1) {
      Object var5 = azp.b;
      synchronized(var5){}

      boolean var19;
      boolean var4;
      label199: {
         Throwable var10000;
         label203: {
            boolean var10001;
            int var2;
            int var3;
            try {
               var2 = this.b;
               var3 = var1.u();
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label203;
            }

            var4 = false;
            if (var2 != var3) {
               var19 = true;
               break label199;
            }

            try {
               var2 = this.c;
               var3 = var1.h();
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label203;
            }

            if (var2 != var3) {
               var19 = true;
            } else {
               var19 = false;
            }
            break label199;
         }

         Throwable var18 = var10000;
         throw var18;
      }

      if (this.d != a) {
         if (var19) {
            if (this.e == this.d(var1)) {
               var4 = true;
            }
         } else {
            var4 = true;
         }
      }

      if (var4 && var19) {
         var5 = azp.b;
         synchronized(var5){}

         try {
            this.b = var1.u();
            this.c = var1.h();
         } finally {
            ;
         }
      }

      return var4;
   }
}
