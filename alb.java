import androidx.wear.ambient.AmbientMode$AmbientController;

@qus(
   b = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2",
   c = "LazyLayoutSemantics.kt",
   d = "invokeSuspend",
   e = {119}
)
public final class alb extends quw implements qvx {
   int a;
   final int b;
   final AmbientMode$AmbientController c;

   public alb(AmbientMode$AmbientController var1, int var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         AmbientMode$AmbientController var6 = this.c;
         int var2 = this.b;
         this.a = 1;
         var1 = var6.a;
         Object var3 = eu.g((afw)var1, new ajw((ajz)var1, var2, (que)null), this);
         qul var5 = qul.a;
         var1 = var3;
         if (var3 != var5) {
            var1 = qsn.a;
         }

         var3 = var1;
         if (var1 != var5) {
            var3 = qsn.a;
         }

         if (var3 == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new alb(this.c, this.b, var2);
   }
}
