public final class ach extends bba implements bni {
   public lmk a;
   private ahm b;

   public ach(lmk var1) {
      this.a = var1;
   }

   public final Object a(que var1) {
      acd var6;
      label33: {
         if (var1 instanceof acd) {
            acd var3 = (acd)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               var6 = var3;
               break label33;
            }
         }

         var6 = new acd(this, var1);
      }

      Object var5 = var6.a;
      qul var4 = qul.a;
      ach var7;
      ahm var8;
      switch(var6.c) {
      case 0:
         pwm.bs(var5);
         if (this.b != null) {
            return qsn.a;
         }

         var8 = new ahm();
         lmk var9 = this.a;
         var6.d = this;
         var6.e = var8;
         var6.c = 1;
         if (var9.aM(var8, var6) == var4) {
            return var4;
         }

         var7 = this;
         break;
      case 1:
         var8 = var6.e;
         var7 = var6.d;
         pwm.bs(var5);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var7.b = var8;
      return qsn.a;
   }

   public final void eA() {
      this.j();
   }

   // $FF: synthetic method
   public final void eB() {
      kd.h(this);
   }

   public final void eC(bhl var1, int var2, long var3) {
      if (var2 == 2) {
         var2 = var1.c;
         if (!c.n(var2, 4)) {
            if (c.n(var2, 5)) {
               qwo.o(this.o(), (qui)null, 0, new acg(this, (que)null), 3);
               return;
            }
         } else {
            qwo.o(this.o(), (qui)null, 0, new acf(this, (que)null), 3);
         }
      }

   }

   public final void ey() {
      this.j();
   }

   // $FF: synthetic method
   public final void ez() {
      kd.g(this);
   }

   public final Object g(que var1) {
      ace var6;
      label33: {
         if (var1 instanceof ace) {
            ace var3 = (ace)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               var6 = var3;
               break label33;
            }
         }

         var6 = new ace(this, var1);
      }

      Object var4 = var6.a;
      qul var8 = qul.a;
      ach var7;
      switch(var6.c) {
      case 0:
         pwm.bs(var4);
         ahm var9 = this.b;
         if (var9 == null) {
            return qsn.a;
         }

         ahn var5 = new ahn(var9);
         lmk var10 = this.a;
         var6.d = this;
         var6.c = 1;
         if (var10.aM(var5, var6) == var8) {
            return var8;
         }

         var7 = this;
         break;
      case 1:
         var7 = var6.d;
         pwm.bs(var4);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var7.b = null;
      return qsn.a;
   }

   // $FF: synthetic method
   public final void i() {
   }

   public final void j() {
      ahm var1 = this.b;
      if (var1 != null) {
         ahn var2 = new ahn(var1);
         this.a.aN(var2);
         this.b = null;
      }

   }

   // $FF: synthetic method
   public final void k() {
   }
}
