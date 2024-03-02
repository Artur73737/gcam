public final class akb implements baz {
   public boolean a;
   public que b;

   public final Object a(que var1) {
      aka var7;
      label53: {
         if (var1 instanceof aka) {
            aka var3 = (aka)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               var7 = var3;
               break label53;
            }
         }

         var7 = new aka(this, var1);
      }

      Object var9 = var7.a;
      qul var5 = qul.a;
      Object var8;
      switch(var7.c) {
      case 0:
         pwm.bs(var9);
         if (this.a) {
            return qsn.a;
         }

         que var10;
         label41: {
            label40: {
               var10 = this.b;
               var7.d = (quk)var10;
               var7.c = 1;
               quk var6 = new quk(quy.h(var7), qul.b);
               this.b = var6;
               Object var4 = var6.result;
               var8 = var4;
               if (var4 == qul.b) {
                  if (c.A(quk.a, var6, qul.b, qul.a)) {
                     break label40;
                  }

                  var8 = var6.result;
               }

               if (var8 != qul.c) {
                  if (var8 instanceof qsh) {
                     throw ((qsh)var8).a;
                  }
                  break label41;
               }
            }

            var8 = qul.a;
         }

         if (var8 == var5) {
            return var5;
         }

         var8 = var10;
         break;
      case 1:
         var8 = var7.d;
         pwm.bs(var9);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      if (var8 != null) {
         ((que)var8).gP(qsn.a);
      }

      return qsn.a;
   }

   // $FF: synthetic method
   public final bbb g(bbb var1) {
      return bax.a(this, var1);
   }

   // $FF: synthetic method
   public final Object h(Object var1, qvx var2) {
      return dq.j(this, var1, var2);
   }

   // $FF: synthetic method
   public final boolean i(qvt var1) {
      return dq.k(this, var1);
   }
}
