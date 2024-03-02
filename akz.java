import androidx.wear.ambient.AmbientMode$AmbientController;

@qus(
   b = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1",
   c = "LazyLayoutSemantics.kt",
   d = "invokeSuspend",
   e = {101}
)
final class akz extends quw implements qvx {
   int a;
   final float b;
   final AmbientMode$AmbientController c;

   public akz(AmbientMode$AmbientController var1, float var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         AmbientMode$AmbientController var5 = this.c;
         float var2 = this.b;
         this.a = 1;
         Object var3 = et.g((afw)var5.a, var2, sq.h(0.0F, (Object)null, 7), this);
         var1 = var3;
         if (var3 != qul.a) {
            var1 = qsn.a;
         }

         if (var1 == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new akz(this.c, this.b, var2);
   }
}
