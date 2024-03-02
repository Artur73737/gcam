package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;

public class CheckableImageButton extends .io implements Checkable {
   private static final int[] c = new int[]{16842912};
   public boolean a;
   public boolean b;
   private boolean d;

   public CheckableImageButton(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public CheckableImageButton(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969404);
   }

   public CheckableImageButton(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = true;
      this.d = true;
      .cgm.g(this, new .oky(this));
   }

   public final boolean isChecked() {
      return this.a;
   }

   public final int[] onCreateDrawableState(int var1) {
      return this.a ? mergeDrawableStates(super.onCreateDrawableState(var1 + 1), c) : super.onCreateDrawableState(var1);
   }

   protected final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof .okz)) {
         super.onRestoreInstanceState(var1);
      } else {
         .okz var2 = (.okz)var1;
         super.onRestoreInstanceState(var2.d);
         this.setChecked(var2.a);
      }
   }

   protected final Parcelable onSaveInstanceState() {
      .okz var1 = new .okz(super.onSaveInstanceState());
      var1.a = this.a;
      return var1;
   }

   public final void setChecked(boolean var1) {
      if (this.b && this.a != var1) {
         this.a = var1;
         this.refreshDrawableState();
         this.sendAccessibilityEvent(2048);
      }

   }

   public final void setPressed(boolean var1) {
      if (this.d) {
         super.setPressed(var1);
      }

   }

   public final void toggle() {
      this.setChecked(this.a ^ true);
   }
}
