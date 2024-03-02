import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public final class bel extends bec {
   private static final float[] d;
   private static final float[] e;
   private static final float[] f;
   private static final float[] g;

   static {
      float[] var1 = bea.a.b;
      bep var0 = bej.a;
      float[] var2 = bdb.k(var1, bej.b.a(), bej.d.a());
      var1 = bdb.m(new float[]{0.818933F, 0.032984544F, 0.0482003F, 0.36186674F, 0.9293119F, 0.26436627F, -0.12885971F, 0.03614564F, 0.6338517F}, var2);
      d = var1;
      var2 = new float[]{0.21045426F, 1.9779985F, 0.025904037F, 0.7936178F, -2.4285922F, 0.78277177F, -0.004072047F, 0.4505937F, -0.80867577F};
      e = var2;
      f = bdb.l(var1);
      g = bdb.l(var2);
   }

   public bel() {
      super(DzzpnVggahPIX.dwYLTpWLA, 12884901890L, 17);
   }

   public final float a(int var1) {
      return var1 == 0 ? 1.0F : 0.5F;
   }

   public final float b(int var1) {
      return var1 == 0 ? 0.0F : -0.5F;
   }

   public final float c(float var1, float var2, float var3) {
      var1 = qxb.j(var1, 0.0F, 1.0F);
      var2 = qxb.j(var2, -0.5F, 0.5F);
      float var5 = qxb.j(var3, -0.5F, 0.5F);
      float[] var6 = g;
      float var4 = bdb.g(var6, var1, var2, var5);
      var3 = bdb.h(var6, var1, var2, var5);
      var1 = bdb.i(var6, var1, var2, var5);
      return bdb.i(f, var4 * var4 * var4, var3 * var3 * var3, var1 * var1 * var1);
   }

   public final long d(float var1, float var2, float var3) {
      float var4 = qxb.j(var1, 0.0F, 1.0F);
      var2 = qxb.j(var2, -0.5F, 0.5F);
      float var5 = qxb.j(var3, -0.5F, 0.5F);
      float[] var6 = g;
      var3 = bdb.g(var6, var4, var2, var5);
      var1 = bdb.h(var6, var4, var2, var5);
      var4 = bdb.i(var6, var4, var2, var5);
      var2 = var3 * var3 * var3;
      var1 = var1 * var1 * var1;
      var4 = var4 * var4 * var4;
      var6 = f;
      var3 = bdb.g(var6, var2, var1, var4);
      var1 = bdb.h(var6, var2, var1, var4);
      return (long)Float.floatToIntBits(var3) << 32 | (long)Float.floatToIntBits(var1) & 4294967295L;
   }

   public final long e(float var1, float var2, float var3, float var4, bec var5) {
      float[] var8 = d;
      float var7 = bdb.g(var8, var1, var2, var3);
      float var6 = bdb.h(var8, var1, var2, var3);
      var1 = bdb.i(var8, var1, var2, var3);
      var2 = Math.signum(var7) * (float)Math.pow((double)Math.abs(var7), 0.3333333432674408D);
      var3 = Math.signum(var6) * (float)Math.pow((double)Math.abs(var6), 0.3333333432674408D);
      var1 = Math.signum(var1) * (float)Math.pow((double)Math.abs(var1), 0.3333333432674408D);
      var8 = e;
      return bcq.k(bdb.g(var8, var2, var3, var1), bdb.h(var8, var2, var3, var1), bdb.i(var8, var2, var3, var1), var4, var5);
   }
}
