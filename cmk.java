public class cmk {
   public static final Object a = new Object();
   public final Object b = new Object();
   public final qh c = new qh();
   public int d = 0;
   public boolean e;
   public volatile Object f;
   public volatile Object g;
   public int h;
   public final Runnable i;
   private boolean j;
   private boolean k;

   public cmk() {
      Object var1 = a;
      this.g = var1;
      this.i = new nj(this, 14, (byte[])null);
      this.f = var1;
      this.h = -1;
   }

   public cmk(Object var1) {
      this.g = a;
      this.i = new nj(this, 14, (byte[])null);
      this.f = var1;
      this.h = 0;
   }

   public static void b(String var0) {
      if (!px.n().o()) {
         throw new IllegalStateException(c.aA(var0, "Cannot invoke ", " on a background thread"));
      }
   }

   private final void i(cmj var1) {
      if (var1.d) {
         if (!var1.a()) {
            var1.d(false);
         } else {
            int var2 = var1.e;
            int var3 = this.h;
            if (var2 < var3) {
               var1.e = var3;
               var1.c.a(this.f);
            }
         }
      }
   }

   public final Object a() {
      Object var1 = this.f;
      return var1 != a ? var1 : null;
   }

   final void c(cmj var1) {
      if (this.j) {
         this.k = true;
      } else {
         this.j = true;

         while(true) {
            this.k = false;
            if (var1 != null) {
               this.i(var1);
            } else {
               qe var2 = this.c.e();

               while(var2.hasNext()) {
                  this.i((cmj)((qd)var2.a()).b);
                  if (this.k) {
                     break;
                  }
               }
            }

            if (!this.k) {
               this.j = false;
               return;
            }

            var1 = null;
         }
      }
   }

   public final void d(cmc var1, cmm var2) {
      b("observe");
      if (var1.getLifecycle().b != clw.a) {
         cmi var3 = new cmi(this, var1, var2);
         cmj var4 = (cmj)this.c.f(var2, var3);
         if (var4 != null && !var4.c(var1)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
         } else if (var4 == null) {
            var1.getLifecycle().a(var3);
         }
      }
   }

   protected void e() {
   }

   protected void f() {
   }

   public void g(cmm var1) {
      b("removeObserver");
      cmj var2 = (cmj)this.c.b(var1);
      if (var2 != null) {
         var2.b();
         var2.d(false);
      }
   }

   public void h(Object var1) {
      throw null;
   }
}
