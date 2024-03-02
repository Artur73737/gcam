package androidx.compose.ui.graphics;

import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;

public final class GraphicsLayerElement extends .bmp {
   private final float a;
   private final float b;
   private final float c;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final float i;
   private final float j;
   private final float k;
   private final long l;
   private final .bdr m;
   private final boolean n;
   private final .bdn o;
   private final long p;
   private final long q;
   private final int r;

   public GraphicsLayerElement(float var1, float var2, float var3, float var4, float var5, long var6, .bdr var8, boolean var9, long var10, long var12) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = 0.0F;
      this.f = 0.0F;
      this.g = 0.0F;
      this.h = 0.0F;
      this.i = 0.0F;
      this.j = var4;
      this.k = var5;
      this.l = var6;
      this.m = var8;
      this.n = var9;
      this.o = null;
      this.p = var10;
      this.q = var12;
      this.r = 0;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GraphicsLayerElement)) {
         return false;
      } else {
         GraphicsLayerElement var5 = (GraphicsLayerElement)var1;
         if (Float.compare(this.a, var5.a) != 0) {
            return false;
         } else if (Float.compare(this.b, var5.b) != 0) {
            return false;
         } else if (Float.compare(this.c, var5.c) != 0) {
            return false;
         } else {
            float var2 = var5.e;
            if (Float.compare(0.0F, 0.0F) != 0) {
               return false;
            } else {
               var2 = var5.f;
               if (Float.compare(0.0F, 0.0F) != 0) {
                  return false;
               } else {
                  var2 = var5.g;
                  if (Float.compare(0.0F, 0.0F) != 0) {
                     return false;
                  } else {
                     var2 = var5.h;
                     if (Float.compare(0.0F, 0.0F) != 0) {
                        return false;
                     } else {
                        var2 = var5.i;
                        if (Float.compare(0.0F, 0.0F) != 0) {
                           return false;
                        } else if (Float.compare(this.j, var5.j) != 0) {
                           return false;
                        } else if (Float.compare(this.k, var5.k) != 0) {
                           return false;
                        } else if (!.c.o(this.l, var5.l)) {
                           return false;
                        } else if (!.c.E(this.m, var5.m)) {
                           return false;
                        } else if (this.n != var5.n) {
                           return false;
                        } else {
                           .bdn var4 = var5.o;
                           if (!.c.E((Object)null, (Object)null)) {
                              return false;
                           } else if (!.c.o(this.p, var5.p)) {
                              return false;
                           } else if (!.c.o(this.q, var5.q)) {
                              return false;
                           } else {
                              int var3 = var5.r;
                              return .c.n(0, 0);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final int hashCode() {
      return ((((((((((((((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(0.0F)) * 31 + Float.floatToIntBits(0.0F)) * 31 + Float.floatToIntBits(0.0F)) * 31 + Float.floatToIntBits(0.0F)) * 31 + Float.floatToIntBits(0.0F)) * 31 + Float.floatToIntBits(this.j)) * 31 + Float.floatToIntBits(this.k)) * 31 + .c.p(this.l)) * 31 + this.m.hashCode()) * 31 + this.n) * 961 + .c.p(this.p)) * 31 + .c.p(this.q)) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("GraphicsLayerElement(scaleX=");
      var1.append(this.a);
      var1.append(", scaleY=");
      var1.append(this.b);
      var1.append(", alpha=");
      var1.append(this.c);
      var1.append(", translationX=");
      var1.append(0.0F);
      var1.append(", translationY=");
      var1.append(0.0F);
      var1.append(", shadowElevation=");
      var1.append(0.0F);
      var1.append(", rotationX=");
      var1.append(0.0F);
      var1.append(PUdPFKr.vIOlwSDxX);
      var1.append(0.0F);
      var1.append(", rotationZ=");
      var1.append(this.j);
      var1.append(", cameraDistance=");
      var1.append(this.k);
      var1.append(", transformOrigin=");
      var1.append(.bdx.d(this.l));
      var1.append(", shape=");
      var1.append(this.m);
      var1.append(", clip=");
      var1.append(this.n);
      var1.append(", renderEffect=");
      var1.append((Object)null);
      var1.append(", ambientShadowColor=");
      var1.append(.bcy.h(this.p));
      var1.append(", spotShadowColor=");
      var1.append(.bcy.h(this.q));
      var1.append(", compositingStrategy=");
      var1.append("CompositingStrategy(value=0)");
      var1.append(')');
      return var1.toString();
   }
}
