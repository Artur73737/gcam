import android.animation.ValueAnimator;
import android.animation.ValueAnimator.DurationScaleChangeListener;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

public abstract class cjs implements cjc {
   public static final cjr a = new cji();
   public static final cjr b = new cjj();
   public static final cjr c = new cjk();
   public static final cjr d = new cjl();
   public static final cjr e = new cjm();
   public static final cjr f = new cjn();
   public static final cjr g = new cjg();
   public float h = 0.0F;
   float i = Float.MAX_VALUE;
   boolean j = false;
   final Object k;
   final cju l;
   public boolean m = false;
   public float n = Float.MAX_VALUE;
   float o = -3.4028235E38F;
   public float p;
   private long q = 0L;
   private final ArrayList r = new ArrayList();
   private final ArrayList s = new ArrayList();

   public cjs(jaq var1) {
      this.k = null;
      this.l = new cjh(var1);
      this.p = 1.0F;
   }

   public cjs(Object var1, cju var2) {
      this.k = var1;
      this.l = var2;
      float var3;
      if (var2 != d && var2 != e && var2 != f) {
         if (var2 == g) {
            var3 = 0.00390625F;
         } else if (var2 != b && var2 != c) {
            var3 = 1.0F;
         } else {
            var3 = 0.002F;
         }
      } else {
         var3 = 0.1F;
      }

      this.p = var3;
   }

   private static void k(ArrayList var0) {
      for(int var1 = var0.size() - 1; var1 >= 0; --var1) {
         if (var0.get(var1) == null) {
            var0.remove(var1);
         }
      }

   }

   public final void a(long var1) {
      long var4 = this.q;
      if (var4 == 0L) {
         this.q = var1;
         this.c(this.i);
      } else {
         this.q = var1;
         float var3 = cjf.a().f;
         if (var3 == 0.0F) {
            var1 = 2147483647L;
         } else {
            var1 = (long)((float)(var1 - var4) / var3);
         }

         boolean var6 = this.e(var1);
         var3 = Math.min(this.i, this.n);
         this.i = var3;
         var3 = Math.max(var3, this.o);
         this.i = var3;
         this.c(var3);
         if (var6) {
            this.j();
         }

      }
   }

   final float b() {
      return this.p * 0.75F;
   }

   final void c(float var1) {
      this.l.b(this.k, var1);

      for(int var2 = 0; var2 < this.s.size(); ++var2) {
         if (this.s.get(var2) != null) {
            ((cjq)this.s.get(var2)).a(this.i);
         }
      }

      k(this.s);
   }

   public void d() {
      if (!cjf.a().b()) {
         throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
      } else {
         if (!this.m) {
            this.m = true;
            if (!this.j) {
               this.i = this.l.a(this.k);
            }

            float var1 = this.i;
            if (var1 > this.n || var1 < this.o) {
               throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }

            cjf var2 = cjf.a();
            if (var2.b.size() == 0) {
               var2.i.u(var2.c);
               var2.f = ValueAnimator.getDurationScale();
               if (var2.g == null) {
                  var2.g = new cje(var2);
               }

               cje var3 = var2.g;
               if (var3.a == null) {
                  var3.a = new cjd(var3);
                  ValueAnimator.registerDurationScaleChangeListener((DurationScaleChangeListener)var3.a);
               }
            }

            if (!var2.b.contains(this)) {
               var2.b.add(this);
               return;
            }
         }

      }
   }

   public abstract boolean e(long var1);

   public final void f(cjp var1) {
      if (!this.r.contains(var1)) {
         this.r.add(var1);
      }

   }

   public final void g(cjq var1) {
      if (!this.m) {
         if (!this.s.contains(var1)) {
            this.s.add(var1);
         }

      } else {
         throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
      }
   }

   public final void h() {
      this.o = 0.0F;
   }

   public final void i(float var1) {
      this.i = var1;
      this.j = true;
   }

   public final void j() {
      int var1 = 0;
      this.m = false;
      cjf var3 = cjf.a();
      var3.a.remove(this);
      int var2 = var3.b.indexOf(this);
      if (var2 >= 0) {
         var3.b.set(var2, (Object)null);
         var3.e = true;
      }

      this.q = 0L;

      for(this.j = false; var1 < this.r.size(); ++var1) {
         if (this.r.get(var1) != null) {
            ((cjp)this.r.get(var1)).a();
         }
      }

      k(this.r);
   }
}
