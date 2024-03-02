import android.content.Context;
import java.util.List;
import java.util.Map;

public final class apz extends aqq implements auq {
   public final att a;
   private final boolean c;
   private final float d;
   private final avi e;
   private final avi f;
   private final aqo g;
   private final att h;
   private long i;
   private int j;
   private final qvi k;

   public apz(boolean var1, float var2, avi var3, avi var4, aqo var5) {
      super(var1, var4);
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
      this.h = sg.d((Object)null);
      this.a = sg.d(true);
      this.i = bcl.a;
      this.j = -1;
      this.k = new amp(this, 8);
   }

   private final aqp i() {
      return (aqp)this.h.a();
   }

   private final void j() {
      aqo var1 = this.g;
      this.f();
      aqp var2 = var1.e.f(this);
      if (var2 != null) {
         var2.a();
         var1.e.g(this);
         var1.c.add(var2);
      }

   }

   private final void k(aqp var1) {
      this.h.b(var1);
   }

   public final void a() {
      this.j();
   }

   public final void b() {
      this.j();
   }

   public final void c() {
   }

   public final void d(ahr var1, qzv var2) {
      var1.getClass();
      var2.getClass();
      aqo var11 = this.g;
      aqp var10 = var11.e.f(this);
      aqp var13 = var10;
      int var4;
      if (var10 == null) {
         List var14 = var11.c;
         var14.getClass();
         Object var15;
         if (var14.isEmpty()) {
            var15 = null;
         } else {
            var15 = var14.remove(0);
         }

         var10 = (aqp)var15;
         var13 = var10;
         if (var10 == null) {
            if (var11.d > pwm.al(var11.b)) {
               Context var16 = var11.getContext();
               var16.getClass();
               var13 = new aqp(var16);
               var11.addView(var13);
               var11.b.add(var13);
            } else {
               var10 = (aqp)var11.b.get(var11.d);
               bpe var17 = var11.e;
               var10.getClass();
               apz var12 = (apz)((Map)var17.a).get(var10);
               var13 = var10;
               if (var12 != null) {
                  var12.f();
                  var11.e.g(var12);
                  var10.a();
                  var13 = var10;
               }
            }

            var4 = var11.d;
            if (var4 < var11.a - 1) {
               var11.d = var4 + 1;
            } else {
               var11.d = 0;
            }
         }

         bpe var18 = var11.e;
         var13.getClass();
         ((Map)var18.b).put(this, var13);
         ((Map)var18.a).put(var13, this);
      }

      boolean var9 = this.c;
      long var5 = this.i;
      var4 = this.j;
      long var7 = ((bcy)this.e.a()).g;
      float var3 = ((aqf)this.f.a()).d;
      qvi var19 = this.k;
      var19.getClass();
      aqy var20;
      if (var13.b == null || !c.E(var9, var13.c)) {
         var20 = new aqy(var9);
         var13.setBackground(var20);
         var13.b = var20;
         var13.c = var9;
      }

      var20 = var13.b;
      var20.getClass();
      var13.e = var19;
      var13.c(var5, var4, var7, var3);
      if (var9) {
         var20.setHotspot(bci.b(var1.a), bci.c(var1.a));
      } else {
         var20.setHotspot((float)var20.getBounds().centerX(), (float)var20.getBounds().centerY());
      }

      var13.b(true);
      this.k(var13);
   }

   public final void e(ahr var1) {
      aqp var2 = this.i();
      if (var2 != null) {
         var2.b(false);
      }

   }

   public final void ev(bmf var1) {
      this.i = var1.j();
      int var3;
      if (Float.isNaN(this.d)) {
         var3 = qxg.e(lb.d(var1, this.c, var1.j()));
      } else {
         var3 = var1.eJ(this.d);
      }

      this.j = var3;
      long var4 = ((bcy)this.e.a()).g;
      float var2 = ((aqf)this.f.a()).d;
      var1.l();
      this.h(var1, this.d, var4);
      bcw var7 = var1.m().b();
      this.g();
      aqp var6 = this.i();
      if (var6 != null) {
         var6.c(var1.j(), this.j, var4, var2);
         var6.draw(bcn.a(var7));
      }

   }

   public final void f() {
      this.k((aqp)null);
   }

   public final boolean g() {
      return (Boolean)this.a.a();
   }
}
