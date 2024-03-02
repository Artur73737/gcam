public final class akw implements akv {
   public final int a;
   public final long b;
   public boolean c;
   public bjp d;

   public akw(int var1, long var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      if (!this.c) {
         this.c = true;
         bjp var1 = this.d;
         if (var1 != null) {
            var1.a();
         }

         this.d = null;
      }

   }
}
