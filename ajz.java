public final class ajz implements afw {
   public static final bjp w;
   public boolean a;
   public ajn b;
   public final ajs c;
   public final att d;
   public float e;
   public bxr f;
   public final afw g;
   public int h;
   public boolean i;
   public int j;
   public akv k;
   public boolean l;
   public bkg m;
   public final akb n;
   public final ajg o;
   public long p;
   public final aku q;
   public final att r;
   public final att s;
   public qzv t;
   public zc u;
   public final aju v;
   public final pde x;
   public final lmk y;
   public final lmk z;

   static {
      ajt var1 = ajt.a;
      aal var0 = aal.l;
      ajb var2 = new ajb(var1, 6);
      qxb.e(var0, 1);
      w = dp.m(var2, var0);
   }

   public ajz() {
      this(0, 0);
   }

   public ajz(int var1, int var2) {
      this.c = new ajs(var1, var2);
      this.d = sg.d(aje.a);
      this.z = eu.l();
      this.f = car.N(1.0F, 1.0F);
      this.g = new adn(new aiz(this, 2));
      this.i = true;
      this.j = -1;
      this.v = new aju(this);
      this.n = new akb();
      this.o = new ajg();
      this.y = new lmk((byte[])null, (byte[])null, (char[])null, (byte[])null);
      this.p = car.aa(0, 0, 15);
      this.q = new aku();
      Boolean var3 = false;
      this.r = sg.d(var3);
      this.s = sg.d(var3);
      this.x = new pde();
      bpe var5 = aam.a;
      Float var4 = 0.0F;
      this.u = new zc(var5, var4, (zh)((qvt)var5.a).eo(var4), Long.MIN_VALUE, Long.MIN_VALUE, false);
   }

   public final Object a(acn var1, qvx var2, que var3) {
      ajv var10;
      label37: {
         if (var3 instanceof ajv) {
            ajv var5 = (ajv)var3;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               var10 = var5;
               break label37;
            }
         }

         var10 = new ajv(this, var3);
      }

      Object var7 = var10.a;
      qul var6 = qul.a;
      ajz var11;
      switch(var10.c) {
      case 0:
         pwm.bs(var7);
         akb var12 = this.n;
         var10.d = this;
         var10.e = var1;
         var10.f = var2;
         var10.c = 1;
         if (var12.a(var10) == var6) {
            return var6;
         }

         var11 = this;
         break;
      case 1:
         var2 = var10.f;
         var1 = var10.e;
         var11 = var10.d;
         pwm.bs(var7);
         break;
      case 2:
         pwm.bs(var7);
         return qsn.a;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      afw var13 = var11.g;
      var10.d = null;
      var10.e = null;
      var10.f = null;
      var10.c = 2;
      Object var9 = qzy.g(new adl((adn)var13, var1, var2, (que)null), var10);
      Object var8 = var9;
      if (var9 != qul.a) {
         var8 = qsn.a;
      }

      if (var8 == var6) {
         return var6;
      } else {
         return qsn.a;
      }
   }

   public final boolean b() {
      return (Boolean)this.s.a();
   }

   public final boolean c() {
      return (Boolean)this.r.a();
   }

   public final boolean d() {
      return (Boolean)((adn)this.g).c.a();
   }

   public final int e() {
      return this.c.a();
   }

   public final int f() {
      return this.c.d.f();
   }

   public final ajn g() {
      return (ajn)this.d.a();
   }

   public final int h(aji var1, int var2) {
      var1.getClass();
      ajs var4 = this.c;
      int var3 = iy.b(var1, var4.b, var2);
      if (var2 != var3) {
         var4.b(var3);
         var4.c.c(var2);
      }

      return var3;
   }
}
