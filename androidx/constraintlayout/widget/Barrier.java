package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Barrier extends .cab {
   public int a;
   public .bzb b;

   public Barrier(Context var1) {
      super(var1);
      super.setVisibility(8);
   }

   public Barrier(Context var1, AttributeSet var2) {
      super(var1, var2);
      super.setVisibility(8);
   }

   public Barrier(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      super.setVisibility(8);
   }

   protected final void a(AttributeSet var1) {
      int var2;
      int var3;
      int var4;
      if (var1 != null) {
         TypedArray var5 = this.getContext().obtainStyledAttributes(var1, .cau.b);
         var3 = var5.getIndexCount();

         for(var2 = 0; var2 < var3; ++var2) {
            var4 = var5.getIndex(var2);
            if (var4 == 35) {
               super.f = var5.getString(35);
               this.e(super.f);
            } else if (var4 == 36) {
               super.g = var5.getString(36);
               this.f(super.g);
            }
         }

         var5.recycle();
      }

      this.b = new .bzb();
      if (var1 != null) {
         TypedArray var6 = this.getContext().obtainStyledAttributes(var1, .cau.b);
         var3 = var6.getIndexCount();

         for(var2 = 0; var2 < var3; ++var2) {
            var4 = var6.getIndex(var2);
            if (var4 == 26) {
               this.a = var6.getInt(26, 0);
            } else if (var4 == 25) {
               this.b.b = var6.getBoolean(25, true);
            } else if (var4 == 27) {
               var4 = var6.getDimensionPixelSize(27, 0);
               this.b.c = var4;
            }
         }

         var6.recycle();
      }

      this.i = this.b;
      this.h();
   }

   public final void b(.bzf var1, boolean var2) {
      int var3;
      label27: {
         label26: {
            int var4 = this.a;
            if (var2) {
               if (var4 == 5) {
                  break label26;
               }

               var3 = var4;
               if (var4 != 6) {
                  break label27;
               }
            } else if (var4 != 5) {
               var3 = var4;
               if (var4 != 6) {
                  break label27;
               }
               break label26;
            }

            var3 = 0;
            break label27;
         }

         var3 = 1;
      }

      if (var1 instanceof .bzb) {
         ((.bzb)var1).a = var3;
      }

   }

   public final void c(int var1) {
      this.b.c = var1;
   }
}
