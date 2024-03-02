import com.google.android.apps.camera.facedeblur.deeprestore.jni.lt.SFjQQF;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;

public final class tn extends kh {
   public final qq a;
   private final String b;
   private final Integer c;
   private final vn d;
   private final Throwable e;
   private final vn f;
   private final vn g;
   private final vn h;
   private final int i;

   public tn(String var1, int var2, Integer var3, vn var4, Throwable var5, vn var6, vn var7, vn var8, qq var9) {
      var1.getClass();
      super();
      this.b = var1;
      this.i = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.a = var9;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof tn)) {
         return false;
      } else {
         tn var2 = (tn)var1;
         if (!c.E(this.b, var2.b)) {
            return false;
         } else if (this.i != var2.i) {
            return false;
         } else if (!c.E(this.c, var2.c)) {
            return false;
         } else if (!c.E(this.d, var2.d)) {
            return false;
         } else if (!c.E(this.e, var2.e)) {
            return false;
         } else if (!c.E(this.f, var2.f)) {
            return false;
         } else if (!c.E(this.g, var2.g)) {
            return false;
         } else if (!c.E(this.h, var2.h)) {
            return false;
         } else {
            return c.E(this.a, var2.a);
         }
      }
   }

   public final int hashCode() {
      int var8 = this.b.hashCode();
      int var9 = this.i;
      c.ai(var9);
      Integer var10 = this.c;
      int var7 = 0;
      int var1;
      if (var10 == null) {
         var1 = 0;
      } else {
         var1 = var10.hashCode();
      }

      vn var11 = this.d;
      int var2;
      if (var11 == null) {
         var2 = 0;
      } else {
         var2 = c.p(var11.a);
      }

      Throwable var12 = this.e;
      int var3;
      if (var12 == null) {
         var3 = 0;
      } else {
         var3 = var12.hashCode();
      }

      var11 = this.f;
      int var4;
      if (var11 == null) {
         var4 = 0;
      } else {
         var4 = c.p(var11.a);
      }

      var11 = this.g;
      int var5;
      if (var11 == null) {
         var5 = 0;
      } else {
         var5 = c.p(var11.a);
      }

      var11 = this.h;
      int var6;
      if (var11 == null) {
         var6 = 0;
      } else {
         var6 = c.p(var11.a);
      }

      qq var13 = this.a;
      if (var13 != null) {
         var7 = var13.a;
      }

      return (((((((var8 * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CameraStateClosed(cameraId=");
      var1.append(qu.b(this.b));
      var1.append(", cameraClosedReason=");
      var1.append(lb.c(this.i));
      var1.append(SFjQQF.ZbVSL);
      var1.append(this.c);
      var1.append(", cameraRetryDurationNs=");
      var1.append(this.d);
      var1.append(", cameraException=");
      var1.append(this.e);
      var1.append(", cameraOpenDurationNs=");
      var1.append(this.f);
      var1.append(", cameraActiveDurationNs=");
      var1.append(this.g);
      var1.append(gKVNpqGY.wYss);
      var1.append(this.h);
      var1.append(", cameraErrorCode=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
