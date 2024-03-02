import org.brotli.wrapper.dec.Hm.CLzmcq;

public final class rii {
   public static final riq a = new riq("REMOVE_FROZEN");
   public final qyp b;
   private final int c;
   private final boolean d;
   private final int e;
   private final qyq f;
   private final nlz g;

   public rii(int var1, boolean var2) {
      this.c = var1;
      this.d = var2;
      int var3 = var1 - 1;
      this.e = var3;
      this.f = qwp.i((Object)null);
      this.b = qwp.h(0L);
      this.g = qxb.y(var1);
      String var4 = CLzmcq.dpvE;
      if (var3 <= 1073741823) {
         if ((var1 & var3) != 0) {
            throw new IllegalStateException(var4);
         }
      } else {
         throw new IllegalStateException(var4);
      }
   }

   public final int a(Object var1) {
      qyp var7 = this.b;

      while(true) {
         long var5 = var7.b;
         if ((3458764513820540928L & var5) != 0L) {
            if ((2305843009213693952L & var5) != 0L) {
               return 2;
            }

            return 1;
         }

         int var4 = this.e;
         int var2 = (int)((var5 & 1152921503533105152L) >> 30);
         int var3 = (int)(1073741823L & var5);
         if ((var2 + 2 & var4) == (var3 & var4)) {
            return 1;
         }

         if (!this.d && this.g.k(var2 & var4).a != null) {
            var4 = this.c;
            if (var4 < 1024 || (var2 - var3 & 1073741823) > var4 >> 1) {
               return 1;
            }
         } else if (this.b.d(var5, qwo.v(var5, 1152921503533105152L) | (long)(var2 + 1 & 1073741823) << 30)) {
            this.g.k(var2 & var4).c(var1);
            rii var8 = this;

            while((var8.b.b & 1152921504606846976L) != 0L) {
               rii var9 = var8.c();
               Object var10 = var9.g.k(var9.e & var2).a;
               if (var10 instanceof rih && ((rih)var10).a == var2) {
                  var9.g.k(var9.e & var2).c(var1);
               } else {
                  var9 = null;
               }

               var8 = var9;
               if (var9 == null) {
                  break;
               }
            }

            return 0;
         }
      }
   }

   public final Object b() {
      qyp var10 = this.b;

      while(true) {
         long var6 = var10.b;
         if ((var6 & 1152921504606846976L) != 0L) {
            return a;
         }

         int var4 = this.e;
         int var2 = (int)((1152921503533105152L & var6) >> 30);
         int var1 = (int)(var6 & 1073741823L);
         int var3 = var1 & var4;
         if ((var2 & var4) == var3) {
            return null;
         }

         Object var9 = this.g.k(var3).a;
         if (var9 == null) {
            if (this.d) {
               return null;
            }
         } else {
            if (var9 instanceof rih) {
               return null;
            }

            qyp var8 = this.b;
            var2 = var1 + 1 & 1073741823;
            if (var8.d(var6, qwo.w(var6, var2))) {
               this.g.k(this.e & var1).c((Object)null);
               return var9;
            }

            if (this.d) {
               rii var11 = this;

               label38:
               do {
                  var10 = var11.b;

                  do {
                     var6 = var10.b;
                     boolean var5 = qzx.a;
                     if ((var6 & 1152921504606846976L) != 0L) {
                        var11 = var11.c();
                        continue label38;
                     }
                  } while(!var11.b.d(var6, qwo.w(var6, var2)));

                  var1 = (int)(var6 & 1073741823L);
                  var11.g.k(var1 & var11.e).c((Object)null);
                  var11 = null;
               } while(var11 != null);

               return var9;
            }
         }
      }
   }

   public final rii c() {
      qyp var8 = this.b;

      long var4;
      while(true) {
         var4 = var8.b;
         if ((var4 & 1152921504606846976L) != 0L) {
            break;
         }

         long var6 = var4 | 1152921504606846976L;
         if (var8.d(var4, var6)) {
            var4 = var6;
            break;
         }
      }

      qyq var10 = this.f;

      while(true) {
         rii var13 = (rii)var10.a;
         if (var13 != null) {
            return var13;
         }

         qyq var11 = this.f;
         int var1 = this.c;
         rii var12 = new rii(var1 + var1, this.d);
         var1 = (int)(1073741823L & var4);

         while(true) {
            int var2 = this.e;
            int var3 = var1 & var2;
            if (var3 == (var2 & (int)((1152921503533105152L & var4) >> 30))) {
               var12.b.b = qwo.v(var4, 1152921504606846976L);
               var11.d((Object)null, var12);
               break;
            }

            Object var9 = this.g.k(var3).a;
            Object var14 = var9;
            if (var9 == null) {
               var14 = new rih(var1);
            }

            var12.g.k(var12.e & var1).c(var14);
            ++var1;
         }
      }
   }

   public final boolean d() {
      qyp var3 = this.b;

      long var1;
      do {
         var1 = var3.b;
         if ((var1 & 2305843009213693952L) != 0L) {
            return true;
         }

         if ((1152921504606846976L & var1) != 0L) {
            return false;
         }
      } while(!var3.d(var1, 2305843009213693952L | var1));

      return true;
   }

   public final boolean e() {
      long var1 = this.b.b;
      return (int)(1073741823L & var1) == (int)((var1 & 1152921503533105152L) >> 30);
   }
}
