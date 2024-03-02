public final class aji {
   public final ako a;
   public final bpe b;
   public final lmk c;
   private final ajz d;

   public aji(ajz var1, lmk var2, bpe var3, ako var4) {
      var2.getClass();
      super();
      this.d = var1;
      this.c = var2;
      this.b = var3;
      this.a = var4;
   }

   public final int a(Object var1) {
      return this.a.a(var1);
   }

   public final int b() {
      return ((ip)this.c.a).a;
   }

   public final Object c(int var1) {
      alf var3 = (alf)this.a;
      Object[] var4 = var3.a;
      int var2 = var1 - var3.c;
      Object var5 = null;
      if (var2 >= 0 && var2 <= pwm.aX(var4)) {
         var5 = var4[var2];
      }

      if (var5 == null) {
         iyq var6 = ((ip)this.c.a).k(var1);
         var2 = var6.b;
         var5 = var6.c;
         return jj.d(var1);
      } else {
         return var5;
      }
   }

   public final void d(int var1, Object var2, asm var3, int var4) {
      var3 = var3.b(-462424778);
      ja.b(var2, var1, this.d.q, sr.t(var3, -824725566, new ajh(this, var1, 0)), var3, var4 << 3 & 112 | 3592);
      aug var5 = var3.H();
      if (var5 != null) {
         var5.c = new akl(this, var1, var2, var4, 1);
      }
   }

   public final void e(int var1) {
      iyq var3 = ((ip)this.c.a).k(var1);
      int var2 = var3.b;
      ((qvt)((bpe)var3.c).a).eo(var1 - var2);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof aji) ? false : c.E(this.c, ((aji)var1).c);
      }
   }

   public final int hashCode() {
      return this.c.hashCode();
   }
}
