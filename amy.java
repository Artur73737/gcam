@qus(
   b = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1",
   c = "SelectionGestures.kt",
   d = "invokeSuspend",
   e = {99}
)
public final class amy extends quw implements qvx {
   int a;
   final amk b;
   final amj c;
   private Object d;

   public amy(amk var1, amj var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var4 = (bil)this.d;
         ip var3 = new ip(var4.j());
         amx var5 = new amx(this.b, var3, this.c, (que)null);
         this.a = 1;
         if (et.i(var4, var5, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      amy var3 = new amy(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
