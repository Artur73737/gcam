import androidx.window.area.reflectionguard.TU.aGGlrXh;

public final class aac implements yy {
   public final Object a;
   public final Object b;
   public final long c;
   private final aan d;
   private final zh e;
   private final zh f;
   private final zh g;
   private final zh h;
   private final bpe i;

   public aac(zb var1, bpe var2, Object var3, Object var4, zh var5) {
      var1.getClass();
      aan var6 = var1.a(var2);
      super();
      this.d = var6;
      this.i = var2;
      this.a = var3;
      this.b = var4;
      zh var7 = (zh)((qvt)var2.a).eo(var3);
      this.e = var7;
      zh var9 = (zh)((qvt)var2.a).eo(var4);
      this.f = var9;
      zh var8;
      if (var5 != null) {
         var8 = do.x(var5);
      } else {
         var8 = do.y((zh)((qvt)var2.a).eo(var3));
      }

      this.g = var8;
      this.c = var6.a(var7, var9, var8);
      this.h = var6.b(var7, var9, var8);
   }

   public final long a() {
      return this.c;
   }

   public final zh b(long var1) {
      zh var3;
      if (!sp.d(this, var1)) {
         var3 = this.d.d(var1, this.e, this.f, this.g);
      } else {
         var3 = this.h;
      }

      return var3;
   }

   public final Object c(long var1) {
      Object var7;
      if (!sp.d(this, var1)) {
         zh var6 = this.d.c(var1, this.e, this.f, this.g);
         int var4 = var6.b();

         for(int var3 = 0; var3 < var4; ++var3) {
            if (Float.isNaN(var6.a(var3))) {
               StringBuilder var5 = new StringBuilder();
               var5.append("AnimationVector cannot contain a NaN. ");
               var5.append(var6);
               var5.append(". Animation: ");
               var5.append(this);
               var5.append(", playTimeNanos: ");
               var5.append(var1);
               throw new IllegalStateException(var5.toString());
            }
         }

         var7 = ((qvt)this.i.b).eo(var6);
      } else {
         var7 = this.b;
      }

      return var7;
   }

   // $FF: synthetic method
   public final boolean d(long var1) {
      return sp.d(this, var1);
   }

   public final void e() {
   }

   public final void f() {
   }

   public final bpe g() {
      return this.i;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TargetBasedAnimation: ");
      var1.append(this.a);
      var1.append(" -> ");
      var1.append(this.b);
      var1.append(aGGlrXh.oRGCq);
      var1.append(this.g);
      var1.append(", duration: ");
      var1.append(this.c / 1000000L);
      var1.append(" ms,animationSpec: ");
      var1.append(this.d);
      return var1.toString();
   }
}
