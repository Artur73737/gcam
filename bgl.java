import androidx.wear.ambient.AmbientMode$AmbientController;

public final class bgl extends bfa {
   public final att e;
   public final att f;
   public final bgd g;
   private ass h;
   private final att i;
   private float j;
   private dmw k;

   public bgl() {
      this.e = sg.d(bcl.d(bcl.a));
      this.f = sg.d(false);
      bgd var1 = new bgd();
      var1.b = new amp(this, 14);
      this.g = var1;
      this.i = sg.d(true);
      this.j = 1.0F;
   }

   public final long a() {
      return ((bcl)this.e.a()).c;
   }

   public final void b(bev var1) {
      bgd var8 = this.g;
      dmw var7 = this.k;
      dmw var6 = var7;
      if (var7 == null) {
         var6 = var8.d();
      }

      if ((Boolean)this.f.a() && var1.k() == bxy.b) {
         long var2 = var1.i();
         bes var9 = var1.m();
         long var4 = var9.a();
         var9.b().e();
         bcw var10 = ((bes)((AmbientMode$AmbientController)var9.b).a).b();
         var10.g(bci.b(var2), bci.c(var2));
         var10.o();
         var10.g(-bci.b(var2), -bci.c(var2));
         var8.f(var1, this.j, var6);
         var9.b().d();
         var9.c(var4);
      } else {
         var8.f(var1, this.j, var6);
      }

      if ((Boolean)this.i.a()) {
         this.e(false);
      }

   }

   public final void c(float var1) {
      this.j = var1;
   }

   public final void d(dmw var1) {
      this.k = var1;
   }

   public final void e(boolean var1) {
      this.i.b(var1);
   }

   public final void f(float var1, float var2, qvz var3, asm var4, int var5) {
      asm var6 = var4.b(1264894527);
      bgd var8 = this.g;
      var8.a.f("");
      if (var8.d != var1) {
         var8.d = var1;
         var8.a();
      }

      if (var8.e != var2) {
         var8.e = var2;
         var8.a();
      }

      ast var7 = lh.e(var6);
      ass var9 = this.h;
      if (var9 == null || ((asw)var9).h) {
         var9 = asx.a(new bgc(this.g.a), var7);
      }

      this.h = var9;
      var9.c(sr.r(-1916507005, true, new afh(var3, this, 5)));
      atj.c(var9, new arh(var9, 18), var6);
      aug var10 = var6.H();
      if (var10 != null) {
         var10.c = new bgk(this, var1, var2, var3, var5);
      }
   }
}
