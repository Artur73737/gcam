import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

public final class bfg extends bgb {
   public bcu a;
   public float b = 1.0F;
   public List c;
   public float d;
   public float e;
   public bcu f;
   public int g;
   public int h;
   public float i;
   public float j;
   public float k;
   public float l;
   public boolean m;
   public boolean n;
   public boolean o;
   public bbf p;
   private bey q;
   private final qsd r;
   private final bbf s;

   public bfg() {
      this.c = bgj.a;
      this.d = 1.0F;
      this.g = 0;
      this.h = 0;
      this.i = 4.0F;
      this.k = 1.0F;
      this.m = true;
      this.n = true;
      bbf var1 = eu.i();
      this.s = var1;
      this.p = var1;
      this.r = pwm.bu(3, ara.k);
   }

   private final void a() {
      if (this.j == 0.0F && this.k == 1.0F) {
         this.p = this.s;
      } else {
         if (c.E(this.p, this.s)) {
            this.p = eu.i();
         } else {
            int var4 = this.p.a();
            this.p.l();
            this.p.m(var4);
         }

         lmk var6 = this.d();
         bbf var5 = this.s;
         Object var8 = var6.a;
         Path var7 = (Path)var5.a;
         ((PathMeasure)var8).setPath(var7, false);
         float var1 = ((PathMeasure)this.d().a).getLength();
         float var3 = this.j;
         float var2 = this.l;
         var3 = (var3 + var2) % 1.0F * var1;
         var2 = (this.k + var2) % 1.0F * var1;
         if (var3 > var2) {
            this.d().aA(var3, var1, this.p);
            this.d().aA(0.0F, var2, this.p);
         } else {
            this.d().aA(var3, var2, this.p);
         }
      }
   }

   private final lmk d() {
      return (lmk)this.r.a();
   }

   public final void c(bev var1) {
      if (this.m) {
         gg.h(this.c, this.s);
         this.a();
      } else if (this.o) {
         this.a();
      }

      this.m = false;
      this.o = false;
      bcu var2 = this.a;
      if (var2 != null) {
         gf.s(var1, this.p, var2, this.b, (gf)null, 56);
      }

      bcu var3 = this.f;
      if (var3 != null) {
         bey var4 = this.q;
         if (this.n || var4 == null) {
            var4 = new bey(this.e, this.i, this.g, this.h, 16);
            this.q = var4;
            this.n = false;
         }

         gf.s(var1, this.p, var3, this.d, var4, 48);
      }

   }

   public final String toString() {
      return this.s.toString();
   }
}
