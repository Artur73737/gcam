import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.util.ArrayMap;
import java.util.Set;

public final class sz implements rz {
   public final String a;
   public final CameraCharacteristics b;
   public final qsd c;
   private final Set d;
   private final ArrayMap e;
   private final qsd f;
   private final qsd g;

   public sz(String var1, CameraCharacteristics var2, Set var3) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.e = new ArrayMap();
      pwm.bu(2, new sy(this, 1));
      this.c = pwm.bu(2, new sy(this, 3));
      pwm.bu(2, new sy(this, 4));
      this.f = pwm.bu(2, new sy(this, 0));
      pwm.bu(2, new sy(this, 2));
      this.g = pwm.bu(2, new sy(this, 5));
   }

   public final Object a(qxs var1) {
      throw null;
   }

   public final Object b(Key var1) {
      if (this.d.contains(var1)) {
         return this.b.get(var1);
      } else {
         ArrayMap var2 = this.e;
         synchronized(var2){}

         Object var3;
         try {
            var3 = this.e.get(var1);
         } finally {
            ;
         }

         Object var10 = var3;
         if (var3 == null) {
            var10 = this.b.get(var1);
            if (var10 != null) {
               ArrayMap var11 = this.e;
               synchronized(var11){}

               try {
                  this.e.put(var1, var10);
               } finally {
                  ;
               }
            }
         }

         return var10;
      }
   }

   public final Set c() {
      return (Set)this.f.a();
   }

   public final Set d() {
      return (Set)this.g.a();
   }
}
