import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class um {
   public final int a;
   public final uc b;
   public final List c;
   public final Executor d;
   public final int e;
   public final Map f;
   public final Integer g;
   public final tz h;
   public final ub i;

   public um(int var1, List var2, Executor var3, tz var4, Map var5) {
      var3.getClass();
      super();
      this.a = var1;
      this.b = null;
      this.c = var2;
      this.d = var3;
      this.h = var4;
      this.e = 1;
      this.f = var5;
      this.g = null;
      this.i = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof um)) {
         return false;
      } else {
         um var4 = (um)var1;
         if (this.a != var4.a) {
            return false;
         } else {
            uc var3 = var4.b;
            if (!c.E((Object)null, (Object)null)) {
               return false;
            } else if (!c.E(this.c, var4.c)) {
               return false;
            } else if (!c.E(this.d, var4.d)) {
               return false;
            } else if (!c.E(this.h, var4.h)) {
               return false;
            } else {
               int var2 = var4.e;
               if (!c.E(this.f, var4.f)) {
                  return false;
               } else {
                  Integer var6 = var4.g;
                  if (!c.E((Object)null, (Object)null)) {
                     return false;
                  } else {
                     ub var5 = var4.i;
                     return c.E((Object)null, (Object)null);
                  }
               }
            }
         }
      }
   }

   public final int hashCode() {
      return ((((this.a * 961 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.h.hashCode()) * 31 + 1) * 29791;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SessionConfigData(sessionType=");
      var1.append(this.a);
      var1.append(nJwt.OVteIEZUnIXMvW);
      var1.append((Object)null);
      var1.append(", outputConfigurations=");
      var1.append(this.c);
      var1.append(", executor=");
      var1.append(this.d);
      var1.append(", stateCallback=");
      var1.append(this.h);
      var1.append(", sessionTemplateId=1, sessionParameters=");
      var1.append(this.f);
      var1.append(", extensionMode=");
      var1.append((Object)null);
      var1.append(", extensionStateCallback=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
