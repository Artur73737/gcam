import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.view.Surface;
import androidx.wear.ambient.AmbientMode.AmbientController;
import java.util.List;
import java.util.Map;

public final class tc extends CaptureCallback {
   public final boolean a;
   public final List b;
   public final List c;
   public final List d;
   public volatile Integer e;
   public final qzg f;
   private final String g;
   private final Map h;
   private final Map i;
   private final long j;
   private final AmbientController k;

   public tc(String var1, boolean var2, List var3, List var4, List var5, AmbientController var6, Map var7, Map var8) {
      this.g = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.k = var6;
      this.h = var7;
      this.i = var8;
      this.j = tf.b.c();
      this.f = qwp.J();
   }

   private final tj b(long var1) {
      Object var3 = this.h.get(ru.a(var1));
      if (var3 != null) {
         return (tj)var3;
      } else {
         StringBuilder var4 = new StringBuilder();
         var4.append("Unable to find the request for ");
         var4.append(ru.b(var1));
         var4.append('!');
         throw new IllegalStateException(var4.toString());
      }
   }

   private static final long c(CaptureRequest var0) {
      Object var1 = var0.getTag();
      var1.getClass();
      return ((ru)var1).a;
   }

   public final int a() {
      StringBuilder var16;
      Integer var2;
      if (this.e == null) {
         synchronized(this){}

         Throwable var10000;
         label138: {
            boolean var10001;
            try {
               var2 = this.e;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label138;
            }

            if (var2 != null) {
               label132: {
                  int var1;
                  try {
                     var1 = var2.intValue();
                  } catch (Throwable var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label132;
                  }

                  return var1;
               }
            } else {
               label134:
               try {
                  var16 = new StringBuilder();
                  var16.append("SequenceNumber has not been set for ");
                  var16.append(this);
                  var16.append('!');
                  String var18 = var16.toString();
                  IllegalStateException var3 = new IllegalStateException(var18);
                  throw var3;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label134;
               }
            }
         }

         Throwable var17 = var10000;
         throw var17;
      } else {
         var2 = this.e;
         if (var2 != null) {
            return var2.intValue();
         } else {
            var16 = new StringBuilder();
            var16.append("SequenceNumber has not been set for ");
            var16.append(this);
            var16.append('!');
            throw new IllegalStateException(var16.toString());
         }
      }
   }

   public final void onCaptureBufferLost(CameraCaptureSession var1, CaptureRequest var2, Surface var3, long var4) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      long var10 = c(var2);
      Object var12 = this.i.get(var3);
      if (var12 == null) {
         StringBuilder var14 = new StringBuilder();
         var14.append("Unable to find the streamId for ");
         var14.append(var3);
         var14.append(" on frame ");
         StringBuilder var15 = new StringBuilder();
         var15.append("FrameNumber(value=");
         var15.append(var4);
         var15.append(')');
         var14.append(var15.toString());
         IllegalStateException var16 = new IllegalStateException(var14.toString());
         throw var16;
      } else {
         int var8 = ((ry)var12).a;
         tj var13 = this.b(var10);
         int var9 = this.d.size();
         byte var7 = 0;

         int var6;
         for(var6 = 0; var6 < var9; ++var6) {
            ((rs)this.d.get(var6)).e(var4, var8);
         }

         var9 = var13.a.c.size();

         for(var6 = var7; var6 < var9; ++var6) {
            ((rs)var13.a.c.get(var6)).e(var4, var8);
         }

      }
   }

   public final void onCaptureCompleted(CameraCaptureSession var1, CaptureRequest var2, TotalCaptureResult var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var3.getFrameNumber();
      this.k.k(this);
      tj var7 = this.b(c(var2));
      si var8 = new si(var3, this.g);
      int var6 = this.d.size();
      byte var5 = 0;

      int var4;
      for(var4 = 0; var4 < var6; ++var4) {
         ((rs)this.d.get(var4)).k(var8);
      }

      var6 = var7.a.c.size();

      for(var4 = 0; var4 < var6; ++var4) {
         ((rs)var7.a.c.get(var4)).k(var8);
      }

      var6 = this.d.size();

      for(var4 = 0; var4 < var6; ++var4) {
         ((rs)this.d.get(var4)).f();
      }

      var6 = var7.a.c.size();

      for(var4 = var5; var4 < var6; ++var4) {
         ((rs)var7.a.c.get(var4)).f();
      }

   }

   public final void onCaptureFailed(CameraCaptureSession var1, CaptureRequest var2, CaptureFailure var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var3.getFrameNumber();
      this.k.k(this);
      tj var7 = this.b(c(var2));
      int var6 = this.d.size();
      byte var5 = 0;

      int var4;
      for(var4 = 0; var4 < var6; ++var4) {
         ((rs)this.d.get(var4)).g();
      }

      var6 = var7.a.c.size();

      for(var4 = var5; var4 < var6; ++var4) {
         ((rs)var7.a.c.get(var4)).g();
      }

   }

   public final void onCaptureProgressed(CameraCaptureSession var1, CaptureRequest var2, CaptureResult var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      long var7 = c(var2);
      var3.getFrameNumber();
      new sj(var3, this.g);
      tj var9 = this.b(var7);
      int var6 = this.d.size();
      byte var5 = 0;

      int var4;
      for(var4 = 0; var4 < var6; ++var4) {
         ((rs)this.d.get(var4)).j();
      }

      var6 = var9.a.c.size();

      for(var4 = var5; var4 < var6; ++var4) {
         ((rs)var9.a.c.get(var4)).j();
      }

   }

   public final void onCaptureSequenceAborted(CameraCaptureSession var1, int var2) {
      var1.getClass();
      this.k.k(this);
      if (this.a() != var2) {
         StringBuilder var7 = new StringBuilder();
         var7.append("onCaptureSequenceAborted was invoked on ");
         var7.append(this.a());
         var7.append(", but expected ");
         var7.append(var2);
         var7.append('!');
         IllegalStateException var8 = new IllegalStateException(var7.toString());
         throw var8;
      } else {
         this.f.O(qsn.a);
         int var4 = this.c.size();

         int var3;
         int var5;
         tj var6;
         for(var2 = 0; var2 < var4; ++var2) {
            var6 = (tj)this.c.get(var2);
            var5 = this.d.size();

            for(var3 = 0; var3 < var5; ++var3) {
               ((rs)this.d.get(var3)).b(var6);
            }
         }

         var4 = this.c.size();

         for(var2 = 0; var2 < var4; ++var2) {
            var6 = (tj)this.c.get(var2);
            var5 = var6.a.c.size();

            for(var3 = 0; var3 < var5; ++var3) {
               ((rs)var6.a.c.get(var3)).b(var6);
            }
         }

      }
   }

   public final void onCaptureSequenceCompleted(CameraCaptureSession var1, int var2, long var3) {
      var1.getClass();
      this.k.k(this);
      if (this.a() != var2) {
         StringBuilder var9 = new StringBuilder();
         var9.append("onCaptureSequenceCompleted was invoked on ");
         var9.append(this.a());
         var9.append(", but expected ");
         var9.append(var2);
         var9.append('!');
         IllegalStateException var10 = new IllegalStateException(var9.toString());
         throw var10;
      } else {
         int var6 = this.c.size();

         int var5;
         int var7;
         tj var8;
         for(var2 = 0; var2 < var6; ++var2) {
            var8 = (tj)this.c.get(var2);
            var7 = this.d.size();

            for(var5 = 0; var5 < var7; ++var5) {
               ((rs)this.d.get(var5)).h(var8);
            }
         }

         var6 = this.c.size();

         for(var2 = 0; var2 < var6; ++var2) {
            var8 = (tj)this.c.get(var2);
            var7 = var8.a.c.size();

            for(var5 = 0; var5 < var7; ++var5) {
               ((rs)var8.a.c.get(var5)).h(var8);
            }
         }

      }
   }

   public final void onCaptureStarted(CameraCaptureSession var1, CaptureRequest var2, long var3, long var5) {
      var1.getClass();
      var2.getClass();
      tj var10 = this.b(c(var2));
      this.f.O(qsn.a);
      int var9 = this.d.size();
      byte var8 = 0;

      int var7;
      for(var7 = 0; var7 < var9; ++var7) {
         ((rs)this.d.get(var7)).i(var3, var5);
      }

      var9 = var10.a.c.size();

      for(var7 = var8; var7 < var9; ++var7) {
         ((rs)var10.a.c.get(var7)).i(var3, var5);
      }

   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Camera2CaptureSequence-");
      var1.append(this.j);
      return var1.toString();
   }
}
