import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.libraries.social.licenses.an.fJos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public abstract class ctr implements Cloneable {
   private static final int[] r = new int[]{2, 1, 3, 4};
   private static final ThreadLocal s = new ThreadLocal();
   private static final csr x = new csr();
   public long a = -1L;
   long b = -1L;
   final ArrayList c = new ArrayList();
   final ArrayList d = new ArrayList();
   cty e = null;
   public final int[] f;
   public ArrayList g;
   public ArrayList h;
   final ArrayList i;
   int j;
   boolean k;
   ArrayList l;
   ctm m;
   public ctj n;
   public csr o;
   public dub p = new dub((byte[])null);
   public dub q = new dub((byte[])null);
   private final String t = this.getClass().getName();
   private ctn[] u;
   private boolean v;
   private ArrayList w;

   public ctr() {
      this.f = r;
      this.i = new ArrayList();
      this.j = 0;
      this.v = false;
      this.k = false;
      this.w = null;
      this.l = new ArrayList();
      this.o = x;
   }

   private static void J(dub var0, View var1, cuc var2) {
      ((xo)var0.a).put(var1, var2);
      int var3 = var1.getId();
      if (var3 >= 0) {
         if (((SparseArray)var0.d).indexOfKey(var3) >= 0) {
            ((SparseArray)var0.d).put(var3, (Object)null);
         } else {
            ((SparseArray)var0.d).put(var3, var1);
         }
      }

      String var6 = cgd.h(var1);
      if (var6 != null) {
         if (((xo)var0.c).containsKey(var6)) {
            ((xo)var0.c).put(var6, (Object)null);
         } else {
            ((xo)var0.c).put(var6, var1);
         }
      }

      if (var1.getParent() instanceof ListView) {
         ListView var7 = (ListView)var1.getParent();
         if (var7.getAdapter().hasStableIds()) {
            long var4 = var7.getItemIdAtPosition(var7.getPositionForView(var1));
            if (((xl)var0.b).a(var4) >= 0) {
               var1 = (View)((xl)var0.b).d(var4);
               if (var1 != null) {
                  cfx.n(var1, false);
                  ((xl)var0.b).g(var4, (Object)null);
                  return;
               }
            } else {
               cfx.n(var1, true);
               ((xl)var0.b).g(var4, var1);
            }
         }
      }

   }

   private final void e(View var1, boolean var2) {
      if (var1 != null) {
         var1.getId();
         if (var1.getParent() instanceof ViewGroup) {
            cuc var4 = new cuc(var1);
            if (var2) {
               this.c(var4);
            } else {
               this.b(var4);
            }

            var4.c.add(this);
            this.n(var4);
            if (var2) {
               J(this.p, var1, var4);
            } else {
               J(this.q, var1, var4);
            }
         }

         if (var1 instanceof ViewGroup) {
            ViewGroup var5 = (ViewGroup)var1;

            for(int var3 = 0; var3 < var5.getChildCount(); ++var3) {
               this.e(var5.getChildAt(var3), var2);
            }
         }

      }
   }

   private static boolean f(cuc var0, cuc var1, String var2) {
      Object var4 = var0.a.get(var2);
      Object var5 = var1.a.get(var2);
      boolean var3;
      if (var4 == null && var5 == null) {
         var3 = false;
      } else if (var4 != null) {
         if (var5 != null) {
            return var4.equals(var5) ^ true;
         }

         var3 = true;
      } else {
         var3 = true;
      }

      return var3;
   }

   public static xh g() {
      ThreadLocal var2 = s;
      xh var1 = (xh)var2.get();
      xh var0 = var1;
      if (var1 == null) {
         var0 = new xh();
         var2.set(var0);
      }

      return var0;
   }

   public final void A(ctn var1) {
      ArrayList var2 = this.w;
      if (var2 != null) {
         var2.remove(var1);
         if (this.w.size() == 0) {
            this.w = null;
         }

      }
   }

   public void B(View var1) {
      this.d.remove(var1);
   }

   public void C() {
   }

   public void D() {
   }

   public void E(long var1) {
      this.a = var1;
   }

   public void F() {
      this.b = 0L;
   }

   public void G(ctj var1) {
      this.n = var1;
   }

   public void H(csr var1) {
      if (var1 == null) {
         this.o = x;
      } else {
         this.o = var1;
      }
   }

   public void I(ViewGroup var1, dub var2, dub var3, ArrayList var4, ArrayList var5) {
      xh var19 = g();
      SparseIntArray var18 = new SparseIntArray();
      int var7 = var4.size();

      int var6;
      for(var6 = 0; var6 < var7; ++var6) {
         cuc var15 = (cuc)var4.get(var6);
         cuc var23 = (cuc)var5.get(var6);
         cuc var14 = var15;
         if (var15 != null) {
            var14 = var15;
            if (!var15.c.contains(this)) {
               var14 = null;
            }
         }

         var15 = var23;
         if (var23 != null) {
            var15 = var23;
            if (!var23.c.contains(this)) {
               var15 = null;
            }
         }

         if ((var14 != null || var15 != null) && (var14 == null || var15 == null || this.v(var14, var15))) {
            Animator var24 = this.a(var1, var14, var15);
            if (var24 != null) {
               View var29;
               if (var15 != null) {
                  View var17 = var15.b;
                  String[] var16 = this.d();
                  if (var16 == null) {
                     var14 = null;
                  } else {
                     var15 = new cuc(var17);
                     cuc var20 = (cuc)((xo)var3.a).get(var17);
                     Animator var25 = var24;
                     int var8;
                     if (var20 != null) {
                        var8 = 0;

                        while(true) {
                           var25 = var24;
                           if (var8 >= var16.length) {
                              break;
                           }

                           Map var26 = var15.a;
                           String var21 = var16[var8];
                           var26.put(var21, var20.a.get(var21));
                           ++var8;
                        }
                     }

                     var24 = var25;
                     int var9 = var19.d;
                     var8 = 0;

                     while(true) {
                        if (var8 >= var9) {
                           var14 = var15;
                           break;
                        }

                        fjo var27 = (fjo)var19.get((Animator)var19.d(var8));
                        if (var27.e != null && var27.b == var17) {
                           Object var28 = var27.f;
                           String var30 = this.t;
                           if (((String)var28).equals(var30) && ((cuc)var27.e).equals(var15)) {
                              var14 = var15;
                              var24 = null;
                              break;
                           }
                        }

                        ++var8;
                     }
                  }

                  var29 = var17;
               } else {
                  var29 = var14.b;
                  var14 = null;
               }

               if (var24 != null) {
                  var19.put(var24, new fjo(var29, this.t, this, cug.a(var1), var14, var24));
                  this.l.add(var24);
               }
            }
         }
      }

      if (var18.size() != 0) {
         for(var6 = 0; var6 < var18.size(); ++var6) {
            var7 = var18.keyAt(var6);
            fjo var22 = (fjo)var19.get((Animator)this.l.get(var7));
            long var12 = (long)var18.valueAt(var6);
            long var10 = ((Animator)var22.a).getStartDelay();
            ((Animator)var22.a).setStartDelay(var12 - Long.MAX_VALUE + var10);
         }
      }

   }

   public Animator a(ViewGroup var1, cuc var2, cuc var3) {
      return null;
   }

   public abstract void b(cuc var1);

   public abstract void c(cuc var1);

   public String[] d() {
      return null;
   }

   public ctr h() {
      // $FF: Couldn't be decompiled
   }

   public final ctr i() {
      cty var1 = this.e;
      return var1 != null ? var1.i() : this;
   }

   final cuc j(View var1, boolean var2) {
      cty var5 = this.e;
      if (var5 != null) {
         return var5.j(var1, var2);
      } else {
         ArrayList var10;
         if (var2) {
            var10 = this.g;
         } else {
            var10 = this.h;
         }

         Object var6 = null;
         if (var10 == null) {
            return null;
         } else {
            int var4 = var10.size();
            int var3 = 0;

            while(true) {
               if (var3 >= var4) {
                  var3 = -1;
                  break;
               }

               cuc var7 = (cuc)var10.get(var3);
               if (var7 == null) {
                  return null;
               }

               if (var7.b == var1) {
                  break;
               }

               ++var3;
            }

            cuc var9;
            if (var3 >= 0) {
               ArrayList var8;
               if (var2) {
                  var8 = this.h;
               } else {
                  var8 = this.g;
               }

               var9 = (cuc)var8.get(var3);
            } else {
               var9 = (cuc)var6;
            }

            return var9;
         }
      }
   }

   public final cuc k(View var1, boolean var2) {
      cty var3 = this.e;
      if (var3 != null) {
         return var3.k(var1, var2);
      } else {
         dub var4;
         if (var2) {
            var4 = this.p;
         } else {
            var4 = this.q;
         }

         return (cuc)((xo)var4.a).get(var1);
      }
   }

   public String l(String var1) {
      StringBuilder var4 = new StringBuilder(var1);
      var4.append(this.getClass().getSimpleName());
      var4.append("@");
      var4.append(Integer.toHexString(this.hashCode()));
      var4.append(": ");
      if (this.b != -1L) {
         var4.append("dur(");
         var4.append(this.b);
         var4.append(") ");
      }

      if (this.a != -1L) {
         var4.append("dly(");
         var4.append(this.a);
         var4.append(") ");
      }

      if (this.c.size() > 0 || this.d.size() > 0) {
         var4.append(fJos.POsdAqGx);
         int var2 = this.c.size();
         byte var3 = 0;
         if (var2 > 0) {
            for(var2 = 0; var2 < this.c.size(); ++var2) {
               if (var2 > 0) {
                  var4.append(", ");
               }

               var4.append(this.c.get(var2));
            }
         }

         if (this.d.size() > 0) {
            for(var2 = var3; var2 < this.d.size(); ++var2) {
               if (var2 > 0) {
                  var4.append(", ");
               }

               var4.append(this.d.get(var2));
            }
         }

         var4.append(")");
      }

      return var4.toString();
   }

   protected void m() {
      for(int var1 = this.i.size() - 1; var1 >= 0; --var1) {
         ((Animator)this.i.get(var1)).cancel();
      }

      this.z(ctq.h);
   }

   public void n(cuc var1) {
   }

   final void o(ViewGroup var1, boolean var2) {
      this.p(var2);
      int var3 = this.c.size();
      byte var4 = 0;
      if (var3 <= 0) {
         if (this.d.size() <= 0) {
            this.e(var1, var2);
            return;
         }

         var3 = 0;
      } else {
         var3 = 0;
      }

      for(; var3 < this.c.size(); ++var3) {
         View var5 = var1.findViewById((Integer)this.c.get(var3));
         if (var5 != null) {
            cuc var6 = new cuc(var5);
            if (var2) {
               this.c(var6);
            } else {
               this.b(var6);
            }

            var6.c.add(this);
            this.n(var6);
            if (var2) {
               J(this.p, var5, var6);
            } else {
               J(this.q, var5, var6);
            }
         }
      }

      for(var3 = var4; var3 < this.d.size(); ++var3) {
         View var7 = (View)this.d.get(var3);
         cuc var8 = new cuc(var7);
         if (var2) {
            this.c(var8);
         } else {
            this.b(var8);
         }

         var8.c.add(this);
         this.n(var8);
         if (var2) {
            J(this.p, var7, var8);
         } else {
            J(this.q, var7, var8);
         }
      }

   }

   final void p(boolean var1) {
      if (var1) {
         ((xo)this.p.a).clear();
         ((SparseArray)this.p.d).clear();
         ((xl)this.p.b).f();
      } else {
         ((xo)this.q.a).clear();
         ((SparseArray)this.q.d).clear();
         ((xl)this.q.b).f();
      }
   }

   protected final void q() {
      int var1 = this.j - 1;
      this.j = var1;
      if (var1 == 0) {
         this.z(ctq.g);

         View var2;
         for(var1 = 0; var1 < ((xl)this.p.b).b(); ++var1) {
            var2 = (View)((xl)this.p.b).e(var1);
            if (var2 != null) {
               cfx.n(var2, false);
            }
         }

         for(var1 = 0; var1 < ((xl)this.q.b).b(); ++var1) {
            var2 = (View)((xl)this.q.b).e(var1);
            if (var2 != null) {
               cfx.n(var2, false);
            }
         }

         this.k = true;
      }

   }

   public void r(View var1) {
      if (!this.k) {
         for(int var2 = this.i.size() - 1; var2 >= 0; --var2) {
            css.b((Animator)this.i.get(var2));
         }

         this.z(ctq.i);
         this.v = true;
      }

   }

   public void s(View var1) {
      if (this.v) {
         if (!this.k) {
            for(int var2 = this.i.size() - 1; var2 >= 0; --var2) {
               css.c((Animator)this.i.get(var2));
            }

            this.z(ctq.j);
         }

         this.v = false;
      }

   }

   protected void t() {
      this.u();
      xh var6 = g();
      ArrayList var7 = this.l;
      int var2 = var7.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         Animator var5 = (Animator)var7.get(var1);
         if (var6.containsKey(var5)) {
            this.u();
            if (var5 != null) {
               var5.addListener(new ctk(this, var6));
               if (this.b >= 0L) {
                  var5.setDuration(0L);
               }

               long var3 = this.a;
               if (var3 >= 0L) {
                  var5.setStartDelay(var3 + var5.getStartDelay());
               }

               var5.addListener(new ctl(this));
               var5.start();
            }
         }
      }

      this.l.clear();
      this.q();
   }

   public final String toString() {
      return this.l("");
   }

   protected final void u() {
      if (this.j == 0) {
         this.z(ctq.f);
         this.k = false;
      }

      ++this.j;
   }

   public boolean v(cuc var1, cuc var2) {
      boolean var4 = false;
      if (var1 != null && var2 != null) {
         String[] var5 = this.d();
         if (var5 != null) {
            for(int var3 = 0; var3 < var5.length; ++var3) {
               if (f(var1, var2, var5[var3])) {
                  var4 = true;
                  break;
               }
            }
         } else {
            Iterator var6 = var1.a.keySet().iterator();

            while(var6.hasNext()) {
               if (f(var1, var2, (String)var6.next())) {
                  var4 = true;
                  break;
               }
            }
         }
      }

      return var4;
   }

   final boolean w(View var1) {
      int var2 = var1.getId();
      if (this.c.size() == 0 && this.d.size() == 0) {
         return true;
      } else {
         return this.c.contains(var2) || this.d.contains(var1);
      }
   }

   public final void x(ctn var1) {
      if (this.w == null) {
         this.w = new ArrayList();
      }

      this.w.add(var1);
   }

   public void y(View var1) {
      this.d.add(var1);
   }

   final void z(ctq var1) {
      ArrayList var4 = this.w;
      if (var4 != null && !var4.isEmpty()) {
         int var3 = this.w.size();
         ctn[] var5 = this.u;
         ctn[] var6 = var5;
         if (var5 == null) {
            var6 = new ctn[var3];
         }

         this.u = null;
         var6 = (ctn[])this.w.toArray(var6);

         for(int var2 = 0; var2 < var3; ++var2) {
            var1.a(var6[var2], this);
            var6[var2] = null;
         }

         this.u = var6;
      }

   }
}
