final class cv {
   int a;
   bv b;
   boolean c;
   int d;
   int e;
   int f;
   int g;
   clw h;
   clw i;

   public cv() {
   }

   public cv(int var1, bv var2) {
      this.a = var1;
      this.b = var2;
      this.c = false;
      this.h = clw.e;
      this.i = clw.e;
   }

   public cv(int var1, bv var2, byte[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = true;
      this.h = clw.e;
      this.i = clw.e;
   }
}
