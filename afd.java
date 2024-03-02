public final class afd implements bxr {
   private final bxr a;
   private boolean b;
   private boolean c;
   private final rjo d;

   public afd(bxr var1) {
      var1.getClass();
      super();
      this.a = var1;
      this.d = rjp.a();
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

   public final Object i(que var1) {
      afb var5;
      label22: {
         if (var1 instanceof afb) {
            afb var3 = (afb)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               var5 = var3;
               break label22;
            }
         }

         var5 = new afb(this, var1);
      }

      Object var7 = var5.a;
      qul var4 = qul.a;
      afd var6;
      switch(var5.c) {
      case 0:
         pwm.bs(var7);
         rjo var8 = this.d;
         var5.d = this;
         var5.c = 1;
         if (var8.a(var5) == var4) {
            return var4;
         }

         var6 = this;
         break;
      case 1:
         var6 = var5.d;
         pwm.bs(var7);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var6.b = false;
      var6.c = false;
      return qsn.a;
   }

   public final Object j(que var1) {
      afc var5;
      label37: {
         if (var1 instanceof afc) {
            afc var3 = (afc)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               var5 = var3;
               break label37;
            }
         }

         var5 = new afc(this, var1);
      }

      Object var4 = var5.a;
      qul var7 = qul.a;
      afd var6;
      switch(var5.c) {
      case 0:
         pwm.bs(var4);
         if (!this.b && !this.c) {
            rjo var8 = this.d;
            var5.d = this;
            var5.c = 1;
            if (var8.a(var5) == var7) {
               return var7;
            }

            var6 = this;
            break;
         }

         var6 = this;
         return var6.b;
      case 1:
         var6 = var5.d;
         pwm.bs(var4);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var6.d.b();
      return var6.b;
   }

   public final void k() {
      this.c = true;
      this.d.b();
   }

   public final void l() {
      this.b = true;
      this.d.b();
   }
}
