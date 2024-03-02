public final class vy {
   public final qvi a;
   public final Object b;
   public int c;
   public rbd d;
   public boolean e;
   private final qzv f;

   public vy(qzv var1, qvi var2) {
      this.f = var1;
      this.a = var2;
      Object var5 = new Object();
      this.b = var5;
      synchronized(var5){}

      try {
         this.a();
      } finally {
         ;
      }

   }

   public final void a() {
      this.d = qwo.o(this.f, (qui)null, 0, new vx(this, (que)null), 3);
   }

   public final void b() {
      Object var2 = this.b;
      synchronized(var2){}

      Throwable var10000;
      label190: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.e;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label190;
         }

         if (var1) {
            return;
         }

         rbd var3;
         try {
            this.e = true;
            var3 = this.d;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label190;
         }

         if (var3 != null) {
            try {
               qxb.r(var3);
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label190;
            }
         }

         try {
            this.d = null;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label190;
         }

         qwo.o(this.f, (qui)null, 0, new vw(this, (que)null), 3);
         return;
      }

      Throwable var24 = var10000;
      throw var24;
   }
}
