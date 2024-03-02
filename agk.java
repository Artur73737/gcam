@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {237, 245}
)
final class agk extends quv implements qvx {
   int a;
   final qzv b;
   final qvy c;
   final qvt d;
   final afd e;
   private Object f;

   public agk(qzv var1, qvy var2, qvt var3, afd var4, que var5) {
      super(var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      bhw var4;
      label32: {
         qul var3 = qul.a;
         bij var2;
         switch(this.a) {
         case 0:
            pwm.bs(var1);
            var2 = (bij)this.f;
            qwo.o(this.b, (qui)null, 0, new agg(this.e, (que)null), 3);
            this.f = var2;
            this.a = 1;
            var1 = ahb.d(var2, this, 3);
            if (var1 == var3) {
               return var3;
            }
            break;
         case 1:
            var2 = (bij)this.f;
            pwm.bs(var1);
            break;
         default:
            pwm.bs(var1);
            break label32;
         }

         var4 = (bhw)var1;
         var4.b();
         if (this.c != ahb.a) {
            qwo.o(this.b, (qui)null, 0, new agh(this.c, this.e, var4, (que)null), 3);
         }

         this.f = null;
         this.a = 2;
         Object var5 = ahb.e(var2, this);
         var1 = var5;
         if (var5 == var3) {
            return var3;
         }
      }

      var4 = (bhw)var1;
      if (var4 == null) {
         qwo.o(this.b, (qui)null, 0, new agi(this.e, (que)null), 3);
      } else {
         var4.b();
         qwo.o(this.b, (qui)null, 0, new agj(this.e, (que)null), 3);
         this.d.eo(bci.i(var4.c));
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      agk var3 = new agk(this.b, this.c, this.d, this.e, var2);
      var3.f = var1;
      return var3;
   }
}
