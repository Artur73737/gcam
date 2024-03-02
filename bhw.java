import java.util.List;

public final class bhw {
   public final long a;
   public final long b;
   public final long c;
   public final boolean d;
   public final float e;
   public final long f;
   public final long g;
   public final boolean h;
   public final int i;
   public final long j;
   public bhf k;
   private List l;

   // $FF: synthetic method
   public bhw(long var1, long var3, long var5, boolean var7, float var8, long var9, long var11, boolean var13, int var14, List var15, long var16) {
      this(var1, var3, var5, var7, var8, var9, var11, var13, false, var14, var16);
      this.l = var15;
   }

   public bhw(long var1, long var3, long var5, boolean var7, float var8, long var9, long var11, boolean var13, boolean var14, int var15, long var16) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var8;
      this.f = var9;
      this.g = var11;
      this.h = var13;
      this.i = var15;
      this.j = var16;
      this.k = new bhf(var14, var14);
   }

   public final List a() {
      List var2 = this.l;
      Object var1 = var2;
      if (var2 == null) {
         var1 = qtf.a;
      }

      return (List)var1;
   }

   public final void b() {
      bhf var1 = this.k;
      var1.b = true;
      var1.a = true;
   }

   public final boolean c() {
      bhf var1 = this.k;
      return var1.b || var1.a;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PointerInputChange(id=");
      var1.append(bhv.b(this.a));
      var1.append(", uptimeMillis=");
      var1.append(this.b);
      var1.append(", position=");
      var1.append(bci.j(this.c));
      var1.append(", pressed=");
      var1.append(this.d);
      var1.append(", pressure=");
      var1.append(this.e);
      var1.append(", previousUptimeMillis=");
      var1.append(this.f);
      var1.append(", previousPosition=");
      var1.append(bci.j(this.g));
      var1.append(", previousPressed=");
      var1.append(this.h);
      var1.append(", isConsumed=");
      var1.append(this.c());
      var1.append(", type=");
      var1.append(bie.a(this.i));
      var1.append(", historical=");
      var1.append(this.a());
      var1.append(",scrollDelta=");
      var1.append(bci.j(this.j));
      var1.append(')');
      return var1.toString();
   }
}
