@qus(
   b = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1",
   c = "RoomDatabaseExt.kt",
   d = "invokeSuspend",
   e = {103}
)
final class crd extends quw implements qvx {
   int a;
   final crc b;
   final qvx c;
   final qza d;
   private Object e;

   public crd(crc var1, qza var2, qvx var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.d = var2;
      this.c = var3;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      Object var9;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qug var6 = ((qzv)this.e).gO().get(quf.k);
         var6.getClass();
         quf var3 = (quf)var6;
         crc var5 = this.b;
         crk var7 = new crk(var3);
         ThreadLocal var10 = var5.i;
         int var2 = System.identityHashCode(var7);
         var10.getClass();
         rit var11 = new rit(var2, var10);
         qui var12 = var3.plus(var7).plus(var11);
         var9 = this.d;
         qvx var8 = this.c;
         this.e = var9;
         this.a = 1;
         var1 = qwo.k(var12, var8, this);
         if (var1 == var4) {
            return var4;
         }
         break;
      default:
         var9 = (que)this.e;
         pwm.bs(var1);
      }

      ((que)var9).gP(var1);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      crd var3 = new crd(this.b, this.d, this.c, var2);
      var3.e = var1;
      return var3;
   }
}
