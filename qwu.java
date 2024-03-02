public abstract class qwu extends qwh implements qxx {
   public qwu() {
      Object var1 = qwh.d;
      throw null;
   }

   public qwu(Object var1, Class var2, String var3, String var4) {
      super(var1, var2, var3, var4, true);
   }

   public qwu(Object var1, Class var2, String var3, String var4, int var5) {
      boolean var6;
      if (1 != var5) {
         var6 = false;
      } else {
         var6 = true;
      }

      super(var1, var2, var3, var4, var6);
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof qwu) {
         qwu var2 = (qwu)var1;
         return this.e().equals(var2.e()) && super.f.equals(var2.f) && super.g.equals(var2.g) && c.E(super.e, var2.e);
      } else {
         return var1 instanceof qxx ? var1.equals(this.c()) : false;
      }
   }

   protected final qxx h() {
      qxr var1 = this.c();
      if (var1 != this) {
         return (qxx)var1;
      } else {
         throw new qvh();
      }
   }

   public final int hashCode() {
      return (this.e().hashCode() * 31 + super.f.hashCode()) * 31 + super.g.hashCode();
   }

   public final String toString() {
      qxr var1 = this.c();
      if (var1 != this) {
         return var1.toString();
      } else {
         String var3 = super.f;
         StringBuilder var2 = new StringBuilder();
         var2.append("property ");
         var2.append(var3);
         var2.append(" (Kotlin reflection is not available)");
         return var2.toString();
      }
   }
}
