import android.content.Context;

public final class csm implements cse {
   public final Context a;
   public final String b;
   public final csb c;
   public final boolean d;
   public final boolean e;
   public final qsd f;
   public boolean g;

   public csm(Context var1, String var2, csb var3, boolean var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = pwm.bt(new bmc(this, 15));
   }

   public final csa a() {
      return this.b().b();
   }

   public final csl b() {
      return (csl)this.f.a();
   }

   public final void close() {
      if (this.f.b()) {
         this.b().close();
      }

   }
}
