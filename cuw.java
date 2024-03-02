import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;

final class cuw extends cuy {
   public int[] a;
   float b = 0.0F;
   float c = 1.0F;
   float d = 1.0F;
   float e = 0.0F;
   float f = 1.0F;
   float g = 0.0F;
   Cap h;
   Join i;
   float j;
   ktf k;
   ktf l;

   public cuw() {
      this.h = Cap.BUTT;
      this.i = Join.MITER;
      this.j = 4.0F;
   }

   public cuw(cuw var1) {
      super(var1);
      this.h = Cap.BUTT;
      this.i = Join.MITER;
      this.j = 4.0F;
      int[] var2 = var1.a;
      this.a = null;
      this.k = var1.k;
      this.b = var1.b;
      this.c = var1.c;
      this.l = var1.l;
      this.o = var1.o;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
   }

   public final boolean b() {
      return this.l.f() || this.k.f();
   }

   public final boolean c(int[] var1) {
      boolean var2 = this.l.g(var1);
      return this.k.g(var1) | var2;
   }

   float getFillAlpha() {
      return this.d;
   }

   int getFillColor() {
      return this.l.a;
   }

   float getStrokeAlpha() {
      return this.c;
   }

   int getStrokeColor() {
      return this.k.a;
   }

   float getStrokeWidth() {
      return this.b;
   }

   float getTrimPathEnd() {
      return this.f;
   }

   float getTrimPathOffset() {
      return this.g;
   }

   float getTrimPathStart() {
      return this.e;
   }

   void setFillAlpha(float var1) {
      this.d = var1;
   }

   void setFillColor(int var1) {
      this.l.a = var1;
   }

   void setStrokeAlpha(float var1) {
      this.c = var1;
   }

   void setStrokeColor(int var1) {
      this.k.a = var1;
   }

   void setStrokeWidth(float var1) {
      this.b = var1;
   }

   void setTrimPathEnd(float var1) {
      this.f = var1;
   }

   void setTrimPathOffset(float var1) {
      this.g = var1;
   }

   void setTrimPathStart(float var1) {
      this.e = var1;
   }
}
