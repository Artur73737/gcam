import java.util.List;

public final class bhy {
   public final long a;
   public final long b;
   public final long c;
   public final long d;
   public final boolean e;
   public final float f;
   public final int g;
   public final boolean h;
   public final List i;
   public final long j;

   public bhy(long var1, long var3, long var5, long var7, boolean var9, float var10, int var11, boolean var12, List var13, long var14) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var10;
      this.g = var11;
      this.h = var12;
      this.i = var13;
      this.j = var14;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bhy)) {
         return false;
      } else {
         bhy var2 = (bhy)var1;
         if (!c.o(this.a, var2.a)) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else if (!c.o(this.c, var2.c)) {
            return false;
         } else if (!c.o(this.d, var2.d)) {
            return false;
         } else if (this.e != var2.e) {
            return false;
         } else if (Float.compare(this.f, var2.f) != 0) {
            return false;
         } else if (!c.n(this.g, var2.g)) {
            return false;
         } else if (this.h != var2.h) {
            return false;
         } else if (!c.E(this.i, var2.i)) {
            return false;
         } else {
            return c.o(this.j, var2.j);
         }
      }
   }

   public final int hashCode() {
      return ((((((((c.p(this.a) * 31 + c.p(this.b)) * 31 + c.p(this.c)) * 31 + c.p(this.d)) * 31 + this.e) * 31 + Float.floatToIntBits(this.f)) * 31 + this.g) * 31 + this.h) * 31 + this.i.hashCode()) * 31 + c.p(this.j);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PointerInputEventData(id=");
      var1.append(bhv.b(this.a));
      var1.append(", uptime=");
      var1.append(this.b);
      var1.append(", positionOnScreen=");
      var1.append(bci.j(this.c));
      var1.append(", position=");
      var1.append(bci.j(this.d));
      var1.append(", down=");
      var1.append(this.e);
      var1.append(", pressure=");
      var1.append(this.f);
      var1.append(", type=");
      var1.append(bie.a(this.g));
      var1.append(", issuesEnterExit=");
      var1.append(this.h);
      var1.append(", historical=");
      var1.append(this.i);
      var1.append(", scrollDelta=");
      var1.append(bci.j(this.j));
      var1.append(')');
      return var1.toString();
   }
}
