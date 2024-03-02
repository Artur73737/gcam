package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class PreferenceImageView extends ImageView {
   private int a;
   private int b;

   public PreferenceImageView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PreferenceImageView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public PreferenceImageView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = Integer.MAX_VALUE;
      this.b = Integer.MAX_VALUE;
      TypedArray var4 = var1.obtainStyledAttributes(var2, .cqk.j, var3, 0);
      this.setMaxWidth(var4.getDimensionPixelSize(3, Integer.MAX_VALUE));
      this.setMaxHeight(var4.getDimensionPixelSize(2, Integer.MAX_VALUE));
      var4.recycle();
   }

   public final int getMaxHeight() {
      return this.b;
   }

   public final int getMaxWidth() {
      return this.a;
   }

   protected final void onMeasure(int var1, int var2) {
      int var3;
      int var4;
      byte var5;
      int var6;
      label39: {
         var6 = MeasureSpec.getMode(var1);
         var5 = 0;
         var4 = var6;
         if (var6 != Integer.MIN_VALUE) {
            var3 = var1;
            if (var6 != 0) {
               break label39;
            }

            var4 = 0;
         }

         var6 = MeasureSpec.getSize(var1);
         int var7 = this.a;
         var3 = var1;
         if (var7 != Integer.MAX_VALUE) {
            label33: {
               if (var7 >= var6) {
                  var3 = var1;
                  if (var4 != 0) {
                     break label33;
                  }
               }

               var3 = MeasureSpec.makeMeasureSpec(var7, Integer.MIN_VALUE);
            }
         }
      }

      label28: {
         var4 = MeasureSpec.getMode(var2);
         if (var4 != Integer.MIN_VALUE) {
            var1 = var2;
            if (var4 != 0) {
               break label28;
            }

            var4 = var5;
         }

         int var8 = MeasureSpec.getSize(var2);
         var6 = this.b;
         var1 = var2;
         if (var6 != Integer.MAX_VALUE) {
            label22: {
               if (var6 >= var8) {
                  var1 = var2;
                  if (var4 != 0) {
                     break label22;
                  }
               }

               var1 = MeasureSpec.makeMeasureSpec(var6, Integer.MIN_VALUE);
            }
         }
      }

      super.onMeasure(var3, var1);
   }

   public final void setMaxHeight(int var1) {
      this.b = var1;
      super.setMaxHeight(var1);
   }

   public final void setMaxWidth(int var1) {
      this.a = var1;
      super.setMaxWidth(var1);
   }
}
