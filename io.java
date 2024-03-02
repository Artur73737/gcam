import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class io extends ImageButton {
   private final ii mBackgroundTintHelper;
   private boolean mHasLevel;
   private final ip mImageHelper;

   public io(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public io(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969404);
   }

   public io(Context var1, AttributeSet var2, int var3) {
      ng.a(var1);
      super(var1, var2, var3);
      this.mHasLevel = false;
      ne.d(this, this.getContext());
      ii var4 = new ii(this);
      this.mBackgroundTintHelper = var4;
      var4.d(var2, var3);
      ip var5 = new ip(this);
      this.mImageHelper = var5;
      var5.c(var2, var3);
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      ii var1 = this.mBackgroundTintHelper;
      if (var1 != null) {
         var1.c();
      }

      ip var2 = this.mImageHelper;
      if (var2 != null) {
         var2.b();
      }

   }

   public ColorStateList getSupportBackgroundTintList() {
      ii var1 = this.mBackgroundTintHelper;
      return var1 != null ? var1.a() : null;
   }

   public Mode getSupportBackgroundTintMode() {
      ii var1 = this.mBackgroundTintHelper;
      return var1 != null ? var1.b() : null;
   }

   public ColorStateList getSupportImageTintList() {
      ip var1 = this.mImageHelper;
      if (var1 != null) {
         Object var2 = var1.c;
         if (var2 != null) {
            return ((nh)var2).a;
         }
      }

      return null;
   }

   public Mode getSupportImageTintMode() {
      ip var1 = this.mImageHelper;
      if (var1 != null) {
         Object var2 = var1.c;
         if (var2 != null) {
            return ((nh)var2).b;
         }
      }

      return null;
   }

   public boolean hasOverlappingRendering() {
      return this.mImageHelper.f() && super.hasOverlappingRendering();
   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      ii var2 = this.mBackgroundTintHelper;
      if (var2 != null) {
         var2.i();
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      ii var2 = this.mBackgroundTintHelper;
      if (var2 != null) {
         var2.e(var1);
      }

   }

   public void setImageBitmap(Bitmap var1) {
      super.setImageBitmap(var1);
      ip var2 = this.mImageHelper;
      if (var2 != null) {
         var2.b();
      }

   }

   public void setImageDrawable(Drawable var1) {
      ip var2 = this.mImageHelper;
      if (var2 != null && var1 != null && !this.mHasLevel) {
         var2.d(var1);
      }

      super.setImageDrawable(var1);
      ip var3 = this.mImageHelper;
      if (var3 != null) {
         var3.b();
         if (!this.mHasLevel) {
            this.mImageHelper.a();
         }
      }

   }

   public void setImageLevel(int var1) {
      super.setImageLevel(var1);
      this.mHasLevel = true;
   }

   public void setImageResource(int var1) {
      this.mImageHelper.e(var1);
   }

   public void setImageURI(Uri var1) {
      super.setImageURI(var1);
      ip var2 = this.mImageHelper;
      if (var2 != null) {
         var2.b();
      }

   }

   public void setSupportBackgroundTintList(ColorStateList var1) {
      ii var2 = this.mBackgroundTintHelper;
      if (var2 != null) {
         var2.g(var1);
      }

   }

   public void setSupportBackgroundTintMode(Mode var1) {
      ii var2 = this.mBackgroundTintHelper;
      if (var2 != null) {
         var2.h(var1);
      }

   }

   public void setSupportImageTintList(ColorStateList var1) {
      ip var2 = this.mImageHelper;
      if (var2 != null) {
         if (var2.c == null) {
            var2.c = new nh();
         }

         nh var3 = (nh)var2.c;
         var3.a = var1;
         var3.d = true;
         var2.b();
      }

   }

   public void setSupportImageTintMode(Mode var1) {
      ip var2 = this.mImageHelper;
      if (var2 != null) {
         if (var2.c == null) {
            var2.c = new nh();
         }

         nh var3 = (nh)var2.c;
         var3.b = var1;
         var3.c = true;
         var2.b();
      }

   }
}
