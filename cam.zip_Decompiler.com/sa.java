import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sa implements tk {
   public final tl a;
   private final CameraCaptureSession b;
   private final Handler c;
   private final blj d;

   public sa(tl var1, CameraCaptureSession var2, blj var3, Handler var4) {
      var1.getClass();
      var3.getClass();
      var4.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
   }

   public Object a(qxs var1) {
      throw null;
   }

   public final tl b() {
      return this.a;
   }

   public final Integer c(CaptureRequest var1, CaptureCallback var2) {
      var1.getClass();
      String var4 = ((sc)this.a).b;
      blj var3 = this.d;

      Integer var6;
      try {
         var6 = this.b.capture(var1, var2, this.c);
      } catch (Exception var5) {
         if (!(var5 instanceof IllegalArgumentException) && !(var5 instanceof IllegalStateException) && !(var5 instanceof CameraAccessException) && !(var5 instanceof SecurityException) && !(var5 instanceof UnsupportedOperationException) && !(var5 instanceof NullPointerException)) {
            throw var5;
         }

         var3.k(var4, 9, false);
         var6 = null;
      }

      return var6;
   }

   public final void close() {
      this.b.close();
   }

   public final Integer d(List var1, CaptureCallback var2) {
      var1.getClass();
      String var4 = ((sc)this.a).b;
      blj var3 = this.d;

      Integer var6;
      try {
         var6 = this.b.captureBurst(var1, var2, this.c);
      } catch (Exception var5) {
         if (!(var5 instanceof IllegalArgumentException) && !(var5 instanceof IllegalStateException) && !(var5 instanceof CameraAccessException) && !(var5 instanceof SecurityException) && !(var5 instanceof UnsupportedOperationException) && !(var5 instanceof NullPointerException)) {
            throw var5;
         }

         var3.k(var4, 9, false);
         var6 = null;
      }

      return var6;
   }

   public final Integer e(List var1, CaptureCallback var2) {
      var1.getClass();
      String var4 = ((sc)this.a).b;
      blj var3 = this.d;

      Integer var6;
      try {
         var6 = this.b.setRepeatingBurst(var1, var2, this.c);
      } catch (Exception var5) {
         if (!(var5 instanceof IllegalArgumentException) && !(var5 instanceof IllegalStateException) && !(var5 instanceof CameraAccessException) && !(var5 instanceof SecurityException) && !(var5 instanceof UnsupportedOperationException) && !(var5 instanceof NullPointerException)) {
            throw var5;
         }

         var3.k(var4, 9, false);
         var6 = null;
      }

      return var6;
   }

   public final Integer f(CaptureRequest var1, CaptureCallback var2) {
      var1.getClass();
      String var3 = ((sc)this.a).b;
      blj var4 = this.d;

      Integer var6;
      try {
         var6 = this.b.setRepeatingRequest(var1, var2, this.c);
      } catch (Exception var5) {
         if (!(var5 instanceof IllegalArgumentException) && !(var5 instanceof IllegalStateException) && !(var5 instanceof CameraAccessException) && !(var5 instanceof SecurityException) && !(var5 instanceof UnsupportedOperationException) && !(var5 instanceof NullPointerException)) {
            throw var5;
         }

         var4.k(var3, 9, false);
         var6 = null;
      }

      return var6;
   }

   public final void g() {
      String var1 = ((sc)this.a).b;
      blj var2 = this.d;

      try {
         this.b.abortCaptures();
         qsn var3 = qsn.a;
      } catch (Exception var4) {
         if (!(var4 instanceof IllegalArgumentException) && !(var4 instanceof IllegalStateException) && !(var4 instanceof CameraAccessException) && !(var4 instanceof SecurityException) && !(var4 instanceof UnsupportedOperationException) && !(var4 instanceof NullPointerException)) {
            throw var4;
         }

         var2.k(var1, 9, false);
      }

   }

   public final void h(List var1) {
      String var2 = ((sc)this.a).b;
      blj var3 = this.d;

      Exception var10000;
      label51: {
         ArrayList var4;
         CameraCaptureSession var5;
         Iterator var9;
         boolean var10001;
         try {
            var5 = this.b;
            var4 = new ArrayList(pwm.aL(var1));
            var9 = var1.iterator();
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label51;
         }

         while(true) {
            try {
               if (var9.hasNext()) {
                  var4.add(((sm)var9.next()).a(qxa.a(OutputConfiguration.class)));
                  continue;
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }

            try {
               sq.e(var5, var4);
               qsn var11 = qsn.a;
               return;
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }
         }
      }

      Exception var10 = var10000;
      if (!(var10 instanceof IllegalArgumentException) && !(var10 instanceof IllegalStateException) && !(var10 instanceof CameraAccessException) && !(var10 instanceof SecurityException) && !(var10 instanceof UnsupportedOperationException) && !(var10 instanceof NullPointerException)) {
         throw var10;
      } else {
         var3.k(var2, 9, false);
      }
   }
}
