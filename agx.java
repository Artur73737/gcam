@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {157}
)
final class agx extends quv implements qvx {
   int a;
   final qzv b;
   final qvt c;
   final qwz d;
   final afd e;
   private Object f;

   public agx(qzv var1, qvt var2, qwz var3, afd var4, que var5) {
      super(var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var5 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bij var6 = (bij)this.f;
         this.a = 1;
         Object var4 = ahb.e(var6, this);
         var1 = var4;
         if (var4 == var5) {
            return var5;
         }
         break;
      default:
         pwm.bs(var1);
      }

      bhw var7 = (bhw)var1;
      if (var7 == null) {
         qwo.o(this.b, (qui)null, 0, new agw(this.e, (que)null), 3);
         this.c.eo(bci.i(((bhw)this.d.a).c));
         return qsn.a;
      } else {
         var7.b();
         qwo.o(this.b, (qui)null, 0, new agv(this.e, (que)null), 3);
         long var2 = bci.a;
         throw null;
      }
   }

   public final que c(Object var1, que var2) {
      agx var3 = new agx(this.b, this.c, this.d, this.e, var2);
      var3.f = var1;
      return var3;
   }
}
