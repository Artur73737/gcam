@qus(
   b = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3",
   c = "AnimateAsState.kt",
   d = "invokeSuspend",
   e = {426}
)
final class yw extends quw implements qvx {
   Object a;
   int b;
   final rdb c;
   final yt d;
   final avi e;
   final avi f;
   private Object g;

   public yw(rdb var1, yt var2, avi var3, avi var4, que var5) {
      super(2, var5);
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
   }

   public final Object b(Object var1) {
      qul var6 = qul.a;
      Object var2;
      qzv var3;
      yw var4;
      Object var5;
      switch(this.b) {
      case 0:
         pwm.bs(var1);
         var3 = (qzv)this.g;
         var2 = this.c.o();
         this.g = var3;
         this.a = var2;
         this.b = 1;
         var5 = ((rco)var2).a(this);
         var4 = this;
         var1 = var5;
         if (var5 == var6) {
            return var6;
         }
         break;
      default:
         var2 = this.a;
         var3 = (qzv)this.g;
         pwm.bs(var1);
         var4 = this;
      }

      do {
         if (!(Boolean)var1) {
            return qsn.a;
         }

         var5 = ((rco)var2).b();
         var1 = rdf.a(var4.c.d());
         if (var1 == null) {
            var1 = var5;
         }

         qwo.o(var3, (qui)null, 0, new yv(var1, var4.d, var4.e, var4.f, (que)null), 3);
         var4.g = var3;
         var4.a = var2;
         var4.b = 1;
         var5 = ((rco)var2).a(var4);
         var4 = var4;
         var1 = var5;
      } while(var5 != var6);

      return var6;
   }

   public final que c(Object var1, que var2) {
      yw var3 = new yw(this.c, this.d, this.e, this.f, var2);
      var3.g = var1;
      return var3;
   }
}
