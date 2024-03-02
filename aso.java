import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class aso extends ast {
   public final Set a;
   public final att b;
   final asq c;
   private final int d;
   private final boolean e;
   private Set f;

   public aso(asq var1, int var2, boolean var3) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.a = new LinkedHashSet();
      this.b = sg.d(ayv.c);
   }

   public final int a() {
      return this.d;
   }

   public final aue b() {
      return (aue)this.b.a();
   }

   public final qui c() {
      return this.c.b.c();
   }

   public final void d() {
      if (!this.a.isEmpty()) {
         Set var2 = this.f;
         if (var2 != null) {
            Iterator var1 = this.a.iterator();

            while(var1.hasNext()) {
               asq var3 = (asq)var1.next();
               Iterator var4 = var2.iterator();

               while(var4.hasNext()) {
                  ((Set)var4.next()).remove(var3.c);
               }
            }
         }

         this.a.clear();
      }

   }

   public final void e() {
      asq var1 = this.c;
      --var1.h;
   }

   public final void f(Set var1) {
      Object var2 = this.f;
      if (var2 == null) {
         var2 = new HashSet();
         this.f = (Set)var2;
      }

      ((Set)var2).add(var1);
   }

   public final void g(asm var1) {
      this.a.add(var1);
   }

   public final void h() {
      asq var1 = this.c;
      ++var1.h;
   }

   public final void i(asm var1) {
      Set var2 = this.f;
      if (var2 != null) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            ((Set)var3.next()).remove(((asq)var1).c);
         }
      }

      this.a.remove(var1);
   }

   public final boolean j() {
      return this.e;
   }

   public final void k(asw var1, qvx var2) {
      var2.getClass();
      this.c.b.k(var1, var2);
   }

   public final void l(asw var1) {
      asq var2 = this.c;
      var2.b.l(var2.r);
      this.c.b.l(var1);
   }

   public final void m(asw var1) {
      this.c.b.m(var1);
   }

   public final void n(ezu var1) {
      this.c.b.n(var1);
   }

   public final lmk o(ezu var1) {
      var1.getClass();
      return this.c.b.o(var1);
   }

   public final void p(ezu var1, lmk var2) {
      var1.getClass();
      this.c.b.p(var1, var2);
   }
}
