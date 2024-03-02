public final class ads implements afa {
   private final int a;

   public ads(int var1) {
      this.a = var1;
   }

   public final float a(long var1) {
      switch(this.a) {
      case 0:
         return bci.b(var1);
      default:
         return bci.c(var1);
      }
   }

   public final float b(long var1) {
      switch(this.a) {
      case 0:
         return bci.c(var1);
      default:
         return bci.b(var1);
      }
   }

   public final long c(float var1, float var2) {
      switch(this.a) {
      case 0:
         return es.i(var2, var1);
      default:
         return es.i(var1, var2);
      }
   }
}
