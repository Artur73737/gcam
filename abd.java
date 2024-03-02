@qus(
   b = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1",
   c = "AndroidOverscroll.kt",
   d = "invokeSuspend",
   e = {316}
)
final class abd extends quw implements qvx {
   int a;
   final abe b;
   private Object c;

   public abd(abe var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var4 = (bil)this.c;
         abc var3 = new abc(this.b, (que)null);
         this.a = 1;
         if (et.i(var4, var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      abd var3 = new abd(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
