@qus(
   b = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1",
   c = "Draggable.kt",
   d = "invokeSuspend",
   e = {320}
)
final class aeh extends quw implements qvx {
   Object a;
   int b;
   final qwz c;
   final aep d;
   private Object e;

   public aeh(qwz var1, aep var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.d = var2;
   }

   public final Object b(Object var1) {
      qul var9 = qul.a;
      aeb var5;
      Object var6;
      aeh var10;
      switch(this.b) {
      case 0:
         pwm.bs(var1);
         var5 = (aeb)this.e;
         var10 = this;
         break;
      default:
         var6 = this.a;
         var5 = (aeb)this.e;
         pwm.bs(var1);
         ((qwz)var6).a = var1;
         var10 = this;
      }

      while(true) {
         var6 = var10.c.a;
         if (var6 instanceof adr || var6 instanceof ado) {
            return qsn.a;
         }

         adp var11;
         if (var6 instanceof adp) {
            var11 = (adp)var6;
         } else {
            var11 = null;
         }

         if (var11 != null) {
            aep var7 = var10.d;
            long var3 = var11.a;
            float var2;
            if (var7.c == aez.a) {
               var2 = bci.c(var3);
            } else {
               var2 = bci.b(var3);
            }

            var5.b(var2);
         }

         qwz var13 = var10.c;
         rdb var12 = var10.d.j;
         var10.e = var5;
         var10.a = var13;
         var10.b = 1;
         Object var8 = var12.b(var10);
         if (var8 == var9) {
            return var9;
         }

         ((qwz)var13).a = var8;
         var10 = var10;
      }
   }

   public final que c(Object var1, que var2) {
      aeh var3 = new aeh(this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
