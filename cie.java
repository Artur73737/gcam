import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

public final class cie {
   static ViewStructure a(ContentCaptureSession var0, View var1) {
      return var0.newViewStructure(var1);
   }

   static ViewStructure b(ContentCaptureSession var0, AutofillId var1, long var2) {
      return var0.newVirtualViewStructure(var1, var2);
   }

   public static AutofillId c(ContentCaptureSession var0, AutofillId var1, long var2) {
      return var0.newAutofillId(var1, var2);
   }

   static void d(ContentCaptureSession var0, ViewStructure var1) {
      var0.notifyViewAppeared(var1);
   }

   public static void e(ContentCaptureSession var0, AutofillId var1, CharSequence var2) {
      var0.notifyViewTextChanged(var1, var2);
   }

   public static void f(ContentCaptureSession var0, AutofillId var1, long[] var2) {
      var0.notifyViewsDisappeared(var1, var2);
   }
}
