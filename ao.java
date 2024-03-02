public final class ao extends am {
   public float af = -1.0F;
   public int ag = -1;
   public int ah = -1;
   public int ai;
   private al aj;

   public ao() {
      this.aj = this.j;
      this.ai = 0;
      this.q.clear();
      this.q.add(this.aj);
   }

   public final void A(int var1) {
      if (this.ai != var1) {
         this.ai = var1;
         this.q.clear();
         if (this.ai == 1) {
            this.aj = this.i;
         } else {
            this.aj = this.j;
         }

         this.q.add(this.aj);
      }
   }

   public final al t(int var1) {
      switch(var1 - 1) {
      case 1:
      case 3:
         if (this.ai == 1) {
            return this.aj;
         }
         break;
      case 2:
      case 4:
         if (this.ai == 0) {
            return this.aj;
         }
      }

      return null;
   }

   public final void x(aj var1) {
      am var5 = super.r;
      if (var5 != null) {
         al var4 = var5.t(2);
         al var3 = var5.t(4);
         if (this.ai == 0) {
            var4 = var5.t(3);
            var3 = var5.t(5);
         }

         if (this.ag != -1) {
            var1.g(aj.c(var1, var1.e(this.aj), var1.e(var4), this.ag, false));
         } else if (this.ah != -1) {
            var1.g(aj.c(var1, var1.e(this.aj), var1.e(var3), -this.ah, false));
         } else {
            if (this.af != -1.0F) {
               ak var9 = var1.e(this.aj);
               ak var8 = var1.e(var4);
               ak var6 = var1.e(var3);
               float var2 = this.af;
               ah var7 = var1.a();
               var7.d.f(var9, -1.0F);
               var7.d.f(var8, 1.0F - var2);
               var7.d.f(var6, var2);
               var1.g(var7);
            }

         }
      }
   }

   public final void y() {
      if (super.r != null) {
         int var1 = aj.p(this.aj);
         if (this.ai == 1) {
            super.w = var1;
            super.x = 0;
            this.j(super.r.d());
            this.p(0);
         } else {
            super.w = 0;
            super.x = var1;
            this.p(super.r.h());
            this.j(0);
         }
      }
   }
}
