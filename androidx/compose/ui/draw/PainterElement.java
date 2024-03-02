package androidx.compose.ui.draw;

import com.google.android.apps.camera.gesturecapture.ui.UB.oBLUVToV;

public final class PainterElement extends .bmp {
   private final .bfa a;
   private final boolean b;
   private final .bar c;
   private final .bja e;
   private final float f;
   private final .dmw g;

   public PainterElement(.bfa var1, .bar var2, .bja var3, .dmw var4) {
      this.a = var1;
      this.b = true;
      this.c = var2;
      this.e = var3;
      this.f = 1.0F;
      this.g = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof PainterElement)) {
         return false;
      } else {
         PainterElement var4 = (PainterElement)var1;
         if (!.c.E(this.a, var4.a)) {
            return false;
         } else {
            boolean var3 = var4.b;
            if (!.c.E(this.c, var4.c)) {
               return false;
            } else if (!.c.E(this.e, var4.e)) {
               return false;
            } else {
               float var2 = var4.f;
               if (Float.compare(1.0F, 1.0F) != 0) {
                  return false;
               } else {
                  return .c.E(this.g, var4.g);
               }
            }
         }
      }
   }

   public final int hashCode() {
      int var4 = this.a.hashCode();
      int var5 = this.c.hashCode();
      int var2 = this.e.hashCode();
      int var3 = Float.floatToIntBits(1.0F);
      .dmw var6 = this.g;
      int var1;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = var6.hashCode();
      }

      return ((((var4 * 31 + 1) * 31 + var5) * 31 + var2) * 31 + var3) * 31 + var1;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PainterElement(painter=");
      var1.append(this.a);
      var1.append(", sizeToIntrinsics=true, alignment=");
      var1.append(this.c);
      var1.append(", contentScale=");
      var1.append(this.e);
      var1.append(oBLUVToV.lKPEi);
      var1.append(1.0F);
      var1.append(", colorFilter=");
      var1.append(this.g);
      var1.append(')');
      return var1.toString();
   }
}
