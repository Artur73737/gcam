package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.Method;

public class AppCompatButton extends Button {
   public final .ii a;
   private final .jn b;
   private .blj c;

   public AppCompatButton(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public AppCompatButton(Context var1, AttributeSet var2) {
      this(var1, var2, 2130968825);
   }

   public AppCompatButton(Context var1, AttributeSet var2, int var3) {
      .ng.a(var1);
      super(var1, var2, var3);
      .ne.d(this, this.getContext());
      .ii var4 = new .ii(this);
      this.a = var4;
      var4.d(var2, var3);
      .jn var5 = new .jn(this);
      this.b = var5;
      var5.b(var2, var3);
      var5.a();
      this.a().w(var2, var3);
   }

   private final .blj a() {
      if (this.c == null) {
         this.c = new .blj(this);
      }

      return this.c;
   }

   protected final void drawableStateChanged() {
      super.drawableStateChanged();
      .ii var1 = this.a;
      if (var1 != null) {
         var1.c();
      }

      .jn var2 = this.b;
      if (var2 != null) {
         var2.a();
      }

   }

   public final int getAutoSizeMaxTextSize() {
      Method var1 = .nv.a;
      return super.getAutoSizeMaxTextSize();
   }

   public final int getAutoSizeMinTextSize() {
      Method var1 = .nv.a;
      return super.getAutoSizeMinTextSize();
   }

   public final int getAutoSizeStepGranularity() {
      Method var1 = .nv.a;
      return super.getAutoSizeStepGranularity();
   }

   public final int[] getAutoSizeTextAvailableSizes() {
      Method var1 = .nv.a;
      return super.getAutoSizeTextAvailableSizes();
   }

   public final int getAutoSizeTextType() {
      Method var1 = .nv.a;
      return super.getAutoSizeTextType() == 1 ? 1 : 0;
   }

   public final Callback getCustomSelectionActionModeCallback() {
      Callback var1 = super.getCustomSelectionActionModeCallback();
      .cik.f(var1);
      return var1;
   }

   public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName(Button.class.getName());
   }

   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setClassName(Button.class.getName());
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.b != null) {
         Method var6 = .nv.a;
      }

   }

   protected void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      super.onTextChanged(var1, var2, var3, var4);
      if (this.b != null) {
         Method var5 = .nv.a;
      }

   }

   public final void setAllCaps(boolean var1) {
      super.setAllCaps(var1);
      this.a();
      .ckf.b();
   }

   public final void setAutoSizeTextTypeUniformWithConfiguration(int var1, int var2, int var3, int var4) {
      Method var5 = .nv.a;
      super.setAutoSizeTextTypeUniformWithConfiguration(var1, var2, var3, var4);
   }

   public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] var1, int var2) {
      Method var3 = .nv.a;
      super.setAutoSizeTextTypeUniformWithPresetSizes(var1, var2);
   }

   public final void setAutoSizeTextTypeWithDefaults(int var1) {
      Method var2 = .nv.a;
      super.setAutoSizeTextTypeWithDefaults(var1);
   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      .ii var2 = this.a;
      if (var2 != null) {
         var2.i();
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      .ii var2 = this.a;
      if (var2 != null) {
         var2.e(var1);
      }

   }

   public final void setFilters(InputFilter[] var1) {
      this.a();
      .ckf.b();
      super.setFilters(var1);
   }

   public final void setTextAppearance(Context var1, int var2) {
      super.setTextAppearance(var1, var2);
      .jn var3 = this.b;
      if (var3 != null) {
         var3.c(var1, var2);
      }

   }

   public final void setTextSize(int var1, float var2) {
      Method var3 = .nv.a;
      super.setTextSize(var1, var2);
   }
}
