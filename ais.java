import java.util.List;

public final class ais {
   public final qwa a;
   public final float b;
   public final ail c;
   public final List d;
   public final bke[] e;
   public final ait[] f;
   public final int g;

   public ais(int var1, qwa var2, float var3, ail var4, List var5, bke[] var6) {
      this.g = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      int var7 = var5.size();
      ait[] var11 = new ait[var7];

      for(var1 = 0; var1 < var7; ++var1) {
         bjd var8 = (bjd)this.d.get(var1);
         var8.getClass();
         Object var9 = var8.c();
         ait var10;
         if (var9 instanceof ait) {
            var10 = (ait)var9;
         } else {
            var10 = null;
         }

         var11[var1] = var10;
      }

      this.f = var11;
   }

   public final int a(bke var1) {
      int var2;
      if (this.g == 1) {
         var2 = var1.b;
      } else {
         var2 = var1.a;
      }

      return var2;
   }

   public final int b(bke var1) {
      int var2;
      if (this.g == 1) {
         var2 = var1.a;
      } else {
         var2 = var1.b;
      }

      return var2;
   }
}
