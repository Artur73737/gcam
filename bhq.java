@qus(
   b = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1",
   c = "PointerIcon.kt",
   d = "invokeSuspend",
   e = {110}
)
final class bhq extends quw implements qvx {
   int a;
   final bht b;
   private Object c;

   public bhq(bht var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var4 = (bil)this.c;
         bhp var3 = new bhp(this.b, (que)null);
         this.a = 1;
         if (var4.l(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      bhq var3 = new bhq(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
