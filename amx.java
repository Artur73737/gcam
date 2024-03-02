import java.util.List;

@qus(
   b = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1",
   c = "SelectionGestures.kt",
   d = "invokeSuspend",
   e = {100, 106, 108}
)
final class amx extends quv implements qvx {
   int a;
   final amk b;
   final amj c;
   final ip d;
   private Object e;

   public amx(amk var1, ip var2, amj var3, que var4) {
      super(var4);
      this.b = var1;
      this.d = var2;
      this.c = var3;
   }

   public final Object b(Object var1) {
      qul var5 = qul.a;
      bij var4;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var4 = (bij)this.e;
         this.e = var4;
         this.a = 1;
         var1 = jm.d(var4, this);
         if (var1 == var5) {
            return var5;
         }
         break;
      case 1:
         var4 = (bij)this.e;
         pwm.bs(var1);
         break;
      case 2:
      default:
         pwm.bs(var1);
         return qsn.a;
      }

      bhl var8 = (bhl)var1;
      if (jm.c(var8) && (var8.b & 33) != 0) {
         List var6 = var8.a;
         int var3 = var6.size();
         int var2 = 0;

         while(true) {
            if (var2 >= var3) {
               amk var10 = this.b;
               ip var7 = this.d;
               this.e = null;
               this.a = 2;
               if (jm.q(var4, var10, var7, var8, this) == var5) {
                  return var5;
               }

               return qsn.a;
            }

            if (((bhw)var6.get(var2)).c()) {
               break;
            }

            ++var2;
         }
      }

      if (jm.c(var8)) {
         return qsn.a;
      } else {
         amj var9 = this.c;
         this.e = null;
         this.a = 3;
         if (jm.e(var4, var9, var8, this) != var5) {
            return qsn.a;
         } else {
            return var5;
         }
      }
   }

   public final que c(Object var1, que var2) {
      amx var3 = new amx(this.b, this.d, this.c, var2);
      var3.e = var1;
      return var3;
   }
}
