import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

class dhw implements Iterator {
   final dhy a;
   public dhv b;
   private int c;
   private did d;
   private String e;
   private Iterator f;
   private int g;
   private Iterator h;

   public dhw(dhy var1) {
      this.a = var1;
      this.c = 0;
      this.f = null;
      this.g = 0;
      this.h = Collections.EMPTY_LIST.iterator();
      this.b = null;
   }

   public dhw(dhy var1, did var2, String var3, int var4) {
      this.a = var1;
      this.c = 0;
      this.f = null;
      this.g = 0;
      this.h = Collections.EMPTY_LIST.iterator();
      this.b = null;
      this.d = var2;
      this.c = 0;
      if (var2.g().n()) {
         var1.b = var2.a;
      }

      this.e = this.a(var2, var3, var4);
   }

   protected static final dhv b(did var0, String var1, String var2) {
      String var3;
      if (var0.g().n()) {
         var3 = null;
      } else {
         var3 = var0.b;
      }

      return new dhv(var1, var2, var3, var0);
   }

   private final boolean c(Iterator var1) {
      if (!this.h.hasNext() && var1.hasNext()) {
         did var3 = (did)var1.next();
         int var2 = this.g + 1;
         this.g = var2;
         this.h = new dhw(this.a, var3, this.e, var2);
      }

      if (this.h.hasNext()) {
         this.b = (dhv)this.h.next();
         return true;
      } else {
         return false;
      }
   }

   protected final String a(did var1, String var2, int var3) {
      if (var1.c != null && !var1.g().n()) {
         String var4;
         String var7;
         if (var1.c.g().d()) {
            StringBuilder var6 = new StringBuilder();
            var6.append("[");
            var6.append(String.valueOf(var3));
            var6.append("]");
            var7 = var6.toString();
            var4 = "";
         } else {
            var7 = var1.a;
            var4 = "/";
         }

         if (var2 != null && var2.length() != 0) {
            if (this.a.a.h(1024)) {
               return !var7.startsWith("?") ? var7 : var7.substring(1);
            } else {
               StringBuilder var5 = new StringBuilder();
               var5.append(var2);
               var5.append(var4);
               var5.append(var7);
               return var5.toString();
            }
         } else {
            return var7;
         }
      } else {
         return null;
      }
   }

   public boolean hasNext() {
      dhv var4 = this.b;
      boolean var2 = true;
      if (var4 != null) {
         return true;
      } else {
         int var1 = this.c;
         if (var1 != 0) {
            if (var1 == 1) {
               if (this.f == null) {
                  this.f = this.d.h();
               }

               boolean var3 = this.c(this.f);
               var2 = var3;
               if (!var3) {
                  var2 = var3;
                  if (this.d.t()) {
                     var2 = var3;
                     if (!this.a.a.h(4096)) {
                        this.c = 2;
                        this.f = null;
                        var2 = this.hasNext();
                     }
                  }
               }

               return var2;
            } else {
               if (this.f == null) {
                  this.f = this.d.i();
               }

               return this.c(this.f);
            }
         } else {
            this.c = 1;
            did var5 = this.d;
            if (var5.c == null || this.a.a.b() && var5.s()) {
               var2 = this.hasNext();
            } else {
               this.b = b(this.d, this.a.b, this.e);
            }

            return var2;
         }
      }
   }

   public final Object next() {
      if (this.hasNext()) {
         dhv var1 = this.b;
         this.b = null;
         return var1;
      } else {
         throw new NoSuchElementException("There are no more nodes to return");
      }
   }

   public final void remove() {
      throw new UnsupportedOperationException();
   }
}
