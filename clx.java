import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

public final class clx {
   public final AtomicReference a;
   public clw b;
   private qa c;
   private final WeakReference d;
   private int e;
   private boolean f;
   private boolean g;
   private final ArrayList h;
   private final rga i;

   public clx() {
      this.a = new AtomicReference();
   }

   public clx(cmc var1) {
      this();
      this.c = new qa();
      this.b = clw.b;
      this.h = new ArrayList();
      this.d = new WeakReference(var1);
      this.i = rgb.a(clw.b);
   }

   public static void e(String var0) {
      if (!px.n().o()) {
         throw new IllegalStateException(c.aA(var0, "Method ", " must be called on the main thread"));
      }
   }

   private final clw f(cmb var1) {
      qa var4 = this.c;
      boolean var2 = var4.c(var1);
      clw var3 = null;
      qd var5;
      if (var2) {
         var5 = ((qd)var4.a.get(var1)).d;
      } else {
         var5 = null;
      }

      clw var6;
      if (var5 != null) {
         var6 = ((cmd)var5.b).a;
      } else {
         var6 = null;
      }

      if (!this.h.isEmpty()) {
         ArrayList var7 = this.h;
         var3 = (clw)var7.get(var7.size() - 1);
      }

      return cit.i(cit.i(this.b, var6), var3);
   }

   private final void g(clw var1) {
      clw var2 = this.b;
      if (var2 != var1) {
         if (var2 == clw.b && var1 == clw.a) {
            StringBuilder var3 = new StringBuilder();
            var3.append("no event down from ");
            var3.append(this.b);
            var3.append(" in component ");
            var3.append(this.d.get());
            throw new IllegalStateException(var3.toString());
         } else {
            this.b = var1;
            if (!this.f && this.e == 0) {
               this.f = true;
               this.j();
               this.f = false;
               if (this.b == clw.a) {
                  this.c = new qa();
               }
            } else {
               this.g = true;
            }
         }
      }
   }

   private final void h() {
      ArrayList var1 = this.h;
      var1.remove(var1.size() - 1);
   }

   private final void i(clw var1) {
      this.h.add(var1);
   }

   private final void j() {
      cmc var1 = (cmc)this.d.get();
      if (var1 == null) {
         IllegalStateException var7 = new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
         throw var7;
      } else {
         while(true) {
            qa var4 = this.c;
            if (var4.e == 0) {
               break;
            }

            qd var2 = var4.b;
            var2.getClass();
            clw var3 = ((cmd)var2.b).a;
            qd var14 = var4.c;
            var14.getClass();
            clw var15 = ((cmd)var14.b).a;
            if (var3 == var15 && this.b == var15) {
               break;
            }

            this.g = false;
            var15 = this.b;
            var2.getClass();
            clu var5;
            StringBuilder var6;
            clw var9;
            cmb var13;
            clv var16;
            if (var15.compareTo(var3) < 0) {
               qa var10 = this.c;
               qc var8 = new qc(var10.c, var10.b);
               var10.d.put(var8, false);

               while(var8.hasNext() && !this.g) {
                  Entry var11 = var8.c();
                  var11.getClass();
                  var14 = (qd)var11;
                  var13 = (cmb)var14.a;
                  cmd var17 = (cmd)var14.b;

                  while(var17.a.compareTo(this.b) > 0 && !this.g && this.c.c(var13)) {
                     var5 = clv.Companion;
                     var16 = clu.a(var17.a);
                     if (var16 == null) {
                        var6 = new StringBuilder();
                        var6.append("no event down from ");
                        var9 = var17.a;
                        var6.append(var9);
                        throw new IllegalStateException("no event down from ".concat(String.valueOf(var9)));
                     }

                     this.i(var16.a());
                     var17.a(var1, var16);
                     this.h();
                  }
               }
            }

            var2 = this.c.c;
            if (!this.g && var2 != null && this.b.compareTo(((cmd)var2.b).a) > 0) {
               qe var18 = this.c.e();

               while(var18.hasNext() && !this.g) {
                  var2 = (qd)var18.a();
                  var13 = (cmb)var2.a;
                  cmd var12 = (cmd)var2.b;

                  while(var12.a.compareTo(this.b) < 0 && !this.g && this.c.c(var13)) {
                     this.i(var12.a);
                     var5 = clv.Companion;
                     var16 = clu.b(var12.a);
                     if (var16 == null) {
                        var6 = new StringBuilder();
                        var6.append("no event up from ");
                        var9 = var12.a;
                        var6.append(var9);
                        throw new IllegalStateException("no event up from ".concat(String.valueOf(var9)));
                     }

                     var12.a(var1, var16);
                     this.h();
                  }
               }
            }
         }

         this.g = false;
         this.i.d(this.b);
      }
   }

   public final void a(cmb var1) {
      var1.getClass();
      e("addObserver");
      clw var3;
      if (this.b == clw.a) {
         var3 = clw.a;
      } else {
         var3 = clw.b;
      }

      cmd var4 = new cmd(var1, var3);
      qa var5 = this.c;
      qd var7 = var5.a(var1);
      Object var8;
      if (var7 != null) {
         var8 = var7.b;
      } else {
         var5.a.put(var1, var5.d(var1, var4));
         var8 = null;
      }

      if ((cmd)var8 == null) {
         cmc var9 = (cmc)this.d.get();
         if (var9 != null) {
            boolean var2;
            if (this.e == 0) {
               if (this.f) {
                  var2 = true;
               } else {
                  var2 = false;
               }
            } else {
               var2 = true;
            }

            var3 = this.f(var1);
            ++this.e;

            while(var4.a.compareTo(var3) < 0 && this.c.c(var1)) {
               this.i(var4.a);
               clu var10 = clv.Companion;
               clv var11 = clu.b(var4.a);
               if (var11 == null) {
                  StringBuilder var6 = new StringBuilder();
                  var6.append("no event up from ");
                  var3 = var4.a;
                  var6.append(var3);
                  throw new IllegalStateException("no event up from ".concat(String.valueOf(var3)));
               }

               var4.a(var9, var11);
               this.h();
               var3 = this.f(var1);
            }

            if (!var2) {
               this.j();
            }

            --this.e;
         }
      }
   }

   public final void b(clv var1) {
      var1.getClass();
      e("handleLifecycleEvent");
      this.g(var1.a());
   }

   public final void c(cmb var1) {
      var1.getClass();
      e("removeObserver");
      this.c.b(var1);
   }

   public final void d(clw var1) {
      var1.getClass();
      e("setCurrentState");
      this.g(var1);
   }
}
