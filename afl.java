@qus(
   b = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {}
)
final class afl extends quw implements qvy {
   long a;
   final afm b;

   public afl(afm var1, que var2) {
      super(3, var2);
      this.b = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      qzv var6 = (qzv)var1;
      long var4 = ((byb)var2).b;
      que var7 = (que)var3;
      afl var8 = new afl(this.b, var7);
      var8.a = var4;
      return var8.b(qsn.a);
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      pwm.bs(var1);
      long var2 = this.a;
      qzv var5 = (qzv)((qvi)this.b.h.c).a();
      if (var5 != null) {
         qwo.o(var5, (qui)null, 0, new afk(this.b, var2, (que)null), 3);
         return qsn.a;
      } else {
         throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
      }
   }
}
