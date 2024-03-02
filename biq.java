public final class biq {
   private final float a;
   private final float b;
   private final long c;

   public biq(float var1, float var2, long var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof biq) {
         biq var2 = (biq)var1;
         if (var2.a == this.a && var2.b == this.b && var2.c == this.c) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return (Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + c.p(this.c);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RotaryScrollEvent(verticalScrollPixels=");
      var1.append(this.a);
      var1.append(",horizontalScrollPixels=");
      var1.append(this.b);
      var1.append(",uptimeMillis=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
