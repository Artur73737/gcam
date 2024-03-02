@qus(
   b = "androidx.compose.foundation.gestures.DraggableKt$draggable$5",
   c = "Draggable.kt",
   d = "invokeSuspend",
   e = {202}
)
public final class aef extends quw implements qvy {
   int a;
   long b;
   final qvy c;
   final aez d;
   private Object e;

   public aef(qvy var1, aez var2, que var3) {
      super(3, var3);
      this.c = var1;
      this.d = var2;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      qzv var6 = (qzv)var1;
      long var4 = ((byb)var2).b;
      que var7 = (que)var3;
      aef var8 = new aef(this.c, this.d, var7);
      var8.e = var6;
      var8.b = var4;
      return var8.b(qsn.a);
   }

   public final Object b(Object var1) {
      qul var5 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         Object var7 = this.e;
         long var3 = this.b;
         qvy var6 = this.c;
         float var2;
         if (this.d == aez.a) {
            var2 = byb.b(var3);
         } else {
            var2 = byb.a(var3);
         }

         Float var8 = quy.d(var2);
         this.a = 1;
         if (var6.a(var7, var8, this) == var5) {
            return var5;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }
}
