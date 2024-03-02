import android.graphics.Matrix;
import java.util.ArrayList;

final class cux extends cub {
   final Matrix a = new Matrix();
   final ArrayList b = new ArrayList();
   float c = 0.0F;
   public float d = 0.0F;
   public float e = 0.0F;
   public float f = 1.0F;
   public float g = 1.0F;
   public float h = 0.0F;
   public float i = 0.0F;
   final Matrix j;
   int k;
   public int[] l;
   public String m;

   public cux() {
      this.j = new Matrix();
      this.m = null;
   }

   public cux(cux var1, xh var2) {
      Matrix var4 = new Matrix();
      this.j = var4;
      this.m = null;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      int[] var5 = var1.l;
      this.l = null;
      String var8 = var1.m;
      this.m = var8;
      int var3 = var1.k;
      var3 = 0;
      this.k = 0;
      if (var8 != null) {
         var2.put(var8, this);
      }

      var4.set(var1.j);

      for(ArrayList var7 = var1.b; var3 < var7.size(); ++var3) {
         Object var6 = var7.get(var3);
         if (var6 instanceof cux) {
            var1 = (cux)var6;
            this.b.add(new cux(var1, var2));
         } else {
            if (var6 instanceof cuw) {
               var6 = new cuw((cuw)var6);
            } else {
               if (!(var6 instanceof cuv)) {
                  throw new IllegalStateException("Unknown object in the tree!");
               }

               var6 = new cuv((cuv)var6);
            }

            this.b.add(var6);
            var8 = ((cuy)var6).n;
            if (var8 != null) {
               var2.put(var8, var6);
            }
         }
      }

   }

   public final boolean b() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         if (((cub)this.b.get(var1)).b()) {
            return true;
         }
      }

      return false;
   }

   public final boolean c(int[] var1) {
      int var2 = 0;

      boolean var3;
      for(var3 = false; var2 < this.b.size(); ++var2) {
         var3 |= ((cub)this.b.get(var2)).c(var1);
      }

      return var3;
   }

   public final void d() {
      this.j.reset();
      this.j.postTranslate(-this.d, -this.e);
      this.j.postScale(this.f, this.g);
      this.j.postRotate(this.c, 0.0F, 0.0F);
      this.j.postTranslate(this.h + this.d, this.i + this.e);
   }

   public String getGroupName() {
      return this.m;
   }

   public Matrix getLocalMatrix() {
      return this.j;
   }

   public float getPivotX() {
      return this.d;
   }

   public float getPivotY() {
      return this.e;
   }

   public float getRotation() {
      return this.c;
   }

   public float getScaleX() {
      return this.f;
   }

   public float getScaleY() {
      return this.g;
   }

   public float getTranslateX() {
      return this.h;
   }

   public float getTranslateY() {
      return this.i;
   }

   public void setPivotX(float var1) {
      if (var1 != this.d) {
         this.d = var1;
         this.d();
      }

   }

   public void setPivotY(float var1) {
      if (var1 != this.e) {
         this.e = var1;
         this.d();
      }

   }

   public void setRotation(float var1) {
      if (var1 != this.c) {
         this.c = var1;
         this.d();
      }

   }

   public void setScaleX(float var1) {
      if (var1 != this.f) {
         this.f = var1;
         this.d();
      }

   }

   public void setScaleY(float var1) {
      if (var1 != this.g) {
         this.g = var1;
         this.d();
      }

   }

   public void setTranslateX(float var1) {
      if (var1 != this.h) {
         this.h = var1;
         this.d();
      }

   }

   public void setTranslateY(float var1) {
      if (var1 != this.i) {
         this.i = var1;
         this.d();
      }

   }
}
