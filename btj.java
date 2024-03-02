import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Canvas.EdgeType;
import android.graphics.Canvas.VertexMode;
import android.graphics.PorterDuff.Mode;
import android.graphics.Region.Op;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.google.android.apps.camera.contentprovider.Eboh.wAtBWCNpqMjxj;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import com.google.android.material.snackbar.Lqt.HUJCIBIkzRDQ;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public final class btj extends Canvas {
   public Canvas a;

   public final boolean clipOutPath(Path var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.clipOutPath(var1);
   }

   public final boolean clipOutRect(float var1, float var2, float var3, float var4) {
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      return var5.clipOutRect(var1, var2, var3, var4);
   }

   public final boolean clipOutRect(int var1, int var2, int var3, int var4) {
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      return var5.clipOutRect(var1, var2, var3, var4);
   }

   public final boolean clipOutRect(Rect var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.clipOutRect(var1);
   }

   public final boolean clipOutRect(RectF var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.clipOutRect(var1);
   }

   public final boolean clipPath(Path var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b(DzzpnVggahPIX.bjigHsVF);
         var2 = null;
      }

      return var2.clipPath(var1);
   }

   public final boolean clipPath(Path var1, Op var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.clipPath(var1, var2);
   }

   public final boolean clipRect(float var1, float var2, float var3, float var4) {
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      return var5.clipRect(var1, var2, var3, var4);
   }

   public final boolean clipRect(float var1, float var2, float var3, float var4, Op var5) {
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      return var6.clipRect(var1, var2, var3, var4, var5);
   }

   public final boolean clipRect(int var1, int var2, int var3, int var4) {
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      return var5.clipRect(var1, var2, var3, var4);
   }

   public final boolean clipRect(Rect var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.clipRect(var1);
   }

   public final boolean clipRect(Rect var1, Op var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.clipRect(var1, var2);
   }

   public final boolean clipRect(RectF var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.clipRect(var1);
   }

   public final boolean clipRect(RectF var1, Op var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.clipRect(var1, var2);
   }

   public final void concat(Matrix var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.concat(var1);
   }

   public final void disableZ() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      var1.disableZ();
   }

   public final void drawARGB(int var1, int var2, int var3, int var4) {
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawARGB(var1, var2, var3, var4);
   }

   public final void drawArc(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7, Paint var8) {
      var8.getClass();
      Canvas var9 = this.a;
      if (var9 == null) {
         qwp.b("nativeCanvas");
         var9 = null;
      }

      var9.drawArc(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public final void drawArc(RectF var1, float var2, float var3, boolean var4, Paint var5) {
      var1.getClass();
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      var6.drawArc(var1, var2, var3, var4, var5);
   }

   public final void drawBitmap(Bitmap var1, float var2, float var3, Paint var4) {
      var1.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawBitmap(var1, var2, var3, var4);
   }

   public final void drawBitmap(Bitmap var1, Matrix var2, Paint var3) {
      var1.getClass();
      var2.getClass();
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      var4.drawBitmap(var1, var2, var3);
   }

   public final void drawBitmap(Bitmap var1, Rect var2, Rect var3, Paint var4) {
      var1.getClass();
      var3.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawBitmap(var1, var2, var3, var4);
   }

   public final void drawBitmap(Bitmap var1, Rect var2, RectF var3, Paint var4) {
      var1.getClass();
      var3.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawBitmap(var1, var2, var3, var4);
   }

   public final void drawBitmap(int[] var1, int var2, int var3, float var4, float var5, int var6, int var7, boolean var8, Paint var9) {
      var1.getClass();
      Canvas var10 = this.a;
      if (var10 == null) {
         qwp.b("nativeCanvas");
         var10 = null;
      }

      var10.drawBitmap(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void drawBitmap(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Paint var9) {
      var1.getClass();
      Canvas var10 = this.a;
      if (var10 == null) {
         qwp.b("nativeCanvas");
         var10 = null;
      }

      var10.drawBitmap(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void drawBitmapMesh(Bitmap var1, int var2, int var3, float[] var4, int var5, int[] var6, int var7, Paint var8) {
      var1.getClass();
      var4.getClass();
      Canvas var9 = this.a;
      if (var9 == null) {
         qwp.b("nativeCanvas");
         var9 = null;
      }

      var9.drawBitmapMesh(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public final void drawCircle(float var1, float var2, float var3, Paint var4) {
      var4.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawCircle(var1, var2, var3, var4);
   }

   public final void drawColor(int var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.drawColor(var1);
   }

   public final void drawColor(int var1, BlendMode var2) {
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawColor(var1, var2);
   }

   public final void drawColor(int var1, Mode var2) {
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawColor(var1, var2);
   }

   public final void drawColor(long var1) {
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawColor(var1);
   }

   public final void drawColor(long var1, BlendMode var3) {
      var3.getClass();
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      var4.drawColor(var1, var3);
   }

   public final void drawDoubleRoundRect(RectF var1, float var2, float var3, RectF var4, float var5, float var6, Paint var7) {
      var1.getClass();
      var4.getClass();
      var7.getClass();
      Canvas var8 = this.a;
      if (var8 == null) {
         qwp.b("nativeCanvas");
         var8 = null;
      }

      var8.drawDoubleRoundRect(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void drawDoubleRoundRect(RectF var1, float[] var2, RectF var3, float[] var4, Paint var5) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var4.getClass();
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b(gKVNpqGY.ncpBvfs);
         var6 = null;
      }

      var6.drawDoubleRoundRect(var1, var2, var3, var4, var5);
   }

   public final void drawGlyphs(int[] var1, int var2, float[] var3, int var4, int var5, Font var6, Paint var7) {
      var1.getClass();
      var3.getClass();
      var6.getClass();
      var7.getClass();
      Canvas var8 = this.a;
      if (var8 == null) {
         qwp.b("nativeCanvas");
         var8 = null;
      }

      var8.drawGlyphs(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void drawLine(float var1, float var2, float var3, float var4, Paint var5) {
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      var6.drawLine(var1, var2, var3, var4, var5);
   }

   public final void drawLines(float[] var1, int var2, int var3, Paint var4) {
      var1.getClass();
      var4.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawLines(var1, var2, var3, var4);
   }

   public final void drawLines(float[] var1, Paint var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawLines(var1, var2);
   }

   public final void drawOval(float var1, float var2, float var3, float var4, Paint var5) {
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      var6.drawOval(var1, var2, var3, var4, var5);
   }

   public final void drawOval(RectF var1, Paint var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawOval(var1, var2);
   }

   public final void drawPaint(Paint var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b(HUJCIBIkzRDQ.JJbQobFfrp);
         var2 = null;
      }

      var2.drawPaint(var1);
   }

   public final void drawPatch(NinePatch var1, Rect var2, Paint var3) {
      var1.getClass();
      var2.getClass();
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b(wAtBWCNpqMjxj.RYlgfVZYrmzCArT);
         var4 = null;
      }

      var4.drawPatch(var1, var2, var3);
   }

   public final void drawPatch(NinePatch var1, RectF var2, Paint var3) {
      var1.getClass();
      var2.getClass();
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      var4.drawPatch(var1, var2, var3);
   }

   public final void drawPath(Path var1, Paint var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawPath(var1, var2);
   }

   public final void drawPicture(Picture var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.drawPicture(var1);
   }

   public final void drawPicture(Picture var1, Rect var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawPicture(var1, var2);
   }

   public final void drawPicture(Picture var1, RectF var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawPicture(var1, var2);
   }

   public final void drawPoint(float var1, float var2, Paint var3) {
      var3.getClass();
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      var4.drawPoint(var1, var2, var3);
   }

   public final void drawPoints(float[] var1, int var2, int var3, Paint var4) {
      var4.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawPoints(var1, var2, var3, var4);
   }

   public final void drawPoints(float[] var1, Paint var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawPoints(var1, var2);
   }

   public final void drawPosText(String var1, float[] var2, Paint var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      var4.drawPosText(var1, var2, var3);
   }

   public final void drawPosText(char[] var1, int var2, int var3, float[] var4, Paint var5) {
      var1.getClass();
      var4.getClass();
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      var6.drawPosText(var1, var2, var3, var4, var5);
   }

   public final void drawRGB(int var1, int var2, int var3) {
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      var4.drawRGB(var1, var2, var3);
   }

   public final void drawRect(float var1, float var2, float var3, float var4, Paint var5) {
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      var6.drawRect(var1, var2, var3, var4, var5);
   }

   public final void drawRect(Rect var1, Paint var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawRect(var1, var2);
   }

   public final void drawRect(RectF var1, Paint var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.drawRect(var1, var2);
   }

   public final void drawRenderNode(RenderNode var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.drawRenderNode(var1);
   }

   public final void drawRoundRect(float var1, float var2, float var3, float var4, float var5, float var6, Paint var7) {
      var7.getClass();
      Canvas var8 = this.a;
      if (var8 == null) {
         qwp.b("nativeCanvas");
         var8 = null;
      }

      var8.drawRoundRect(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void drawRoundRect(RectF var1, float var2, float var3, Paint var4) {
      var1.getClass();
      var4.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawRoundRect(var1, var2, var3, var4);
   }

   public final void drawText(CharSequence var1, int var2, int var3, float var4, float var5, Paint var6) {
      var1.getClass();
      var6.getClass();
      Canvas var7 = this.a;
      if (var7 == null) {
         qwp.b("nativeCanvas");
         var7 = null;
      }

      var7.drawText(var1, var2, var3, var4, var5, var6);
   }

   public final void drawText(String var1, float var2, float var3, Paint var4) {
      var1.getClass();
      var4.getClass();
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      var5.drawText(var1, var2, var3, var4);
   }

   public final void drawText(String var1, int var2, int var3, float var4, float var5, Paint var6) {
      var1.getClass();
      var6.getClass();
      Canvas var7 = this.a;
      if (var7 == null) {
         qwp.b("nativeCanvas");
         var7 = null;
      }

      var7.drawText(var1, var2, var3, var4, var5, var6);
   }

   public final void drawText(char[] var1, int var2, int var3, float var4, float var5, Paint var6) {
      var1.getClass();
      var6.getClass();
      Canvas var7 = this.a;
      if (var7 == null) {
         qwp.b("nativeCanvas");
         var7 = null;
      }

      var7.drawText(var1, var2, var3, var4, var5, var6);
   }

   public final void drawTextOnPath(String var1, Path var2, float var3, float var4, Paint var5) {
      var1.getClass();
      var2.getClass();
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      var6.drawTextOnPath(var1, var2, var3, var4, var5);
   }

   public final void drawTextOnPath(char[] var1, int var2, int var3, Path var4, float var5, float var6, Paint var7) {
      var1.getClass();
      var4.getClass();
      var7.getClass();
      Canvas var8 = this.a;
      if (var8 == null) {
         qwp.b("nativeCanvas");
         var8 = null;
      }

      var8.drawTextOnPath(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void drawTextRun(MeasuredText var1, int var2, int var3, int var4, int var5, float var6, float var7, boolean var8, Paint var9) {
      var1.getClass();
      var9.getClass();
      Canvas var10 = this.a;
      if (var10 == null) {
         qwp.b("nativeCanvas");
         var10 = null;
      }

      var10.drawTextRun(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void drawTextRun(CharSequence var1, int var2, int var3, int var4, int var5, float var6, float var7, boolean var8, Paint var9) {
      var1.getClass();
      var9.getClass();
      Canvas var10 = this.a;
      if (var10 == null) {
         qwp.b("nativeCanvas");
         var10 = null;
      }

      var10.drawTextRun(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void drawTextRun(char[] var1, int var2, int var3, int var4, int var5, float var6, float var7, boolean var8, Paint var9) {
      var1.getClass();
      var9.getClass();
      Canvas var10 = this.a;
      if (var10 == null) {
         qwp.b("nativeCanvas");
         var10 = null;
      }

      var10.drawTextRun(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void drawVertices(VertexMode var1, int var2, float[] var3, int var4, float[] var5, int var6, int[] var7, int var8, short[] var9, int var10, int var11, Paint var12) {
      var1.getClass();
      var3.getClass();
      var12.getClass();
      Canvas var13 = this.a;
      if (var13 == null) {
         qwp.b("nativeCanvas");
         var13 = null;
      }

      var13.drawVertices(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public final void enableZ() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      var1.enableZ();
   }

   public final boolean getClipBounds(Rect var1) {
      var1.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      boolean var2 = var3.getClipBounds(var1);
      if (var2) {
         var1.set(0, 0, var1.width(), Integer.MAX_VALUE);
      }

      return var2;
   }

   public final int getDensity() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getDensity();
   }

   public final DrawFilter getDrawFilter() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getDrawFilter();
   }

   public final int getHeight() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getHeight();
   }

   public final void getMatrix(Matrix var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.getMatrix(var1);
   }

   public final int getMaximumBitmapHeight() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getMaximumBitmapHeight();
   }

   public final int getMaximumBitmapWidth() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getMaximumBitmapWidth();
   }

   public final int getSaveCount() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getSaveCount();
   }

   public final int getWidth() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.getWidth();
   }

   public final boolean isOpaque() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.isOpaque();
   }

   public final boolean quickReject(float var1, float var2, float var3, float var4) {
      Canvas var6 = this.a;
      Canvas var5 = var6;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var5 = null;
      }

      return var5.quickReject(var1, var2, var3, var4);
   }

   public final boolean quickReject(float var1, float var2, float var3, float var4, EdgeType var5) {
      var5.getClass();
      Canvas var6 = this.a;
      if (var6 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      return var6.quickReject(var1, var2, var3, var4, var5);
   }

   public final boolean quickReject(Path var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.quickReject(var1);
   }

   public final boolean quickReject(Path var1, EdgeType var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.quickReject(var1, var2);
   }

   public final boolean quickReject(RectF var1) {
      var1.getClass();
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      return var2.quickReject(var1);
   }

   public final boolean quickReject(RectF var1, EdgeType var2) {
      var1.getClass();
      var2.getClass();
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.quickReject(var1, var2);
   }

   public final void restore() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      var1.restore();
   }

   public final void restoreToCount(int var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.restoreToCount(var1);
   }

   public final void rotate(float var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.rotate(var1);
   }

   public final int save() {
      Canvas var2 = this.a;
      Canvas var1 = var2;
      if (var2 == null) {
         qwp.b("nativeCanvas");
         var1 = null;
      }

      return var1.save();
   }

   public final int saveLayer(float var1, float var2, float var3, float var4, Paint var5) {
      Canvas var7 = this.a;
      Canvas var6 = var7;
      if (var7 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      return var6.saveLayer(var1, var2, var3, var4, var5);
   }

   public final int saveLayer(float var1, float var2, float var3, float var4, Paint var5, int var6) {
      Canvas var8 = this.a;
      Canvas var7 = var8;
      if (var8 == null) {
         qwp.b("nativeCanvas");
         var7 = null;
      }

      return var7.saveLayer(var1, var2, var3, var4, var5, var6);
   }

   public final int saveLayer(RectF var1, Paint var2) {
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.saveLayer(var1, var2);
   }

   public final int saveLayer(RectF var1, Paint var2, int var3) {
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b(TRoaEYDrhZZT.xlGDlWhnSC);
         var4 = null;
      }

      return var4.saveLayer(var1, var2, var3);
   }

   public final int saveLayerAlpha(float var1, float var2, float var3, float var4, int var5) {
      Canvas var7 = this.a;
      Canvas var6 = var7;
      if (var7 == null) {
         qwp.b("nativeCanvas");
         var6 = null;
      }

      return var6.saveLayerAlpha(var1, var2, var3, var4, var5);
   }

   public final int saveLayerAlpha(float var1, float var2, float var3, float var4, int var5, int var6) {
      Canvas var8 = this.a;
      Canvas var7 = var8;
      if (var8 == null) {
         qwp.b("nativeCanvas");
         var7 = null;
      }

      return var7.saveLayerAlpha(var1, var2, var3, var4, var5, var6);
   }

   public final int saveLayerAlpha(RectF var1, int var2) {
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      return var3.saveLayerAlpha(var1, var2);
   }

   public final int saveLayerAlpha(RectF var1, int var2, int var3) {
      Canvas var5 = this.a;
      Canvas var4 = var5;
      if (var5 == null) {
         qwp.b("nativeCanvas");
         var4 = null;
      }

      return var4.saveLayerAlpha(var1, var2, var3);
   }

   public final void scale(float var1, float var2) {
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.scale(var1, var2);
   }

   public final void setBitmap(Bitmap var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.setBitmap(var1);
   }

   public final void setDensity(int var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.setDensity(var1);
   }

   public final void setDrawFilter(DrawFilter var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.setDrawFilter(var1);
   }

   public final void setMatrix(Matrix var1) {
      Canvas var3 = this.a;
      Canvas var2 = var3;
      if (var3 == null) {
         qwp.b("nativeCanvas");
         var2 = null;
      }

      var2.setMatrix(var1);
   }

   public final void skew(float var1, float var2) {
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.skew(var1, var2);
   }

   public final void translate(float var1, float var2) {
      Canvas var4 = this.a;
      Canvas var3 = var4;
      if (var4 == null) {
         qwp.b("nativeCanvas");
         var3 = null;
      }

      var3.translate(var1, var2);
   }
}
