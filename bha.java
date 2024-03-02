public final class bha extends bba implements bkr, bgv, blg {
   private final bgv a;
   private final bkq b;
   private final prl c;

   public bha(bgv var1, prl var2) {
      this.a = var1;
      this.c = var2;
      this.b = jj.m(pwm.bq(bhb.a, this));
   }

   private final bgv h() {
      return super.y ? (bgv)jj.n(this, bhb.a) : null;
   }

   public final long a(long var1, long var3, int var5) {
      long var6 = this.a.a(var1, var3, var5);
      bgv var8 = this.h();
      if (var8 != null) {
         var1 = var8.a(bci.f(var1, var6), bci.e(var3, var6), var5);
      } else {
         var1 = bci.a;
      }

      return bci.f(var6, var1);
   }

   public final long b(long var1, int var3) {
      bgv var6 = this.h();
      long var4;
      if (var6 != null) {
         var4 = var6.b(var1, var3);
      } else {
         var4 = bci.a;
      }

      return bci.f(var4, this.a.b(bci.e(var1, var4), var3));
   }

   public final Object c(long var1, long var3, que var5) {
      bgy var12;
      label40: {
         if (var5 instanceof bgy) {
            bgy var9 = (bgy)var5;
            int var6 = var9.e;
            if ((var6 & Integer.MIN_VALUE) != 0) {
               var9.e = var6 + Integer.MIN_VALUE;
               var12 = var9;
               break label40;
            }
         }

         var12 = new bgy(this, var5);
      }

      Object var13;
      label43: {
         var13 = var12.c;
         qul var11 = qul.a;
         long var7;
         bha var10;
         bgv var14;
         switch(var12.e) {
         case 0:
            pwm.bs(var13);
            var14 = this.a;
            var12.f = this;
            var12.a = var1;
            var12.b = var3;
            var12.e = 1;
            var13 = var14.c(var1, var3, var12);
            if (var13 == var11) {
               return var11;
            }

            var10 = this;
            var7 = var1;
            break;
         case 1:
            var3 = var12.b;
            var7 = var12.a;
            var10 = var12.f;
            pwm.bs(var13);
            break;
         case 2:
            var1 = var12.a;
            pwm.bs(var13);
            break label43;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var1 = ((byb)var13).b;
         var14 = var10.h();
         if (var14 == null) {
            var3 = byb.a;
            return byb.e(byb.d(var1, var3));
         }

         var7 = byb.d(var7, var1);
         var3 = byb.c(var3, var1);
         var12.f = null;
         var12.a = var1;
         var12.e = 2;
         var13 = var14.c(var7, var3, var12);
         if (var13 == var11) {
            return var11;
         }
      }

      var3 = ((byb)var13).b;
      return byb.e(byb.d(var1, var3));
   }

   public final Object d(long var1, que var3) {
      bgz var7;
      label40: {
         if (var3 instanceof bgz) {
            var7 = (bgz)var3;
            int var4 = var7.d;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var7.d = var4 + Integer.MIN_VALUE;
               break label40;
            }
         }

         var7 = new bgz(this, var3);
      }

      long var5;
      Object var8;
      qul var9;
      bha var10;
      bgv var11;
      label33: {
         var8 = var7.b;
         var9 = qul.a;
         switch(var7.d) {
         case 0:
            pwm.bs(var8);
            var11 = this.h();
            if (var11 == null) {
               var5 = byb.a;
               var10 = this;
               break label33;
            }

            var7.e = this;
            var7.a = var1;
            var7.d = 1;
            var8 = var11.d(var1, var7);
            if (var8 == var9) {
               return var9;
            }

            var10 = this;
            break;
         case 1:
            var1 = var7.a;
            var10 = var7.e;
            pwm.bs(var8);
            break;
         case 2:
            var5 = var7.a;
            pwm.bs(var8);
            return byb.e(byb.d(var5, ((byb)var8).b));
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var5 = ((byb)var8).b;
      }

      var11 = var10.a;
      byb.c(var1, var5);
      var7.e = null;
      var7.a = var5;
      var7.d = 2;
      var8 = hf.f();
      if (var8 == var9) {
         return var9;
      } else {
         return byb.e(byb.d(var5, ((byb)var8).b));
      }
   }

   public final void eA() {
      prl var1 = this.c;
      if (var1.b == this) {
         var1.b = null;
      }

   }

   // $FF: synthetic method
   public final Object eq(lmk var1) {
      return jj.n(this, var1);
   }

   public final void er() {
      prl var1 = this.c;
      var1.b = this;
      var1.c = new amp(this, 16);
      var1.a = this.o();
   }

   public final bkq ex() {
      return this.b;
   }

   public final qzv f() {
      bha var1;
      if (super.y) {
         var1 = (bha)jj.n(this, bhb.a);
      } else {
         var1 = null;
      }

      Object var2;
      if (var1 != null) {
         var2 = var1.f();
         if (var2 != null) {
            return (qzv)var2;
         }
      }

      var2 = this.c.a;
      if (var2 == null) {
         throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
      } else {
         return (qzv)var2;
      }
   }
}
