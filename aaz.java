@qus(
   b = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1",
   c = "Clickable.kt",
   d = "invokeSuspend",
   e = {927}
)
final class aaz extends quw implements qvx {
   int a;
   final aba b;
   private Object c;

   public aaz(aba var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var7 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var6 = (bil)this.c;
         aba var9 = this.b;
         this.a = 1;
         aav var8 = var9.c;
         long var4 = var6.d;
         int var2 = bxx.b(var4);
         int var3 = bxx.a(var4);
         var4 = car.K(var2 / 2, var3 / 2);
         var2 = bxw.b(var4);
         var8.c = es.i((float)bxw.a(var4), (float)var2);
         Object var10 = qzy.g(new agl(var6, new abl(var9, (que)null), new ou(var9, 17), new afd(var6), (que)null), this);
         qul var11 = qul.a;
         var1 = var10;
         if (var10 != var11) {
            var1 = qsn.a;
         }

         var10 = var1;
         if (var1 != var11) {
            var10 = qsn.a;
         }

         if (var10 == var7) {
            return var7;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      aaz var3 = new aaz(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
