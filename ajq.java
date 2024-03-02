import java.util.List;

public final class ajq {
   public final int a;
   public final List b;
   public final long c;
   public final Object d;
   public int e;
   public final int f;
   public final int g;
   public final int h;
   public int i;
   private final int j;
   private final int[] k;
   private final bat l;

   public ajq(int var1, List var2, bat var3, bxy var4, int var5, long var6, Object var8) {
      var4.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.l = var3;
      this.j = var5;
      this.c = var6;
      this.d = var8;
      this.i = Integer.MIN_VALUE;
      int var10 = var2.size();
      var5 = 0;
      int var9 = 0;

      for(var1 = 0; var5 < var10; ++var5) {
         bke var11 = (bke)var2.get(var5);
         var9 += var11.a;
         var1 = Math.max(var1, var11.b);
      }

      this.f = var9;
      this.g = qxb.k(var9 + this.j, 0);
      this.h = var1;
      var1 = this.b.size();
      this.k = new int[var1 + var1];
   }

   public final int a() {
      return this.b.size();
   }

   public final long b(int var1) {
      int[] var2 = this.k;
      var1 += var1;
      return car.K(var2[var1], var2[var1 + 1]);
   }

   public final Object c(int var1) {
      return ((bke)this.b.get(var1)).c();
   }

   public final void d(int var1, int var2, int var3) {
      this.e = var1;
      this.i = var2;
      List var6 = this.b;
      int var5 = var6.size();
      byte var4 = 0;
      var2 = var1;

      for(var1 = var4; var1 < var5; ++var1) {
         bke var8 = (bke)var6.get(var1);
         int[] var7 = this.k;
         int var10 = var1 + var1;
         var7[var10] = var2;
         bat var9 = this.l;
         if (var9 == null) {
            throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
         }

         var7[var10 + 1] = var9.a(var8.b, var3);
         var2 += var8.a;
      }

   }
}
