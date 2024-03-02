public final class bxt implements Comparable {
   public final float a;

   // $FF: synthetic method
   private bxt(float var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bxt a(float var0) {
      return new bxt(var0);
   }

   public static String b(float var0) {
      String var1;
      if (Float.isNaN(var0)) {
         var1 = "Dp.Unspecified";
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append(var0);
         var2.append(".dp");
         var1 = var2.toString();
      }

      return var1;
   }

   public static final boolean c(float var0, float var1) {
      return Float.compare(var0, var1) == 0;
   }

   // $FF: synthetic method
   public final int compareTo(Object var1) {
      float var2 = ((bxt)var1).a;
      return Float.compare(this.a, var2);
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bxt;
      float var2 = this.a;
      return var3 && Float.compare(var2, ((bxt)var1).a) == 0;
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a);
   }

   public final String toString() {
      return b(this.a);
   }
}
