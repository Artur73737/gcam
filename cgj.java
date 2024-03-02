import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

public final class cgj {
   public static AccessibilityDelegate a(View var0) {
      return var0.getAccessibilityDelegate();
   }

   public static ContentCaptureSession b(View var0) {
      return var0.getContentCaptureSession();
   }

   static List c(View var0) {
      return var0.getSystemGestureExclusionRects();
   }

   public static void d(View var0, Context var1, int[] var2, AttributeSet var3, TypedArray var4, int var5, int var6) {
      var0.saveAttributeDataForStyleable(var1, var2, var3, var4, var5, var6);
   }

   static void e(View var0, ContentCaptureSession var1) {
      var0.setContentCaptureSession(var1);
   }

   static void f(View var0, List var1) {
      var0.setSystemGestureExclusionRects(var1);
   }
}
