import java.util.Map;

public final class apu {
   public final zb a;
   public final qvt b;
   public final att c;
   public final att d;
   public final ree e;
   public float f;
   public float g;
   public final att h;
   public final att i;
   public final aeq j;
   public final auy k;
   public final auy l;
   public final auy m;
   public final auy n;
   private final att o;
   private final att p;

   public apu(Object var1, zb var2, qvt var3) {
      this.a = var2;
      this.b = var3;
      this.o = sg.d(var1);
      this.p = sg.d(false);
      this.k = lg.c(0.0F);
      this.l = lg.c(0.0F);
      this.m = lg.c(0.0F);
      this.c = sg.d((Object)null);
      this.d = sg.d(qtg.a);
      this.e = new dcw(new dcw(sg.c(new amp(this, 7)), 1), 7);
      this.f = Float.NEGATIVE_INFINITY;
      this.g = Float.POSITIVE_INFINITY;
      this.h = sg.d(ajt.i);
      this.n = lg.c(0.0F);
      this.i = sg.d((Object)null);
      this.j = new adh(new arh(this, 1));
   }

   public final Object a(float var1, zb var2, que var3) {
      Object var4 = es.e(this.j, new apl(this, var1, var2, (que)null), var3);
      return var4 == qul.a ? var4 : qsn.a;
   }

   public final Object b(Object var1, zb var2, que var3) {
      var1 = this.e.gY(new apn(var1, this, var2), var3);
      return var1 == qul.a ? var1 : qsn.a;
   }

   public final Object c() {
      return this.o.a();
   }

   public final Object d() {
      Float var3 = (Float)this.c.a();
      float var1;
      if (var3 != null) {
         var1 = var3;
      } else {
         float var2 = this.k.h().floatValue();
         var3 = la.d(this.g(), this.c());
         if (var3 != null) {
            var1 = var3;
         } else {
            var1 = this.k.h().floatValue();
         }

         var1 = la.c(var2, var1, this.g().keySet(), this.h(), 0.0F, Float.POSITIVE_INFINITY);
      }

      Object var4 = this.g().get(var1);
      Object var5 = var4;
      if (var4 == null) {
         var5 = this.c();
      }

      return var5;
   }

   public final Object e(Map param1, Map param2, que param3) {
      // $FF: Couldn't be decompiled
   }

   public final Object f(float var1, que var2) {
      Object var3 = es.e(this.j, new apq(var1, this, (que)null), var2);
      return var3 == qul.a ? var3 : qsn.a;
   }

   public final Map g() {
      return (Map)this.d.a();
   }

   public final qvx h() {
      return (qvx)this.h.a();
   }

   public final void i(boolean var1) {
      this.p.b(var1);
   }

   public final void j(Object var1) {
      this.o.b(var1);
   }

   public final boolean k() {
      return (Boolean)this.p.a();
   }
}
