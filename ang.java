public final class ang {
   private final att a;
   private final att b;
   private final att c;
   private final att d;
   private final att e;
   private final att f;
   private final att g;
   private final att h;
   private final att i;
   private final att j;
   private final att k;
   private final att l;
   private final att m;

   public ang(long var1, long var3, long var5, long var7, long var9, long var11, long var13, long var15, long var17, long var19, long var21, long var23) {
      this.a = so.i(bcy.f(var1), aup.c);
      this.b = so.i(bcy.f(var3), aup.c);
      this.c = so.i(bcy.f(var5), aup.c);
      this.d = so.i(bcy.f(var7), aup.c);
      this.e = so.i(bcy.f(var9), aup.c);
      this.f = so.i(bcy.f(var11), aup.c);
      this.g = so.i(bcy.f(var13), aup.c);
      this.h = so.i(bcy.f(var15), aup.c);
      this.i = so.i(bcy.f(var17), aup.c);
      this.j = so.i(bcy.f(var19), aup.c);
      this.k = so.i(bcy.f(var21), aup.c);
      this.l = so.i(bcy.f(var23), aup.c);
      this.m = so.i(true, aup.c);
   }

   public final long a() {
      return ((bcy)this.e.a()).g;
   }

   public final long b() {
      return ((bcy)this.g.a()).g;
   }

   public final long c() {
      return ((bcy)this.j.a()).g;
   }

   public final long d() {
      return ((bcy)this.l.a()).g;
   }

   public final long e() {
      return ((bcy)this.h.a()).g;
   }

   public final long f() {
      return ((bcy)this.i.a()).g;
   }

   public final long g() {
      return ((bcy)this.k.a()).g;
   }

   public final long h() {
      return ((bcy)this.a.a()).g;
   }

   public final long i() {
      return ((bcy)this.b.a()).g;
   }

   public final long j() {
      return ((bcy)this.c.a()).g;
   }

   public final long k() {
      return ((bcy)this.d.a()).g;
   }

   public final long l() {
      return ((bcy)this.f.a()).g;
   }

   public final boolean m() {
      return (Boolean)this.m.a();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Colors(primary=");
      var1.append(bcy.h(this.h()));
      var1.append(", primaryVariant=");
      var1.append(bcy.h(this.i()));
      var1.append(", secondary=");
      var1.append(bcy.h(this.j()));
      var1.append(", secondaryVariant=");
      var1.append(bcy.h(this.k()));
      var1.append(", background=");
      var1.append(bcy.h(this.a()));
      var1.append(", surface=");
      var1.append(bcy.h(this.l()));
      var1.append(", error=");
      var1.append(bcy.h(this.b()));
      var1.append(", onPrimary=");
      var1.append(bcy.h(this.e()));
      var1.append(", onSecondary=");
      var1.append(bcy.h(this.f()));
      var1.append(", onBackground=");
      var1.append(bcy.h(this.c()));
      var1.append(", onSurface=");
      var1.append(bcy.h(this.g()));
      var1.append(", onError=");
      var1.append(bcy.h(this.d()));
      var1.append(", isLight=");
      var1.append(this.m());
      var1.append(')');
      return var1.toString();
   }
}
