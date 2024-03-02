public final class bxa {
   public static final float a;
   public static final float b;
   public static final float c;

   static {
      a(0.0F);
      a(0.5F);
      a = 0.5F;
      a(-1.0F);
      b = -1.0F;
      a(1.0F);
      c = 1.0F;
   }

   public static void a(float var0) {
      if ((var0 < 0.0F || !(var0 <= 1.0F)) && var0 != -1.0F) {
         throw new IllegalStateException("topRatio should be in [0..1] range or -1");
      }
   }

   public final boolean equals(Object var1) {
      throw null;
   }

   public final int hashCode() {
      throw null;
   }

   public final String toString() {
      throw null;
   }
}
