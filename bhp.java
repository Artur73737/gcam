@qus(
   b = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1",
   c = "PointerIcon.kt",
   d = "invokeSuspend",
   e = {112}
)
final class bhp extends quv implements qvx {
   int a;
   final bht b;
   private Object c;

   public bhp(bht var1, que var2) {
      super(var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var7 = qul.a;
      bij var3;
      bhp var4;
      Object var6;
      bij var8;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var8 = (bij)this.c;
         this.c = var8;
         this.a = 1;
         var6 = var8.p(2, this);
         var3 = var8;
         var4 = this;
         var1 = var6;
         if (var6 == var7) {
            return var7;
         }
         break;
      default:
         var3 = (bij)this.c;
         pwm.bs(var1);
         var4 = this;
      }

      do {
         int var2 = ((bhl)var1).c;
         bhp var5;
         bht var9;
         if (c.n(var2, 4)) {
            bht var10 = var4.b;
            var10.f = true;
            var8 = var3;
            var5 = var4;
            if (!var10.e) {
               var9 = var10.b();
               if (var9 != null) {
                  var9.f();
               }

               var10.c.eo(var10.a);
               var8 = var3;
               var5 = var4;
            }
         } else {
            var8 = var3;
            var5 = var4;
            if (c.n(var2, 5)) {
               var9 = var4.b;
               var9.c(var9.b());
               var5 = var4;
               var8 = var3;
            }
         }

         var5.c = var8;
         var5.a = 1;
         var6 = var8.p(2, var5);
         var3 = var8;
         var4 = var5;
         var1 = var6;
      } while(var6 != var7);

      return var7;
   }

   public final que c(Object var1, que var2) {
      bhp var3 = new bhp(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
