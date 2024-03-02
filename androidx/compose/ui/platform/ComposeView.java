package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;

public final class ComposeView extends .bno {
   private final .att a;
   private boolean b;

   public ComposeView(Context var1) {
      var1.getClass();
      this(var1, (AttributeSet)null, 0, 6, (.qwl)null);
   }

   public ComposeView(Context var1, AttributeSet var2) {
      var1.getClass();
      this(var1, var2, 0, 4, (.qwl)null);
   }

   public ComposeView(Context var1, AttributeSet var2, int var3) {
      var1.getClass();
      super(var1, var2, var3);
      this.a = .sg.d((Object)null);
   }

   // $FF: synthetic method
   public ComposeView(Context var1, AttributeSet var2, int var3, int var4, .qwl var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 0;
      }

      this(var1, var2, var3);
   }

   public final void a(.asm var1, int var2) {
      var1 = var1.b(420213850);
      .qvx var3 = (.qvx)this.a.a();
      if (var3 != null) {
         var3.a(var1, 0);
      }

      .aug var4 = var1.H();
      if (var4 != null) {
         var4.c = new .ajh(this, var2, 8);
      }
   }

   protected final boolean d() {
      return this.b;
   }

   public final void e(.qvx var1) {
      this.b = true;
      this.a.b(var1);
      if (this.isAttachedToWindow()) {
         if (this.isAttachedToWindow()) {
            super.c();
         } else {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
         }
      }
   }

   public final CharSequence getAccessibilityClassName() {
      String var1 = this.getClass().getName();
      var1.getClass();
      return var1;
   }
}
