import java.util.concurrent.Callable;

@qus(
   b = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1",
   c = "CoroutinesRoom.kt",
   d = "invokeSuspend",
   e = {137}
)
final class cqr extends quw implements qvx {
   int a;
   final crc b;
   final ref c;
   final String[] d;
   final Callable e;
   private Object f;

   public cqr(crc var1, ref var2, String[] var3, Callable var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var4 = (qzv)this.f;
         rdb var3 = quy.B(-1, 0, 6);
         cqy var5 = new cqy(this.d, var3);
         var3.u(qsn.a);
         crk var7 = (crk)var4.gO().get(crk.c);
         if (var7 != null) {
            var1 = var7.a;
         } else {
            var1 = cbi.d(this.b);
         }

         rdb var6 = quy.B(0, 0, 7);
         qwo.o(var4, (qui)var1, 0, new cqq(this.b, var5, var3, this.e, var6, (que)null), 2);
         ref var8 = this.c;
         this.a = 1;
         if (qwl.r(var8, var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cqr var3 = new cqr(this.b, this.c, this.d, this.e, var2);
      var3.f = var1;
      return var3;
   }
}
