import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;

public class bdn {
   public static long a(float var0, float var1) {
      long var2 = (long)Float.floatToIntBits(var0);
      long var4 = (long)Float.floatToIntBits(var1);
      long var6 = bdx.a;
      return var4 & 4294967295L | var2 << 32;
   }

   public static bbb b(bbb var0, qvt var1) {
      var0.getClass();
      return var0.g(new BlockGraphicsLayerElement(var1));
   }

   // $FF: synthetic method
   public static bbb c(bbb var0, float var1, float var2, float var3, float var4, bdr var5, boolean var6, int var7) {
      long var10;
      if ((var7 & 1024) != 0) {
         var10 = bdx.a;
      } else {
         var10 = 0L;
      }

      if ((var7 & 2048) != 0) {
         var5 = bdm.a;
      }

      float var8;
      if ((var7 & 512) != 0) {
         var8 = 8.0F;
      } else {
         var8 = 0.0F;
      }

      if ((var7 & 256) != 0) {
         var4 = 0.0F;
      }

      if ((var7 & 4) != 0) {
         var3 = 1.0F;
      }

      if ((var7 & 2) != 0) {
         var2 = 1.0F;
      }

      boolean var9 = true;
      if (1 == (var7 & 1)) {
         var1 = 1.0F;
      }

      boolean var16;
      if ((var7 & 4096) != 0) {
         var16 = false;
      } else {
         var16 = var9;
      }

      long var12 = bdd.a;
      long var14 = bdd.a;
      var0.getClass();
      var5.getClass();
      return var0.g(new GraphicsLayerElement(var1, var2, var3, var4, var8, var10, var5, var16 & var6, var12, var14));
   }
}
