import java.util.ArrayList;
import java.util.List;

public final class bfe {
   public String a;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   public List i;
   public List j;

   public bfe() {
      this((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (List)null, 1023);
   }

   // $FF: synthetic method
   public bfe(String var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, List var9, int var10) {
      if ((var10 & 256) != 0) {
         var9 = bgj.a;
      }

      float var11 = 0.0F;
      if ((var10 & 128) != 0) {
         var8 = 0.0F;
      }

      if ((var10 & 64) != 0) {
         var7 = 0.0F;
      }

      float var12 = 1.0F;
      if ((var10 & 32) != 0) {
         var6 = 1.0F;
      }

      if ((var10 & 16) != 0) {
         var5 = var12;
      }

      if ((var10 & 8) != 0) {
         var4 = 0.0F;
      }

      if ((var10 & 4) != 0) {
         var3 = 0.0F;
      }

      if ((var10 & 2) != 0) {
         var2 = var11;
      }

      if (1 == (var10 & 1)) {
         var1 = "";
      }

      ArrayList var13 = new ArrayList();
      var1.getClass();
      var9.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var13;
   }
}
