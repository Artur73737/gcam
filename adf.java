@qus(
   b = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2",
   c = "Draggable.kt",
   d = "invokeSuspend",
   e = {575}
)
final class adf extends quw implements qvx {
   int a;
   final adh b;
   final acn c;
   final qvx d;

   public adf(adh var1, acn var2, qvx var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         adh var3 = this.b;
         bpe var6 = var3.c;
         aeb var7 = var3.b;
         acn var5 = this.c;
         qvx var4 = this.d;
         this.a = 1;
         if (var6.h(var7, var5, var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new adf(this.b, this.c, this.d, var2);
   }
}
