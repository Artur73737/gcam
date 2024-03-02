public final class zx implements zp {
   public final float a;
   public final float b;
   public final Object c;

   public zx() {
      this((Object)null);
   }

   public zx(float var1, float var2, Object var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   public zx(Object var1) {
      this(1.0F, 1500.0F, var1);
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof zx) {
         zx var2 = (zx)var1;
         if (var2.a == this.a && var2.b == this.b && c.E(var2.c, this.c)) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      Object var2 = this.c;
      int var1;
      if (var2 != null) {
         var1 = var2.hashCode();
      } else {
         var1 = 0;
      }

      return (var1 * 31 + Float.floatToIntBits(this.a)) * 31 + Float.floatToIntBits(this.b);
   }
}
