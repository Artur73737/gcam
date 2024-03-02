import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import com.google.android.material.appbar.XD.SSYOSt;

public final class bsh {
   public final bxc a;
   public final bxe b;
   public final long c;
   public final bxi d;
   public final bsk e;
   public final bxb f;
   public final bwz g;
   public final bwv h;
   public final bxj i;

   public bsh(bxc var1, bxe var2, long var3, bxi var5, bsk var6, bxb var7, bwz var8, bwv var9, bxj var10) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
      this.e = var6;
      this.f = var7;
      this.g = var8;
      this.h = var9;
      this.i = var10;
      if (!c.o(var3, bxz.a) && !(bxz.a(var3) >= 0.0F)) {
         StringBuilder var11 = new StringBuilder();
         var11.append("lineHeight can't be negative (");
         var11.append(bxz.a(var3));
         var11.append(')');
         throw new IllegalStateException(var11.toString());
      }
   }

   public final bsh a(bsh var1) {
      return bsi.a(this, var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var1.g, var1.h, var1.i);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsh)) {
         return false;
      } else {
         bxc var2 = this.a;
         bsh var3 = (bsh)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.o(this.c, var3.c)) {
            return false;
         } else if (!c.E(this.d, var3.d)) {
            return false;
         } else if (!c.E(this.e, var3.e)) {
            return false;
         } else if (!c.E(this.f, var3.f)) {
            return false;
         } else if (!c.E(this.g, var3.g)) {
            return false;
         } else if (!c.E(this.h, var3.h)) {
            return false;
         } else {
            return c.E(this.i, var3.i);
         }
      }
   }

   public final int hashCode() {
      bxc var10 = this.a;
      bxe var11 = this.b;
      int var8 = 0;
      int var1;
      if (var11 != null) {
         var1 = var11.a;
      } else {
         var1 = 0;
      }

      byte var2;
      if (var10 != null) {
         var2 = 5;
      } else {
         var2 = 0;
      }

      int var9 = car.H(this.c);
      bxi var12 = this.d;
      int var3;
      if (var12 != null) {
         var3 = var12.hashCode();
      } else {
         var3 = 0;
      }

      char var4;
      if (this.e != null) {
         var4 = '闋';
      } else {
         var4 = 0;
      }

      bxb var13 = this.f;
      int var5;
      if (var13 != null) {
         var5 = var13.hashCode();
      } else {
         var5 = 0;
      }

      int var6;
      if (this.g != null) {
         var6 = 66305;
      } else {
         var6 = 0;
      }

      byte var7;
      if (this.h != null) {
         var7 = 1;
      } else {
         var7 = 0;
      }

      bxj var14 = this.i;
      if (var14 != null) {
         var8 = var14.hashCode();
      }

      return (((((((var2 * 31 + var1) * 31 + var9) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ParagraphStyle(textAlign=");
      var1.append(this.a);
      var1.append(", textDirection=");
      var1.append(this.b);
      var1.append(", lineHeight=");
      var1.append(bxz.d(this.c));
      var1.append(", textIndent=");
      var1.append(this.d);
      var1.append(", platformStyle=");
      var1.append(this.e);
      var1.append(SSYOSt.Xbsj);
      var1.append(this.f);
      var1.append(", lineBreak=");
      var1.append(this.g);
      var1.append(TRoaEYDrhZZT.XWZfQUdwA);
      var1.append(this.h);
      var1.append(", textMotion=");
      var1.append(this.i);
      var1.append(')');
      return var1.toString();
   }
}
