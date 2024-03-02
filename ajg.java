import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ajg {
   public final Set a = new LinkedHashSet();
   public ako b;
   public int c;
   public final LinkedHashSet d;
   public final List e;
   public final List f;
   public final List g;
   public final List h;

   public ajg() {
      this.b = ako.b;
      this.d = new LinkedHashSet();
      this.e = new ArrayList();
      this.f = new ArrayList();
      this.g = new ArrayList();
      this.h = new ArrayList();
   }

   public static final ake b(Object var0) {
      return var0 instanceof ake ? (ake)var0 : null;
   }

   public static final boolean c(ajq var0) {
      int var2 = var0.a();

      for(int var1 = 0; var1 < var2; ++var1) {
         if (b(var0.c(var1)) != null) {
            return true;
         }
      }

      return false;
   }

   public static final void d(ajq var0) {
      int var1 = 0;
      var0.b(0);

      for(int var2 = var0.a(); var1 < var2; ++var1) {
         if (b(var0.c(var1)) != null) {
            var0.b(var1);
            throw null;
         }
      }

   }

   public static final void e(ajq var0) {
      int var2 = var0.a();

      for(int var1 = 0; var1 < var2; ++var1) {
         if (b(var0.c(var1)) != null) {
            var0.b(var1);
            throw null;
         }
      }

   }

   public final void a() {
      this.a.clear();
      this.b = ako.b;
      this.c = -1;
   }
}
