@qus(
   b = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2",
   c = "ScrollExtensions.kt",
   d = "invokeSuspend",
   e = {41}
)
public final class afi extends quw implements qvx {
   int a;
   final float b;
   final zb c;
   final qww d;
   private Object e;

   public afi(float var1, zb var2, qww var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         afj var10 = (afj)this.e;
         float var2 = this.b;
         zb var6 = this.c;
         afh var8 = new afh(this.d, var10, 0);
         this.a = 1;
         bpe var7 = aam.a;
         Float var5 = quy.d(0.0F);
         Float var9 = quy.d(var2);
         Float var11 = quy.d(0.0F);
         zh var3 = (zh)((qvt)var7.a).eo(var11);
         zh var12 = var3;
         if (var3 == null) {
            var12 = do.y((zh)((qvt)var7.a).eo(var5));
         }

         aac var13 = new aac(var6, var7, var5, var9, var12);
         Object var14 = dq.d(new zc(var7, var5, var12, 56), var13, Long.MIN_VALUE, new zy(var8, var7, 0, (byte[])null), this);
         qul var15 = qul.a;
         var1 = var14;
         if (var14 != var15) {
            var1 = qsn.a;
         }

         var14 = var1;
         if (var1 != var15) {
            var14 = qsn.a;
         }

         if (var14 == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      afi var3 = new afi(this.b, this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
