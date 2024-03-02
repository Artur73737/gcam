public final class agc {
   public afw a;
   public aez b;
   public acv c;
   public boolean d;
   public final att e;
   public ip f;
   public prl g;

   public agc(afw var1, aez var2, acv var3, boolean var4, ip var5, prl var6) {
      var1.getClass();
      var2.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.f = var5;
      this.g = var6;
      this.e = sg.d(false);
   }

   private final boolean i() {
      return this.a.c() || this.a.b();
   }

   public final float a(float var1) {
      float var2 = var1;
      if (this.d) {
         var2 = -var1;
      }

      return var2;
   }

   public final float b(long var1) {
      float var3;
      if (this.b == aez.b) {
         var3 = bci.b(var1);
      } else {
         var3 = bci.c(var1);
      }

      return var3;
   }

   public final long c(afj var1, long var2, int var4) {
      var1.getClass();
      if (this.b == aez.b) {
         var2 = bci.k(var2, 1);
      } else {
         var2 = bci.k(var2, 2);
      }

      atd var5 = new atd(this, var4, var1, 1);
      acv var6 = this.c;
      if (c.n(var4, 4)) {
         var2 = ((bci)var5.eo(bci.i(var2))).d;
      } else if (var6 != null && this.i()) {
         var2 = var6.a(var2, var4, var5);
      } else {
         var2 = ((bci)var5.eo(bci.i(var2))).d;
      }

      return var2;
   }

   public final long d(long var1) {
      long var3 = var1;
      if (this.d) {
         var3 = bci.g(var1, -1.0F);
      }

      return var3;
   }

   public final long e(float var1) {
      long var2;
      if (var1 == 0.0F) {
         var2 = bci.a;
      } else if (this.b == aez.b) {
         var2 = es.i(var1, 0.0F);
      } else {
         var2 = es.i(0.0F, var1);
      }

      return var2;
   }

   public final Object f(long var1, que var3) {
      afx var9;
      label22: {
         if (var3 instanceof afx) {
            afx var5 = (afx)var3;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               var9 = var5;
               break label22;
            }
         }

         var9 = new afx(this, var3);
      }

      Object var11 = var9.a;
      qul var6 = qul.a;
      qwy var10;
      switch(var9.c) {
      case 0:
         pwm.bs(var11);
         qwy var12 = new qwy();
         var12.a = var1;
         afw var8 = this.a;
         afz var7 = new afz(this, var12, var1, (que)null);
         var9.d = var12;
         var9.c = 1;
         if (eu.g(var8, var7, var9) == var6) {
            return var6;
         }

         var10 = var12;
         break;
      case 1:
         var10 = var9.d;
         pwm.bs(var11);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      return byb.e(var10.a);
   }

   public final Object g(long var1, que var3) {
      aga var8;
      label41: {
         if (var3 instanceof aga) {
            aga var5 = (aga)var3;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               var8 = var5;
               break label41;
            }
         }

         var8 = new aga(this, var3);
      }

      agc var9;
      label36: {
         Object var6 = var8.a;
         qul var10 = qul.a;
         switch(var8.c) {
         case 0:
            pwm.bs(var6);
            this.h(true);
            if (this.b == aez.b) {
               var1 = byb.f(var1, 0.0F, 0.0F, 1);
            } else {
               var1 = byb.f(var1, 0.0F, 0.0F, 2);
            }

            agb var11 = new agb(this, (que)null);
            acv var7 = this.c;
            if (var7 != null && this.i()) {
               var8.d = this;
               var8.c = 1;
               if (var7.c(var1, var11, var8) == var10) {
                  return var10;
               }
            } else {
               byb var12 = byb.e(var1);
               var8.d = this;
               var8.c = 2;
               if (var11.a(var12, var8) == var10) {
                  return var10;
               }
            }

            var9 = this;
            break label36;
         case 1:
            var9 = var8.d;
            break;
         case 2:
            var9 = var8.d;
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         pwm.bs(var6);
      }

      var9.h(false);
      return qsn.a;
   }

   public final void h(boolean var1) {
      this.e.b(var1);
   }
}
