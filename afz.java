@qus(
   b = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {784}
)
final class afz extends quw implements qvx {
   Object a;
   Object b;
   long c;
   int d;
   final agc e;
   final qwy f;
   final long g;
   private Object h;

   public afz(agc var1, qwy var2, long var3, que var5) {
      super(2, var5);
      this.e = var1;
      this.f = var2;
      this.g = var3;
   }

   public final Object b(Object var1) {
      qul var7 = qul.a;
      float var2;
      long var3;
      Object var13;
      Object var14;
      agc var15;
      switch(this.d) {
      case 0:
         pwm.bs(var1);
         afj var8 = (afj)this.h;
         agc var12 = this.e;
         afy var10 = new afy(var12, new zy(var12, var8, 7, (byte[])null));
         var14 = this.f;
         long var5 = this.g;
         ip var9 = var12.f;
         var3 = ((qwy)var14).a;
         if (var12.b == aez.b) {
            var2 = byb.a(var5);
         } else {
            var2 = byb.b(var5);
         }

         var2 = var12.a(var2);
         this.h = var12;
         this.a = var12;
         this.b = var14;
         this.c = var3;
         this.d = 1;
         var9.a = 0;
         Object var11 = qwo.k((qui)var9.b, new adj(var2, var9, var10, (que)null), this);
         if (var11 == var7) {
            return var7;
         }

         var13 = var12;
         var15 = var12;
         var1 = var11;
         break;
      default:
         var3 = this.c;
         var14 = this.b;
         var13 = this.a;
         var15 = (agc)this.h;
         pwm.bs(var1);
      }

      var2 = var15.a(((Number)var1).floatValue());
      if (((agc)var13).b == aez.b) {
         var3 = byb.f(var3, var2, 0.0F, 2);
      } else {
         var3 = byb.f(var3, 0.0F, var2, 1);
      }

      ((qwy)var14).a = var3;
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      afz var3 = new afz(this.e, this.f, this.g, var2);
      var3.h = var1;
      return var3;
   }
}
