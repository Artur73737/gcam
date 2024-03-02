@qus(
   b = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2",
   c = "Clickable.kt",
   d = "invokeSuspend",
   e = {973}
)
final class abl extends quw implements qvy {
   int a;
   long b;
   final aba c;
   private Object d;

   public abl(aba var1, que var2) {
      super(3, var2);
      this.c = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      afd var6 = (afd)var1;
      long var4 = ((bci)var2).d;
      que var7 = (que)var3;
      abl var8 = new abl(this.c, var7);
      var8.d = var6;
      var8.b = var4;
      return var8.b(qsn.a);
   }

   public final Object b(Object var1) {
      qul var5 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         Object var6 = this.d;
         long var2 = this.b;
         aba var7 = this.c;
         if (var7.a) {
            Object var9;
            label21: {
               this.a = 1;
               lmk var8 = var7.e;
               if (var8 != null) {
                  aav var4 = var7.c;
                  qvi var11 = var7.d;
                  var9 = qzy.g(new abk((afd)var6, var2, var8, var4, var11, (que)null), this);
                  qul var10 = qul.a;
                  var1 = var9;
                  if (var9 != var10) {
                     var1 = qsn.a;
                  }

                  var9 = var1;
                  if (var1 == var10) {
                     break label21;
                  }
               }

               var9 = qsn.a;
            }

            if (var9 == var5) {
               return var5;
            }
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }
}
