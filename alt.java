public abstract class alt implements bdr {
   public final alu a;
   public final alu b;
   public final alu c;
   public final alu d;

   public alt(alu var1, alu var2, alu var3, alu var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final bdn a(long var1, bxy var3, bxr var4) {
      var3.getClass();
      var4.getClass();
      float var6 = this.a.a(var1, var4);
      float var10 = this.b.a(var1, var4);
      float var9 = this.c.a(var1, var4);
      float var5 = this.d.a(var1, var4);
      float var7 = var6 + var5;
      float var11 = bcl.b(var1);
      if (var7 > var11) {
         var7 = var11 / var7;
         var6 *= var7;
         var5 *= var7;
      }

      float var12 = var10 + var9;
      float var8 = var10;
      var7 = var9;
      if (var12 > var11) {
         var7 = var11 / var12;
         var8 = var10 * var7;
         var7 = var9 * var7;
      }

      if (var6 >= 0.0F && var8 >= 0.0F && var7 >= 0.0F && var5 >= 0.0F) {
         return this.b(var1, var6, var8, var7, var5, var3);
      } else {
         StringBuilder var13 = new StringBuilder();
         var13.append("Corner size in Px can't be negative(topStart = ");
         var13.append(var6);
         var13.append(", topEnd = ");
         var13.append(var8);
         var13.append(", bottomEnd = ");
         var13.append(var7);
         var13.append(", bottomStart = ");
         var13.append(var5);
         var13.append(")!");
         throw new IllegalArgumentException(var13.toString());
      }
   }

   public abstract bdn b(long var1, float var3, float var4, float var5, float var6, bxy var7);
}
