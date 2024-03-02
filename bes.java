import androidx.wear.ambient.AmbientMode$AmbientController;

public final class bes {
   final Object a;
   public final Object b;

   public bes(bet var1) {
      this.a = var1;
      this.b = new AmbientMode$AmbientController(this);
   }

   public bes(vy var1) {
      this.a = var1;
      this.b = qwp.f(false);
   }

   public final long a() {
      return ((bet)this.a).a.d;
   }

   public final bcw b() {
      return ((bet)this.a).a.c;
   }

   public final void c(long var1) {
      ((bet)this.a).a.d = var1;
   }

   public final void d() {
      if (((qyn)this.b).b()) {
         Object var3 = this.a;
         Object var2 = ((vy)var3).b;
         synchronized(var2){}

         Throwable var10000;
         label93: {
            int var1;
            boolean var10001;
            try {
               var1 = ((vy)var3).c - 1;
               ((vy)var3).c = var1;
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label93;
            }

            if (var1 != 0) {
               return;
            }

            label82:
            try {
               if (!((vy)var3).e) {
                  ((vy)var3).a();
               }

               return;
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label82;
            }
         }

         Throwable var10 = var10000;
         throw var10;
      }
   }
}
