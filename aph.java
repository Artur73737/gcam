import java.util.Map;

@qus(
   b = "androidx.compose.material.SwipeableKt$swipeable$3$3",
   c = "Swipeable.kt",
   d = "invokeSuspend",
   e = {615}
)
final class aph extends quw implements qvx {
   int a;
   final apu b;
   final Map c;
   final bxr d;
   final qvx e;

   public aph(apu var1, Map var2, bxr var3, qvx var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         Map var6 = this.b.g();
         apu var4 = this.b;
         Map var5 = this.c;
         var4.d.b(var5);
         this.b.i.b((Object)null);
         apu var10 = this.b;
         bxo var7 = new bxo(this.c, this.e, this.d, 1);
         var10.h.b(var7);
         bxr var8 = this.d;
         var10 = this.b;
         float var2 = var8.eI(125.0F);
         var10.n.i(var2);
         var10 = this.b;
         Map var9 = this.c;
         this.a = 1;
         if (var10.e(var6, var9, this) == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aph(this.b, this.c, this.d, this.e, var2);
   }
}
