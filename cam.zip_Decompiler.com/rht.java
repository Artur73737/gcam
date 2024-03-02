public final class rht {
   public final qyq a;
   public final long b;
   public final qyo c;
   public final nlz d;
   private final qyq e = qwp.i((Object)null);

   public rht(long var1, rht var3, int var4) {
      this.a = qwp.i(var3);
      this.b = var1;
      this.c = qwp.g(var4 << 16);
      this.d = qxb.y(rjr.f);
   }

   public final Object a() {
      return this.e.a;
   }

   public final rht b() {
      Object var1 = this.a();
      return var1 == rhs.a ? null : (rht)var1;
   }

   public final void c() {
      boolean var1 = qzx.a;

      rht var2;
      rht var3;
      do {
         do {
            for(var2 = (rht)this.a.a; var2 != null && var2.g(); var2 = (rht)var2.a.a) {
            }

            var3 = this.b();
            var3.getClass();

            while(var3.g()) {
               var3 = var3.b();
               var3.getClass();
            }

            var3.a.c(var2);
            if (var2 != null) {
               var2.e.c(var3);
            }
         } while(var3.g());
      } while(var2 != null && var2.g());

   }

   public final boolean d() {
      return this.b() == null;
   }

   public final boolean e(rht var1) {
      return this.e.d((Object)null, var1);
   }

   public final boolean f() {
      qyo var1 = this.c;
      return qyo.a.addAndGet(var1, -65536) == rjr.f && !this.d();
   }

   public final boolean g() {
      return this.c.b == rjr.f && !this.d();
   }

   public final boolean h() {
      qyo var3 = this.c;

      boolean var2;
      while(true) {
         int var1 = var3.b;
         if (var1 == rjr.f && !this.d()) {
            var2 = false;
            break;
         }

         if (var3.c(var1, 65536 + var1)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final String toString() {
      long var2 = this.b;
      int var1 = this.hashCode();
      StringBuilder var4 = new StringBuilder();
      var4.append("SemaphoreSegment[id=");
      var4.append(var2);
      var4.append(", hashCode=");
      var4.append(var1);
      var4.append("]");
      return var4.toString();
   }
}
