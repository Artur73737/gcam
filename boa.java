import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

public final class boa extends ViewGroup implements cll {
   public static Class a;
   public static Method b;
   public final boe A;
   public final bof B;
   public final btd C;
   public final cje D;
   public final gh E;
   public final dmx F;
   public final dmw G;
   public final ebt H;
   public final eze I;
   public final ebt J;
   public final lmk K;
   public final lmk L;
   private long M;
   private final boolean N;
   private final EmptySemanticsElement O;
   private final bbb P;
   private final bbb Q;
   private final List R;
   private List S;
   private boolean T;
   private final bhh U;
   private final bhz V;
   private boolean W;
   private bpc aa;
   private bxq ab;
   private boolean ac;
   private long ad;
   private final int[] ae;
   private final float[] af;
   private long ag;
   private boolean ah;
   private long ai;
   private final avi aj;
   private final OnGlobalLayoutListener ak;
   private final OnScrollChangedListener al;
   private final OnTouchModeChangeListener am;
   private final att an;
   private int ao;
   private final axf ap;
   private final Runnable aq;
   private final qvi ar;
   private boolean as;
   private final bpe at;
   private final dmw au;
   public final bmf c;
   public bxr d;
   public final bqg e;
   public final bmd f;
   public final bol g;
   public qvt h;
   public final bbf i;
   public final bng j;
   public boolean k;
   public bpm l;
   public final bqa m;
   public final float[] n;
   public boolean o;
   public final att p;
   public qvt q;
   public final att r;
   public final qui s;
   public MotionEvent t;
   public long u;
   public boolean v;
   public final bbu w;
   public final nj x;
   public final jtf y;
   public final jom z;

   public boa(Context var1, qui var2) {
      var2.getClass();
      super(var1);
      this.M = bci.c;
      this.N = true;
      this.c = new bmf((byte[])null);
      this.d = car.ad(var1);
      EmptySemanticsElement var4 = EmptySemanticsElement.a;
      this.O = var4;
      bbu var6 = new bbu(new bkh(this, 6));
      this.w = var6;
      this.e = new bqg();
      bay var5 = bbb.d;
      bkh var7 = new bkh(this, 7);
      var5.getClass();
      KeyInputElement var19 = new KeyInputElement(var7);
      this.P = var19;
      bmv var8 = bmv.m;
      var5.getClass();
      RotaryInputElement var21 = new RotaryInputElement(var8);
      this.Q = var21;
      this.au = new dmw((byte[])null, (byte[])null);
      bmd var14 = new bmd(false, 3, (byte[])null);
      var14.g(bki.a);
      var14.X(this.d);
      var4.getClass();
      var14.h(bax.a(var4, var21).g(var6.b).g(var19));
      this.f = var14;
      this.I = new eze(var14);
      bol var17 = new bol(this);
      this.g = var17;
      dmw var11 = new dmw((byte[])null, (byte[])null, (byte[])null);
      this.G = var11;
      this.R = new ArrayList();
      this.U = new bhh();
      this.V = new bhz(var14);
      this.h = bmv.l;
      this.i = new bbf(this, var11);
      Object var12 = var1.getSystemService("clipboard");
      var12.getClass();
      this.K = new lmk((ClipboardManager)var12, (byte[])null);
      this.L = new lmk(var1, (char[])null, (byte[])null);
      this.j = new bng(new bkh(this, 8));
      this.y = new jtf(var14);
      ViewConfiguration var13 = ViewConfiguration.get(var1);
      var13.getClass();
      this.m = new bpb(var13);
      this.ad = car.K(Integer.MAX_VALUE, Integer.MAX_VALUE);
      this.ae = new int[]{0, 0};
      this.n = bdf.c();
      this.af = bdf.c();
      this.ag = -1L;
      this.ai = bci.b;
      this.o = true;
      this.p = sg.d((Object)null);
      this.aj = avg.a(new bmc(this, 5));
      this.ak = new hn(this, 4);
      this.al = new bnx(this);
      this.am = new bny(this);
      ebt var20 = new ebt(new ajb(this, 13));
      this.H = var20;
      bvp var22 = bvp.a;
      ebt var15 = (ebt)((azz)var20.a).get(var22);
      if (var15 == null) {
         btd var16 = new btd((byte[])null);
         var15 = new ebt((ebt)((qvx)var20.b).a(var22, var16));
         ((Map)var20.a).put(var22, var15);
      }

      int var3 = ((ava)var15.b).f();
      ((ava)var15.b).h(var3 + 1);
      this.C = (btd)((ebt)var15.a).b;
      this.A = new boe();
      this.an = so.i(bsv.e(var1), aup.a);
      Configuration var18 = var1.getResources().getConfiguration();
      var18.getClass();
      this.ao = var18.fontWeightAdjustment;
      Configuration var9 = var1.getResources().getConfiguration();
      var9.getClass();
      this.r = sg.d(bod.b(var9.getLayoutDirection()));
      this.E = new gh((byte[])null);
      byte var10;
      if (!this.isInTouchMode()) {
         var10 = 2;
      } else {
         var10 = 1;
      }

      this.F = new dmx(var10);
      this.z = new jom(this);
      this.B = new bof();
      this.s = var2;
      this.J = new ebt((byte[])null, (char[])null, (byte[])null);
      this.ap = new axf(new qvi[16]);
      this.x = new nj(this, 9, (byte[])null);
      this.aq = new nj(this, 8);
      this.ar = new bmc(this, 4);
      this.at = new bpe();
      this.setWillNotDraw(false);
      this.setFocusable(true);
      boq.a.a(this, 1, false);
      this.setFocusableInTouchMode(true);
      this.setClipChildren(false);
      cgm.g(this, var17);
      var14.as(this);
      bon.a.a(this);
      boo.a.a(this, new bnz());
      this.D = new cje(this);
   }

   private final void A(bmd var1) {
      jtf.r(this.y, var1);
      axf var5 = var1.m();
      int var4 = var5.b;
      if (var4 > 0) {
         Object[] var6 = var5.a;
         int var2 = 0;

         int var3;
         do {
            this.A((bmd)var6[var2]);
            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var4);
      }

   }

   private final void B() {
      this.at.a(this, this.n);
      kf.d(this.n, this.af);
   }

   private final void C(bmd var1) {
      if (!this.isLayoutRequested() && this.isAttachedToWindow()) {
         bmd var4 = var1;
         if (var1 != null) {
            for(; var4 != null && var4.ah() == 1; var4 = var4.n()) {
               if (!this.ac) {
                  var1 = var4.n();
                  if (var1 == null) {
                     break;
                  }

                  long var2 = var1.r().d;
                  if (bxq.j(var2) && bxq.i(var2)) {
                     break;
                  }
               }
            }

            if (var4 == this.f) {
               this.requestLayout();
               return;
            }
         }

         if (this.getWidth() != 0 && this.getHeight() != 0) {
            this.invalidate();
         } else {
            this.requestLayout();
         }
      }
   }

   private final boolean D(MotionEvent var1) {
      float var3 = var1.getX();
      float var2 = var1.getY();
      return !(var3 < 0.0F) && var3 <= (float)this.getWidth() && !(var2 < 0.0F) && var2 <= (float)this.getHeight();
   }

   private final boolean E(MotionEvent var1) {
      if (var1.getPointerCount() != 1) {
         return true;
      } else {
         MotionEvent var2 = this.t;
         return var2 == null || var2.getPointerCount() != var1.getPointerCount() || var1.getRawX() != var2.getRawX() || var1.getRawY() != var2.getRawY();
      }
   }

   private static final boolean F(MotionEvent var0, MotionEvent var1) {
      return var1.getSource() != var0.getSource() || var1.getToolType(0) != var0.getToolType(0);
   }

   private static final boolean G(MotionEvent var0) {
      float var1;
      boolean var4;
      label54: {
         var1 = var0.getX();
         if (!Float.isInfinite(var1) && !Float.isNaN(var1)) {
            var1 = var0.getY();
            if (!Float.isInfinite(var1) && !Float.isNaN(var1)) {
               var1 = var0.getRawX();
               if (!Float.isInfinite(var1) && !Float.isNaN(var1)) {
                  var1 = var0.getRawY();
                  if (!Float.isInfinite(var1) && !Float.isNaN(var1)) {
                     var4 = false;
                     break label54;
                  }
               }
            }
         }

         var4 = true;
      }

      boolean var5 = var4;
      if (!var4) {
         int var3 = var0.getPointerCount();
         int var2 = 1;

         while(true) {
            var5 = var4;
            if (var2 >= var3) {
               break;
            }

            label38: {
               var1 = var0.getX(var2);
               if (!Float.isInfinite(var1) && !Float.isNaN(var1)) {
                  var1 = var0.getY(var2);
                  if (!Float.isInfinite(var1) && !Float.isNaN(var1) && bpu.a.a(var0, var2)) {
                     var4 = false;
                     break label38;
                  }
               }

               var4 = true;
            }

            var5 = var4;
            if (var4) {
               break;
            }

            ++var2;
         }
      }

      return var5;
   }

   private static final long H(int var0, int var1) {
      long var2 = (long)var0;
      return (long)var1 | var2 << 32;
   }

   private static final long I(int var0) {
      int var1 = MeasureSpec.getMode(var0);
      var0 = MeasureSpec.getSize(var0);
      long var2;
      switch(var1) {
      case Integer.MIN_VALUE:
         var2 = H(0, var0);
         break;
      case 0:
         var2 = H(0, Integer.MAX_VALUE);
         break;
      case 1073741824:
         var2 = H(var0, var0);
         break;
      default:
         throw new IllegalStateException();
      }

      return var2;
   }

   // $FF: synthetic method
   public static void t(boa var0) {
      var0.C((bmd)null);
   }

   // $FF: synthetic method
   static void u(boa var0, MotionEvent var1, int var2, long var3) {
      var0.q(var1, var2, var3, true);
   }

   private final int x(MotionEvent var1) {
      this.removeCallbacks(this.x);

      int var249;
      label2138: {
         Throwable var10000;
         Throwable var248;
         label2142: {
            boolean var10001;
            try {
               this.ag = AnimationUtils.currentAnimationTimeMillis();
               this.B();
               long var5 = bdf.a(this.n, es.i(var1.getX(), var1.getY()));
               this.ai = es.i(var1.getRawX() - bci.b(var5), var1.getRawY() - bci.c(var5));
            } catch (Throwable var247) {
               var10000 = var247;
               var10001 = false;
               break label2142;
            }

            boolean var2 = true;

            try {
               this.ah = true;
               this.f(false);
               Trace.beginSection("AndroidOwner:onTouch");
            } catch (Throwable var246) {
               var10000 = var246;
               var10001 = false;
               break label2142;
            }

            label2143: {
               label2144: {
                  int var3;
                  MotionEvent var7;
                  try {
                     var3 = var1.getActionMasked();
                     var7 = this.t;
                  } catch (Throwable var245) {
                     var10000 = var245;
                     var10001 = false;
                     break label2144;
                  }

                  label2124: {
                     if (var7 != null) {
                        try {
                           if (var7.getToolType(0) == 3) {
                              break label2124;
                           }
                        } catch (Throwable var244) {
                           var10000 = var244;
                           var10001 = false;
                           break label2144;
                        }
                     }

                     var2 = false;
                  }

                  int var4;
                  if (var7 != null) {
                     label2145: {
                        label2146: {
                           label2147: {
                              try {
                                 if (!F(var1, var7)) {
                                    break label2145;
                                 }

                                 if (var7.getButtonState() != 0) {
                                    break label2147;
                                 }
                              } catch (Throwable var243) {
                                 var10000 = var243;
                                 var10001 = false;
                                 break label2144;
                              }

                              try {
                                 switch(var7.getActionMasked()) {
                                 case 0:
                                 case 2:
                                 case 6:
                                    break;
                                 default:
                                    break label2146;
                                 }
                              } catch (Throwable var242) {
                                 var10000 = var242;
                                 var10001 = false;
                                 break label2144;
                              }
                           }

                           try {
                              this.V.a();
                              break label2145;
                           } catch (Throwable var241) {
                              var10000 = var241;
                              var10001 = false;
                              break label2144;
                           }
                        }

                        try {
                           var4 = var7.getActionMasked();
                        } catch (Throwable var240) {
                           var10000 = var240;
                           var10001 = false;
                           break label2144;
                        }

                        if (var4 != 10 && var2) {
                           try {
                              u(this, var7, 10, var7.getEventTime());
                           } catch (Throwable var239) {
                              var10000 = var239;
                              var10001 = false;
                              break label2144;
                           }
                        }
                     }
                  }

                  try {
                     var4 = var1.getToolType(0);
                  } catch (Throwable var238) {
                     var10000 = var238;
                     var10001 = false;
                     break label2144;
                  }

                  if (!var2 && var4 == 3 && var3 != 3 && var3 != 9) {
                     try {
                        if (this.D(var1)) {
                           u(this, var1, 9, var1.getEventTime());
                        }
                     } catch (Throwable var237) {
                        var10000 = var237;
                        var10001 = false;
                        break label2144;
                     }
                  }

                  if (var7 != null) {
                     try {
                        var7.recycle();
                     } catch (Throwable var236) {
                        var10000 = var236;
                        var10001 = false;
                        break label2144;
                     }
                  }

                  label2076:
                  try {
                     this.t = MotionEvent.obtainNoHistory(var1);
                     var249 = this.a(var1);
                     break label2143;
                  } catch (Throwable var235) {
                     var10000 = var235;
                     var10001 = false;
                     break label2076;
                  }
               }

               var248 = var10000;

               try {
                  Trace.endSection();
                  throw var248;
               } catch (Throwable var233) {
                  var10000 = var233;
                  var10001 = false;
                  break label2142;
               }
            }

            label2072:
            try {
               Trace.endSection();
               break label2138;
            } catch (Throwable var234) {
               var10000 = var234;
               var10001 = false;
               break label2072;
            }
         }

         var248 = var10000;
         this.ah = false;
         throw var248;
      }

      this.ah = false;
      return var249;
   }

   private final void y(ViewGroup var1) {
      int var3 = var1.getChildCount();

      for(int var2 = 0; var2 < var3; ++var2) {
         View var4 = var1.getChildAt(var2);
         if (var4 instanceof boa) {
            ((boa)var4).i();
         } else if (var4 instanceof ViewGroup) {
            this.y((ViewGroup)var4);
         }
      }

   }

   private final void z(bmd var1) {
      var1.H();
      axf var5 = var1.m();
      int var4 = var5.b;
      if (var4 > 0) {
         Object[] var6 = var5.a;
         int var2 = 0;

         int var3;
         do {
            this.z((bmd)var6[var2]);
            var3 = var2 + 1;
            var2 = var3;
         } while(var3 < var4);
      }

   }

   public final int a(MotionEvent var1) {
      if (this.as) {
         this.as = false;
         this.e.a(var1.getMetaState());
      }

      blj var6 = this.U.a(var1, this);
      int var2;
      if (var6 != null) {
         Object var7 = var6.b;
         var2 = ((List)var7).size() - 1;
         Object var4 = null;
         int var3;
         if (var2 >= 0) {
            while(true) {
               var3 = var2 - 1;
               Object var5 = ((List)var7).get(var2);
               if (((bhy)var5).e) {
                  var4 = var5;
                  break;
               }

               if (var3 < 0) {
                  break;
               }

               var2 = var3;
            }
         }

         bhy var8 = (bhy)var4;
         if (var8 != null) {
            this.M = var8.d;
         }

         var2 = this.V.b(var6, this, this.D(var1));
         var3 = var1.getActionMasked();
         if ((var3 == 0 || var3 == 5) && !bif.a(var2)) {
            bhh var9 = this.U;
            var3 = var1.getPointerId(var1.getActionIndex());
            var9.b.delete(var3);
            var9.a.delete(var3);
            return var2;
         }
      } else {
         this.V.a();
         var2 = iy.i(false, false);
      }

      return var2;
   }

   public final void autofill(SparseArray var1) {
      var1.getClass();
      bbf var5 = this.i;
      if (var5 != null) {
         int var3 = var1.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            int var4 = var1.keyAt(var2);
            AutofillValue var6 = (AutofillValue)var1.get(var4);
            bbh var7 = bbh.a;
            var6.getClass();
            if (var7.h(var6)) {
               Object var8 = var5.b;
               bbh.a.b(var6);
               if ((bbj)((Map)((dmw)var8).a).get(var4) != null) {
                  throw null;
               }
            } else {
               if (bbh.a.f(var6)) {
                  throw new qsf("An operation is not implemented: b/138604541: Add onFill() callback for date");
               }

               if (bbh.a.g(var6)) {
                  throw new qsf("An operation is not implemented: b/138604541: Add onFill() callback for list");
               }

               if (bbh.a.i(var6)) {
                  throw new qsf("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
               }
            }
         }
      }

   }

   public final long b(long var1) {
      this.n();
      var1 = bdf.a(this.n, var1);
      return es.i(bci.b(var1) + bci.b(this.ai), bci.c(var1) + bci.c(this.ai));
   }

   public final long c(long var1) {
      this.n();
      float var3 = bci.b(var1);
      float var4 = bci.b(this.ai);
      float var5 = bci.c(var1);
      float var6 = bci.c(this.ai);
      return bdf.a(this.af, es.i(var3 - var4, var5 - var6));
   }

   public final boolean canScrollHorizontally(int var1) {
      return this.g.A(false, var1, this.M);
   }

   public final boolean canScrollVertically(int var1) {
      return this.g.A(true, var1, this.M);
   }

   public final bpc d() {
      bpc var2;
      if (this.aa == null) {
         Context var1 = this.getContext();
         var1.getClass();
         var2 = new bpc(var1);
         this.aa = var2;
         this.addView(var2);
      }

      var2 = this.aa;
      var2.getClass();
      return var2;
   }

   protected final void dispatchDraw(Canvas var1) {
      var1.getClass();
      if (!this.isAttachedToWindow()) {
         this.z(this.f);
      }

      kd.i(this);
      this.T = true;
      dmw var5 = this.au;
      bcm var6 = (bcm)var5.a;
      Canvas var4 = var6.a;
      var6.f(var1);
      Object var8 = var5.a;
      this.f.D((bcw)var8);
      ((bcm)var5.a).f(var4);
      int var2;
      if (!this.R.isEmpty()) {
         int var3 = this.R.size();

         for(var2 = 0; var2 < var3; ++var2) {
            ((bnd)this.R.get(var2)).h();
         }
      }

      if (bqc.d) {
         var2 = var1.save();
         var1.clipRect(0.0F, 0.0F, 0.0F, 0.0F);
         super.dispatchDraw(var1);
         var1.restoreToCount(var2);
      }

      this.R.clear();
      this.T = false;
      List var7 = this.S;
      if (var7 != null) {
         this.R.addAll(var7);
         var7.clear();
      }

   }

   public final boolean dispatchGenericMotionEvent(MotionEvent var1) {
      var1.getClass();
      boolean var6;
      if (var1.getActionMasked() == 8) {
         if (var1.isFromSource(4194304)) {
            ViewConfiguration var7 = ViewConfiguration.get(this.getContext());
            float var2 = -var1.getAxisValue(26);
            this.getContext();
            float var3 = cgn.b(var7);
            this.getContext();
            biq var15 = new biq(var3 * var2, var2 * cgn.a(var7), var1.getEventTime());
            bcd var20 = ej.j(this.w.a);
            var6 = false;
            int var4;
            int var5;
            bba var8;
            bba var9;
            axf var10;
            bba var16;
            axf var17;
            bmr var18;
            bba var21;
            axf var24;
            bba var27;
            bip var31;
            if (var20 == null) {
               var31 = null;
            } else {
               var16 = var20.p;
               if (!var16.y) {
                  throw new IllegalStateException("visitAncestors called on an unattached node");
               }

               var16 = var16.s;
               bmd var11 = jj.h(var20);

               label314:
               while(true) {
                  if (var11 == null) {
                     var16 = null;
                     break;
                  }

                  var8 = var16;
                  if ((var11.n.e.r & 16384) != 0) {
                     label310:
                     for(; var8 != null; var8 = var8.s) {
                        if ((var8.q & 16384) != 0) {
                           var10 = null;
                           var21 = var8;

                           while(true) {
                              do {
                                 if (var21 == null) {
                                    continue label310;
                                 }

                                 var16 = var21;
                                 if (var21 instanceof bip) {
                                    break label314;
                                 }

                                 var17 = var10;
                                 if ((var21.q & 16384) == 0) {
                                    break;
                                 }

                                 var17 = var10;
                                 if (!(var21 instanceof blh)) {
                                    break;
                                 }

                                 var9 = ((blh)var21).A;
                                 var5 = 0;
                                 var17 = var10;

                                 for(var27 = var21; var9 != null; var5 = var4) {
                                    var21 = var27;
                                    axf var12 = var17;
                                    var4 = var5;
                                    if ((var9.q & 16384) != 0) {
                                       var4 = var5 + 1;
                                       if (var4 == 1) {
                                          var21 = var9;
                                          var12 = var17;
                                       } else {
                                          var24 = var17;
                                          if (var17 == null) {
                                             var24 = new axf(new bba[16]);
                                          }

                                          if (var27 != null) {
                                             var24.p(var27);
                                          }

                                          var24.p(var9);
                                          var1 = null;
                                          var12 = var24;
                                          var21 = var1;
                                       }
                                    }

                                    var9 = var9.t;
                                    var27 = var21;
                                    var17 = var12;
                                 }

                                 var21 = var27;
                                 var10 = var17;
                              } while(var5 == 1);

                              var21 = jj.f(var17);
                              var10 = var17;
                           }
                        }
                     }
                  }

                  var11 = var11.n();
                  if (var11 != null) {
                     var18 = var11.n;
                     if (var18 != null) {
                        var16 = var18.d;
                        continue;
                     }
                  }

                  var16 = null;
               }

               var31 = (bip)var16;
            }

            if (var31 != null) {
               var16 = var31.p;
               if (!var16.y) {
                  throw new IllegalStateException("visitAncestors called on an unattached node");
               }

               var21 = var16.s;
               bmd var13 = jj.h(var31);
               ArrayList var23 = null;

               while(true) {
                  bba var30;
                  while(var13 != null) {
                     ArrayList var19 = var23;
                     var9 = var21;
                     if ((var13.n.e.r & 16384) != 0) {
                        while(true) {
                           var23 = var19;
                           if (var9 == null) {
                              break;
                           }

                           ArrayList var28 = var19;
                           if ((var9.q & 16384) != 0) {
                              var27 = var9;
                              axf var25 = null;

                              label258:
                              while(true) {
                                 axf var29;
                                 while(true) {
                                    var28 = var19;
                                    if (var27 == null) {
                                       break label258;
                                    }

                                    if (var27 instanceof bip) {
                                       var28 = var19;
                                       if (var19 == null) {
                                          var28 = new ArrayList();
                                       }

                                       var28.add(var27);
                                       var29 = var25;
                                       break;
                                    }

                                    var28 = var19;
                                    var29 = var25;
                                    if ((var27.q & 16384) == 0) {
                                       break;
                                    }

                                    var28 = var19;
                                    var29 = var25;
                                    if (!(var27 instanceof blh)) {
                                       break;
                                    }

                                    var30 = ((blh)var27).A;
                                    var5 = 0;

                                    for(var24 = var25; var30 != null; var5 = var4) {
                                       var8 = var27;
                                       axf var14 = var24;
                                       var4 = var5;
                                       if ((var30.q & 16384) != 0) {
                                          var4 = var5 + 1;
                                          if (var4 == 1) {
                                             var8 = var30;
                                             var14 = var24;
                                          } else {
                                             var25 = var24;
                                             if (var24 == null) {
                                                var25 = new axf(new bba[16]);
                                             }

                                             if (var27 != null) {
                                                var25.p(var27);
                                             }

                                             var25.p(var30);
                                             var7 = null;
                                             var14 = var25;
                                             var8 = var7;
                                          }
                                       }

                                       var30 = var30.t;
                                       var27 = var8;
                                       var24 = var14;
                                    }

                                    var25 = var24;
                                    if (var5 != 1) {
                                       var29 = var24;
                                       var28 = var19;
                                       break;
                                    }
                                 }

                                 var27 = jj.f(var29);
                                 var19 = var28;
                                 var25 = var29;
                              }
                           }

                           var9 = var9.s;
                           var19 = var28;
                        }
                     }

                     var13 = var13.n();
                     if (var13 != null) {
                        var18 = var13.n;
                        if (var18 != null) {
                           var21 = var18.d;
                           continue;
                        }
                     }

                     var21 = null;
                  }

                  bip var22;
                  if (var23 != null) {
                     var4 = var23.size() - 1;
                     if (var4 >= 0) {
                        while(true) {
                           var5 = var4 - 1;
                           var22 = (bip)var23.get(var4);
                           if (var5 < 0) {
                              break;
                           }

                           var4 = var5;
                        }
                     }
                  }

                  var21 = var31.p;
                  axf var26 = null;

                  while(true) {
                     do {
                        if (var21 == null) {
                           var21 = var31.p;
                           var26 = null;

                           while(true) {
                              do {
                                 if (var21 == null) {
                                    if (var23 != null) {
                                       var5 = var23.size();

                                       for(var4 = 0; var4 < var5; ++var4) {
                                          ((bip)var23.get(var4)).a(var15);
                                       }
                                    }

                                    return var6;
                                 }

                                 if (var21 instanceof bip) {
                                    ((bip)var21).a(var15);
                                    var17 = var26;
                                    break;
                                 }

                                 var17 = var26;
                                 if ((var21.q & 16384) == 0) {
                                    break;
                                 }

                                 var17 = var26;
                                 if (!(var21 instanceof blh)) {
                                    break;
                                 }

                                 var16 = ((blh)var21).A;
                                 var4 = 0;
                                 var30 = var21;
                                 var21 = var16;

                                 for(var17 = var26; var21 != null; var30 = var9) {
                                    var10 = var17;
                                    var5 = var4;
                                    var9 = var30;
                                    if ((var21.q & 16384) != 0) {
                                       var5 = var4 + 1;
                                       if (var5 == 1) {
                                          var9 = var21;
                                          var10 = var17;
                                       } else {
                                          var10 = var17;
                                          if (var17 == null) {
                                             var10 = new axf(new bba[16]);
                                          }

                                          if (var30 != null) {
                                             var10.p(var30);
                                          }

                                          var10.p(var21);
                                          var9 = null;
                                       }
                                    }

                                    var21 = var21.t;
                                    var17 = var10;
                                    var4 = var5;
                                 }

                                 var26 = var17;
                                 var21 = var30;
                              } while(var4 == 1);

                              var21 = jj.f(var17);
                              var26 = var17;
                           }
                        }

                        if (var21 instanceof bip) {
                           var22 = (bip)var21;
                           var17 = var26;
                           break;
                        }

                        var17 = var26;
                        if ((var21.q & 16384) == 0) {
                           break;
                        }

                        var17 = var26;
                        if (!(var21 instanceof blh)) {
                           break;
                        }

                        var16 = ((blh)var21).A;
                        var5 = 0;
                        var30 = var21;
                        var21 = var16;

                        for(var17 = var26; var21 != null; var30 = var9) {
                           var10 = var17;
                           var4 = var5;
                           var9 = var30;
                           if ((var21.q & 16384) != 0) {
                              var4 = var5 + 1;
                              if (var4 == 1) {
                                 var9 = var21;
                                 var10 = var17;
                              } else {
                                 var10 = var17;
                                 if (var17 == null) {
                                    var10 = new axf(new bba[16]);
                                 }

                                 if (var30 != null) {
                                    var10.p(var30);
                                 }

                                 var10.p(var21);
                                 var9 = null;
                              }
                           }

                           var21 = var21.t;
                           var17 = var10;
                           var5 = var4;
                        }

                        var26 = var17;
                        var21 = var30;
                     } while(var5 == 1);

                     var21 = jj.f(var17);
                     var26 = var17;
                  }
               }
            }
         } else if (!G(var1) && this.isAttachedToWindow()) {
            var6 = bif.a(this.x(var1));
         } else {
            var6 = super.dispatchGenericMotionEvent(var1);
         }
      } else {
         var6 = super.dispatchGenericMotionEvent(var1);
      }

      return var6;
   }

   public final boolean dispatchHoverEvent(MotionEvent var1) {
      var1.getClass();
      if (this.v) {
         this.removeCallbacks(this.aq);
         this.aq.run();
      }

      if (!G(var1) && this.isAttachedToWindow()) {
         bol var9 = this.g;
         if (var9.F()) {
            int var5 = var1.getAction();
            int var4 = Integer.MIN_VALUE;
            switch(var5) {
            case 7:
            case 9:
               float var2 = var1.getX();
               float var3 = var1.getY();
               kd.i(var9.b);
               blq var10 = new blq();
               bmd var11 = var9.b.f;
               long var6 = es.i(var2, var3);
               qvi var8 = bmd.b;
               var11.ak(var6, var10, true);
               bba var12 = (bba)pwm.ay(var10);
               bmd var13;
               if (var12 != null) {
                  var13 = jj.h(var12);
               } else {
                  var13 = null;
               }

               if (var13 != null) {
                  bmr var15 = var13.n;
                  if (var15 != null && var15.j(8) && bom.g(la.k(var13, false)) && (byc)var9.b.d().a.get(var13) == null) {
                     var4 = var9.m(var13.d);
                  }
               }

               var9.b.d().dispatchGenericMotionEvent(var1);
               var9.z(var4);
            case 8:
            default:
               break;
            case 10:
               if (var9.c != Integer.MIN_VALUE) {
                  var9.z(Integer.MIN_VALUE);
               } else {
                  var9.b.d().dispatchGenericMotionEvent(var1);
               }
            }
         }

         switch(var1.getActionMasked()) {
         case 7:
            if (!this.E(var1)) {
               return false;
            }
            break;
         case 10:
            if (this.D(var1)) {
               if (var1.getToolType(0) != 3) {
                  MotionEvent var14 = this.t;
                  if (var14 != null) {
                     var14.recycle();
                  }

                  this.t = MotionEvent.obtainNoHistory(var1);
                  this.v = true;
                  this.post(this.aq);
                  return false;
               }

               if (var1.getButtonState() != 0) {
                  return false;
               }
            }
         }

         return bif.a(this.x(var1));
      } else {
         return false;
      }
   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      var1.getClass();
      if (!this.isFocused()) {
         return super.dispatchKeyEvent(var1);
      } else {
         this.e.a(var1.getMetaState());
         bcd var8 = ej.j(this.w.a);
         if (var8 != null) {
            bba var4 = var8.p;
            if (!var4.y) {
               throw new IllegalStateException("visitLocalDescendants called on an unattached node");
            } else {
               int var2;
               bba var5;
               bba var6;
               bba var7;
               if ((var4.r & 9216) != 0) {
                  var4 = var4.t;
                  var5 = null;

                  while(true) {
                     var7 = var5;
                     if (var4 == null) {
                        break;
                     }

                     var2 = var4.q;
                     var6 = var5;
                     if ((var2 & 9216) != 0) {
                        if ((var2 & 1024) != 0) {
                           var7 = var5;
                           break;
                        }

                        var6 = var4;
                     }

                     var4 = var4.t;
                     var5 = var6;
                  }
               } else {
                  var7 = null;
               }

               var6 = var7;
               int var3;
               axf var10;
               axf var13;
               axf var14;
               bmr var15;
               axf var16;
               bgs var17;
               bba var18;
               if (var7 == null) {
                  var4 = var8.p;
                  if (!var4.y) {
                     throw new IllegalStateException("visitAncestors called on an unattached node");
                  }

                  var4 = var4.s;
                  bmd var9 = jj.h(var8);

                  label333:
                  while(true) {
                     while(var9 != null) {
                        var6 = var4;
                        if ((var9.n.e.r & 8192) != 0) {
                           label324:
                           for(; var6 != null; var6 = var6.s) {
                              if ((var6.q & 8192) != 0) {
                                 var5 = var6;
                                 var16 = null;

                                 while(true) {
                                    do {
                                       if (var5 == null) {
                                          continue label324;
                                       }

                                       if (var5 instanceof bgs) {
                                          break label333;
                                       }

                                       var13 = var16;
                                       if ((var5.q & 8192) == 0) {
                                          break;
                                       }

                                       var13 = var16;
                                       if (!(var5 instanceof blh)) {
                                          break;
                                       }

                                       var7 = ((blh)var5).A;
                                       var3 = 0;
                                       var13 = var16;

                                       for(var18 = var5; var7 != null; var3 = var2) {
                                          var5 = var18;
                                          var10 = var13;
                                          var2 = var3;
                                          if ((var7.q & 8192) != 0) {
                                             var2 = var3 + 1;
                                             if (var2 == 1) {
                                                var5 = var7;
                                                var10 = var13;
                                             } else {
                                                var14 = var13;
                                                if (var13 == null) {
                                                   var14 = new axf(new bba[16]);
                                                }

                                                if (var18 != null) {
                                                   var14.p(var18);
                                                }

                                                var14.p(var7);
                                                var4 = null;
                                                var10 = var14;
                                                var5 = var4;
                                             }
                                          }

                                          var7 = var7.t;
                                          var18 = var5;
                                          var13 = var10;
                                       }

                                       var5 = var18;
                                       var16 = var13;
                                    } while(var3 == 1);

                                    var5 = jj.f(var13);
                                    var16 = var13;
                                 }
                              }
                           }
                        }

                        var9 = var9.n();
                        if (var9 != null) {
                           var15 = var9.n;
                           if (var15 != null) {
                              var4 = var15.d;
                              continue;
                           }
                        }

                        var4 = null;
                     }

                     var5 = null;
                     break;
                  }

                  var17 = (bgs)var5;
                  if (var17 != null) {
                     var6 = var17.n();
                  } else {
                     var6 = null;
                  }
               }

               if (var6 != null) {
                  if (!var6.n().y) {
                     throw new IllegalStateException("visitAncestors called on an unattached node");
                  }

                  var4 = var6.n().s;
                  bmd var11 = jj.h(var6);
                  ArrayList var21 = null;

                  label287:
                  while(true) {
                     bba var20;
                     while(var11 != null) {
                        var7 = var4;
                        ArrayList var19 = var21;
                        if ((var11.n.e.r & 8192) != 0) {
                           while(true) {
                              var21 = var19;
                              if (var7 == null) {
                                 break;
                              }

                              var21 = var19;
                              if ((var7.q & 8192) != 0) {
                                 var20 = var7;
                                 var16 = null;

                                 label275:
                                 while(true) {
                                    ArrayList var23;
                                    while(true) {
                                       var21 = var19;
                                       if (var20 == null) {
                                          break label275;
                                       }

                                       if (var20 instanceof bgs) {
                                          var21 = var19;
                                          if (var19 == null) {
                                             var21 = new ArrayList();
                                          }

                                          var21.add(var20);
                                          var23 = var21;
                                          var14 = var16;
                                          break;
                                       }

                                       var23 = var19;
                                       var14 = var16;
                                       if ((var20.q & 8192) == 0) {
                                          break;
                                       }

                                       var23 = var19;
                                       var14 = var16;
                                       if (!(var20 instanceof blh)) {
                                          break;
                                       }

                                       bba var25 = ((blh)var20).A;
                                       var2 = 0;

                                       for(var14 = var16; var25 != null; var2 = var3) {
                                          var18 = var20;
                                          axf var12 = var14;
                                          var3 = var2;
                                          if ((var25.q & 8192) != 0) {
                                             var3 = var2 + 1;
                                             if (var3 == 1) {
                                                var18 = var25;
                                                var12 = var14;
                                             } else {
                                                var16 = var14;
                                                if (var14 == null) {
                                                   var16 = new axf(new bba[16]);
                                                }

                                                if (var20 != null) {
                                                   var16.p(var20);
                                                }

                                                var16.p(var25);
                                                var5 = null;
                                                var12 = var16;
                                                var18 = var5;
                                             }
                                          }

                                          var25 = var25.t;
                                          var20 = var18;
                                          var14 = var12;
                                       }

                                       var16 = var14;
                                       if (var2 != 1) {
                                          var23 = var19;
                                          break;
                                       }
                                    }

                                    var20 = jj.f(var14);
                                    var19 = var23;
                                    var16 = var14;
                                 }
                              }

                              var7 = var7.s;
                              var19 = var21;
                           }
                        }

                        var11 = var11.n();
                        if (var11 != null) {
                           var15 = var11.n;
                           if (var15 != null) {
                              var4 = var15.d;
                              continue;
                           }
                        }

                        var4 = null;
                     }

                     if (var21 != null) {
                        var2 = var21.size() - 1;
                        if (var2 >= 0) {
                           while(true) {
                              var3 = var2 - 1;
                              ((bgs)var21.get(var2)).j();
                              if (var3 < 0) {
                                 break;
                              }

                              var2 = var3;
                           }
                        }
                     }

                     var20 = var6.n();
                     var16 = null;

                     while(true) {
                        do {
                           if (var20 == null) {
                              var18 = var6.n();
                              axf var22 = null;

                              while(true) {
                                 do {
                                    if (var18 == null) {
                                       if (var21 != null) {
                                          var3 = var21.size();

                                          for(var2 = 0; var2 < var3; ++var2) {
                                             if (((bgs)var21.get(var2)).g(var1)) {
                                                return true;
                                             }
                                          }
                                       }
                                       break label287;
                                    }

                                    if (var18 instanceof bgs) {
                                       if (((bgs)var18).g(var1)) {
                                          return true;
                                       }

                                       var13 = var22;
                                       break;
                                    }

                                    var13 = var22;
                                    if ((var18.q & 8192) == 0) {
                                       break;
                                    }

                                    var13 = var22;
                                    if (!(var18 instanceof blh)) {
                                       break;
                                    }

                                    var6 = ((blh)var18).A;
                                    var2 = 0;

                                    for(var13 = var22; var6 != null; var2 = var3) {
                                       var7 = var18;
                                       axf var24 = var13;
                                       var3 = var2;
                                       if ((var6.q & 8192) != 0) {
                                          var3 = var2 + 1;
                                          if (var3 == 1) {
                                             var7 = var6;
                                             var24 = var13;
                                          } else {
                                             var22 = var13;
                                             if (var13 == null) {
                                                var22 = new axf(new bba[16]);
                                             }

                                             if (var18 != null) {
                                                var22.p(var18);
                                             }

                                             var22.p(var6);
                                             var4 = null;
                                             var24 = var22;
                                             var7 = var4;
                                          }
                                       }

                                       var6 = var6.t;
                                       var18 = var7;
                                       var13 = var24;
                                    }

                                    var22 = var13;
                                 } while(var2 == 1);

                                 var18 = jj.f(var13);
                                 var22 = var13;
                              }
                           }

                           if (var20 instanceof bgs) {
                              var17 = (bgs)var20;
                              var13 = var16;
                              break;
                           }

                           var13 = var16;
                           if ((var20.q & 8192) == 0) {
                              break;
                           }

                           var13 = var16;
                           if (!(var20 instanceof blh)) {
                              break;
                           }

                           var7 = ((blh)var20).A;
                           var3 = 0;

                           for(var13 = var16; var7 != null; var3 = var2) {
                              var18 = var20;
                              var10 = var13;
                              var2 = var3;
                              if ((var7.q & 8192) != 0) {
                                 var2 = var3 + 1;
                                 if (var2 == 1) {
                                    var18 = var7;
                                    var10 = var13;
                                 } else {
                                    var16 = var13;
                                    if (var13 == null) {
                                       var16 = new axf(new bba[16]);
                                    }

                                    if (var20 != null) {
                                       var16.p(var20);
                                    }

                                    var16.p(var7);
                                    var4 = null;
                                    var10 = var16;
                                    var18 = var4;
                                 }
                              }

                              var7 = var7.t;
                              var20 = var18;
                              var13 = var10;
                           }

                           var16 = var13;
                        } while(var3 == 1);

                        var20 = jj.f(var13);
                        var16 = var13;
                     }
                  }
               }

               if (!super.dispatchKeyEvent(var1)) {
                  return false;
               } else {
                  return true;
               }
            }
         } else {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.");
         }
      }
   }

   public final boolean dispatchKeyEventPreIme(KeyEvent var1) {
      var1.getClass();
      if (this.isFocused()) {
         bcd var5 = ej.j(this.w.a);
         int var2;
         int var3;
         bba var4;
         bba var6;
         bba var7;
         axf var13;
         axf var15;
         bmr var16;
         bba var18;
         bgu var23;
         if (var5 == null) {
            var23 = null;
         } else {
            var4 = var5.p;
            if (!var4.y) {
               throw new IllegalStateException("visitAncestors called on an unattached node");
            }

            var4 = var4.s;
            bmd var9 = jj.h(var5);

            label319:
            while(true) {
               if (var9 == null) {
                  var4 = null;
                  break;
               }

               var6 = var4;
               if ((var9.n.e.r & 131072) != 0) {
                  label315:
                  for(; var6 != null; var6 = var6.s) {
                     if ((var6.q & 131072) != 0) {
                        axf var8 = null;
                        bba var14 = var6;

                        while(true) {
                           do {
                              if (var14 == null) {
                                 continue label315;
                              }

                              var4 = var14;
                              if (var14 instanceof bgu) {
                                 break label319;
                              }

                              var13 = var8;
                              if ((var14.q & 131072) == 0) {
                                 break;
                              }

                              var13 = var8;
                              if (!(var14 instanceof blh)) {
                                 break;
                              }

                              var7 = ((blh)var14).A;
                              var3 = 0;
                              var13 = var8;

                              for(var18 = var14; var7 != null; var3 = var2) {
                                 var14 = var18;
                                 axf var10 = var13;
                                 var2 = var3;
                                 if ((var7.q & 131072) != 0) {
                                    var2 = var3 + 1;
                                    if (var2 == 1) {
                                       var14 = var7;
                                       var10 = var13;
                                    } else {
                                       var15 = var13;
                                       if (var13 == null) {
                                          var15 = new axf(new bba[16]);
                                       }

                                       if (var18 != null) {
                                          var15.p(var18);
                                       }

                                       var15.p(var7);
                                       var4 = null;
                                       var10 = var15;
                                       var14 = var4;
                                    }
                                 }

                                 var7 = var7.t;
                                 var18 = var14;
                                 var13 = var10;
                              }

                              var14 = var18;
                              var8 = var13;
                           } while(var3 == 1);

                           var14 = jj.f(var13);
                           var8 = var13;
                        }
                     }
                  }
               }

               var9 = var9.n();
               if (var9 != null) {
                  var16 = var9.n;
                  if (var16 != null) {
                     var4 = var16.d;
                     continue;
                  }
               }

               var4 = null;
            }

            var23 = (bgu)var4;
         }

         if (var23 != null) {
            if (!var23.n().y) {
               throw new IllegalStateException("visitAncestors called on an unattached node");
            }

            var4 = var23.n().s;
            bmd var11 = jj.h(var23);
            ArrayList var19 = null;

            label275:
            while(true) {
               axf var17;
               axf var21;
               while(var11 != null) {
                  var6 = var4;
                  ArrayList var20 = var19;
                  if ((var11.n.e.r & 131072) != 0) {
                     while(true) {
                        var19 = var20;
                        if (var6 == null) {
                           break;
                        }

                        var19 = var20;
                        if ((var6.q & 131072) != 0) {
                           var18 = var6;
                           var17 = null;

                           label263:
                           while(true) {
                              while(true) {
                                 var19 = var20;
                                 if (var18 == null) {
                                    break label263;
                                 }

                                 if (var18 instanceof bgu) {
                                    var19 = var20;
                                    if (var20 == null) {
                                       var19 = new ArrayList();
                                    }

                                    var19.add(var18);
                                    var21 = var17;
                                    break;
                                 }

                                 var19 = var20;
                                 var21 = var17;
                                 if ((var18.q & 131072) == 0) {
                                    break;
                                 }

                                 var19 = var20;
                                 var21 = var17;
                                 if (!(var18 instanceof blh)) {
                                    break;
                                 }

                                 bba var22 = ((blh)var18).A;
                                 var2 = 0;

                                 for(var15 = var17; var22 != null; var2 = var3) {
                                    var7 = var18;
                                    axf var12 = var15;
                                    var3 = var2;
                                    if ((var22.q & 131072) != 0) {
                                       var3 = var2 + 1;
                                       if (var3 == 1) {
                                          var7 = var22;
                                          var12 = var15;
                                       } else {
                                          var17 = var15;
                                          if (var15 == null) {
                                             var17 = new axf(new bba[16]);
                                          }

                                          if (var18 != null) {
                                             var17.p(var18);
                                          }

                                          var17.p(var22);
                                          var5 = null;
                                          var12 = var17;
                                          var7 = var5;
                                       }
                                    }

                                    var22 = var22.t;
                                    var18 = var7;
                                    var15 = var12;
                                 }

                                 var17 = var15;
                                 if (var2 != 1) {
                                    var21 = var15;
                                    var19 = var20;
                                    break;
                                 }
                              }

                              var18 = jj.f(var21);
                              var20 = var19;
                              var17 = var21;
                           }
                        }

                        var6 = var6.s;
                        var20 = var19;
                     }
                  }

                  var11 = var11.n();
                  if (var11 != null) {
                     var16 = var11.n;
                     if (var16 != null) {
                        var4 = var16.d;
                        continue;
                     }
                  }

                  var4 = null;
               }

               if (var19 != null) {
                  var2 = var19.size() - 1;
                  if (var2 >= 0) {
                     while(true) {
                        var3 = var2 - 1;
                        if (((bgu)var19.get(var2)).b()) {
                           return true;
                        }

                        if (var3 < 0) {
                           break;
                        }

                        var2 = var3;
                     }
                  }
               }

               var18 = var23.n();
               var17 = null;

               while(true) {
                  do {
                     if (var18 == null) {
                        var18 = var23.n();
                        var17 = null;

                        while(true) {
                           do {
                              if (var18 == null) {
                                 if (var19 != null) {
                                    var3 = var19.size();

                                    for(var2 = 0; var2 < var3; ++var2) {
                                       if (((bgu)var19.get(var2)).a()) {
                                          return true;
                                       }
                                    }
                                 }
                                 break label275;
                              }

                              if (var18 instanceof bgu) {
                                 if (((bgu)var18).a()) {
                                    return true;
                                 }

                                 var13 = var17;
                                 break;
                              }

                              var13 = var17;
                              if ((var18.q & 131072) == 0) {
                                 break;
                              }

                              var13 = var17;
                              if (!(var18 instanceof blh)) {
                                 break;
                              }

                              var6 = ((blh)var18).A;
                              var2 = 0;

                              for(var13 = var17; var6 != null; var2 = var3) {
                                 var7 = var18;
                                 var21 = var13;
                                 var3 = var2;
                                 if ((var6.q & 131072) != 0) {
                                    var3 = var2 + 1;
                                    if (var3 == 1) {
                                       var7 = var6;
                                       var21 = var13;
                                    } else {
                                       var17 = var13;
                                       if (var13 == null) {
                                          var17 = new axf(new bba[16]);
                                       }

                                       if (var18 != null) {
                                          var17.p(var18);
                                       }

                                       var17.p(var6);
                                       var4 = null;
                                       var21 = var17;
                                       var7 = var4;
                                    }
                                 }

                                 var6 = var6.t;
                                 var18 = var7;
                                 var13 = var21;
                              }

                              var17 = var13;
                           } while(var2 == 1);

                           var18 = jj.f(var13);
                           var17 = var13;
                        }
                     }

                     if (var18 instanceof bgu) {
                        if (((bgu)var18).b()) {
                           return true;
                        }

                        var13 = var17;
                        break;
                     }

                     var13 = var17;
                     if ((var18.q & 131072) == 0) {
                        break;
                     }

                     var13 = var17;
                     if (!(var18 instanceof blh)) {
                        break;
                     }

                     var6 = ((blh)var18).A;
                     var3 = 0;

                     for(var13 = var17; var6 != null; var3 = var2) {
                        var7 = var18;
                        var21 = var13;
                        var2 = var3;
                        if ((var6.q & 131072) != 0) {
                           var2 = var3 + 1;
                           if (var2 == 1) {
                              var7 = var6;
                              var21 = var13;
                           } else {
                              var17 = var13;
                              if (var13 == null) {
                                 var17 = new axf(new bba[16]);
                              }

                              if (var18 != null) {
                                 var17.p(var18);
                              }

                              var17.p(var6);
                              var4 = null;
                              var21 = var17;
                              var7 = var4;
                           }
                        }

                        var6 = var6.t;
                        var18 = var7;
                        var13 = var21;
                     }

                     var17 = var13;
                  } while(var3 == 1);

                  var18 = jj.f(var13);
                  var17 = var13;
               }
            }
         }
      }

      if (!super.dispatchKeyEventPreIme(var1)) {
         return false;
      } else {
         return true;
      }
   }

   public final boolean dispatchTouchEvent(MotionEvent var1) {
      var1.getClass();
      if (this.v) {
         this.removeCallbacks(this.aq);
         MotionEvent var3 = this.t;
         var3.getClass();
         if (var1.getActionMasked() == 0 && !F(var1, var3)) {
            this.v = false;
         } else {
            this.aq.run();
         }
      }

      if (!G(var1) && this.isAttachedToWindow()) {
         if (var1.getActionMasked() == 2 && !this.E(var1)) {
            return false;
         } else {
            int var2 = this.x(var1);
            if ((var2 & 2) != 0) {
               this.getParent().requestDisallowInterceptTouchEvent(true);
            }

            return bif.a(var2);
         }
      } else {
         return false;
      }
   }

   public final void e(bmd var1, boolean var2) {
      this.y.g(var1, var2);
   }

   public final void f(boolean var1) {
      if (this.y.k() || ((axf)((bnc)this.y.c).a).n()) {
         label158: {
            Throwable var10000;
            label162: {
               Trace.beginSection("AndroidOwner:measureAndLayout");
               boolean var10001;
               qvi var2;
               if (var1) {
                  try {
                     var2 = this.ar;
                  } catch (Throwable var14) {
                     var10000 = var14;
                     var10001 = false;
                     break label162;
                  }
               } else {
                  var2 = null;
               }

               try {
                  if (this.y.l(var2)) {
                     this.requestLayout();
                  }
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label162;
               }

               label149:
               try {
                  jtf.q(this.y);
                  break label158;
               } catch (Throwable var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label149;
               }
            }

            Throwable var15 = var10000;
            Trace.endSection();
            throw var15;
         }

         Trace.endSection();
      }
   }

   public final View findViewByAccessibilityIdTraversal(int var1) {
      View var2 = null;

      try {
         Method var3 = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
         var3.setAccessible(true);
         Object var5 = var3.invoke(this, var1);
         if (var5 instanceof View) {
            var2 = (View)var5;
         }

         return var2;
      } catch (NoSuchMethodException var4) {
         return null;
      }
   }

   public final void g(bmd var1, long var2) {
      var1.getClass();
      Trace.beginSection("AndroidOwner:measureAndLayout");

      Throwable var164;
      Throwable var10000;
      label1469: {
         IllegalArgumentException var163;
         boolean var10001;
         label1468: {
            label1473: {
               jtf var5;
               label1474: {
                  label1465: {
                     label1475: {
                        label1463: {
                           try {
                              var5 = this.y;
                              if (c.E(var1, var5.b)) {
                                 break label1473;
                              }

                              Object var6 = var5.b;
                              if (!((bmd)var6).ad()) {
                                 break label1468;
                              }

                              if (((bmd)var6).d()) {
                                 if (var5.a) {
                                    break label1475;
                                 }

                                 if (var5.e == null) {
                                    break label1465;
                                 }

                                 var5.a = true;
                                 break label1463;
                              }
                           } catch (Throwable var162) {
                              var10000 = var162;
                              var10001 = false;
                              break label1469;
                           }

                           try {
                              var163 = new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
                              throw var163;
                           } catch (Throwable var154) {
                              var10000 = var154;
                              var10001 = false;
                              break label1469;
                           }
                        }

                        boolean var4;
                        try {
                           ((blj)var5.f).e(var1);
                           var4 = var5.i(var1, bxq.e(var2));
                           var5.j(var1, bxq.e(var2));
                        } catch (Throwable var159) {
                           var10000 = var159;
                           var10001 = false;
                           break label1474;
                        }

                        label1451: {
                           if (!var4) {
                              try {
                                 if (!var1.aa()) {
                                    break label1451;
                                 }
                              } catch (Throwable var161) {
                                 var10000 = var161;
                                 var10001 = false;
                                 break label1474;
                              }
                           }

                           try {
                              if (c.E(var1.u(), true)) {
                                 var1.K();
                              }
                           } catch (Throwable var158) {
                              var10000 = var158;
                              var10001 = false;
                              break label1474;
                           }
                        }

                        try {
                           if (var1.Z() && var1.d()) {
                              var1.S();
                              ((bnc)var5.c).b(var1);
                           }
                        } catch (Throwable var160) {
                           var10000 = var160;
                           var10001 = false;
                           break label1474;
                        }

                        try {
                           var5.a = false;
                           Object var165 = var5.d;
                           break label1465;
                        } catch (Throwable var157) {
                           var10000 = var157;
                           var10001 = false;
                           break label1469;
                        }
                     }

                     try {
                        var163 = new IllegalArgumentException("performMeasureAndLayout called during measure layout");
                        throw var163;
                     } catch (Throwable var153) {
                        var10000 = var153;
                        var10001 = false;
                        break label1469;
                     }
                  }

                  try {
                     var5.e();
                     if (!this.y.k()) {
                        jtf.q(this.y);
                     }
                  } catch (Throwable var152) {
                     var10000 = var152;
                     var10001 = false;
                     break label1469;
                  }

                  Trace.endSection();
                  return;
               }

               var164 = var10000;

               try {
                  var5.a = false;
                  throw var164;
               } catch (Throwable var151) {
                  var10000 = var151;
                  var10001 = false;
                  break label1469;
               }
            }

            try {
               var163 = new IllegalArgumentException("measureAndLayout called on root");
               throw var163;
            } catch (Throwable var156) {
               var10000 = var156;
               var10001 = false;
               break label1469;
            }
         }

         label1424:
         try {
            var163 = new IllegalArgumentException("performMeasureAndLayout called with unattached root");
            throw var163;
         } catch (Throwable var155) {
            var10000 = var155;
            var10001 = false;
            break label1424;
         }
      }

      var164 = var10000;
      Trace.endSection();
      throw var164;
   }

   public final void getFocusedRect(Rect var1) {
      var1.getClass();
      bcd var2 = ej.j(this.w.a);
      Object var3 = null;
      bcj var4;
      if (var2 != null) {
         var4 = ej.l(var2);
      } else {
         var4 = null;
      }

      qsn var5;
      if (var4 != null) {
         var1.left = qxg.e(var4.b);
         var1.top = qxg.e(var4.c);
         var1.right = qxg.e(var4.d);
         var1.bottom = qxg.e(var4.e);
         var5 = qsn.a;
      } else {
         var5 = (qsn)var3;
      }

      if (var5 == null) {
         super.getFocusedRect(var1);
      }

   }

   public final void h(bnd var1, boolean var2) {
      if (!var2) {
         if (!this.T) {
            this.R.remove(var1);
            List var4 = this.S;
            if (var4 != null) {
               var4.remove(var1);
            }
         }

      } else if (!this.T) {
         this.R.add(var1);
      } else {
         Object var3 = this.S;
         if (var3 == null) {
            var3 = new ArrayList();
            this.S = (List)var3;
         }

         ((Collection)var3).add(var1);
      }
   }

   public final void i() {
      axf var129;
      int var1;
      int var2;
      if (this.W) {
         Object var9 = this.j.a;
         bmv var12 = bmv.d;
         axf var11 = ((bad)var9).f;
         synchronized(var11){}

         label1548: {
            Throwable var10000;
            label1555: {
               int var5;
               boolean var10001;
               try {
                  var129 = ((bad)var9).f;
                  var5 = var129.b;
               } catch (Throwable var128) {
                  var10000 = var128;
                  var10001 = false;
                  break label1555;
               }

               if (var5 <= 0) {
                  break label1548;
               }

               Object[] var130;
               try {
                  var130 = var129.a;
               } catch (Throwable var127) {
                  var10000 = var127;
                  var10001 = false;
                  break label1555;
               }

               var2 = 0;

               label1539:
               while(true) {
                  int var6;
                  bac var13;
                  dhq var14;
                  try {
                     var13 = (bac)var130[var2];
                     var14 = var13.j;
                     var6 = var14.a;
                  } catch (Throwable var124) {
                     var10000 = var124;
                     var10001 = false;
                     break;
                  }

                  int var3 = 0;

                  int var4;
                  for(var1 = 0; var3 < var6; var1 = var4) {
                     Object var10;
                     Object var15;
                     Object var17;
                     label1561: {
                        int var7;
                        Object var16;
                        try {
                           var17 = ((Object[])var14.b)[var3];
                           var17.getClass();
                           dhq var18 = (dhq)((Object[])var14.c)[var3];
                           var15 = var12.eo(var17);
                           if (!(Boolean)var15) {
                              break label1561;
                           }

                           var10 = var18.c;
                           var16 = var18.b;
                           var7 = var18.a;
                        } catch (Throwable var125) {
                           var10000 = var125;
                           var10001 = false;
                           break label1539;
                        }

                        for(var4 = 0; var4 < var7; ++var4) {
                           try {
                              Object var134 = ((Object[])var10)[var4];
                              var134.getClass();
                              int var8 = ((int[])var16)[var4];
                              var13.a(var17, var134);
                           } catch (Throwable var123) {
                              var10000 = var123;
                              var10001 = false;
                              break label1539;
                           }
                        }
                     }

                     var4 = var1;

                     label1563: {
                        try {
                           if ((Boolean)var15) {
                              break label1563;
                           }
                        } catch (Throwable var126) {
                           var10000 = var126;
                           var10001 = false;
                           break label1539;
                        }

                        if (var1 != var3) {
                           try {
                              ((Object[])var14.b)[var1] = var17;
                              var15 = var14.c;
                              var10 = ((Object[])var15)[var3];
                              ((Object[])var15)[var1] = var10;
                           } catch (Throwable var122) {
                              var10000 = var122;
                              var10001 = false;
                              break label1539;
                           }
                        }

                        var4 = var1 + 1;
                     }

                     ++var3;
                  }

                  try {
                     var4 = var14.a;
                  } catch (Throwable var121) {
                     var10000 = var121;
                     var10001 = false;
                     break;
                  }

                  if (var4 > var1) {
                     for(var3 = var1; var3 < var4; ++var3) {
                        try {
                           ((Object[])var14.b)[var3] = null;
                           ((Object[])var14.c)[var3] = null;
                        } catch (Throwable var120) {
                           var10000 = var120;
                           var10001 = false;
                           break label1539;
                        }
                     }

                     try {
                        var14.a = var1;
                     } catch (Throwable var119) {
                        var10000 = var119;
                        var10001 = false;
                        break;
                     }
                  }

                  ++var2;
                  if (var2 >= var5) {
                     break label1548;
                  }
               }
            }

            Throwable var131 = var10000;
            throw var131;
         }

         this.W = false;
      }

      bpc var132 = this.aa;
      if (var132 != null) {
         this.y(var132);
      }

      while(this.ap.n()) {
         var2 = this.ap.b;

         for(var1 = 0; var1 < var2; ++var1) {
            var129 = this.ap;
            qvi var133 = (qvi)var129.a[var1];
            var129.d(var1, (Object)null);
            if (var133 != null) {
               var133.a();
            }
         }

         this.ap.i(0, var2);
      }

   }

   public final void j(bmd var1) {
      bol var2 = this.g;
      var2.n = true;
      if (var2.C()) {
         var2.v(var1);
      }
   }

   public final void k(bmd var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         if (this.y.n(var1, var3) && var4) {
            this.C(var1);
            return;
         }
      } else if (this.y.p(var1, var3) && var4) {
         this.C(var1);
         return;
      }

   }

   public final void l(bmd var1, boolean var2, boolean var3) {
      if (var2) {
         if (this.y.m(var1, var3)) {
            t(this);
            return;
         }
      } else if (this.y.o(var1, var3)) {
         t(this);
         return;
      }

   }

   public final void m() {
      bol var1 = this.g;
      var1.n = true;
      if (var1.C() && !var1.v) {
         var1.v = true;
         var1.h.post(var1.w);
      }

   }

   public final void n() {
      if (!this.ah) {
         long var3 = AnimationUtils.currentAnimationTimeMillis();
         if (var3 != this.ag) {
            this.ag = var3;
            this.B();
            ViewParent var6 = this.getParent();

            Object var5;
            for(var5 = this; var6 instanceof ViewGroup; var6 = ((ViewGroup)var5).getParent()) {
               var5 = (View)var6;
            }

            ((View)var5).getLocationOnScreen(this.ae);
            int[] var8 = this.ae;
            float var2 = (float)var8[0];
            float var1 = (float)var8[1];
            ((View)var5).getLocationInWindow(var8);
            int[] var7 = this.ae;
            this.ai = es.i(var2 - (float)var7[0], var1 - (float)var7[1]);
         }
      }

   }

   public final void o(qvi var1) {
      if (!this.ap.l(var1)) {
         this.ap.p(var1);
      }

   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.A(this.f);
      this.z(this.f);
      bad var3 = (bad)this.j.a;
      var3.h = dp.o(var3.d);
      bbf var7 = this.i;
      if (var7 != null) {
         bbi.a.a(var7);
      }

      bpe var9;
      label48: {
         cmc var8 = car.c(this);
         cry var4 = cbu.e(this);
         bpe var5 = this.v();
         if (var5 != null) {
            if (var8 == null || var4 == null) {
               break label48;
            }

            Object var6 = var5.a;
            if (var8 == var6 && var4 == var6) {
               break label48;
            }
         }

         if (var8 == null) {
            throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
         }

         if (var4 == null) {
            throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
         }

         if (var5 != null) {
            clx var12 = ((cmc)var5.a).getLifecycle();
            if (var12 != null) {
               var12.c(this);
            }
         }

         var8.getLifecycle().a(this);
         var9 = new bpe(var8, var4);
         this.p.b(var9);
         qvt var11 = this.q;
         if (var11 != null) {
            var11.eo(var9);
         }

         this.q = null;
      }

      dmx var10 = this.F;
      boolean var2 = this.isInTouchMode();
      byte var1 = 1;
      if (!var2) {
         var1 = 2;
      }

      var10.f(var1);
      var9 = this.v();
      var9.getClass();
      ((cmc)var9.a).getLifecycle().a(this);
      var9 = this.v();
      var9.getClass();
      ((cmc)var9.a).getLifecycle().a(this.g);
      this.getViewTreeObserver().addOnGlobalLayoutListener(this.ak);
      this.getViewTreeObserver().addOnScrollChangedListener(this.al);
      this.getViewTreeObserver().addOnTouchModeChangeListener(this.am);
   }

   public final boolean onCheckIsTextEditor() {
      return this.H.D() != null;
   }

   protected final void onConfigurationChanged(Configuration var1) {
      var1.getClass();
      super.onConfigurationChanged(var1);
      Context var2 = this.getContext();
      var2.getClass();
      this.d = car.ad(var2);
      if (var1.fontWeightAdjustment != this.ao) {
         this.ao = var1.fontWeightAdjustment;
         var2 = this.getContext();
         var2.getClass();
         fwf var3 = bsv.e(var2);
         this.an.b(var3);
      }

      this.h.eo(var1);
   }

   // $FF: synthetic method
   public final void onCreate(cmc var1) {
   }

   public final InputConnection onCreateInputConnection(EditorInfo var1) {
      var1.getClass();
      ebt var3 = this.H.D();
      if (var3 != null) {
         Object var4 = var3.a;
         bwc var9 = (bwc)var4;
         Object var5 = var9.d;
         byte var2;
         if (c.n(1, 1)) {
            var2 = 0;
         } else if (c.n(1, 0)) {
            var2 = 1;
         } else if (c.n(1, 2)) {
            var2 = 2;
         } else if (c.n(1, 6)) {
            var2 = 5;
         } else if (c.n(1, 5)) {
            var2 = 7;
         } else if (c.n(1, 3)) {
            var2 = 3;
         } else if (c.n(1, 4)) {
            var2 = 4;
         } else {
            if (!c.n(1, 7)) {
               throw new IllegalStateException("invalid ImeAction");
            }

            var2 = 6;
         }

         var1.imeOptions = var2;
         if (c.n(1, 1)) {
            var1.inputType = 1;
         } else if (c.n(1, 2)) {
            var1.inputType = 1;
            var1.imeOptions |= Integer.MIN_VALUE;
         } else if (c.n(1, 3)) {
            var1.inputType = 2;
         } else if (c.n(1, 4)) {
            var1.inputType = 3;
         } else if (c.n(1, 5)) {
            var1.inputType = 17;
         } else if (c.n(1, 6)) {
            var1.inputType = 33;
         } else if (c.n(1, 7)) {
            var1.inputType = 129;
         } else if (c.n(1, 8)) {
            var1.inputType = 18;
         } else {
            if (!c.n(1, 9)) {
               throw new IllegalStateException("Invalid Keyboard Type");
            }

            var1.inputType = 8194;
         }

         if (bte.d(var1.inputType)) {
            var1.inputType |= 131072;
            if (c.n(1, 1)) {
               var1.imeOptions |= 1073741824;
            }
         }

         if (bte.d(var1.inputType)) {
            if (c.n(0, 1)) {
               var1.inputType |= 4096;
            } else if (c.n(0, 2)) {
               var1.inputType |= 8192;
            } else if (c.n(0, 3)) {
               var1.inputType |= 16384;
            }

            var1.inputType |= 32768;
         }

         bwa var11 = (bwa)var5;
         var1.initialSelStart = bsr.d(var11.b);
         var1.initialSelEnd = bsr.a(var11.b);
         var1.setInitialSurroundingSubText(var11.a(), 0);
         var1.imeOptions |= 33554432;
         cjx var6 = cjx.a;
         Object var7 = var9.d;
         AmbientMode$AmbientController var10 = new AmbientMode$AmbientController(var4);
         bvw var8 = new bvw((bwa)var7, var10);
         ((List)var9.e).add(new WeakReference(var8));
         return var8;
      } else {
         return null;
      }
   }

   public final void onCreateVirtualViewTranslationRequests(long[] var1, int[] var2, Consumer var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      bol var4 = this.g;
      boi.a.a(var4, var1, var2, var3);
   }

   // $FF: synthetic method
   public final void onDestroy(cmc var1) {
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      bng var4 = this.j;
      AmbientMode$AmbientController var5 = ((bad)var4.a).h;
      if (var5 != null) {
         var5.e();
      }

      Object var23 = var4.a;
      axf var20 = ((bad)var23).f;
      synchronized(var20){}

      label220: {
         Throwable var10000;
         label226: {
            int var3;
            boolean var10001;
            axf var24;
            try {
               var24 = ((bad)var23).f;
               var3 = var24.b;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label226;
            }

            if (var3 <= 0) {
               break label220;
            }

            Object[] var25;
            try {
               var25 = var24.a;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label226;
            }

            int var1 = 0;

            while(true) {
               try {
                  bac var6 = (bac)var25[var1];
                  var6.h.u();
                  dhq var7 = var6.j;
                  var7.a = 0;
                  pwm.bl((Object[])var7.b, (Object)null);
                  pwm.bl((Object[])var7.c, (Object)null);
                  var6.i.u();
                  var6.g.clear();
               } catch (Throwable var17) {
                  var10000 = var17;
                  var10001 = false;
                  break;
               }

               int var2 = var1 + 1;
               var1 = var2;
               if (var2 >= var3) {
                  break label220;
               }
            }
         }

         Throwable var27 = var10000;
         throw var27;
      }

      bpe var21 = this.v();
      clx var22;
      if (var21 != null) {
         var22 = ((cmc)var21.a).getLifecycle();
         if (var22 != null) {
            var22.c(this);
         }
      }

      var21 = this.v();
      if (var21 != null) {
         var22 = ((cmc)var21.a).getLifecycle();
         if (var22 != null) {
            var22.c(this.g);
         }
      }

      bbf var26 = this.i;
      if (var26 != null) {
         bbi.a.b(var26);
      }

      this.getViewTreeObserver().removeOnGlobalLayoutListener(this.ak);
      this.getViewTreeObserver().removeOnScrollChangedListener(this.al);
      this.getViewTreeObserver().removeOnTouchModeChangeListener(this.am);
   }

   protected final void onDraw(Canvas var1) {
      var1.getClass();
   }

   protected final void onFocusChanged(boolean var1, int var2, Rect var3) {
      super.onFocusChanged(var1, var2, var3);
      if (var1) {
         bbu var4 = this.w;
         if (var4.a.c == bcc.d) {
            var4.a.i(bcc.a);
         }

      } else {
         ej.n(this.w.a, true, true);
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.y.l(this.ar);
      this.ab = null;
      this.r();
      if (this.aa != null) {
         this.d().layout(0, 0, var4 - var2, var5 - var3);
      }

   }

   protected final void onMeasure(int var1, int var2) {
      Trace.beginSection("AndroidOwner:onMeasure");

      Throwable var10000;
      label3362: {
         boolean var10001;
         try {
            if (!this.isAttachedToWindow()) {
               this.A(this.f);
            }
         } catch (Throwable var416) {
            var10000 = var416;
            var10001 = false;
            break label3362;
         }

         long var6;
         try {
            var6 = I(var1);
         } catch (Throwable var415) {
            var10000 = var415;
            var10001 = false;
            break label3362;
         }

         var1 = (int)(var6 & 4294967295L);

         long var4;
         try {
            var4 = I(var2);
         } catch (Throwable var414) {
            var10000 = var414;
            var10001 = false;
            break label3362;
         }

         var2 = (int)(var4 >>> 32);

         bxq var8;
         try {
            var4 = car.X((int)(var6 >>> 32), var1, var2, (int)(4294967295L & var4));
            var8 = this.ab;
         } catch (Throwable var413) {
            var10000 = var413;
            var10001 = false;
            break label3362;
         }

         if (var8 == null) {
            try {
               this.ab = bxq.e(var4);
               this.ac = false;
            } catch (Throwable var412) {
               var10000 = var412;
               var10001 = false;
               break label3362;
            }
         } else {
            try {
               if (!c.o(var8.b, var4)) {
                  this.ac = true;
               }
            } catch (Throwable var411) {
               var10000 = var411;
               var10001 = false;
               break label3362;
            }
         }

         jtf var9;
         Object var417;
         try {
            var9 = this.y;
            var417 = var9.e;
         } catch (Throwable var410) {
            var10000 = var410;
            var10001 = false;
            break label3362;
         }

         IllegalArgumentException var418;
         Object var419;
         label3363: {
            if (var417 != null) {
               try {
                  if (c.o(((bxq)var417).b, var4)) {
                     break label3363;
                  }
               } catch (Throwable var408) {
                  var10000 = var408;
                  var10001 = false;
                  break label3362;
               }
            }

            label3364: {
               try {
                  if (var9.a) {
                     break label3364;
                  }

                  var9.e = bxq.e(var4);
                  var417 = var9.b;
                  if (((bmd)var417).e != null) {
                     ((bmd)var417).M();
                  }
               } catch (Throwable var409) {
                  var10000 = var409;
                  var10001 = false;
                  break label3362;
               }

               boolean var3;
               label3322: {
                  label3321: {
                     try {
                        ((bmd)var9.b).N();
                        var417 = var9.f;
                        var419 = var9.b;
                        if (((bmd)var419).e != null) {
                           break label3321;
                        }
                     } catch (Throwable var407) {
                        var10000 = var407;
                        var10001 = false;
                        break label3362;
                     }

                     var3 = false;
                     break label3322;
                  }

                  var3 = true;
               }

               try {
                  bmd var421 = (bmd)var419;
                  ((blj)var417).a(var421, var3);
                  break label3363;
               } catch (Throwable var406) {
                  var10000 = var406;
                  var10001 = false;
                  break label3362;
               }
            }

            try {
               var418 = new IllegalArgumentException("updateRootConstraints called while measuring");
               throw var418;
            } catch (Throwable var399) {
               var10000 = var399;
               var10001 = false;
               break label3362;
            }
         }

         label3313: {
            label3312: {
               label3311: {
                  label3365: {
                     jtf var420;
                     try {
                        var420 = this.y;
                        var419 = var420.b;
                        if (!((bmd)var419).ad()) {
                           break label3365;
                        }

                        if (!((bmd)var419).d()) {
                           break label3311;
                        }

                        if (var420.a) {
                           break label3312;
                        }

                        if (var420.e == null) {
                           break label3313;
                        }

                        var420.a = true;
                     } catch (Throwable var405) {
                        var10000 = var405;
                        var10001 = false;
                        break label3362;
                     }

                     try {
                        var420.h((bmd)var420.b);
                     } finally {
                        try {
                           var420.a = false;
                        } catch (Throwable var398) {
                           var10000 = var398;
                           var10001 = false;
                           break label3362;
                        }
                     }

                     var417 = var420.d;
                     break label3313;
                  }

                  try {
                     var418 = new IllegalArgumentException("performMeasureAndLayout called with unattached root");
                     throw var418;
                  } catch (Throwable var403) {
                     var10000 = var403;
                     var10001 = false;
                     break label3362;
                  }
               }

               try {
                  var418 = new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
                  throw var418;
               } catch (Throwable var402) {
                  var10000 = var402;
                  var10001 = false;
                  break label3362;
               }
            }

            try {
               var418 = new IllegalArgumentException("performMeasureAndLayout called during measure layout");
               throw var418;
            } catch (Throwable var401) {
               var10000 = var401;
               var10001 = false;
               break label3362;
            }
         }

         try {
            this.setMeasuredDimension(this.f.k(), this.f.i());
            if (this.aa != null) {
               this.d().measure(MeasureSpec.makeMeasureSpec(this.f.k(), 1073741824), MeasureSpec.makeMeasureSpec(this.f.i(), 1073741824));
            }
         } catch (Throwable var400) {
            var10000 = var400;
            var10001 = false;
            break label3362;
         }

         Trace.endSection();
         return;
      }

      Throwable var422 = var10000;
      Trace.endSection();
      throw var422;
   }

   // $FF: synthetic method
   public final void onPause(cmc var1) {
   }

   public final void onProvideAutofillVirtualStructure(ViewStructure var1, int var2) {
      if (var1 != null) {
         bbf var4 = this.i;
         if (var4 != null) {
            var2 = bbg.a.a(var1, ((Map)((dmw)var4.b).a).size());

            for(Iterator var6 = ((Map)((dmw)var4.b).a).entrySet().iterator(); var6.hasNext(); ++var2) {
               Entry var5 = (Entry)var6.next();
               int var3 = ((Number)var5.getKey()).intValue();
               bbj var8 = (bbj)var5.getValue();
               ViewStructure var9 = bbg.a.b(var1, var2);
               if (var9 != null) {
                  bbh var10 = bbh.a;
                  AutofillId var7 = var10.a(var1);
                  var7.getClass();
                  var10.d(var9, var7, var3);
                  bbg.a.d(var9, var3, ((View)var4.a).getContext().getPackageName(), (String)null, (String)null);
                  bbh.a.e(var9, 1);
                  throw null;
               }
            }
         }
      }

   }

   public final void onResume(cmc var1) {
      this.k = kd.e();
   }

   public final void onRtlPropertiesChanged(int var1) {
      if (this.N) {
         bxy var2 = bod.b(var1);
         this.r.b(var2);
         bbu var3 = this.w;
         var2.getClass();
         var3.c = var2;
      }

   }

   // $FF: synthetic method
   public final void onStart(cmc var1) {
   }

   // $FF: synthetic method
   public final void onStop(cmc var1) {
   }

   public final void onVirtualViewTranslationResponses(LongSparseArray var1) {
      var1.getClass();
      bol var2 = this.g;
      boi.a.b(var2, var1);
   }

   public final void onWindowFocusChanged(boolean var1) {
      this.e.a.b(var1);
      this.as = true;
      super.onWindowFocusChanged(var1);
      if (var1) {
         var1 = kd.e();
         if (this.k != var1) {
            this.k = var1;
            this.z(this.f);
         }
      }

   }

   public final void p() {
      this.W = true;
   }

   public final void q(MotionEvent var1, int var2, long var3, boolean var5) {
      int var6;
      int var7;
      var7 = var1.getActionMasked();
      var6 = -1;
      label53:
      switch(var7) {
      case 1:
         switch(var2) {
         case 9:
         case 10:
            break label53;
         default:
            var6 = 0;
            break label53;
         }
      case 6:
         var6 = var1.getActionIndex();
      }

      int var8 = var1.getPointerCount();
      byte var15;
      if (var6 >= 0) {
         var15 = 1;
      } else {
         var15 = 0;
      }

      int var9 = var8 - var15;
      if (var9 != 0) {
         PointerProperties[] var13 = new PointerProperties[var9];

         for(var7 = 0; var7 < var9; ++var7) {
            var13[var7] = new PointerProperties();
         }

         PointerCoords[] var12 = new PointerCoords[var9];

         for(var7 = 0; var7 < var9; ++var7) {
            var12[var7] = new PointerCoords();
         }

         long var10;
         for(var8 = 0; var8 < var9; ++var8) {
            if (var6 >= 0) {
               if (var8 < var6) {
                  var15 = 0;
               } else {
                  var15 = 1;
               }
            } else {
               var15 = 0;
            }

            PointerProperties var14 = var13[var8];
            var7 = var15 + var8;
            var1.getPointerProperties(var7, var14);
            PointerCoords var18 = var12[var8];
            var1.getPointerCoords(var7, var18);
            var10 = this.b(es.i(var18.x, var18.y));
            var18.x = bci.b(var10);
            var18.y = bci.c(var10);
         }

         if (var5) {
            var6 = 0;
         } else {
            var6 = var1.getButtonState();
         }

         if (var1.getDownTime() == var1.getEventTime()) {
            var10 = var3;
         } else {
            var10 = var1.getDownTime();
         }

         var1 = MotionEvent.obtain(var10, var3, var2, var9, var13, var12, var1.getMetaState(), var6, var1.getXPrecision(), var1.getYPrecision(), var1.getDeviceId(), var1.getEdgeFlags(), var1.getSource(), var1.getFlags());
         bhh var16 = this.U;
         var1.getClass();
         blj var17 = var16.a(var1, this);
         var17.getClass();
         this.V.b(var17, this, true);
         var1.recycle();
      }
   }

   public final void r() {
      this.getLocationOnScreen(this.ae);
      long var5 = this.ad;
      int var3 = bxw.a(var5);
      int var1 = bxw.b(var5);
      int[] var7 = this.ae;
      boolean var4 = false;
      int var2 = var7[0];
      if (var3 != var2 || var1 != var7[1]) {
         this.ad = car.K(var2, var7[1]);
         if (var3 != Integer.MAX_VALUE && var1 != Integer.MAX_VALUE) {
            this.f.o.n.s();
            var4 = true;
         }
      }

      this.y.f(var4);
   }

   public final void s(bnd var1) {
      if (this.l != null) {
         Method var2 = bqc.a;
      }

      ebt var3 = this.J;
      var3.w();
      Object var5 = var3.b;
      WeakReference var4 = new WeakReference(var1, (ReferenceQueue)var3.a);
      ((axf)var5).p(var4);
   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }

   public final bpe v() {
      return (bpe)this.aj.a();
   }

   public final fwf w() {
      return (fwf)this.an.a();
   }
}
