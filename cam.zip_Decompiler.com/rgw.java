final class rgw implements ref {
   final rdb a;
   final int b;

   public rgw(rdb var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object a(Object var1, que var2) {
      rgv var7;
      label31: {
         if (var2 instanceof rgv) {
            rgv var4 = (rgv)var2;
            int var3 = var4.c;
            if ((var3 & Integer.MIN_VALUE) != 0) {
               var4.c = var3 + Integer.MIN_VALUE;
               var7 = var4;
               break label31;
            }
         }

         var7 = new rgv(this, var2);
      }

      Object var5 = var7.a;
      qul var8 = qul.a;
      switch(var7.c) {
      case 0:
         pwm.bs(var5);
         rdb var9 = this.a;
         qti var6 = new qti(this.b, var1);
         var7.c = 1;
         if (var9.t(var6, var7) == var8) {
            return var8;
         }
         break;
      case 1:
         pwm.bs(var5);
         break;
      case 2:
         pwm.bs(var5);
         return qsn.a;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      var7.c = 2;
      if (quy.C(var7) == var8) {
         return var8;
      } else {
         return qsn.a;
      }
   }
}
