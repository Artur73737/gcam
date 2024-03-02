public final class afv extends blh implements bna, blf, bbx {
   public afw a;
   public aez b;
   public acv c;
   public boolean d;
   public boolean e;
   public final agc f;
   public final afu g;
   public final ade h;
   public final aet i;
   public final afm j;
   public final acw k;
   public final ip l;
   public ip m;
   public final prl n;
   public lmk o;

   public afv(afw var1, aez var2, acv var3, boolean var4, boolean var5, ip var6, lmk var7, acz var8) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.m = var6;
      this.o = var7;
      acw var17 = acw.a;
      this.k = var17;
      prl var18 = new prl((byte[])null, (byte[])null, (byte[])null, (byte[])null);
      this.n = var18;
      ip var12 = new ip(so.m(afs.e));
      this.l = var12;
      afw var10 = this.a;
      aez var9 = this.b;
      acv var19 = this.c;
      var4 = this.e;
      ip var11 = this.m;
      if (var11 == null) {
         var11 = var12;
      }

      agc var13 = new agc(var10, var9, var19, var4, var11, var18);
      this.f = var13;
      afu var14 = new afu(var13, this.d);
      this.g = var14;
      ade var20 = new ade(this.b, this.a, this.e, var8);
      this.m(var20);
      this.h = var20;
      aet var21 = new aet(this.d);
      this.m(var21);
      this.i = var21;
      this.m(new bha(var14, var18));
      this.m(new bcd());
      this.m(new alr(var20));
      this.m(new acc(new ou(this, 20)));
      lmk var16 = this.o;
      afm var15 = new afm(var13, this.b, this.d, var18, var16, var17);
      this.m(var15);
      this.j = var15;
   }

   private final void d() {
      bxr var1 = (bxr)jj.l(this, bpi.b);
      this.l.c = so.m(var1);
   }

   public final void eE(bbv var1) {
      var1.a(false);
   }

   public final void ep() {
      this.d();
   }

   public final void er() {
      this.d();
      jm.f(this, new ov(this, 14));
   }
}
