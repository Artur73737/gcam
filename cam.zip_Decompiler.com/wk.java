import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class wk {
   public final qzv a;
   public final Object b;
   public final List c;
   public final List d;
   public wl e;
   public boolean f;
   public final rga g;
   public final bwc h;
   private final qr i;
   private final List j;
   private final Object k;
   private rt l;
   private boolean m;
   private boolean n;
   private final ns o;

   public wk(bwc var1, qr var2, ns var3, qzv var4, List var5) {
      var1.getClass();
      var3.getClass();
      var4.getClass();
      var5.getClass();
      super();
      this.h = var1;
      this.i = var2;
      this.o = var3;
      this.a = var4;
      this.j = var5;
      this.b = new Object();
      this.k = new Object();
      this.c = new ArrayList();
      this.d = new ArrayList();
      this.g = rgb.a(rj.a);
   }

   public final void a(List var1) {
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         rt var6 = (rt)var5.next();
         int var4 = this.j.size();
         byte var3 = 0;

         int var2;
         for(var2 = 0; var2 < var4; ++var2) {
            ((rs)this.j.get(var2)).a(var6);
         }

         var4 = var6.c.size();

         for(var2 = var3; var2 < var4; ++var2) {
            ((rs)var6.c.get(var2)).a(var6);
         }
      }

   }

   public final void b() {
      Object var2 = this.b;
      synchronized(var2){}

      Throwable var10000;
      label144: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.f;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label144;
         }

         if (var1) {
            return;
         }

         wl var17;
         try {
            this.f = true;
            var17 = this.e;
            this.e = null;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label144;
         }

         if (var17 != null) {
            var17.a();
         }

         qwz var18 = new qwz();
         qwz var4 = new qwz();
         var2 = this.b;
         synchronized(var2){}

         try {
            var18.a = this.e;
            var4.a = pwm.aD(this.c);
            this.c.clear();
         } finally {
            ;
         }

         qwo.o(this.a, (qui)this.h.d, 0, new wf(var18, var4, this, (que)null), 2);
         return;
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public final void c() {
      qwo.o(this.a, (qui)this.h.d, 0, new wg(this, (que)null), 2);
   }

   public final void d() {
      // $FF: Couldn't be decompiled
   }

   public final void e() {
      // $FF: Couldn't be decompiled
   }
}
