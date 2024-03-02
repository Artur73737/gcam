import com.google.android.apps.camera.hdrplus.fusion.api.qAwe.yGCWWDnsImN;
import com.google.googlex.gcam.base.HmAh.MBdHSCLVFh;

public final class zc implements avi {
   public zh a;
   public long b;
   public long c;
   public boolean d;
   public final bpe e;
   private final att f;

   // $FF: synthetic method
   public zc(bpe var1, Object var2, zh var3, int var4) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3, Long.MIN_VALUE, Long.MIN_VALUE, false);
   }

   public zc(bpe var1, Object var2, zh var3, long var4, long var6, boolean var8) {
      super();
      this.e = var1;
      this.f = sg.d(var2);
      zh var9;
      if (var3 != null) {
         var9 = do.x(var3);
      } else {
         var9 = sr.u(var1, var2);
      }

      this.a = var9;
      this.b = var4;
      this.c = var6;
      this.d = var8;
   }

   public final Object a() {
      return this.f.a();
   }

   public final Object b() {
      return ((qvt)this.e.b).eo(this.a);
   }

   public final void c(Object var1) {
      this.f.b(var1);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AnimationState(value=");
      var1.append(this.a());
      var1.append(", velocity=");
      var1.append(this.b());
      var1.append(MBdHSCLVFh.uyefBAtcELcmZ);
      var1.append(this.d);
      var1.append(", lastFrameTimeNanos=");
      var1.append(this.b);
      var1.append(yGCWWDnsImN.ScZSoDtwsC);
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
