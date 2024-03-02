import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class bvw implements InputConnection {
   private int a;
   private final bwa b;
   private final List c;
   private boolean d;
   private final AmbientMode$AmbientController e;

   public bvw(bwa var1, AmbientMode$AmbientController var2) {
      this.e = var2;
      this.b = var1;
      this.c = new ArrayList();
      this.d = true;
   }

   private final void a(bvt var1) {
      this.d();

      try {
         this.c.add(var1);
      } finally {
         this.c();
      }

   }

   private final void b(int var1) {
      this.sendKeyEvent(new KeyEvent(0, var1));
      this.sendKeyEvent(new KeyEvent(1, var1));
   }

   private final boolean c() {
      int var1 = this.a - 1;
      this.a = var1;
      if (var1 == 0 && !this.c.isEmpty()) {
         AmbientMode$AmbientController var3 = this.e;
         List var2 = pwm.aE(this.c);
         ((qvt)((bwc)var3.a).b).eo(var2);
         this.c.clear();
      }

      return this.a > 0;
   }

   private final void d() {
      ++this.a;
   }

   public final boolean beginBatchEdit() {
      if (this.d) {
         this.d();
         return true;
      } else {
         return false;
      }
   }

   public final boolean clearMetaKeyStates(int var1) {
      return false;
   }

   public final void closeConnection() {
      this.c.clear();
      int var1 = 0;
      this.a = 0;
      this.d = false;
      AmbientMode$AmbientController var3 = this.e;

      for(int var2 = ((List)((bwc)var3.a).e).size(); var1 < var2; ++var1) {
         if (c.E(((WeakReference)((List)((bwc)var3.a).e).get(var1)).get(), this)) {
            ((List)((bwc)var3.a).e).remove(var1);
            return;
         }
      }

   }

   public final boolean commitCompletion(CompletionInfo var1) {
      return false;
   }

   public final boolean commitContent(InputContentInfo var1, int var2, Bundle var3) {
      var1.getClass();
      return false;
   }

   public final boolean commitCorrection(CorrectionInfo var1) {
      return this.d;
   }

   public final boolean commitText(CharSequence var1, int var2) {
      boolean var3 = this.d;
      if (var3) {
         String var4 = String.valueOf(var1);
         var4.getClass();
         this.a(new bvq(new bry(var4), var2));
      }

      return var3;
   }

   public final boolean deleteSurroundingText(int var1, int var2) {
      if (this.d) {
         this.a(new bvr(var1, var2));
         return true;
      } else {
         return false;
      }
   }

   public final boolean deleteSurroundingTextInCodePoints(int var1, int var2) {
      if (this.d) {
         this.a(new bvs(var1, var2));
         return true;
      } else {
         return false;
      }
   }

   public final boolean endBatchEdit() {
      return this.c();
   }

   public final boolean finishComposingText() {
      if (this.d) {
         this.a(new bvu());
         return true;
      } else {
         return false;
      }
   }

   public final int getCursorCapsMode(int var1) {
      bwa var2 = this.b;
      return TextUtils.getCapsMode(var2.a(), bsr.c(var2.b), var1);
   }

   public final ExtractedText getExtractedText(ExtractedTextRequest var1, int var2) {
      if ((var2 & 1) != 0 && var1 != null) {
         var2 = var1.token;
      }

      bwa var3 = this.b;
      ExtractedText var4 = new ExtractedText();
      var4.text = var3.a();
      byte var5 = 0;
      var4.startOffset = 0;
      var4.partialEndOffset = var3.a().length();
      var4.partialStartOffset = -1;
      var4.selectionStart = bsr.c(var3.b);
      var4.selectionEnd = bsr.b(var3.b);
      if (qwp.s(var3.a(), '\n', 0, 2) >= 0) {
         var5 = 1;
      }

      var4.flags = var5 ^ 1;
      return var4;
   }

   public final Handler getHandler() {
      return null;
   }

   public final CharSequence getSelectedText(int var1) {
      long var2 = this.b.b;
      if (bsr.d(var2) == bsr.a(var2)) {
         return null;
      } else {
         bwa var5 = this.b;
         bry var4 = var5.a;
         var2 = var5.b;
         return var4.b(bsr.c(var2), bsr.b(var2)).a;
      }
   }

   public final CharSequence getTextAfterCursor(int var1, int var2) {
      bwa var3 = this.b;
      return var3.a.b(bsr.b(var3.b), Math.min(bsr.b(var3.b) + var1, var3.a().length())).a;
   }

   public final CharSequence getTextBeforeCursor(int var1, int var2) {
      bwa var3 = this.b;
      return var3.a.b(Math.max(0, bsr.c(var3.b) - var1), bsr.c(var3.b)).a;
   }

   public final boolean performContextMenuAction(int var1) {
      if (this.d) {
         switch(var1) {
         case 16908319:
            this.a(new bvz(0, this.b.a().length()));
            break;
         case 16908320:
            this.b(277);
            break;
         case 16908321:
            this.b(278);
            break;
         case 16908322:
            this.b(279);
         }

         return false;
      } else {
         return false;
      }
   }

   public final boolean performEditorAction(int var1) {
      if (this.d) {
         byte var2;
         switch(var1) {
         case 0:
            var2 = 1;
            break;
         case 1:
         default:
            Log.w("RecordingIC", c.aE(var1, "IME sends unsupported Editor Action: "));
            var2 = 1;
            break;
         case 2:
            var2 = 2;
            break;
         case 3:
            var2 = 3;
            break;
         case 4:
            var2 = 4;
            break;
         case 5:
            var2 = 6;
            break;
         case 6:
            var2 = 7;
            break;
         case 7:
            var2 = 5;
         }

         ((qvt)((bwc)this.e.a).c).eo(new bvv(var2));
         return true;
      } else {
         return false;
      }
   }

   public final boolean performPrivateCommand(String var1, Bundle var2) {
      return this.d;
   }

   public final boolean reportFullscreenMode(boolean var1) {
      return false;
   }

   public final boolean requestCursorUpdates(int var1) {
      return this.d;
   }

   public final boolean sendKeyEvent(KeyEvent var1) {
      var1.getClass();
      if (this.d) {
         ((BaseInputConnection)((qsd)((bwc)this.e.a).f).a()).sendKeyEvent(var1);
         return true;
      } else {
         return false;
      }
   }

   public final boolean setComposingRegion(int var1, int var2) {
      boolean var3 = this.d;
      if (var3) {
         this.a(new bvx(var1, var2));
      }

      return var3;
   }

   public final boolean setComposingText(CharSequence var1, int var2) {
      boolean var3 = this.d;
      if (var3) {
         String var4 = String.valueOf(var1);
         var4.getClass();
         this.a(new bvy(new bry(var4), var2));
      }

      return var3;
   }

   public final boolean setSelection(int var1, int var2) {
      if (this.d) {
         this.a(new bvz(var1, var2));
         return true;
      } else {
         return false;
      }
   }
}
