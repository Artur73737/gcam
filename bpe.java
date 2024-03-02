import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bpe {
   public final Object a;
   public final Object b;

   public bpe() {
      this.a = new Matrix();
      this.b = new int[2];
   }

   public bpe(acn var1, rbd var2) {
      var1.getClass();
      super();
      this.b = var1;
      this.a = var2;
   }

   public bpe(Animator var1) {
      this.b = null;
      AnimatorSet var3 = new AnimatorSet();
      this.a = var3;
      AnimatorSet var2 = (AnimatorSet)var3;
      var3.play(var1);
   }

   public bpe(Animation var1) {
      this.b = var1;
      this.a = null;
   }

   public bpe(EditText var1) {
      this.a = var1;
      this.b = new gfv(var1);
   }

   public bpe(bro var1, Rect var2) {
      var1.getClass();
      super();
      this.b = var1;
      this.a = var2;
   }

   public bpe(bwc var1, lmk var2) {
      var1.getClass();
      var2.getClass();
      super();
      this.b = var1;
      this.a = var2;
   }

   public bpe(clx var1) {
      this.b = var1;
      this.a = new ArrayList();
   }

   public bpe(cp var1) {
      this.b = new CopyOnWriteArrayList();
      this.a = var1;
   }

   public bpe(Object var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public bpe(qrz var1, bwc var2) {
      var1.getClass();
      var2.getClass();
      super();
      this.b = var1;
      this.a = var2;
   }

   public bpe(qrz var1, bwc var2, byte[] var3) {
      var1.getClass();
      var2.getClass();
      super();
      this.a = var1;
      this.b = var2;
   }

   public bpe(qvt var1, que var2) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
   }

   public bpe(byte[] var1) {
      this.a = new AtomicReference(ayw.a);
      this.b = new Object();
   }

   public bpe(byte[] var1, byte[] var2) {
      this.b = new LinkedHashMap();
      this.a = new LinkedHashMap();
   }

   public bpe(byte[] var1, byte[] var2, byte[] var3) {
      this.a = new AtomicReference((Object)null);
      this.b = rjp.a();
   }

   public bpe(char[] var1) {
      this.b = lg.d(Integer.MAX_VALUE);
      this.a = lg.d(Integer.MAX_VALUE);
   }

   public bpe(short[] var1) {
      this.b = new SparseIntArray();
      this.a = new SparseIntArray();
   }

   private final void F(CameraDevice var1, sf var2) {
      String var3 = var1.getId();
      var3.getClass();
      qu.c(var3);
      StringBuilder var4 = new StringBuilder();
      var4.append("Closing ");
      var4.append(var1);
      qzv var9 = vs.a;
      Object var10 = ((bwc)this.b).f;
      th var5 = new th(var1, (que)null);
      qwo.p(new vr((qzr)var10, var5, (que)null));
      sz var8 = ((fwf)((lmk)this.a).a).h(var3);
      Key var6 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
      var6.getClass();
      Integer var7 = (Integer)var8.b(var6);
      if (var7 != null && var7 == 2 && !var2.b.await(5000L, TimeUnit.MILLISECONDS)) {
         Log.w("CXCP", "Failed to wait for camera device to close after 5000ms");
      }
   }

   public static final int m(int var0, int var1) {
      int var5 = 0;
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var5 < var0; var3 = var4) {
         int var6 = var2 + 1;
         if (var6 == var1) {
            var4 = var3 + 1;
            var2 = 0;
         } else {
            var2 = var6;
            var4 = var3;
            if (var6 > var1) {
               var4 = var3 + 1;
               var2 = 1;
            }
         }

         ++var5;
      }

      var0 = var3;
      if (var2 + 1 > var1) {
         var0 = var3 + 1;
      }

      return var0;
   }

   public static final boolean o(KeyListener var0) {
      return !(var0 instanceof NumberKeyListener);
   }

   public static final KeyListener p(KeyListener var0) {
      if (o(var0)) {
         KeyListener var1;
         if (var0 instanceof ckd) {
            var1 = var0;
         } else if (var0 == null) {
            var1 = null;
         } else {
            var1 = var0;
            if (!(var0 instanceof NumberKeyListener)) {
               return new ckd(var0);
            }
         }

         return var1;
      } else {
         return var0;
      }
   }

   public final void A(bv var1, Bundle var2, boolean var3) {
      bv var5 = ((cp)this.a).k;
      if (var5 != null) {
         var5.getParentFragmentManager().v.A(var1, var2, true);
      }

      boolean var4;
      prv var6;
      for(Iterator var8 = ((CopyOnWriteArrayList)this.b).iterator(); var8.hasNext(); var4 = var6.a) {
         var6 = (prv)var8.next();
         if (!var3) {
            Object var7 = var6.b;
            throw null;
         }
      }

   }

   public final void B(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.B(var1, true);
      }

      boolean var3;
      prv var5;
      for(Iterator var7 = ((CopyOnWriteArrayList)this.b).iterator(); var7.hasNext(); var3 = var5.a) {
         var5 = (prv)var7.next();
         if (!var2) {
            Object var6 = var5.b;
            throw null;
         }
      }

   }

   public final void C(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.C(var1, true);
      }

      boolean var3;
      prv var5;
      for(Iterator var7 = ((CopyOnWriteArrayList)this.b).iterator(); var7.hasNext(); var3 = var5.a) {
         var5 = (prv)var7.next();
         if (!var2) {
            Object var6 = var5.b;
            throw null;
         }
      }

   }

   public final void D(bv var1, View var2, Bundle var3, boolean var4) {
      bv var6 = ((cp)this.a).k;
      if (var6 != null) {
         var6.getParentFragmentManager().v.D(var1, var2, var3, true);
      }

      boolean var5;
      prv var9;
      for(Iterator var7 = ((CopyOnWriteArrayList)this.b).iterator(); var7.hasNext(); var5 = var9.a) {
         var9 = (prv)var7.next();
         if (!var4) {
            Object var8 = var9.b;
            throw null;
         }
      }

   }

   public final void E(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.E(var1, true);
      }

      boolean var3;
      prv var5;
      for(Iterator var7 = ((CopyOnWriteArrayList)this.b).iterator(); var7.hasNext(); var3 = var5.a) {
         var5 = (prv)var7.next();
         if (!var2) {
            Object var6 = var5.b;
            throw null;
         }
      }

   }

   public void a(View var1, float[] var2) {
      var1.getClass();
      var2.getClass();
      ((Matrix)this.a).reset();
      var1.transformMatrixToGlobal((Matrix)this.a);

      for(ViewParent var7 = var1.getParent(); var7 instanceof View; var7 = var1.getParent()) {
         var1 = (View)var7;
      }

      var1.getLocationOnScreen((int[])this.b);
      int[] var9 = (int[])this.b;
      int var4 = var9[0];
      int var3 = var9[1];
      var1.getLocationInWindow(var9);
      int[] var8 = (int[])this.b;
      int var5 = var8[0];
      int var6 = var8[1];
      ((Matrix)this.a).postTranslate((float)(var5 - var4), (float)(var6 - var3));
      eu.j(var2, (Matrix)this.a);
   }

   public final Object b(int var1) {
      Object var2 = ((axf)this.a).c(var1);
      ((qvi)this.b).a();
      return var2;
   }

   public final void c(int var1, Object var2) {
      ((axf)this.a).f(var1, var2);
      ((qvi)this.b).a();
   }

   public final Object d() {
      nuc var2 = (nuc)((AtomicReference)this.a).get();
      int var1 = var2.b(Thread.currentThread().getId());
      return var1 >= 0 ? ((Object[])var2.d)[var1] : null;
   }

   public final void e(Object var1) {
      long var8 = Thread.currentThread().getId();
      Object var12 = this.b;
      synchronized(var12){}

      Throwable var10000;
      label1011: {
         int var2;
         nuc var14;
         boolean var10001;
         try {
            var14 = (nuc)((AtomicReference)this.a).get();
            var2 = var14.b(var8);
         } catch (Throwable var89) {
            var10000 = var89;
            var10001 = false;
            break label1011;
         }

         if (var2 < 0) {
            label1015: {
               int var6;
               int var7;
               Object var13;
               Object var15;
               try {
                  var13 = this.a;
                  var6 = var14.b;
                  var15 = var14.d;
                  var7 = ((Object[])var15).length;
               } catch (Throwable var87) {
                  var10000 = var87;
                  var10001 = false;
                  break label1015;
               }

               byte var5 = 0;
               var2 = 0;

               int var3;
               int var4;
               for(var4 = 0; var2 < var7; var4 = var3) {
                  var3 = var4;

                  label996: {
                     try {
                        if (((Object[])var15)[var2] == null) {
                           break label996;
                        }
                     } catch (Throwable var86) {
                        var10000 = var86;
                        var10001 = false;
                        break label1015;
                     }

                     var3 = var4 + 1;
                  }

                  ++var2;
               }

               var7 = var4 + 1;

               Object[] var16;
               long[] var92;
               try {
                  var92 = new long[var7];
                  var16 = new Object[var7];
               } catch (Throwable var85) {
                  var10000 = var85;
                  var10001 = false;
                  break label1015;
               }

               if (var7 > 1) {
                  var2 = 0;
                  var3 = var5;

                  while(true) {
                     var4 = var3;
                     if (var3 >= var7) {
                        break;
                     }

                     var4 = var3;
                     if (var2 >= var6) {
                        break;
                     }

                     long var10;
                     Object var17;
                     try {
                        var10 = ((long[])var14.c)[var2];
                        var17 = ((Object[])var14.d)[var2];
                     } catch (Throwable var84) {
                        var10000 = var84;
                        var10001 = false;
                        break label1015;
                     }

                     if (var10 > var8) {
                        var92[var3] = var8;
                        var16[var3] = var1;
                        var4 = var3 + 1;
                        break;
                     }

                     var4 = var3;
                     if (var17 != null) {
                        var92[var3] = var10;
                        var16[var3] = var17;
                        var4 = var3 + 1;
                     }

                     ++var2;
                     var3 = var4;
                  }

                  var3 = var2;
                  if (var2 == var6) {
                     var2 = var7 - 1;
                     var92[var2] = var8;
                     var16[var2] = var1;
                  } else {
                     while(var4 < var7) {
                        try {
                           var8 = ((long[])var14.c)[var3];
                           var1 = ((Object[])var14.d)[var3];
                        } catch (Throwable var83) {
                           var10000 = var83;
                           var10001 = false;
                           break label1015;
                        }

                        var2 = var4;
                        if (var1 != null) {
                           var92[var4] = var8;
                           var16[var4] = var1;
                           var2 = var4 + 1;
                        }

                        ++var3;
                        var4 = var2;
                     }
                  }
               } else {
                  var92[0] = var8;
                  var16[0] = var1;
               }

               try {
                  nuc var90 = new nuc(var7, var92, var16);
                  ((AtomicReference)var13).set(var90);
               } catch (Throwable var82) {
                  var10000 = var82;
                  var10001 = false;
                  break label1015;
               }

               return;
            }
         } else {
            label1007: {
               try {
                  ((Object[])var14.d)[var2] = var1;
               } catch (Throwable var88) {
                  var10000 = var88;
                  var10001 = false;
                  break label1007;
               }

               return;
            }
         }
      }

      Throwable var91 = var10000;
      throw var91;
   }

   public final aqp f(apz var1) {
      return (aqp)((Map)this.b).get(var1);
   }

   public final void g(apz var1) {
      aqp var2 = (aqp)((Map)this.b).get(var1);
      if (var2 != null) {
         apz var3 = (apz)((Map)this.a).remove(var2);
      }

      ((Map)this.b).remove(var1);
   }

   public final Object h(Object var1, acn var2, qvx var3, que var4) {
      return qzy.g(new acp(var2, this, var3, var1, (que)null), var4);
   }

   public final void i(tl var1, CameraDevice var2, sf var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("Closing ");
      var4.append(var1);
      var4.append(" and/or ");
      var4.append(var2);
      Object var7;
      if (var1 != null) {
         var7 = var1.a(qxa.a(CameraDevice.class));
      } else {
         var7 = null;
      }

      if (var7 != null) {
         if (var2 != null) {
            CameraDevice var5 = (CameraDevice)var7;
            if (!c.E(var5.getId(), var2.getId())) {
               StringBuilder var6 = new StringBuilder();
               var6.append("Unwrapped camera device has camera ID ");
               var6.append(var5.getId());
               var6.append(", but the accompanied camera device has camera ID ");
               var6.append(var2.getId());
               throw new IllegalStateException(var6.toString());
            }
         }

         this.F((CameraDevice)var7, var3);
         var1.c();
      } else {
         if (var2 != null) {
            this.F(var2, var3);
         }

      }
   }

   public final Object j(String var1, long var2, que var4) {
      ss var12;
      label25: {
         if (var4 instanceof ss) {
            ss var7 = (ss)var4;
            int var5 = var7.b;
            if ((var5 & Integer.MIN_VALUE) != 0) {
               var7.b = var5 + Integer.MIN_VALUE;
               var12 = var7;
               break label25;
            }
         }

         var12 = new ss(this, var4);
      }

      Object var13 = var12.a;
      qul var8 = qul.a;
      Object var9;
      switch(var12.b) {
      case 0:
         pwm.bs(var13);
         st var10 = new st(this, var1, (que)null);
         var12.b = 1;
         var9 = qzy.m(var2, var10, var12);
         if (var9 == var8) {
            return var8;
         }
         break;
      case 1:
         pwm.bs(var13);
         var9 = var13;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      Boolean var11 = (Boolean)var9;
      boolean var6;
      if (var11 != null) {
         var6 = var11;
      } else {
         var6 = false;
      }

      return var6;
   }

   public final void k() {
      ((SparseIntArray)this.a).clear();
   }

   public final void l() {
      ((SparseIntArray)this.b).clear();
   }

   public final void n(AttributeSet var1, int var2) {
      TypedArray var5 = ((EditText)this.a).getContext().obtainStyledAttributes(var1, fq.i, var2, 0);

      boolean var3;
      label91: {
         Throwable var10000;
         label95: {
            boolean var10001;
            boolean var4;
            try {
               var4 = var5.hasValue(14);
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label95;
            }

            var3 = true;
            if (!var4) {
               break label91;
            }

            label86:
            try {
               var3 = var5.getBoolean(14, true);
               break label91;
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label86;
            }
         }

         Throwable var12 = var10000;
         var5.recycle();
         throw var12;
      }

      var5.recycle();
      ckg var13 = (ckg)((ebt)((gfv)this.b).a).b;
      if (var13.a != var3) {
         var13.a = var3;
         if (var3) {
            cjx.a();
            throw null;
         }
      }

   }

   public final InputConnection q(InputConnection var1) {
      Object var2 = this.b;
      if (var1 == null) {
         return null;
      } else {
         var2 = ((gfv)var2).a;
         return (InputConnection)(var1 instanceof ckc ? var1 : new ckc((TextView)((ebt)var2).a, var1));
      }
   }

   public final void r(bv var1, Bundle var2, boolean var3) {
      bv var5 = ((cp)this.a).k;
      if (var5 != null) {
         var5.getParentFragmentManager().v.r(var1, var2, true);
      }

      boolean var4;
      prv var6;
      for(Iterator var8 = ((CopyOnWriteArrayList)this.b).iterator(); var8.hasNext(); var4 = var6.a) {
         var6 = (prv)var8.next();
         if (!var3) {
            Object var7 = var6.b;
            throw null;
         }
      }

   }

   public final void s(bv var1, boolean var2) {
      cp var5 = (cp)this.a;
      Context var4 = var5.i.c;
      bv var8 = var5.k;
      if (var8 != null) {
         var8.getParentFragmentManager().v.s(var1, true);
      }

      boolean var3;
      prv var9;
      for(Iterator var6 = ((CopyOnWriteArrayList)this.b).iterator(); var6.hasNext(); var3 = var9.a) {
         var9 = (prv)var6.next();
         if (!var2) {
            Object var7 = var9.b;
            throw null;
         }
      }

   }

   public final void t(bv var1, Bundle var2, boolean var3) {
      bv var5 = ((cp)this.a).k;
      if (var5 != null) {
         var5.getParentFragmentManager().v.t(var1, var2, true);
      }

      boolean var4;
      prv var6;
      for(Iterator var8 = ((CopyOnWriteArrayList)this.b).iterator(); var8.hasNext(); var4 = var6.a) {
         var6 = (prv)var8.next();
         if (!var3) {
            Object var7 = var6.b;
            throw null;
         }
      }

   }

   public final void u(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.u(var1, true);
      }

      boolean var3;
      prv var7;
      for(Iterator var5 = ((CopyOnWriteArrayList)this.b).iterator(); var5.hasNext(); var3 = var7.a) {
         var7 = (prv)var5.next();
         if (!var2) {
            Object var6 = var7.b;
            throw null;
         }
      }

   }

   public final void v(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.v(var1, true);
      }

      boolean var3;
      prv var7;
      for(Iterator var5 = ((CopyOnWriteArrayList)this.b).iterator(); var5.hasNext(); var3 = var7.a) {
         var7 = (prv)var5.next();
         if (!var2) {
            Object var6 = var7.b;
            throw null;
         }
      }

   }

   public final void w(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.w(var1, true);
      }

      boolean var3;
      prv var7;
      for(Iterator var5 = ((CopyOnWriteArrayList)this.b).iterator(); var5.hasNext(); var3 = var7.a) {
         var7 = (prv)var5.next();
         if (!var2) {
            Object var6 = var7.b;
            throw null;
         }
      }

   }

   public final void x(bv var1, boolean var2) {
      cp var5 = (cp)this.a;
      Context var4 = var5.i.c;
      bv var8 = var5.k;
      if (var8 != null) {
         var8.getParentFragmentManager().v.x(var1, true);
      }

      boolean var3;
      prv var9;
      for(Iterator var6 = ((CopyOnWriteArrayList)this.b).iterator(); var6.hasNext(); var3 = var9.a) {
         var9 = (prv)var6.next();
         if (!var2) {
            Object var7 = var9.b;
            throw null;
         }
      }

   }

   public final void y(bv var1, Bundle var2, boolean var3) {
      bv var5 = ((cp)this.a).k;
      if (var5 != null) {
         var5.getParentFragmentManager().v.y(var1, var2, true);
      }

      boolean var4;
      prv var6;
      for(Iterator var8 = ((CopyOnWriteArrayList)this.b).iterator(); var8.hasNext(); var4 = var6.a) {
         var6 = (prv)var8.next();
         if (!var3) {
            Object var7 = var6.b;
            throw null;
         }
      }

   }

   public final void z(bv var1, boolean var2) {
      bv var4 = ((cp)this.a).k;
      if (var4 != null) {
         var4.getParentFragmentManager().v.z(var1, true);
      }

      boolean var3;
      prv var5;
      for(Iterator var7 = ((CopyOnWriteArrayList)this.b).iterator(); var7.hasNext(); var3 = var5.a) {
         var5 = (prv)var7.next();
         if (!var2) {
            Object var6 = var5.b;
            throw null;
         }
      }

   }
}
