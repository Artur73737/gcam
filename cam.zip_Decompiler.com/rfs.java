final class rfs implements ref {
   final qwv a;
   final ref b;

   public rfs(qwv var1, ref var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object b(int var1, que var2) {
      rfr var7;
      label24: {
         if (var2 instanceof rfr) {
            rfr var4 = (rfr)var2;
            int var3 = var4.c;
            if ((var3 & Integer.MIN_VALUE) != 0) {
               var4.c = var3 + Integer.MIN_VALUE;
               var7 = var4;
               break label24;
            }
         }

         var7 = new rfr(this, var2);
      }

      Object var5 = var7.a;
      qul var8 = qul.a;
      switch(var7.c) {
      case 0:
         pwm.bs(var5);
         if (var1 > 0) {
            qwv var9 = this.a;
            if (!var9.a) {
               var9.a = true;
               ref var6 = this.b;
               rfo var10 = rfo.a;
               var7.c = 1;
               if (var6.a(var10, var7) == var8) {
                  return var8;
               }
            }
         }
         break;
      case 1:
         pwm.bs(var5);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      return qsn.a;
   }
}
