@qus(
   b = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1",
   c = "Clickable.kt",
   d = "invokeSuspend",
   e = {295, 298}
)
final class abj extends quw implements qvx {
   Object a;
   int b;
   final qvi c;
   final long d;
   final aav e;
   final lmk f;

   public abj(qvi var1, long var2, lmk var4, aav var5, que var6) {
      super(2, var6);
      this.c = var1;
      this.d = var2;
      this.f = var4;
      this.e = var5;
   }

   public final Object b(Object var1) {
      label19: {
         qul var5 = qul.a;
         switch(this.b) {
         case 0:
            pwm.bs(var1);
            if ((Boolean)this.c.a()) {
               long var2 = abn.a;
               this.b = 1;
               if (qzy.d(var2, this) == var5) {
                  return var5;
               }
            }
            break;
         case 1:
            pwm.bs(var1);
            break;
         default:
            Object var7 = this.a;
            pwm.bs(var1);
            var1 = var7;
            break label19;
         }

         ahr var4 = new ahr(this.d);
         lmk var6 = this.f;
         this.a = var4;
         this.b = 2;
         var1 = var4;
         if (var6.aM(var4, this) == var5) {
            return var5;
         }
      }

      this.e.b = (ahr)var1;
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new abj(this.c, this.d, this.f, this.e, var2);
   }
}
