import java.util.Arrays;
import java.util.Map;

public final class bxo extends qwq implements qvx {
   final Object a;
   final Object b;
   final Object c;
   private final int d;

   public bxo(String var1, String var2, Object[] var3, int var4) {
      super(2);
      this.d = var4;
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public bxo(Map var1, qvx var2, bxr var3, int var4) {
      super(2);
      this.d = var4;
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public bxo(Object[] var1, String var2, String var3, int var4) {
      super(2);
      this.d = var4;
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      switch(this.d) {
      case 0:
         asm var5 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var5.G()) {
            var5.q();
         } else {
            var5.u(-492369756);
            var2 = var5.f();
            var1 = var2;
            if (var2 == asl.a) {
               var1 = lg.d(0);
               var5.w(var1);
            }

            var5.n();
            ava var11 = (ava)var1;
            ayt var6 = sr.t(var5, 2137630662, new afh(var11, this.a, 11, (byte[])null));
            Object var7 = this.b;
            Object var8 = this.c;
            Object[] var9 = (Object[])this.a;
            String var15 = (String)var8;
            aon.b((bbb)null, (lmk)null, (qvx)null, (qvx)null, (qvy)null, var6, 0, false, (bdr)null, 0.0F, 0L, 0L, 0L, 0L, 0L, sr.t(var5, -1578412612, new bxn((String)var7, var15, var9, var11)), var5, 196608, 12582912);
         }

         return qsn.a;
      case 1:
         float var4 = ((Number)var1).floatValue();
         float var3 = ((Number)var2).floatValue();
         var1 = pwm.ac((Map)this.c, var4);
         var2 = pwm.ac((Map)this.c, var3);
         ((qvx)this.a).a(var1, var2);
         this.b.getClass();
         return car.z(var4, var3, 0.5F);
      default:
         asm var10 = (asm)var1;
         if ((11 & ((Number)var2).intValue()) == 2 && var10.G()) {
            var10.q();
         } else {
            var2 = this.b;
            Object var13 = this.c;
            Object[] var12 = (Object[])this.a;
            var12 = Arrays.copyOf(var12, var12.length);
            String var14 = (String)var13;
            bxl.a((String)var2, var14, var10, var12);
         }

         return qsn.a;
      }
   }
}
