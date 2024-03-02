public final class bxh {
   public static final bxh a = new bxh((byte[])null);
   public final float b;
   public final float c;

   public bxh() {
      this((byte[])null);
   }

   public bxh(byte[] var1) {
      this.b = 1.0F;
      this.c = 0.0F;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bxh)) {
         return false;
      } else {
         bxh var3 = (bxh)var1;
         float var2 = var3.b;
         var2 = var3.c;
         return true;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(1.0F) * 31 + Float.floatToIntBits(0.0F);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TextGeometricTransform(scaleX=");
      var1.append(1.0F);
      var1.append(", skewX=");
      var1.append(0.0F);
      var1.append(')');
      return var1.toString();
   }
}
