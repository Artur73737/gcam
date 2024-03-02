@qus(
   b = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {834}
)
final class afe extends quw implements qvx {
   int a;
   final aff b;
   final qvx c;
   private Object d;

   public afe(aff var1, qvx var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         afj var3 = (afj)this.d;
         aff var4 = this.b;
         var3.getClass();
         var4.a = var3;
         qvx var5 = this.c;
         this.a = 1;
         if (var5.a(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      afe var3 = new afe(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
