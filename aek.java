import java.util.concurrent.CancellationException;

@qus(
   b = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1",
   c = "Draggable.kt",
   d = "invokeSuspend",
   e = {334}
)
final class aek extends quw implements qvx {
   int a;
   final aep b;
   final bil c;
   private Object d;

   public aek(bil var1, aep var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      qzv var2;
      CancellationException var7;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var2 = (qzv)this.d;
         qwo.o(var2, (qui)null, 4, new aei(this.b, (que)null), 1);

         try {
            bil var8 = this.c;
            aej var4 = new aej(var2, this.b, (que)null);
            this.d = var2;
            this.a = 1;
            var1 = var8.l(var4, this);
         } catch (CancellationException var5) {
            var7 = var5;
            break;
         }

         if (var1 == var3) {
            return var3;
         }

         return qsn.a;
      default:
         var2 = (qzv)this.d;

         try {
            pwm.bs(var1);
            return qsn.a;
         } catch (CancellationException var6) {
            var7 = var6;
         }
      }

      if (!qzy.j(var2)) {
         throw var7;
      } else {
         return qsn.a;
      }
   }

   public final que c(Object var1, que var2) {
      aek var3 = new aek(this.c, this.b, var2);
      var3.d = var1;
      return var3;
   }
}
