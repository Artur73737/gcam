public final class afu implements bgv {
   public boolean a;
   private final agc b;

   public afu(agc var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public final long a(long var1, long var3, int var5) {
      if (this.a) {
         agc var8 = this.b;
         if (var8.a.d()) {
            var1 = bci.a;
         } else {
            afw var7 = var8.a;
            float var6 = var8.a(var8.b(var3));
            var1 = var8.e(var8.a(((Number)((adn)((ajz)var7).g).a.eo(var6)).floatValue()));
         }
      } else {
         var1 = bci.a;
      }

      return var1;
   }

   public final long b(long var1, int var3) {
      if (c.n(var3, 2)) {
         this.b.h(true);
      }

      return bci.a;
   }

   public final Object c(long var1, long var3, que var5) {
      aft var9;
      label34: {
         if (var5 instanceof aft) {
            aft var7 = (aft)var5;
            int var6 = var7.d;
            if ((var6 & Integer.MIN_VALUE) != 0) {
               var7.d = var6 + Integer.MIN_VALUE;
               var9 = var7;
               break label34;
            }
         }

         var9 = new aft(this, var5);
      }

      afu var10;
      label28: {
         Object var11 = var9.b;
         qul var8 = qul.a;
         switch(var9.d) {
         case 0:
            pwm.bs(var11);
            if (!this.a) {
               var1 = byb.a;
               var10 = this;
               break label28;
            }

            agc var12 = this.b;
            var9.e = this;
            var9.a = var3;
            var9.d = 1;
            var11 = var12.f(var3, var9);
            if (var11 == var8) {
               return var8;
            }

            var10 = this;
            break;
         case 1:
            var3 = var9.a;
            var10 = var9.e;
            pwm.bs(var11);
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var1 = byb.c(var3, ((byb)var11).b);
      }

      byb var13 = byb.e(var1);
      var10.b.h(false);
      return var13;
   }

   // $FF: synthetic method
   public final Object d(long var1, que var3) {
      return hf.f();
   }
}
