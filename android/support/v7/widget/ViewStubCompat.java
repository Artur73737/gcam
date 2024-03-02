package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
   public LayoutInflater a;
   private int b;
   private int c;
   private WeakReference d;

   public ViewStubCompat(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ViewStubCompat(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = 0;
      TypedArray var4 = var1.obtainStyledAttributes(var2, .fq.A, var3, 0);
      this.c = var4.getResourceId(2, -1);
      this.b = var4.getResourceId(1, 0);
      this.setId(var4.getResourceId(0, -1));
      var4.recycle();
      this.setVisibility(8);
      this.setWillNotDraw(true);
   }

   public final View a() {
      ViewParent var2 = this.getParent();
      if (var2 instanceof ViewGroup) {
         if (this.b != 0) {
            ViewGroup var4 = (ViewGroup)var2;
            LayoutInflater var3 = this.a;
            LayoutInflater var5 = var3;
            if (var3 == null) {
               var5 = LayoutInflater.from(this.getContext());
            }

            View var6 = var5.inflate(this.b, var4, false);
            int var1 = this.c;
            if (var1 != -1) {
               var6.setId(var1);
            }

            var1 = var4.indexOfChild(this);
            var4.removeViewInLayout(this);
            LayoutParams var7 = this.getLayoutParams();
            if (var7 != null) {
               var4.addView(var6, var1, var7);
            } else {
               var4.addView(var6, var1);
            }

            this.d = new WeakReference(var6);
            return var6;
         } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
         }
      } else {
         throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
      }
   }

   protected final void dispatchDraw(Canvas var1) {
   }

   public final void draw(Canvas var1) {
   }

   protected final void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(0, 0);
   }

   public final void setVisibility(int var1) {
      WeakReference var2 = this.d;
      if (var2 != null) {
         View var3 = (View)var2.get();
         if (var3 != null) {
            var3.setVisibility(var1);
         } else {
            throw new IllegalStateException("setVisibility called on un-referenced view");
         }
      } else {
         super.setVisibility(var1);
         if (var1 == 0 || var1 == 4) {
            this.a();
         }
      }
   }
}
