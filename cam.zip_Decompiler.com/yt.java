public final class yt {
   public final zc a;
   public final blj b;
   public final bpe c;
   private final Object d;
   private final att e;
   private final att f;
   private final zx g;
   private final zh h;
   private final zh i;
   private zh j;
   private zh k;

   public yt(Object var1, bpe var2, Object var3) {
      this.c = var2;
      this.d = var3;
      this.a = new zc(var2, var1, (zh)null, 60);
      this.e = sg.d(false);
      this.f = sg.d(var1);
      this.b = new blj((char[])null);
      this.g = new zx(var3);
      zh var4 = this.a();
      if (var4 instanceof zd) {
         var1 = yu.e;
      } else if (var4 instanceof ze) {
         var1 = yu.f;
      } else if (var4 instanceof zf) {
         var1 = yu.g;
      } else {
         var1 = yu.h;
      }

      this.h = (zh)var1;
      zh var5 = this.a();
      Object var6;
      if (var5 instanceof zd) {
         var6 = yu.a;
      } else if (var5 instanceof ze) {
         var6 = yu.b;
      } else if (var5 instanceof zf) {
         var6 = yu.c;
      } else {
         var6 = yu.d;
      }

      this.i = (zh)var6;
      this.j = (zh)var1;
      this.k = (zh)var6;
   }

   // $FF: synthetic method
   public yt(Object var1, bpe var2, Object var3, int var4) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3);
   }

   // $FF: synthetic method
   public static Object h(yt var0, Object var1, zb var2, qvt var3, que var4, int var5) {
      if ((var5 & 2) != 0) {
         var2 = var0.g;
      }

      Object var8;
      if ((var5 & 4) != 0) {
         var8 = ((qvt)var0.c.b).eo(var0.a());
      } else {
         var8 = null;
      }

      if ((var5 & 8) != 0) {
         var3 = null;
      }

      Object var10 = var0.d();
      bpe var9 = var0.c;
      var2.getClass();
      aac var11 = new aac((zb)var2, var9, var10, var1, (zh)((qvt)var9.a).eo(var8));
      long var6 = var0.a.b;
      return blj.x(var0.b, new yr(var0, var8, var11, var6, var3, (que)null), var4);
   }

   public final zh a() {
      return this.a.a;
   }

   public final Object b(Object var1) {
      if (c.E(this.j, this.h) && c.E(this.k, this.i)) {
         return var1;
      } else {
         zh var5 = (zh)((qvt)this.c.a).eo(var1);
         int var4 = var5.b();
         int var2 = 0;

         boolean var3;
         for(var3 = false; var2 < var4; ++var2) {
            if (var5.a(var2) < this.j.a(var2) || var5.a(var2) > this.k.a(var2)) {
               var5.e(var2, qxb.j(var5.a(var2), this.j.a(var2), this.k.a(var2)));
               var3 = true;
            }
         }

         if (var3) {
            var1 = ((qvt)this.c.b).eo(var5);
         }

         return var1;
      }
   }

   public final Object c() {
      return this.f.a();
   }

   public final Object d() {
      return this.a.a();
   }

   public final void e() {
      zc var1 = this.a;
      var1.a.d();
      var1.b = Long.MIN_VALUE;
      this.f(false);
   }

   public final void f(boolean var1) {
      this.e.b(var1);
   }

   public final void g(Object var1) {
      this.f.b(var1);
   }
}
