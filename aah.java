@qus(
   b = "androidx.compose.animation.core.Transition$animateTo$1$1",
   c = "Transition.kt",
   d = "invokeSuspend",
   e = {435}
)
public final class aah extends quw implements qvx {
   int a;
   final jed b;
   private Object c;

   public aah(jed var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      qzv var5;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var5 = (qzv)this.c;
         break;
      default:
         qzv var3 = (qzv)this.c;
         pwm.bs(var1);
         var5 = var3;
      }

      aag var6;
      do {
         float var2 = dq.c(var5.gO());
         var6 = new aag(this.b, var2);
         this.c = var5;
         this.a = 1;
      } while(nl.g(var6, this) != var4);

      return var4;
   }

   public final que c(Object var1, que var2) {
      aah var3 = new aah(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
