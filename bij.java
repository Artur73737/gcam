public final class bij implements bxr, que {
   final bil a;
   public qza b;
   private final que c;
   private final bil d;
   private final qui e;
   private int f;

   public bij(bil var1, que var2) {
      this.a = var1;
      this.c = var2;
      this.d = var1;
      this.f = 2;
      this.e = quj.a;
   }

   public final float a() {
      return this.d.a();
   }

   public final float b() {
      return this.d.b();
   }

   public final float eF(float var1) {
      return car.P(this.d, var1);
   }

   public final float eG(int var1) {
      return car.Q(this.d, var1);
   }

   public final float eH(long var1) {
      return car.R(this.d, var1);
   }

   public final float eI(float var1) {
      return car.S(this.d, var1);
   }

   public final int eJ(float var1) {
      return car.T(this.d, var1);
   }

   public final long eK(long var1) {
      return car.U(this.d, var1);
   }

   public final void gP(Object var1) {
      bil var3 = this.a;
      axf var2 = var3.c;
      synchronized(var2){}

      try {
         var3.c.o(this);
      } finally {
         ;
      }

      this.c.gP(var1);
   }

   public final long i() {
      bil var5 = this.a;
      long var1 = car.U(var5, var5.j().d());
      long var3 = var5.d;
      return et.k(Math.max(0.0F, bcl.c(var1) - (float)bxx.b(var3)) / 2.0F, Math.max(0.0F, bcl.a(var1) - (float)bxx.a(var3)) / 2.0F);
   }

   public final long j() {
      return this.a.d;
   }

   public final bhl k() {
      return this.a.b;
   }

   public final bqa l() {
      return this.a.j();
   }

   public final Object m(long var1, qvx var3, que var4) {
      bih var6;
      label135: {
         if (var4 instanceof bih) {
            var6 = (bih)var4;
            int var5 = var6.c;
            if ((var5 & Integer.MIN_VALUE) != 0) {
               var6.c = var5 + Integer.MIN_VALUE;
               break label135;
            }
         }

         var6 = new bih(this, var4);
      }

      Object var7 = var6.a;
      qul var8 = qul.a;
      Object var16;
      Object var17;
      switch(var6.c) {
      case 0:
         pwm.bs(var7);
         if (var1 <= 0L) {
            qza var18 = this.b;
            if (var18 != null) {
               var18.gP(pwm.br(new bhm(var1)));
            }
         }

         var17 = qwo.o(this.a.o(), (qui)null, 0, new bii(var1, this, (que)null), 3);

         try {
            var6.d = (rby)var17;
            var6.c = 1;
            var16 = var3.a(this, var6);
         } finally {
            ;
         }

         if (var16 == var8) {
            return var8;
         }
         break;
      case 1:
         rby var15 = var6.d;

         try {
            pwm.bs(var7);
         } catch (Throwable var13) {
            var15.s(bhe.a);
            throw var13;
         }

         var17 = var15;
         var16 = var7;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      ((rbd)var17).s(bhe.a);
      return var16;
   }

   public final qui n() {
      return this.e;
   }

   public final Object p(int var1, que var2) {
      qza var4 = new qza(quy.h(var2), 1);
      var4.r();
      this.f = var1;
      this.b = var4;
      Object var5 = var4.c();
      qul var3 = qul.a;
      return var5;
   }

   public final void q(bhl var1, int var2) {
      if (var2 == this.f) {
         qza var3 = this.b;
         if (var3 != null) {
            this.b = null;
            var3.gP(var1);
         }
      }

   }
}
