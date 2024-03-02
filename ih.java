import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.wear.ambient.AmbientDelegate;

public class ih extends AutoCompleteTextView {
   private static final int[] a = new int[]{16843126};
   private final ii b;
   private final jn c;
   private final bpe d;

   public ih(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ih(Context var1, AttributeSet var2) {
      this(var1, var2, 2130968655);
   }

   public ih(Context var1, AttributeSet var2, int var3) {
      ng.a(var1);
      super(var1, var2, var3);
      ne.d(this, this.getContext());
      AmbientDelegate var7 = AmbientDelegate.E(this.getContext(), var2, a, var3, 0);
      if (var7.B(0)) {
         this.setDropDownBackgroundDrawable(var7.v(0));
      }

      var7.z();
      ii var8 = new ii(this);
      this.b = var8;
      var8.d(var2, var3);
      jn var9 = new jn(this);
      this.c = var9;
      var9.b(var2, var3);
      var9.a();
      bpe var10 = new bpe(this);
      this.d = var10;
      var10.n(var2, var3);
      KeyListener var11 = this.getKeyListener();
      if (bpe.o(var11)) {
         boolean var4 = super.isFocusable();
         boolean var5 = super.isClickable();
         boolean var6 = super.isLongClickable();
         var3 = super.getInputType();
         KeyListener var12 = bpe.p(var11);
         if (var12 != var11) {
            super.setKeyListener(var12);
            super.setRawInputType(var3);
            super.setFocusable(var4);
            super.setClickable(var5);
            super.setLongClickable(var6);
            return;
         }
      }

   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      ii var1 = this.b;
      if (var1 != null) {
         var1.c();
      }

      jn var2 = this.c;
      if (var2 != null) {
         var2.a();
      }

   }

   public final Callback getCustomSelectionActionModeCallback() {
      Callback var1 = super.getCustomSelectionActionModeCallback();
      cik.f(var1);
      return var1;
   }

   public final InputConnection onCreateInputConnection(EditorInfo var1) {
      InputConnection var2 = super.onCreateInputConnection(var1);
      ei.b(var2, var1, this);
      return this.d.q(var2);
   }

   public final void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      ii var2 = this.b;
      if (var2 != null) {
         var2.i();
      }

   }

   public final void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      ii var2 = this.b;
      if (var2 != null) {
         var2.e(var1);
      }

   }

   public final void setCompoundDrawables(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawables(var1, var2, var3, var4);
      jn var5 = this.c;
      if (var5 != null) {
         var5.a();
      }

   }

   public final void setCompoundDrawablesRelative(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawablesRelative(var1, var2, var3, var4);
      jn var5 = this.c;
      if (var5 != null) {
         var5.a();
      }

   }

   public final void setDropDownBackgroundResource(int var1) {
      this.setDropDownBackgroundDrawable(fr.a(this.getContext(), var1));
   }

   public final void setKeyListener(KeyListener var1) {
      super.setKeyListener(bpe.p(var1));
   }

   public final void setTextAppearance(Context var1, int var2) {
      super.setTextAppearance(var1, var2);
      jn var3 = this.c;
      if (var3 != null) {
         var3.c(var1, var2);
      }

   }
}
