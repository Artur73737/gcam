import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class auo extends ast {
   public static final rga l;
   private static final AtomicReference p;
   public long a;
   public final asg b;
   public final Object c;
   public rbd d;
   public Throwable e;
   public axb f;
   public final List g;
   public final List h;
   public final Map i;
   public final Map j;
   public boolean k;
   public qza m;
   public final rga n;
   public final op o;
   private final List q;
   private List r;
   private final List s;
   private List t;
   private final qui u;
   private final rbg v;
   private op w;

   static {
      l = rgb.a(ayp.a);
      p = new AtomicReference(false);
   }

   public auo(qui var1) {
      var1.getClass();
      super();
      asg var2 = new asg(new amp(this, 10));
      this.b = var2;
      this.c = new Object();
      this.q = new ArrayList();
      this.f = new axb();
      this.g = new ArrayList();
      this.s = new ArrayList();
      this.h = new ArrayList();
      this.i = new LinkedHashMap();
      this.j = new LinkedHashMap();
      this.n = rgb.a(aui.c);
      rbg var3 = qzy.v((rbd)var1.get(rbd.c));
      var3.q(new arh(this, 2));
      this.v = var3;
      this.u = var1.plus(var2).plus(var3);
      this.o = new op();
   }

   public static final qvt A(asw var0, axb var1) {
      return new zy(var0, var1, 15);
   }

   // $FF: synthetic method
   static void B(auo var0, Exception var1) {
      var0.F(var1, (asw)null);
   }

   private final boolean C() {
      return !this.g.isEmpty() || this.t();
   }

   private static final void D(List var0, auo var1, asw var2) {
      var0.clear();
      Object var3 = var1.c;
      synchronized(var3){}

      Throwable var10000;
      label94: {
         boolean var10001;
         Iterator var12;
         try {
            var12 = var1.h.iterator();
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            break label94;
         }

         while(true) {
            try {
               ezu var4;
               do {
                  if (!var12.hasNext()) {
                     return;
                  }

                  var4 = (ezu)var12.next();
               } while(!c.E(var4.c, var2));

               var0.add(var4);
               var12.remove();
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break;
            }
         }
      }

      Throwable var11 = var10000;
      throw var11;
   }

   private final void E(asw var1) {
      this.q.remove(var1);
      this.r = null;
   }

   private final void F(Exception var1, asw var2) {
      Object var3 = p.get();
      var3.getClass();
      if ((Boolean)var3 && !(var1 instanceof asj)) {
         Object var4 = this.c;
         synchronized(var4){}

         Throwable var10000;
         label377: {
            boolean var10001;
            try {
               Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", var1);
               this.s.clear();
               this.g.clear();
               axb var47 = new axb();
               this.f = var47;
               this.h.clear();
               this.i.clear();
               this.j.clear();
               op var48 = new op();
               this.w = var48;
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label377;
            }

            if (var2 != null) {
               List var51;
               try {
                  var51 = this.t;
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label377;
               }

               Object var49 = var51;
               if (var51 == null) {
                  try {
                     var49 = new ArrayList();
                     this.t = (List)var49;
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break label377;
                  }
               }

               try {
                  if (!((List)var49).contains(var2)) {
                     ((Collection)var49).add(var2);
                  }
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label377;
               }

               try {
                  this.E(var2);
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label377;
               }
            }

            label352:
            try {
               this.w();
               return;
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               break label352;
            }
         }

         Throwable var50 = var10000;
         throw var50;
      } else {
         throw var1;
      }
   }

   // $FF: synthetic method
   public static final void x(auo var0) {
      var0.d = null;
   }

   public static final void y(azg param0) {
      // $FF: Couldn't be decompiled
   }

   public static final qvt z(asw var0) {
      return new arh(var0, 3);
   }

   public final int a() {
      return 1000;
   }

   public final qui c() {
      return this.u;
   }

   public final List d() {
      List var2 = this.r;
      Object var1 = var2;
      if (var2 == null) {
         List var3 = this.q;
         if (var3.isEmpty()) {
            var1 = qtf.a;
         } else {
            var1 = new ArrayList(var3);
         }

         this.r = (List)var1;
      }

      return (List)var1;
   }

   public final void f(Set var1) {
   }

   public final boolean j() {
      return false;
   }

   public final void k(asw param1, qvx param2) {
      // $FF: Couldn't be decompiled
   }

   public final void l(asw var1) {
      Object var2 = this.c;
      synchronized(var2){}
      boolean var4 = false;

      qza var6;
      label45: {
         try {
            var4 = true;
            if (!this.g.contains(var1)) {
               this.g.add(var1);
               var6 = this.w();
               var4 = false;
               break label45;
            }

            var4 = false;
         } finally {
            if (var4) {
               ;
            }
         }

         var6 = null;
      }

      if (var6 != null) {
         var6.gP(qsn.a);
      }

   }

   public final void m(asw var1) {
      Object var2 = this.c;
      synchronized(var2){}

      try {
         this.E(var1);
         this.g.remove(var1);
         this.s.remove(var1);
      } finally {
         ;
      }

   }

   public final void n(ezu var1) {
      Object var3 = this.c;
      synchronized(var3){}

      Throwable var10000;
      label124: {
         boolean var10001;
         Object var2;
         Map var4;
         Object var5;
         try {
            var4 = this.i;
            var5 = var1.a;
            var4.getClass();
            var2 = var4.get(var5);
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label124;
         }

         if (var2 == null) {
            try {
               var2 = new ArrayList();
               var4.put(var5, var2);
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            ((List)var2).add(var1);
            return;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label111;
         }
      }

      Throwable var18 = var10000;
      throw var18;
   }

   public final lmk o(ezu var1) {
      var1.getClass();
      Object var2 = this.c;
      synchronized(var2){}

      lmk var5;
      try {
         var5 = (lmk)this.j.remove(var1);
      } finally {
         ;
      }

      return var5;
   }

   public final void p(ezu var1, lmk var2) {
      var1.getClass();
      Object var3 = this.c;
      synchronized(var3){}

      try {
         this.j.put(var1, var2);
      } finally {
         ;
      }

   }

   public final List q(List param1, axb param2) {
      // $FF: Couldn't be decompiled
   }

   public final void r() {
      Object var1 = this.c;
      synchronized(var1){}

      try {
         if (((aui)this.n.b()).compareTo(aui.e) >= 0) {
            this.n.d(aui.b);
         }
      } finally {
         ;
      }

      qxb.r(this.v);
   }

   public final void s() {
      Object var2 = this.c;
      synchronized(var2){}

      try {
         this.k = true;
      } finally {
         ;
      }

   }

   public final boolean t() {
      if (!this.k) {
         asg var3 = this.b;
         Object var2 = var3.a;
         synchronized(var2){}

         boolean var1;
         try {
            var1 = var3.b.isEmpty();
         } finally {
            ;
         }

         if (var1 ^ true) {
            return true;
         }
      }

      return false;
   }

   public final boolean u() {
      Object var3 = this.c;
      synchronized(var3){}

      boolean var1;
      boolean var2;
      label141: {
         Throwable var10000;
         label146: {
            boolean var10001;
            try {
               var2 = this.f.b();
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label146;
            }

            var1 = true;
            if (var2) {
               return var1;
            }

            try {
               if (!this.g.isEmpty()) {
                  return var1;
               }
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label146;
            }

            label133:
            try {
               var2 = this.t();
               break label141;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label133;
            }
         }

         Throwable var4 = var10000;
         throw var4;
      }

      if (!var2) {
         var1 = false;
      }

      return var1;
   }

   public final boolean v() {
      // $FF: Couldn't be decompiled
   }

   public final qza w() {
      qza var2;
      if (((aui)this.n.b()).compareTo(aui.b) <= 0) {
         this.q.clear();
         this.r = qtf.a;
         this.f = new axb();
         this.g.clear();
         this.s.clear();
         this.h.clear();
         this.t = null;
         var2 = this.m;
         if (var2 != null) {
            qwo.j(var2);
         }

         this.m = null;
         this.w = null;
         return null;
      } else {
         aui var1;
         if (this.w != null) {
            var1 = aui.c;
         } else if (this.d == null) {
            this.f = new axb();
            this.g.clear();
            if (this.t()) {
               var1 = aui.d;
            } else {
               var1 = aui.c;
            }
         } else if (this.g.isEmpty() && !this.f.b() && this.s.isEmpty() && this.h.isEmpty() && !this.t()) {
            var1 = aui.e;
         } else {
            var1 = aui.f;
         }

         this.n.d(var1);
         if (var1 == aui.f) {
            var2 = this.m;
            this.m = null;
            return var2;
         } else {
            return null;
         }
      }
   }
}
