public final class abx extends blh implements bbr, blu, bnj, bln {
   public final abu a;
   public final alk b;
   private bcb c;
   private final abz d;
   private final aby e;
   private final acb f;
   private final all g;

   public abx(lmk var1) {
      abz var2 = new abz();
      this.m(var2);
      this.d = var2;
      abu var3 = new abu(var1);
      this.m(var3);
      this.a = var3;
      aby var4 = new aby();
      this.m(var4);
      this.e = var4;
      acb var5 = new acb();
      this.m(var5);
      this.f = var5;
      alk var6 = new alk();
      this.b = var6;
      all var7 = new all(var6);
      this.m(var7);
      this.g = var7;
   }

   public final void c(brl var1) {
      var1.getClass();
      this.d.c(var1);
   }

   public final void d(bcb var1) {
      var1.getClass();
      if (!c.E(this.c, var1)) {
         boolean var2 = var1.a();
         aks var3 = null;
         if (var2) {
            qwo.o(this.o(), (qui)null, 0, new abw(this, (que)null), 3);
         }

         if (super.y) {
            kd.f(this);
         }

         abu var4 = this.a;
         lmk var5 = var4.b;
         if (var5 != null) {
            ahj var6;
            if (var2) {
               var6 = var4.a;
               if (var6 != null) {
                  var4.a(var5, new ahk(var6));
                  var4.a = null;
               }

               var6 = new ahj();
               var4.a(var5, var6);
               var4.a = var6;
            } else {
               var6 = var4.a;
               if (var6 != null) {
                  var4.a(var5, new ahk(var6));
                  var4.a = null;
               }
            }
         }

         acb var7 = this.f;
         if (var2 != var7.a) {
            if (!var2) {
               qvt var9 = var7.d();
               if (var9 != null) {
                  var9.eo((Object)null);
               }
            } else {
               var7.h();
            }

            var7.a = var2;
         }

         aby var10 = this.e;
         if (var2) {
            aks var8 = var10.d();
            if (var8 != null) {
               var8.f();
               var3 = var8;
            }

            var10.b = var3;
         } else {
            var3 = var10.b;
            if (var3 != null) {
               var3.b();
            }

            var10.b = null;
         }

         var10.a = var2;
         this.d.a = var2;
         this.c = var1;
      }
   }

   // $FF: synthetic method
   public final boolean et() {
      return false;
   }

   public final void f(bjf var1) {
      this.f.f(var1);
   }

   public final void g(bjf var1) {
      this.g.a = var1;
   }

   // $FF: synthetic method
   public final void h(long var1) {
   }
}
