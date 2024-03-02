@qus(
   b = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1",
   c = "ScrollableState.kt",
   d = "invokeSuspend",
   e = {190}
)
final class adk extends quw implements qvx {
   int a;
   final adn b;
   final qvx c;
   private Object d;

   public adk(adn var1, qvx var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      Boolean var3;
      label77: {
         qul var4 = qul.a;
         int var2 = this.a;
         var3 = false;
         Throwable var10000;
         boolean var10001;
         switch(var2) {
         case 0:
            pwm.bs(var1);
            afj var5 = (afj)this.d;
            this.b.c.b(true);

            try {
               qvx var12 = this.c;
               this.a = 1;
               var1 = var12.a(var5, this);
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }

            if (var1 == var4) {
               return var4;
            }
            break label77;
         default:
            label75:
            try {
               pwm.bs(var1);
               break label77;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label75;
            }
         }

         Throwable var13 = var10000;
         att var15 = this.b.c;
         var15.b(var3);
         throw var13;
      }

      att var14 = this.b.c;
      var14.b(var3);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      adk var3 = new adk(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
