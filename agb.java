@qus(
   b = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {744, 747, 750}
)
final class agb extends quw implements qvx {
   long a;
   int b;
   long c;
   final agc d;

   public agb(agc var1, que var2) {
      super(2, var2);
      this.d = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      long var3 = ((byb)var1).b;
      que var5 = (que)var2;
      var5 = this.c(byb.e(var3), var5);
      qsn var6 = qsn.a;
      return ((agb)var5).b(var6);
   }

   public final Object b(Object var1) {
      long var2;
      long var4;
      qul var8;
      prl var9;
      label22: {
         var8 = qul.a;
         switch(this.b) {
         case 0:
            pwm.bs(var1);
            var2 = this.c;
            var9 = this.d.g;
            this.b = 1;
            var1 = var9.v(var2, this);
            if (var1 == var8) {
               return var8;
            }
            break;
         case 1:
            var2 = this.c;
            pwm.bs(var1);
            break;
         case 2:
            var4 = this.a;
            var2 = this.c;
            pwm.bs(var1);
            break label22;
         default:
            var4 = this.a;
            var2 = this.c;
            pwm.bs(var1);
            return byb.e(byb.c(var2, byb.c(var4, ((byb)var1).b)));
         }

         var4 = byb.c(var2, ((byb)var1).b);
         agc var10 = this.d;
         this.c = var2;
         this.a = var4;
         this.b = 2;
         var1 = var10.f(var4, this);
         if (var1 == var8) {
            return var8;
         }
      }

      long var6 = ((byb)var1).b;
      var9 = this.d.g;
      var4 = byb.c(var4, var6);
      this.c = var2;
      this.a = var6;
      this.b = 3;
      var1 = var9.u(var4, var6, this);
      if (var1 == var8) {
         return var8;
      } else {
         var4 = var6;
         return byb.e(byb.c(var2, byb.c(var4, ((byb)var1).b)));
      }
   }

   public final que c(Object var1, que var2) {
      agb var3 = new agb(this.d, var2);
      var3.c = ((byb)var1).b;
      return var3;
   }
}
