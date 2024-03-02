import java.util.ArrayList;

public abstract class cw {
   final ArrayList d = new ArrayList();
   int e;
   int f;
   int g;
   int h;
   int i;
   public boolean j;
   public boolean k = true;
   public String l;
   int m;
   CharSequence n;
   int o;
   CharSequence p;
   ArrayList q;
   ArrayList r;
   boolean s = false;

   public abstract void b();

   public void c(int var1, bv var2, String var3, int var4) {
      throw null;
   }

   public abstract void g();

   public abstract void h();

   public void j(bv var1) {
      throw null;
   }

   final void k(cv var1) {
      this.d.add(var1);
      var1.d = this.e;
      var1.e = this.f;
      var1.f = this.g;
      var1.g = this.h;
   }

   public final void l(int var1, bv var2) {
      this.c(var1, var2, (String)null, 1);
   }

   public final void m(int var1, bv var2, String var3) {
      this.c(var1, var2, var3, 1);
   }

   public final void n(bv var1, String var2) {
      this.c(0, var1, var2, 1);
   }

   public final void o() {
      if (!this.j) {
         this.k = false;
      } else {
         throw new IllegalStateException("This transaction is already being added to the back stack");
      }
   }

   public final void p() {
      this.s = true;
   }

   public final void q(int var1, bv var2) {
      if (var1 != 0) {
         this.c(var1, var2, (String)null, 2);
      } else {
         throw new IllegalArgumentException("Must use non-zero containerViewId");
      }
   }
}
