public final class aep extends blh implements bni {
   public aeq a;
   public qvt b;
   public aez c;
   public boolean d;
   public qvi e;
   public final boolean f;
   public final qvt g;
   public final qvi h;
   public final bin i;
   public final rdb j;
   private qvy k;
   private qvy l;
   private ahg m;
   private final bil n;
   private lmk o;

   public aep(aeq var1, qvt var2, aez var3, boolean var4, lmk var5, qvi var6, qvy var7, qvy var8) {
      var6.getClass();
      var7.getClass();
      var8.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.o = var5;
      this.e = var6;
      this.k = var7;
      this.l = var8;
      this.f = false;
      this.g = new ou(this, 19);
      this.h = new ov(this, 12);
      this.i = new bin();
      bil var9 = big.b(new ael(this, (que)null));
      this.m(var9);
      this.n = var9;
      this.j = quy.B(Integer.MAX_VALUE, 0, 6);
   }

   private final void w() {
      ahg var1 = this.m;
      if (var1 != null) {
         lmk var2 = this.o;
         if (var2 != null) {
            var2.aN(new ahf(var1));
         }

         this.m = null;
      }

   }

   public final Object a(qzv var1, que var2) {
      aem var4;
      label42: {
         if (var2 instanceof aem) {
            var4 = (aem)var2;
            int var3 = var4.c;
            if ((var3 & Integer.MIN_VALUE) != 0) {
               var4.c = var3 + Integer.MIN_VALUE;
               break label42;
            }
         }

         var4 = new aem(this, var2);
      }

      qul var5;
      aep var7;
      label35: {
         Object var6 = var4.a;
         var5 = qul.a;
         switch(var4.c) {
         case 0:
            pwm.bs(var6);
            ahg var10 = this.m;
            if (var10 == null) {
               var7 = this;
               break label35;
            }

            lmk var8 = this.o;
            if (var8 != null) {
               ahf var11 = new ahf(var10);
               var4.d = this;
               var4.e = var1;
               var4.c = 1;
               if (var8.aM(var11, var4) == var5) {
                  return var5;
               }
            }

            var7 = this;
            break;
         case 1:
            var1 = var4.e;
            var7 = var4.d;
            pwm.bs(var6);
            break;
         case 2:
            pwm.bs(var6);
            return qsn.a;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var7.m = null;
      }

      qvy var12 = var7.l;
      byb var9 = byb.e(byb.a);
      var4.d = null;
      var4.e = null;
      var4.c = 2;
      if (var12.a(var1, var9, var4) == var5) {
         return var5;
      } else {
         return qsn.a;
      }
   }

   public final void eA() {
      this.w();
   }

   // $FF: synthetic method
   public final void eB() {
      kd.h(this);
   }

   public final void eC(bhl var1, int var2, long var3) {
      this.n.eC(var1, var2, var3);
   }

   public final void ey() {
      this.n.ey();
   }

   // $FF: synthetic method
   public final void ez() {
      kd.g(this);
   }

   public final Object g(qzv var1, adq var2, que var3) {
      aen var5;
      label51: {
         if (var3 instanceof aen) {
            var5 = (aen)var3;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               break label51;
            }
         }

         var5 = new aen(this, var3);
      }

      aep var6;
      ahg var7;
      qul var8;
      label54: {
         Object var9 = var5.a;
         var8 = qul.a;
         aep var10;
         qzv var11;
         switch(var5.c) {
         case 0:
            pwm.bs(var9);
            ahg var15 = this.m;
            if (var15 != null) {
               lmk var13 = this.o;
               if (var13 != null) {
                  ahf var16 = new ahf(var15);
                  var5.d = this;
                  var5.e = var1;
                  var5.f = var2;
                  var5.c = 1;
                  if (var13.aM(var16, var5) == var8) {
                     return var8;
                  }
               }
            }

            var11 = var1;
            var10 = this;
            break;
         case 1:
            var2 = var5.f;
            var11 = var5.e;
            var10 = var5.d;
            pwm.bs(var9);
            break;
         case 2:
            var7 = var5.g;
            var2 = var5.f;
            var1 = var5.e;
            var6 = var5.d;
            pwm.bs(var9);
            break label54;
         case 3:
            pwm.bs(var9);
            return qsn.a;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var7 = new ahg();
         lmk var17 = var10.o;
         if (var17 != null) {
            var5.d = var10;
            var5.e = var11;
            var5.f = var2;
            var5.g = var7;
            var5.c = 2;
            if (var17.aM(var7, var5) == var8) {
               return var8;
            }
         }

         var6 = var10;
         var1 = var11;
      }

      var6.m = var7;
      qvy var14 = var6.k;
      bci var12 = bci.i(var2.a);
      var5.d = null;
      var5.e = null;
      var5.f = null;
      var5.g = null;
      var5.c = 3;
      if (var14.a(var1, var12, var5) == var8) {
         return var8;
      } else {
         return qsn.a;
      }
   }

   // $FF: synthetic method
   public final void i() {
   }

   public final Object j(qzv var1, adr var2, que var3) {
      aeo var5;
      label42: {
         if (var3 instanceof aeo) {
            var5 = (aeo)var3;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               break label42;
            }
         }

         var5 = new aeo(this, var3);
      }

      qul var6;
      aep var9;
      label35: {
         Object var7 = var5.a;
         var6 = qul.a;
         switch(var5.c) {
         case 0:
            pwm.bs(var7);
            ahg var12 = this.m;
            if (var12 == null) {
               var9 = this;
               break label35;
            }

            lmk var10 = this.o;
            if (var10 != null) {
               ahh var13 = new ahh(var12);
               var5.d = this;
               var5.e = var1;
               var5.f = var2;
               var5.c = 1;
               if (var10.aM(var13, var5) == var6) {
                  return var6;
               }
            }

            var9 = this;
            break;
         case 1:
            var2 = var5.f;
            var1 = var5.e;
            var9 = var5.d;
            pwm.bs(var7);
            break;
         case 2:
            pwm.bs(var7);
            return qsn.a;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var9.m = null;
      }

      qvy var11 = var9.l;
      byb var8 = byb.e(var2.a);
      var5.d = null;
      var5.e = null;
      var5.f = null;
      var5.c = 2;
      if (var11.a(var1, var8, var5) == var6) {
         return var6;
      } else {
         return qsn.a;
      }
   }

   // $FF: synthetic method
   public final void k() {
   }

   public final void l(aeq var1, qvt var2, aez var3, boolean var4, lmk var5, qvi var6, qvy var7, qvy var8) {
      var6.getClass();
      var7.getClass();
      var8.getClass();
      boolean var11 = c.E(this.a, var1);
      boolean var10 = true;
      boolean var9;
      if (!var11) {
         this.a = var1;
         var9 = true;
      } else {
         var9 = false;
      }

      this.b = var2;
      if (this.c != var3) {
         this.c = var3;
         var9 = true;
      }

      if (this.d != var4) {
         this.d = var4;
         if (!var4) {
            this.w();
            var9 = var10;
         } else {
            var9 = var10;
         }
      }

      if (!c.E(this.o, var5)) {
         this.w();
         this.o = var5;
      }

      this.e = var6;
      this.k = var7;
      this.l = var8;
      if (var9) {
         this.n.m();
      }

   }
}
