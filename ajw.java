@qus(
   b = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2",
   c = "LazyListState.kt",
   d = "invokeSuspend",
   e = {}
)
public final class ajw extends quw implements qvx {
   final ajz a;
   final int b;

   public ajw(ajz var1, int var2, que var3) {
      super(2, var3);
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      pwm.bs(var1);
      ajz var4 = this.a;
      int var2 = this.b;
      ajs var6 = var4.c;
      var6.c(var2, 0);
      var6.b = null;
      var4.o.a();
      bkg var5 = var4.m;
      if (var5 != null) {
         var5.e();
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new ajw(this.a, this.b, var2);
   }
}
