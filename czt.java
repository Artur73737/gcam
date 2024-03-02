import java.util.Set;

public final class czt {
   public static final czt a;
   public final boolean b;
   public final boolean c;
   public final boolean d;
   public final boolean e;
   public final long f;
   public final long g;
   public final Set h;
   public final int i;

   static {
      a = new czt(1, false, false, false, false, -1L, -1L, qth.a);
   }

   public czt(int var1, boolean var2, boolean var3, boolean var4, boolean var5, long var6, long var8, Set var10) {
      this.i = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var8;
      this.h = var10;
   }

   public czt(czt var1) {
      var1.getClass();
      super();
      this.b = var1.b;
      this.c = var1.c;
      this.i = var1.i;
      this.d = var1.d;
      this.e = var1.e;
      this.h = var1.h;
      this.f = var1.f;
      this.g = var1.g;
   }

   public final boolean a() {
      return !this.h.isEmpty();
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && c.E(this.getClass(), var1.getClass())) {
         czt var2 = (czt)var1;
         if (this.b != var2.b) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else if (this.d != var2.d) {
            return false;
         } else if (this.e != var2.e) {
            return false;
         } else if (this.f != var2.f) {
            return false;
         } else if (this.g != var2.g) {
            return false;
         } else {
            return this.i != var2.i ? false : c.E(this.h, var2.h);
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var2 = this.i;
      c.ai(var2);
      byte var1 = this.b;
      byte var3 = this.c;
      byte var4 = this.d;
      byte var5 = this.e;
      long var7 = this.f;
      long var9 = this.g;
      int var6 = this.h.hashCode();
      return ((((((var2 * 31 + var1) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + (int)(var7 ^ var7 >>> 32)) * 31 + (int)(var9 ^ var9 >>> 32)) * 31 + var6;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Constraints{requiredNetworkType=");
      var1.append(cbz.i(this.i));
      var1.append(", requiresCharging=");
      var1.append(this.b);
      var1.append(", requiresDeviceIdle=");
      var1.append(this.c);
      var1.append(", requiresBatteryNotLow=");
      var1.append(this.d);
      var1.append(", requiresStorageNotLow=");
      var1.append(this.e);
      var1.append(", contentTriggerUpdateDelayMillis=");
      var1.append(this.f);
      var1.append(", contentTriggerMaxDelayMillis=");
      var1.append(this.g);
      var1.append(", contentUriTriggers=");
      var1.append(this.h);
      var1.append(", }");
      return var1.toString();
   }
}
