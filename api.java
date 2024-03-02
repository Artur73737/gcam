@qus(
   b = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1",
   c = "Swipeable.kt",
   d = "invokeSuspend",
   e = {624}
)
final class api extends quw implements qvx {
   int a;
   final apu b;
   final float c;

   public api(apu var1, float var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         apu var5 = this.b;
         float var2 = this.c;
         this.a = 1;
         Object var3 = var5.e.gY(new apo(var5, var2), this);
         var1 = var3;
         if (var3 != qul.a) {
            var1 = qsn.a;
         }

         if (var1 == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new api(this.b, this.c, var2);
   }
}
