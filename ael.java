@qus(
   b = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1",
   c = "Draggable.kt",
   d = "invokeSuspend",
   e = {310}
)
final class ael extends quw implements qvx {
   int a;
   final aep b;
   private Object c;

   public ael(aep var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var4 = (bil)this.c;
         aep var3 = this.b;
         if (!var3.d) {
            return qsn.a;
         }

         aek var5 = new aek(var4, var3, (que)null);
         this.a = 1;
         if (qzy.g(var5, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      ael var3 = new ael(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
