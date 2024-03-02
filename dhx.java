import java.util.Iterator;

final class dhx extends dhw {
   final dhy c;
   private final String d;
   private final Iterator e;
   private int f;

   public dhx(dhy var1, did var2) {
      super(var1);
      this.c = var1;
      this.f = 0;
      if (var2.g().n()) {
         var1.b = var2.a;
      }

      this.d = this.a(var2, (String)null, 1);
      this.e = var2.h();
   }

   public final boolean hasNext() {
      if (super.b != null) {
         return true;
      } else if (this.e.hasNext()) {
         did var3 = (did)this.e.next();
         ++this.f;
         boolean var1 = var3.g().n();
         String var2 = null;
         if (var1) {
            this.c.b = var3.a;
         } else if (var3.c != null) {
            var2 = this.a(var3, this.d, this.f);
         }

         if (this.c.a.b() && var3.s()) {
            return this.hasNext();
         } else {
            super.b = b(var3, this.c.b, var2);
            return true;
         }
      } else {
         return false;
      }
   }
}
