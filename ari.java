import androidx.compose.ui.draw.PainterElement;

public final class ari {
   private static final bbb a;

   static {
      a = aix.c(bbb.d, 24.0F);
   }

   public static final void a(bfa var0, String var1, bbb var2, long var3, asm var5, int var6, int var7) {
      var0.getClass();
      asm var14 = var5.b(-2142239481);
      if ((var7 & 4) != 0) {
         var2 = bbb.d;
      }

      dmw var17;
      if (c.o(var3, bcy.f)) {
         var17 = null;
      } else {
         var17 = et.p(var3, 5);
      }

      Object var12;
      asq var15;
      bay var16;
      label36: {
         var14.u(69356817);
         var16 = bbb.d;
         var14.u(1157296644);
         boolean var11 = var14.B(var1);
         var15 = (asq)var14;
         Object var13 = var15.O();
         if (!var11) {
            var12 = var13;
            if (var13 != asl.a) {
               break label36;
            }
         }

         var12 = new arh(var1, 0);
         var15.Y(var12);
      }

      bbb var19;
      label30: {
         var15.S();
         var19 = brm.b(var16, (qvt)var12);
         var15.S();
         var2.getClass();
         if (!c.o(var0.a(), bcl.b)) {
            long var9 = var0.a();
            if (!Float.isInfinite(bcl.c(var9)) || !Float.isInfinite(bcl.a(var9))) {
               var12 = bbb.d;
               break label30;
            }
         }

         var12 = a;
      }

      bbb var21 = ((bbb)var2).g((bbb)var12);
      int var8 = bja.b;
      bja var20 = biz.a;
      var8 = bar.a;
      aig.b(var21.g(new PainterElement(var0, baq.b, var20, var17)).g(var19), var14, 0);
      aug var18 = var14.H();
      if (var18 != null) {
         var18.c = new arg(var0, var1, (bbb)var2, var3, var6, var7);
      }
   }
}
