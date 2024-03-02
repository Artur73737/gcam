public final class dii {
   public String a;
   public int b;
   public boolean c;
   public int d;

   public dii(String var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      this.c = true;
   }

   public final String toString() {
      switch(this.b) {
      case 1:
      case 2:
      case 3:
      case 4:
         return this.a;
      case 5:
      case 6:
         return this.a;
      default:
         return this.a;
      }
   }
}
