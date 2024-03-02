import java.util.Arrays;

public class rfl extends rgg implements rfg, ree {
   public Object[] a;
   public long b;
   public long c;
   private final int f;
   private final int g;
   private int h;
   private int i;
   private final int j;

   public rfl(int var1, int var2, int var3) {
      this.f = var1;
      this.g = var2;
      this.j = var3;
   }

   // $FF: synthetic method
   public static Object e(rfl param0, ref param1, que param2) {
      // $FF: Couldn't be decompiled
   }

   private final int m() {
      return (int)(this.d() + (long)this.h - this.b);
   }

   private final int n() {
      return this.h + this.i;
   }

   private final long o() {
      return this.d() + (long)this.h;
   }

   private final long p(rfn var1) {
      long var2 = var1.a;
      if (var2 < this.o()) {
         return var2;
      } else if (this.g > 0) {
         return -1L;
      } else if (var2 > this.d()) {
         return -1L;
      } else {
         return this.i == 0 ? -1L : var2;
      }
   }

   private final void q() {
      Object[] var7 = this.a;
      var7.getClass();
      rfm.b(var7, this.d(), (Object)null);
      --this.h;
      long var5 = this.d() + 1L;
      if (this.b < var5) {
         this.b = var5;
      }

      if (this.c < var5) {
         if (super.e != 0) {
            rgi[] var9 = super.d;
            if (var9 != null) {
               for(int var1 = 0; var1 < var9.length; ++var1) {
                  rgi var8 = var9[var1];
                  if (var8 != null) {
                     rfn var10 = (rfn)var8;
                     long var3 = var10.a;
                     if (var3 >= 0L && var3 < var5) {
                        var10.a = var5;
                     }
                  }
               }
            }
         }

         this.c = var5;
      }

      boolean var2 = qzx.a;
   }

   private final void r(Object var1) {
      int var3 = this.n();
      Object[] var5 = this.a;
      Object[] var4;
      if (var5 == null) {
         var4 = this.u((Object[])null, 0, 2);
      } else {
         int var2 = var5.length;
         var4 = var5;
         if (var3 >= var2) {
            var4 = this.u(var5, var3, var2 + var2);
         }
      }

      rfm.b(var4, this.d() + (long)var3, var1);
   }

   private final void s(long var1, long var3, long var5, long var7) {
      long var11 = Math.min(var3, var1);
      boolean var13 = qzx.a;

      for(long var9 = this.d(); var9 < var11; ++var9) {
         Object[] var14 = this.a;
         var14.getClass();
         rfm.b(var14, var9, (Object)null);
      }

      this.b = var1;
      this.c = var3;
      this.h = (int)(var5 - var11);
      this.i = (int)(var7 - var5);
   }

   private final boolean t(Object var1) {
      int var2;
      if (super.e == 0) {
         boolean var3 = qzx.a;
         if (this.f != 0) {
            this.r(var1);
            var2 = this.h + 1;
            this.h = var2;
            if (var2 > this.f) {
               this.q();
            }

            this.c = this.d() + (long)this.h;
         }

         return true;
      } else {
         if (this.h >= this.g && this.c <= this.b) {
            switch(this.j - 1) {
            case 0:
               return false;
            }
         }

         this.r(var1);
         var2 = this.h + 1;
         this.h = var2;
         if (var2 > this.g) {
            this.q();
         }

         if (this.m() > this.f) {
            long var8 = this.b;
            long var10 = this.c;
            long var12 = this.o();
            long var6 = this.d();
            long var4 = (long)this.h;
            this.s(1L + var8, var10, var12, (long)this.i + var6 + var4);
         }

         return true;
      }
   }

   private final Object[] u(Object[] var1, int var2, int var3) {
      if (var3 <= 0) {
         IllegalStateException var9 = new IllegalStateException("Buffer size overflow");
         throw var9;
      } else {
         Object[] var8 = new Object[var3];
         this.a = var8;
         if (var1 == null) {
            return var8;
         } else {
            long var6 = this.d();

            for(var3 = 0; var3 < var2; ++var3) {
               long var4 = (long)var3 + var6;
               rfm.b(var8, var4, rfm.a(var1, var4));
            }

            return var8;
         }
      }
   }

   private final que[] v(que[] var1) {
      Object var5 = var1;
      if (super.e != 0) {
         rgi[] var6 = super.d;
         var5 = var1;
         if (var6 != null) {
            int var3 = ((Object[])var1).length;
            int var2 = 0;

            while(true) {
               var5 = var1;
               if (var2 >= var6.length) {
                  break;
               }

               rgi var7 = var6[var2];
               int var4 = var3;
               var5 = var1;
               if (var7 != null) {
                  rfn var9 = (rfn)var7;
                  que var8 = var9.b;
                  var4 = var3;
                  var5 = var1;
                  if (var8 != null) {
                     var4 = var3;
                     var5 = var1;
                     if (this.p(var9) >= 0L) {
                        var4 = ((Object[])var1).length;
                        var5 = var1;
                        if (var3 >= var4) {
                           var5 = Arrays.copyOf((Object[])var1, Math.max(2, var4 + var4));
                           var5.getClass();
                        }

                        ((que[])var5)[var3] = var8;
                        var9.b = null;
                        var4 = var3 + 1;
                     }
                  }
               }

               ++var2;
               var3 = var4;
               var1 = var5;
            }
         }
      }

      return (que[])var5;
   }

   public final Object a(Object var1, que var2) {
      Object var14;
      if (this.c(var1)) {
         var14 = qsn.a;
      } else {
         qza var9 = new qza(quy.h(var2), 1);
         var9.r();
         que[] var8 = rgh.a;
         synchronized(this){}
         boolean var11 = false;

         rfj var7;
         que[] var13;
         label121: {
            label120: {
               try {
                  var11 = true;
                  if (this.t(var1)) {
                     var9.gP(qsn.a);
                     var13 = this.v(var8);
                     var11 = false;
                     break label120;
                  }

                  long var5 = this.d();
                  var7 = new rfj(this, (long)this.n() + var5, var1, var9);
                  this.r(var7);
                  ++this.i;
                  if (this.g == 0) {
                     var13 = this.v(var8);
                     var11 = false;
                     break label121;
                  }

                  var11 = false;
               } finally {
                  if (var11) {
                     ;
                  }
               }

               var13 = var8;
               break label121;
            }

            var7 = null;
         }

         if (var7 != null) {
            qwp.L(var9, var7);
         }

         int var4 = var13.length;

         for(int var3 = 0; var3 < var4; ++var3) {
            que var15 = var13[var3];
            if (var15 != null) {
               var15.gP(qsn.a);
            }
         }

         Object var16 = var9.c();
         qul var17 = qul.a;
         if (var16 == var17) {
            var2.getClass();
         }

         var1 = var16;
         if (var16 != var17) {
            var1 = qsn.a;
         }

         var14 = var1;
         if (var1 != var17) {
            return qsn.a;
         }
      }

      return var14;
   }

   public final boolean c(Object var1) {
      que[] var5 = rgh.a;
      synchronized(this){}

      int var2;
      boolean var4;
      que[] var13;
      label117: {
         Throwable var10000;
         label121: {
            boolean var10001;
            try {
               var4 = this.t(var1);
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label121;
            }

            var2 = 0;
            if (!var4) {
               var4 = false;
               var13 = var5;
               break label117;
            }

            try {
               var13 = this.v(var5);
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label121;
            }

            var4 = true;
            break label117;
         }

         Throwable var12 = var10000;
         throw var12;
      }

      for(int var3 = var13.length; var2 < var3; ++var2) {
         que var14 = var13[var2];
         if (var14 != null) {
            var14.gP(qsn.a);
         }
      }

      return var4;
   }

   public final long d() {
      return Math.min(this.c, this.b);
   }

   protected final Object f() {
      Object[] var1 = this.a;
      var1.getClass();
      return rfm.a(var1, this.b + (long)this.m() - 1L);
   }

   public final Object gY(ref var1, que var2) {
      return e(this, var1, var2);
   }

   public final void h() {
      if (this.g != 0 || this.i > 1) {
         Object[] var1 = this.a;
         var1.getClass();

         while(this.i > 0 && rfm.a(var1, this.d() + (long)this.n() - 1L) == rfm.a) {
            --this.i;
            rfm.b(var1, this.d() + (long)this.n(), (Object)null);
         }

      }
   }

   public final que[] i(long var1) {
      boolean var16 = qzx.a;
      if (var1 > this.c) {
         return rgh.a;
      } else {
         long var14 = this.d();
         var1 = (long)this.h + var14;
         if (this.g == 0 && this.i > 0) {
            ++var1;
         }

         int var3 = super.e;
         int var4 = 0;
         long var6;
         long var8;
         if (var3 != 0) {
            rgi[] var17 = super.d;
            if (var17 != null) {
               var3 = 0;

               while(true) {
                  var6 = var1;
                  if (var3 >= var17.length) {
                     break;
                  }

                  rgi var18 = var17[var3];
                  var6 = var1;
                  if (var18 != null) {
                     var8 = ((rfn)var18).a;
                     var6 = var1;
                     if (var8 >= 0L) {
                        if (var8 >= var1) {
                           var6 = var1;
                        } else {
                           var6 = var8;
                        }
                     }
                  }

                  ++var3;
                  var1 = var6;
               }
            } else {
               var6 = var1;
            }
         } else {
            var6 = var1;
         }

         if (var6 <= this.c) {
            return rgh.a;
         } else {
            var8 = this.o();
            if (super.e > 0) {
               var3 = Math.min(this.i, this.g - (int)(var8 - var6));
            } else {
               var3 = this.i;
            }

            que[] var21 = rgh.a;
            var1 = (long)this.i + var8;
            long var10;
            long var12;
            Object[] var22;
            if (var3 > 0) {
               var21 = new que[var3];
               var22 = this.a;
               var22.getClass();
               var10 = var8;
               var8 = var8;

               while(true) {
                  if (var10 >= var1) {
                     var10 = var1;
                     var1 = var8;
                     var8 = var10;
                     break;
                  }

                  Object var20 = rfm.a(var22, var10);
                  riq var19 = rfm.a;
                  if (var20 != var19) {
                     var20.getClass();
                     int var5 = var4 + 1;
                     rfj var23 = (rfj)var20;
                     var12 = var1;
                     var21[var4] = var23.d;
                     rfm.b(var22, var10, var19);
                     rfm.b(var22, var8, var23.c);
                     ++var8;
                     if (var5 >= var3) {
                        var1 = var8;
                        var8 = var12;
                        break;
                     }

                     var4 = var5;
                  }

                  ++var10;
               }
            } else {
               var10 = var1;
               var1 = var8;
               var8 = var10;
            }

            if (super.e == 0) {
               var6 = var1;
            }

            label61: {
               var10 = Math.max(this.b, var1 - (long)Math.min(this.f, (int)(var1 - var14)));
               if (this.g == 0 && var10 < var8) {
                  var22 = this.a;
                  var22.getClass();
                  if (c.E(rfm.a(var22, var10), rfm.a)) {
                     var12 = var1 + 1L;
                     var1 = var10 + 1L;
                     break label61;
                  }
               }

               var12 = var1;
               var1 = var10;
            }

            this.s(var1, var6, var12, var8);
            this.h();
            return var21.length == 0 ? var21 : this.v(var21);
         }
      }
   }
}
