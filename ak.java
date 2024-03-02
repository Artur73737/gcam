public final class ak {
   public int a = -1;
   public int b = -1;
   public int c = 0;
   public float d;
   public final float[] e = new float[6];
   ah[] f = new ah[8];
   int g = 0;
   public int h;

   public ak(int var1) {
      this.h = var1;
   }

   final void a(ah var1) {
      int var3 = 0;

      for(int var2 = 0; var2 < this.g; ++var2) {
         if (this.f[var2] == var1) {
            while(true) {
               int var4 = this.g;
               if (var3 >= var4 - var2 - 1) {
                  this.g = var4 - 1;
                  return;
               }

               ah[] var5 = this.f;
               var4 = var2 + var3;
               var5[var4] = var5[var4 + 1];
               ++var3;
            }
         }
      }

   }

   public final void b() {
      this.h = 5;
      this.c = 0;
      this.a = -1;
      this.b = -1;
      this.d = 0.0F;
      this.g = 0;
   }

   public final String toString() {
      return "null";
   }
}
