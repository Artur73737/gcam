public enum rjx implements qfr {
   a,
   b,
   c,
   d,
   e,
   f,
   g;

   private static final rjx[] i;
   public final int h;

   static {
      rjx var0 = new rjx("UNKNOWN", 0, 0);
      a = var0;
      rjx var4 = new rjx("FOREGROUND_TO_BACKGROUND", 1, 1);
      b = var4;
      rjx var6 = new rjx("BACKGROUND_TO_FOREGROUND", 2, 2);
      c = var6;
      rjx var3 = new rjx("FOREGROUND_SERVICE_START", 3, 3);
      d = var3;
      rjx var2 = new rjx("FOREGROUND_SERVICE_STOP", 4, 4);
      e = var2;
      rjx var5 = new rjx("CUSTOM_MEASURE_START", 5, 5);
      f = var5;
      rjx var1 = new rjx("CUSTOM_MEASURE_STOP", 6, 6);
      g = var1;
      i = new rjx[]{var0, var4, var6, var3, var2, var5, var1};
   }

   private rjx(int var3) {
      this.h = var3;
   }

   public static rjx b(int var0) {
      switch(var0) {
      case 0:
         return a;
      case 1:
         return b;
      case 2:
         return c;
      case 3:
         return d;
      case 4:
         return e;
      case 5:
         return f;
      case 6:
         return g;
      default:
         return null;
      }
   }

   public final int a() {
      return this.h;
   }

   public final String toString() {
      return Integer.toString(this.h);
   }
}
