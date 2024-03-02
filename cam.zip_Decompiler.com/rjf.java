import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.view.WindowManager;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

public final class rjf {
   private static rjf b;
   public final int a;

   public rjf() {
      this.a = 2;
   }

   public rjf(int var1) {
      this.a = var1;
   }

   private rjf(Context var1) {
      this.a = ((WindowManager)var1.getSystemService("window")).getDefaultDisplay().getRotation();
      ((Activity)var1).isInMultiWindowMode();
   }

   public rjf(byte[] var1) {
      this.a = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
   }

   public static int i(Context var0) {
      rjf var1 = b;
      return var1 != null ? var1.a : ((WindowManager)var0.getSystemService("window")).getDefaultDisplay().getRotation();
   }

   public static void j(Context var0) {
      if (b == null) {
         b = new rjf(var0);
      }

   }

   public static void k() {
      b = null;
   }

   public static rjf o(boolean var0) {
      byte var1;
      if (!var0) {
         var1 = 0;
      } else {
         var1 = 4;
      }

      return new rjf(var1 | 1);
   }

   public final void a(float[] var1) {
      GLES20.glUniformMatrix4fv(this.a, 1, false, var1, 0);
   }

   public final void b(float[] var1) {
      GLES20.glUniform4fv(this.a, 1, var1, 0);
   }

   public final void c(Texture var1) {
      GLES20.glActiveTexture(33984);
      var1.bind();
      GLES20.glUniform1i(this.a, 0);
   }

   public final void d() {
      GLES20.glDisableVertexAttribArray(this.a);
   }

   public final void e() {
      GLES20.glEnableVertexAttribArray(this.a);
   }

   public final void f(FloatBuffer var1, int var2) {
      GLES20.glVertexAttribPointer(this.a, var2, 5126, false, 0, var1);
   }

   public final PointF g(PointF var1) {
      switch(this.a) {
      case 0:
         return var1;
      case 90:
         return new PointF(var1.y, 1.0F - var1.x);
      case 180:
         return new PointF(1.0F - var1.x, 1.0F - var1.y);
      case 270:
         return new PointF(1.0F - var1.y, var1.x);
      default:
         throw new IllegalArgumentException("Unsupported Sensor Orientation");
      }
   }

   public final PointF h(PointF var1) {
      switch(this.a) {
      case 0:
         return var1;
      case 90:
         return new PointF(1.0F - var1.y, var1.x);
      case 180:
         return new PointF(1.0F - var1.x, 1.0F - var1.y);
      case 270:
         return new PointF(var1.y, 1.0F - var1.x);
      default:
         throw new IllegalArgumentException("Unsupported Sensor Orientation");
      }
   }

   public final boolean l() {
      return this.a == 0;
   }

   public final boolean m() {
      return (this.a & 2) != 0;
   }

   public final boolean n() {
      return (this.a & 4) != 0;
   }
}
