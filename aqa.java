@qus(
   b = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2",
   c = "CommonRipple.kt",
   d = "invokeSuspend",
   e = {87}
)
final class aqa extends quw implements qvx {
   int a;
   final aqn b;
   final aqb c;
   final ahr d;

   public aqa(aqn var1, aqb var2, ahr var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      label77: {
         qul var2 = qul.a;
         Throwable var10000;
         boolean var10001;
         switch(this.a) {
         case 0:
            pwm.bs(var1);

            try {
               aqn var9 = this.b;
               this.a = 1;
               var1 = var9.a(this);
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            if (var1 == var2) {
               return var2;
            }
            break label77;
         default:
            label75:
            try {
               pwm.bs(var1);
               break label77;
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label75;
            }
         }

         Throwable var10 = var10000;
         this.c.a.remove(this.d);
         throw var10;
      }

      this.c.a.remove(this.d);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aqa(this.b, this.c, this.d, var2);
   }
}
