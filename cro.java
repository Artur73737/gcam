import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;
import java.util.List;

public final class cro {
   public final String a;
   public final String b;
   public final String c;
   public final List d;
   public final List e;

   public cro(String var1, String var2, String var3, List var4, List var5) {
      var4.getClass();
      var5.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof cro)) {
         return false;
      } else {
         String var2 = this.a;
         cro var3 = (cro)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else {
            return !c.E(this.d, var3.d) ? false : c.E(this.e, var3.e);
         }
      }
   }

   public final int hashCode() {
      return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(gREaEL.lIHNRvpWcPJtw);
      var1.append(this.a);
      var1.append("', onDelete='");
      var1.append(this.b);
      var1.append(" +', onUpdate='");
      var1.append(this.c);
      var1.append("', columnNames=");
      var1.append(this.d);
      var1.append(", referenceColumnNames=");
      var1.append(this.e);
      var1.append('}');
      return var1.toString();
   }
}
