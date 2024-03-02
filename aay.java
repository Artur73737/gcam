import android.view.KeyEvent;
import java.util.Iterator;

public final class aay extends blh implements bni, bgs {
   public boolean a;
   public qvi b;
   public final aav c;
   public final abm d;
   public final aba e;
   public lmk f;

   public aay(lmk var1, boolean var2, bri var3, qvi var4) {
      this.f = var1;
      this.a = var2;
      this.b = var4;
      aav var5 = new aav();
      this.c = var5;
      abm var7 = new abm(var2, var3, var4);
      this.m(var7);
      this.d = var7;
      aba var6 = new aba(var2, var1, var4, var5);
      this.m(var6);
      this.e = var6;
   }

   public final void a() {
      ahr var1 = this.c.b;
      if (var1 != null) {
         ahq var3 = new ahq(var1);
         this.f.aN(var3);
      }

      Iterator var2 = this.c.a.values().iterator();

      while(var2.hasNext()) {
         var1 = (ahr)var2.next();
         this.f.aN(new ahq(var1));
      }

      aav var4 = this.c;
      var4.b = null;
      var4.a.clear();
   }

   public final void eA() {
      this.a();
   }

   // $FF: synthetic method
   public final void eB() {
      kd.h(this);
   }

   public final void eC(bhl var1, int var2, long var3) {
      this.e.eC(var1, var2, var3);
   }

   public final void ey() {
      this.e.ey();
   }

   // $FF: synthetic method
   public final void ez() {
      kd.g(this);
   }

   public final boolean g(KeyEvent var1) {
      boolean var3 = this.a;
      boolean var2 = true;
      if (var3 && c.n(hf.h(var1), 2) && abn.a(var1)) {
         if (!this.c.a.containsKey(bgq.a(hf.i(var1)))) {
            ahr var4 = new ahr(this.c.c);
            this.c.a.put(bgq.a(hf.i(var1)), var4);
            qwo.o(this.o(), (qui)null, 0, new aaw(this, var4, (que)null), 3);
            return true;
         }

         var2 = false;
      } else if (this.a && c.n(hf.h(var1), 1) && abn.a(var1)) {
         ahr var5 = (ahr)this.c.a.remove(bgq.a(hf.i(var1)));
         if (var5 != null) {
            qwo.o(this.o(), (qui)null, 0, new aax(this, var5, (que)null), 3);
         }

         this.b.a();
      } else {
         var2 = false;
      }

      return var2;
   }

   // $FF: synthetic method
   public final void i() {
   }

   public final void j() {
   }

   // $FF: synthetic method
   public final void k() {
   }
}
