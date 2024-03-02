import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Iterator;
import java.util.Map.Entry;

public final class aqb extends aqq implements auq {
   public final azz a;
   private final boolean c;
   private final float d;
   private final avi e;
   private final avi f;

   public aqb(boolean var1, float var2, avi var3, avi var4) {
      super(var1, var4);
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.a = so.k();
   }

   public final void a() {
      this.a.clear();
   }

   public final void b() {
      this.a.clear();
   }

   public final void c() {
   }

   public final void d(ahr var1, qzv var2) {
      var1.getClass();
      var2.getClass();
      Iterator var3 = this.a.b.iterator();

      while(var3.hasNext()) {
         ((aqn)((Entry)var3.next()).getValue()).b();
      }

      bci var4;
      if (this.c) {
         var4 = bci.i(var1.a);
      } else {
         var4 = null;
      }

      aqn var5 = new aqn(var4, this.d, this.c);
      this.a.put(var1, var5);
      qwo.o(var2, (qui)null, 0, new aqa(var5, this, var1, (que)null), 3);
   }

   public final void e(ahr var1) {
      aqn var2 = (aqn)this.a.get(var1);
      if (var2 != null) {
         var2.b();
      }

   }

   public final void ev(bmf var1) {
      long var7 = ((bcy)this.e.a()).g;
      var1.l();
      this.h(var1, this.d, var7);
      Iterator var16 = this.a.b.iterator();

      while(true) {
         float var2;
         aqn var17;
         do {
            if (!var16.hasNext()) {
               return;
            }

            var17 = (aqn)((Entry)var16.next()).getValue();
            var2 = ((aqf)this.f.a()).d;
         } while(var2 == 0.0F);

         long var11 = bcy.i(var7, var2);
         long var9;
         if (var17.d == null) {
            var9 = var1.j();
            var17.d = Math.max(bcl.c(var9), bcl.a(var9)) * 0.3F;
         }

         Float var15;
         if (var17.e == null) {
            if (Float.isNaN(var17.b)) {
               var15 = lb.d(var1, var17.c, var1.j());
            } else {
               var15 = var1.eI(var17.b);
            }

            var17.e = var15;
         }

         if (var17.a == null) {
            var17.a = bci.i(var1.i());
         }

         if (var17.f == null) {
            var17.f = bci.i(es.i(bcl.c(var1.j()) / 2.0F, bcl.a(var1.j()) / 2.0F));
         }

         if ((Boolean)var17.k.a() && !(Boolean)var17.j.a()) {
            var2 = 1.0F;
         } else {
            var2 = ((Number)var17.g.d()).floatValue();
         }

         var15 = var17.d;
         var15.getClass();
         float var3 = var15;
         var15 = var17.e;
         var15.getClass();
         var3 = car.z(var3, var15, ((Number)var17.h.d()).floatValue());
         bci var18 = var17.a;
         var18.getClass();
         float var4 = bci.b(var18.d);
         var18 = var17.f;
         var18.getClass();
         var4 = car.z(var4, bci.b(var18.d), ((Number)var17.i.d()).floatValue());
         var18 = var17.a;
         var18.getClass();
         float var5 = bci.c(var18.d);
         var18 = var17.f;
         var18.getClass();
         float var6 = car.z(var5, bci.c(var18.d), ((Number)var17.i.d()).floatValue());
         var5 = bcy.a(var11);
         var9 = es.i(var4, var6);
         long var13 = bcy.i(var11, var5 * var2);
         if (var17.c) {
            var2 = bcl.c(var1.j());
            var4 = bcl.a(var1.j());
            bes var19 = var1.m();
            var11 = var19.a();
            var19.b().e();
            ((AmbientMode$AmbientController)var19.b).d(var2, var4);
            gf.r(var1, var13, var3, var9, (gf)null, 0, 120);
            var19.b().d();
            var19.c(var11);
         } else {
            gf.r(var1, var13, var3, var9, (gf)null, 0, 120);
         }
      }
   }
}
