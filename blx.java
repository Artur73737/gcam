public final class blx extends bmz {
   private static final bco v;
   public blv f;
   public bxq g;
   private bmo u;

   static {
      bco var0 = eu.h();
      var0.j(bcy.d);
      var0.p(1.0F);
      var0.q(1);
      v = var0;
   }

   public blx(bmd var1, blv var2) {
      super(var1);
      this.f = var2;
      blw var3;
      if (var1.e != null) {
         var3 = new blw(this);
      } else {
         var3 = null;
      }

      this.u = var3;
   }

   public final bke l(long var1) {
      this.q(var1);
      blv var3 = this.f;
      if (!(var3 instanceof bjc)) {
         this.af(var3.a(this, this.z(), var1));
         this.ab();
         return this;
      } else {
         bjc var4 = (bjc)var3;
         this.z();
         bmo var5 = this.u;
         var5.getClass();
         bju var6 = var5.C();
         var6.d();
         var6.c();
         this.g.getClass();
         throw null;
      }
   }

   public final void r(long var1, qvt var3) {
      this.al(var1, var3);
      if (!super.h) {
         this.ac();
         bxy var10 = bkd.a;
         int var4 = bxx.b(super.c);
         bxy var7 = this.j();
         bjf var11 = bkd.c;
         int var5 = bkd.b;
         bxy var8 = bkd.a;
         bml var9 = bkd.d;
         bkd.b = var4;
         bkd.a = var7;
         boolean var6 = bkd.a(this);
         this.C().f();
         super.i = var6;
         bkd.b = var5;
         bkd.a = var8;
         bkd.c = var11;
         bkd.d = var9;
      }
   }

   public final int s(bir var1) {
      bmo var3 = this.u;
      int var2;
      if (var3 != null) {
         Integer var4 = (Integer)var3.l.get(var1);
         if (var4 != null) {
            var2 = var4;
         } else {
            var2 = Integer.MIN_VALUE;
         }
      } else {
         var2 = jk.i(this, var1);
      }

      return var2;
   }

   public final bba t() {
      return this.f.n();
   }

   public final bmo u() {
      return this.u;
   }

   public final void v() {
      if (this.u == null) {
         this.u = new blw(this);
      }

   }

   public final void y(bcw var1) {
      var1.getClass();
      this.z().T(var1);
      if (bmg.a(super.n).k) {
         this.ak(var1, v);
      }

   }

   public final bmz z() {
      bmz var1 = super.o;
      var1.getClass();
      return var1;
   }
}
