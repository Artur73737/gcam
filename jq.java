import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.Method;

public class jq extends TextView {
   private final ii a;
   private final jn b;
   private boolean c;
   private jo d;
   private blj e;

   public jq(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public jq(Context var1, AttributeSet var2) {
      this(var1, var2, 16842884);
   }

   public jq(Context var1, AttributeSet var2, int var3) {
      ng.a(var1);
      super(var1, var2, var3);
      this.c = false;
      this.d = null;
      ne.d(this, this.getContext());
      ii var4 = new ii(this);
      this.a = var4;
      var4.d(var2, var3);
      jn var5 = new jn(this);
      this.b = var5;
      var5.b(var2, var3);
      var5.a();
      this.a().w(var2, var3);
   }

   private final blj a() {
      if (this.e == null) {
         this.e = new blj(this);
      }

      return this.e;
   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      ii var1 = this.a;
      if (var1 != null) {
         var1.c();
      }

      jn var2 = this.b;
      if (var2 != null) {
         var2.a();
      }

   }

   final jo g() {
      if (this.d == null) {
         this.d = new jp(this);
      }

      return this.d;
   }

   public final int getAutoSizeMaxTextSize() {
      Method var1 = nv.a;
      return this.g().a.getAutoSizeMaxTextSize();
   }

   public final int getAutoSizeMinTextSize() {
      Method var1 = nv.a;
      return this.g().a.getAutoSizeMinTextSize();
   }

   public final int getAutoSizeStepGranularity() {
      Method var1 = nv.a;
      return this.g().a.getAutoSizeStepGranularity();
   }

   public final int[] getAutoSizeTextAvailableSizes() {
      Method var1 = nv.a;
      return this.g().a.getAutoSizeTextAvailableSizes();
   }

   public final int getAutoSizeTextType() {
      Method var1 = nv.a;
      return this.g().a.getAutoSizeTextType() == 1 ? 1 : 0;
   }

   public final Callback getCustomSelectionActionModeCallback() {
      Callback var1 = super.getCustomSelectionActionModeCallback();
      cik.f(var1);
      return var1;
   }

   public final int getFirstBaselineToTopHeight() {
      return this.getPaddingTop() - this.getPaint().getFontMetricsInt().top;
   }

   public final int getLastBaselineToBottomHeight() {
      return this.getPaddingBottom() + this.getPaint().getFontMetricsInt().bottom;
   }

   public final TextClassifier getTextClassifier() {
      return this.g().a.getTextClassifier();
   }

   public final InputConnection onCreateInputConnection(EditorInfo var1) {
      InputConnection var2 = super.onCreateInputConnection(var1);
      ei.b(var2, var1, this);
      return var2;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.b != null) {
         Method var6 = nv.a;
      }

   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
   }

   protected final void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      super.onTextChanged(var1, var2, var3, var4);
      if (this.b != null) {
         Method var5 = nv.a;
      }

   }

   public final void setAllCaps(boolean var1) {
      super.setAllCaps(var1);
      this.a();
      ckf.b();
   }

   public final void setAutoSizeTextTypeUniformWithConfiguration(int var1, int var2, int var3, int var4) {
      Method var5 = nv.a;
      this.g().a.setAutoSizeTextTypeUniformWithConfiguration(var1, var2, var3, var4);
   }

   public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] var1, int var2) {
      Method var3 = nv.a;
      this.g().a.setAutoSizeTextTypeUniformWithPresetSizes(var1, var2);
   }

   public final void setAutoSizeTextTypeWithDefaults(int var1) {
      Method var2 = nv.a;
      this.g().a.setAutoSizeTextTypeWithDefaults(var1);
   }

   public final void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      ii var2 = this.a;
      if (var2 != null) {
         var2.i();
      }

   }

   public final void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      ii var2 = this.a;
      if (var2 != null) {
         var2.e(var1);
      }

   }

   public final void setCompoundDrawables(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawables(var1, var2, var3, var4);
      jn var5 = this.b;
      if (var5 != null) {
         var5.a();
      }

   }

   public final void setCompoundDrawablesRelative(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawablesRelative(var1, var2, var3, var4);
      jn var5 = this.b;
      if (var5 != null) {
         var5.a();
      }

   }

   public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int var1, int var2, int var3, int var4) {
      Context var9 = this.getContext();
      Drawable var8 = null;
      Drawable var5;
      if (var1 != 0) {
         var5 = fr.a(var9, var1);
      } else {
         var5 = null;
      }

      Drawable var6;
      if (var2 != 0) {
         var6 = fr.a(var9, var2);
      } else {
         var6 = null;
      }

      Drawable var7;
      if (var3 != 0) {
         var7 = fr.a(var9, var3);
      } else {
         var7 = null;
      }

      if (var4 != 0) {
         var8 = fr.a(var9, var4);
      }

      this.setCompoundDrawablesRelativeWithIntrinsicBounds(var5, var6, var7, var8);
      jn var10 = this.b;
      if (var10 != null) {
         var10.a();
      }

   }

   public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawablesRelativeWithIntrinsicBounds(var1, var2, var3, var4);
      jn var5 = this.b;
      if (var5 != null) {
         var5.a();
      }

   }

   public final void setCompoundDrawablesWithIntrinsicBounds(int var1, int var2, int var3, int var4) {
      Context var9 = this.getContext();
      Drawable var8 = null;
      Drawable var5;
      if (var1 != 0) {
         var5 = fr.a(var9, var1);
      } else {
         var5 = null;
      }

      Drawable var6;
      if (var2 != 0) {
         var6 = fr.a(var9, var2);
      } else {
         var6 = null;
      }

      Drawable var7;
      if (var3 != 0) {
         var7 = fr.a(var9, var3);
      } else {
         var7 = null;
      }

      if (var4 != 0) {
         var8 = fr.a(var9, var4);
      }

      this.setCompoundDrawablesWithIntrinsicBounds(var5, var6, var7, var8);
      jn var10 = this.b;
      if (var10 != null) {
         var10.a();
      }

   }

   public final void setCompoundDrawablesWithIntrinsicBounds(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawablesWithIntrinsicBounds(var1, var2, var3, var4);
      jn var5 = this.b;
      if (var5 != null) {
         var5.a();
      }

   }

   public final void setFilters(InputFilter[] var1) {
      this.a();
      ckf.b();
      super.setFilters(var1);
   }

   public final void setFirstBaselineToTopHeight(int var1) {
      ((jp)this.g()).b.setFirstBaselineToTopHeight(var1);
   }

   public final void setLastBaselineToBottomHeight(int var1) {
      ((jp)this.g()).b.setLastBaselineToBottomHeight(var1);
   }

   public final void setLineHeight(int var1) {
      cik.d(this, var1);
   }

   public void setTextAppearance(Context var1, int var2) {
      super.setTextAppearance(var1, var2);
      jn var3 = this.b;
      if (var3 != null) {
         var3.c(var1, var2);
      }

   }

   public final void setTextClassifier(TextClassifier var1) {
      this.g().a.setTextClassifier(var1);
   }

   public final void setTextSize(int var1, float var2) {
      Method var3 = nv.a;
      super.setTextSize(var1, var2);
   }

   public final void setTypeface(Typeface var1, int var2) {
      if (!this.c) {
         Typeface var3 = null;
         if (var1 != null && var2 > 0) {
            if (this.getContext() == null) {
               throw new IllegalArgumentException("Context cannot be null");
            }

            var3 = Typeface.create(var1, var2);
         }

         this.c = true;
         if (var3 != null) {
            var1 = var3;
         }

         try {
            super.setTypeface(var1, var2);
         } finally {
            this.c = false;
         }

      }
   }
}
