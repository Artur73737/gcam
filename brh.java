public final class brh {
   public static final brh a = new brh(new qxo());
   public final qxo b;
   private final float c = 0.0F;
   private final int d;

   public brh(qxo var1) {
      this.b = var1;
      this.d = 0;
      if (Float.isNaN(0.0F)) {
         throw new IllegalArgumentException("current must not be NaN");
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof brh)) {
         return false;
      } else {
         brh var4 = (brh)var1;
         float var2 = var4.c;
         if (!c.E(this.b, var4.b)) {
            return false;
         } else {
            int var3 = var4.d;
            return true;
         }
      }
   }

   public final int hashCode() {
      return (Float.floatToIntBits(0.0F) * 31 + this.b.hashCode()) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ProgressBarRangeInfo(current=");
      var1.append(0.0F);
      var1.append(", range=");
      var1.append(this.b);
      var1.append(", steps=0)");
      return var1.toString();
   }
}
