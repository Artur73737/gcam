public final class alk {
   public final axf a = new axf(new all[16]);

   public final Object a(que var1) {
      int var2;
      alj var9;
      label47: {
         if (var1 instanceof alj) {
            alj var4 = (alj)var1;
            var2 = var4.e;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var4.e = var2 + Integer.MIN_VALUE;
               var9 = var4;
               break label47;
            }
         }

         var9 = new alj(this, var1);
      }

      Object var5 = var9.c;
      qul var7 = qul.a;
      int var3;
      Object[] var12;
      alj var14;
      switch(var9.e) {
      case 0:
         pwm.bs(var5);
         axf var13 = this.a;
         var3 = var13.b;
         if (var3 <= 0) {
            return qsn.a;
         }

         var12 = var13.a;
         var2 = 0;
         var14 = var9;
         break;
      case 1:
         var2 = var9.b;
         var3 = var9.a;
         var12 = var9.f;
         pwm.bs(var5);
         var14 = var9;
         ++var2;
         if (var2 >= var3) {
            return qsn.a;
         }
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      do {
         all var10 = (all)var12[var2];
         var14.f = var12;
         var14.a = var3;
         var14.b = var2;
         var14.e = 1;
         ali var6 = var10.d();
         bjf var8 = var10.f();
         Object var11;
         if (var8 == null) {
            var11 = qsn.a;
         } else {
            Object var15 = var6.b(var8, new ov(var10, 19), var14);
            var11 = var15;
            if (var15 != qul.a) {
               var11 = qsn.a;
            }
         }

         if (var11 == var7) {
            return var7;
         }

         ++var2;
      } while(var2 < var3);

      return qsn.a;
   }
}
