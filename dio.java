public final class dio extends dil {
   public int b = 2048;
   public String c = "\n";
   public String d = "  ";

   public dio() {
   }

   public dio(int var1) {
      super(var1);
   }

   protected final int a() {
      return 4976;
   }

   public final String b() {
      if (this.c()) {
         return "UTF-16BE";
      } else {
         return this.d() ? "UTF-16LE" : "UTF-8";
      }
   }

   public final boolean c() {
      return (super.a & 3) == 2;
   }

   public final Object clone() {
      try {
         dio var1 = new dio(super.a);
         var1.d = this.d;
         var1.c = this.c;
         var1.b = this.b;
         return var1;
      } catch (dhl var2) {
         return null;
      }
   }

   public final boolean d() {
      return (super.a & 3) == 3;
   }

   public final boolean i() {
      return this.h(512);
   }

   public final boolean j() {
      return this.h(256);
   }

   public final boolean k() {
      return this.h(16);
   }

   public final boolean l() {
      return this.h(32);
   }
}
