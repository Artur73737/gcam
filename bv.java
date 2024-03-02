import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;
import android.view.animation.Animation;
import com.google.android.apps.camera.contentprovider.Eboh.wAtBWCNpqMjxj;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;
import com.google.android.clockwork.common.wearable.wearmaterial.button.jKIE.tRYpVduhjf;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.xKbMW;
import com.google.googlex.gcam.base.HmAh.MBdHSCLVFh;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class bv implements ComponentCallbacks, OnCreateContextMenuListener, cmc, cnm, clr, cry {
   static final Object e = new Object();
   public cd A;
   public cp B;
   public bv C;
   public int D;
   public int E;
   public String F;
   public boolean G;
   public boolean H;
   public boolean I;
   boolean J;
   boolean K;
   boolean L;
   public boolean M;
   public ViewGroup N;
   public View O;
   public boolean P;
   public boolean Q;
   public br R;
   Handler S;
   Runnable T;
   public boolean U;
   public LayoutInflater V;
   public boolean W;
   public clw X;
   public df Y;
   public cml Z;
   private int a;
   cnj aa;
   public final AtomicInteger ab;
   public final ArrayList ac;
   public clx ad;
   ebo ae;
   private final bt b;
   public int f;
   public Bundle g;
   public SparseArray h;
   public Bundle i;
   public Boolean j;
   public String k;
   public Bundle l;
   public bv m;
   public String mPreviousWho;
   public String n;
   public int o;
   public Boolean p;
   public boolean q;
   public boolean r;
   public boolean s;
   public boolean t;
   public boolean u;
   public boolean v;
   public boolean w;
   public boolean x;
   public int y;
   public cp z;

   public bv() {
      this.f = -1;
      this.k = UUID.randomUUID().toString();
      this.n = null;
      this.p = null;
      this.B = new cp();
      this.L = true;
      this.Q = true;
      this.T = new bl(this, 2, (byte[])null);
      this.X = clw.e;
      this.Z = new cml();
      this.ab = new AtomicInteger();
      this.ac = new ArrayList();
      this.b = new bn(this);
      this.A();
   }

   public bv(int var1) {
      this();
      this.a = var1;
   }

   private final void A() {
      this.ad = new clx(this);
      this.ae = cbt.d(this);
      this.aa = null;
      if (!this.ac.contains(this.b)) {
         this.B(this.b);
      }

   }

   private final void B(bt var1) {
      if (this.f >= 0) {
         var1.a();
      } else {
         this.ac.add(var1);
      }
   }

   private final int c() {
      return this.X != clw.b && this.C != null ? Math.min(this.X.ordinal(), this.C.c()) : this.X.ordinal();
   }

   private final bv d(boolean var1) {
      if (var1) {
         ckv var2 = new ckv(this);
         ckr.d(var2);
         ckq var3 = ckr.b(this);
         if (var3.b.contains(ckp.h) && ckr.e(var3, this.getClass(), var2.getClass())) {
            ckr.c(var3, var2);
         }
      }

      bv var4 = this.m;
      if (var4 != null) {
         return var4;
      } else {
         cp var6 = this.z;
         if (var6 != null) {
            String var5 = this.n;
            if (var5 != null) {
               return var6.c(var5);
            }
         }

         return null;
      }
   }

   @Deprecated
   public static bv instantiate(Context var0, String var1) {
      return instantiate(var0, var1, (Bundle)null);
   }

   @Deprecated
   public static bv instantiate(Context param0, String param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   private final pj z(pr var1, qi var2, pi var3) {
      if (this.f <= 1) {
         this.B(new bq(this, var2, new AtomicReference(), var1, var3));
         return new bm();
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
      }
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mFragmentId=#");
      var3.print(Integer.toHexString(this.D));
      var3.print(" mContainerId=#");
      var3.print(Integer.toHexString(this.E));
      var3.print(" mTag=");
      var3.println(this.F);
      var3.print(var1);
      var3.print("mState=");
      var3.print(this.f);
      var3.print(" mWho=");
      var3.print(this.k);
      var3.print(" mBackStackNesting=");
      var3.println(this.y);
      var3.print(var1);
      var3.print("mAdded=");
      var3.print(this.q);
      var3.print(" mRemoving=");
      var3.print(this.r);
      var3.print(" mFromLayout=");
      var3.print(this.u);
      var3.print(tRYpVduhjf.fwLJHCIUE);
      var3.println(this.v);
      var3.print(var1);
      var3.print("mHidden=");
      var3.print(this.G);
      var3.print(" mDetached=");
      var3.print(this.H);
      var3.print(" mMenuVisible=");
      var3.print(this.L);
      var3.print(" mHasMenu=");
      var3.println(this.K);
      var3.print(var1);
      var3.print("mRetainInstance=");
      var3.print(this.I);
      var3.print(" mUserVisibleHint=");
      var3.println(this.Q);
      if (this.z != null) {
         var3.print(var1);
         var3.print("mFragmentManager=");
         var3.println(this.z);
      }

      if (this.A != null) {
         var3.print(var1);
         var3.print("mHost=");
         var3.println(this.A);
      }

      if (this.C != null) {
         var3.print(var1);
         var3.print("mParentFragment=");
         var3.println(this.C);
      }

      if (this.l != null) {
         var3.print(var1);
         var3.print("mArguments=");
         var3.println(this.l);
      }

      if (this.g != null) {
         var3.print(var1);
         var3.print("mSavedFragmentState=");
         var3.println(this.g);
      }

      if (this.h != null) {
         var3.print(var1);
         var3.print(gKVNpqGY.KvzUHyOd);
         var3.println(this.h);
      }

      if (this.i != null) {
         var3.print(var1);
         var3.print("mSavedViewRegistryState=");
         var3.println(this.i);
      }

      bv var5 = this.d(false);
      if (var5 != null) {
         var3.print(var1);
         var3.print("mTarget=");
         var3.print(var5);
         var3.print(" mTargetRequestCode=");
         var3.println(this.o);
      }

      var3.print(var1);
      var3.print("mPopDirection=");
      var3.println(this.v());
      if (this.e() != 0) {
         var3.print(var1);
         var3.print("getEnterAnim=");
         var3.println(this.e());
      }

      if (this.f() != 0) {
         var3.print(var1);
         var3.print("getExitAnim=");
         var3.println(this.f());
      }

      if (this.g() != 0) {
         var3.print(var1);
         var3.print("getPopEnterAnim=");
         var3.println(this.g());
      }

      if (this.h() != 0) {
         var3.print(var1);
         var3.print("getPopExitAnim=");
         var3.println(this.h());
      }

      if (this.N != null) {
         var3.print(var1);
         var3.print("mContainer=");
         var3.println(this.N);
      }

      if (this.O != null) {
         var3.print(var1);
         var3.print("mView=");
         var3.println(this.O);
      }

      if (this.getContext() != null) {
         cnt.a(this).c(var1, var3);
      }

      var3.print(var1);
      StringBuilder var6 = new StringBuilder();
      var6.append("Child ");
      var6.append(this.B);
      var6.append(":");
      var3.println(var6.toString());
      this.B.C(String.valueOf(var1).concat("  "), var2, var3, var4);
   }

   public final int e() {
      br var1 = this.R;
      return var1 == null ? 0 : var1.b;
   }

   public final int f() {
      br var1 = this.R;
      return var1 == null ? 0 : var1.c;
   }

   public final int g() {
      br var1 = this.R;
      return var1 == null ? 0 : var1.d;
   }

   public final by getActivity() {
      cd var1 = this.A;
      return var1 == null ? null : (by)var1.b;
   }

   public final boolean getAllowEnterTransitionOverlap() {
      br var1 = this.R;
      if (var1 != null) {
         Boolean var2 = var1.p;
         if (var2 != null) {
            return var2;
         }
      }

      return true;
   }

   public final boolean getAllowReturnTransitionOverlap() {
      br var1 = this.R;
      if (var1 != null) {
         Boolean var2 = var1.o;
         if (var2 != null) {
            return var2;
         }
      }

      return true;
   }

   public final Bundle getArguments() {
      return this.l;
   }

   public final cp getChildFragmentManager() {
      if (this.A != null) {
         return this.B;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " has not been attached yet."));
      }
   }

   public final Context getContext() {
      cd var1 = this.A;
      return var1 == null ? null : var1.c;
   }

   public final cnp getDefaultViewModelCreationExtras() {
      Context var1 = this.requireContext().getApplicationContext();

      Application var3;
      while(true) {
         if (!(var1 instanceof ContextWrapper)) {
            var3 = null;
            break;
         }

         if (var1 instanceof Application) {
            var3 = (Application)var1;
            break;
         }

         var1 = ((ContextWrapper)var1).getBaseContext();
      }

      if (var3 == null && cp.S(3)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Could not find Application instance from Context ");
         var2.append(this.requireContext().getApplicationContext());
         var2.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
      }

      cnr var4 = new cnr();
      if (var3 != null) {
         var4.b(cni.b, var3);
      }

      var4.b(cnb.a, this);
      var4.b(cnb.b, this);
      Bundle var5 = this.l;
      if (var5 != null) {
         var4.b(cnb.c, var5);
      }

      return var4;
   }

   public final cnj getDefaultViewModelProviderFactory() {
      if (this.z == null) {
         IllegalStateException var4 = new IllegalStateException("Can't access ViewModels from detached fragment");
         throw var4;
      } else {
         if (this.aa == null) {
            Context var1 = this.requireContext().getApplicationContext();

            Application var3;
            while(true) {
               if (!(var1 instanceof ContextWrapper)) {
                  var3 = null;
                  break;
               }

               if (var1 instanceof Application) {
                  var3 = (Application)var1;
                  break;
               }

               var1 = ((ContextWrapper)var1).getBaseContext();
            }

            if (var3 == null && cp.S(3)) {
               StringBuilder var2 = new StringBuilder();
               var2.append("Could not find Application instance from Context ");
               var2.append(this.requireContext().getApplicationContext());
               var2.append(MBdHSCLVFh.ulYCLlazrpOkoEr);
            }

            this.aa = new cne(var3, this, this.l);
         }

         return this.aa;
      }
   }

   public final Object getEnterTransition() {
      br var1 = this.R;
      return var1 == null ? null : var1.i;
   }

   public final Object getExitTransition() {
      br var1 = this.R;
      return var1 == null ? null : var1.k;
   }

   @Deprecated
   public final cp getFragmentManager() {
      return this.z;
   }

   public final Object getHost() {
      cd var1 = this.A;
      return var1 == null ? null : ((bx)var1).a;
   }

   public final int getId() {
      return this.D;
   }

   public final LayoutInflater getLayoutInflater() {
      LayoutInflater var2 = this.V;
      LayoutInflater var1 = var2;
      if (var2 == null) {
         var1 = this.j((Bundle)null);
      }

      return var1;
   }

   @Deprecated
   public final LayoutInflater getLayoutInflater(Bundle var1) {
      cd var2 = this.A;
      if (var2 != null) {
         bx var3 = (bx)var2;
         LayoutInflater var4 = var3.a.getLayoutInflater().cloneInContext(var3.a);
         var4.setFactory2(this.B.c);
         return var4;
      } else {
         throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
      }
   }

   public final clx getLifecycle() {
      return this.ad;
   }

   @Deprecated
   public final cnt getLoaderManager() {
      return cnt.a(this);
   }

   public final bv getParentFragment() {
      return this.C;
   }

   public final cp getParentFragmentManager() {
      cp var1 = this.z;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not associated with a fragment manager."));
      }
   }

   public final Object getReenterTransition() {
      br var1 = this.R;
      if (var1 == null) {
         return null;
      } else {
         Object var2 = var1.l;
         Object var3 = var2;
         if (var2 == e) {
            var3 = this.getExitTransition();
         }

         return var3;
      }
   }

   public final Resources getResources() {
      return this.requireContext().getResources();
   }

   @Deprecated
   public final boolean getRetainInstance() {
      ckt var2 = new ckt(this);
      ckr.d(var2);
      ckq var1 = ckr.b(this);
      if (var1.b.contains(ckp.f) && ckr.e(var1, this.getClass(), var2.getClass())) {
         ckr.c(var1, var2);
      }

      return this.I;
   }

   public final Object getReturnTransition() {
      br var1 = this.R;
      if (var1 == null) {
         return null;
      } else {
         Object var2 = var1.j;
         Object var3 = var2;
         if (var2 == e) {
            var3 = this.getEnterTransition();
         }

         return var3;
      }
   }

   public final crx getSavedStateRegistry() {
      return (crx)this.ae.b;
   }

   public final Object getSharedElementEnterTransition() {
      br var1 = this.R;
      return var1 == null ? null : var1.m;
   }

   public final Object getSharedElementReturnTransition() {
      br var1 = this.R;
      if (var1 == null) {
         return null;
      } else {
         Object var2 = var1.n;
         Object var3 = var2;
         if (var2 == e) {
            var3 = this.getSharedElementEnterTransition();
         }

         return var3;
      }
   }

   public final String getString(int var1) {
      return this.getResources().getString(var1);
   }

   public final String getString(int var1, Object... var2) {
      return this.getResources().getString(var1, var2);
   }

   public final String getTag() {
      return this.F;
   }

   @Deprecated
   public final bv getTargetFragment() {
      return this.d(true);
   }

   @Deprecated
   public final int getTargetRequestCode() {
      cku var2 = new cku(this);
      ckr.d(var2);
      ckq var1 = ckr.b(this);
      if (var1.b.contains(ckp.h) && ckr.e(var1, this.getClass(), var2.getClass())) {
         ckr.c(var1, var2);
      }

      return this.o;
   }

   public final CharSequence getText(int var1) {
      return this.getResources().getText(var1);
   }

   @Deprecated
   public final boolean getUserVisibleHint() {
      return this.Q;
   }

   public final View getView() {
      return this.O;
   }

   public final cmc getViewLifecycleOwner() {
      df var1 = this.Y;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
      }
   }

   public final cmk getViewLifecycleOwnerLiveData() {
      return this.Z;
   }

   public final gfv getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging() {
      if (this.z != null) {
         if (this.c() != clw.b.ordinal()) {
            cr var3 = this.z.u;
            gfv var2 = (gfv)var3.d.get(this.k);
            gfv var1 = var2;
            if (var2 == null) {
               var1 = new gfv((byte[])null, (byte[])null, (byte[])null, (byte[])null);
               var3.d.put(this.k, var1);
            }

            return var1;
         } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
         }
      } else {
         throw new IllegalStateException("Can't access ViewModels from detached fragment");
      }
   }

   public ca gf() {
      return new bo(this);
   }

   public void gg(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      this.B.H();
      this.x = true;
      this.Y = new df(this, this.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging(), new bl(this, 0));
      View var4 = this.onCreateView(var1, var2, var3);
      this.O = var4;
      if (var4 != null) {
         this.Y.b();
         if (cp.S(3)) {
            StringBuilder var5 = new StringBuilder();
            var5.append("Setting ViewLifecycleOwner on View ");
            var5.append(this.O);
            var5.append(" for Fragment ");
            var5.append(this);
         }

         car.d(this.O, this.Y);
         car.b(this.O, this.Y);
         cbu.f(this.O, this.Y);
         this.Z.h(this.Y);
      } else if (this.Y.a == null) {
         this.Y = null;
      } else {
         throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
      }
   }

   public final int h() {
      br var1 = this.R;
      return var1 == null ? 0 : var1.e;
   }

   public final boolean hasOptionsMenu() {
      return this.K;
   }

   public final br i() {
      if (this.R == null) {
         this.R = new br();
      }

      return this.R;
   }

   public final boolean isAdded() {
      return this.A != null && this.q;
   }

   public final boolean isDetached() {
      return this.H;
   }

   public final boolean isHidden() {
      boolean var3 = this.G;
      boolean var2 = true;
      boolean var1 = var2;
      if (!var3) {
         if (this.z != null) {
            bv var4 = this.C;
            if (var4 == null || !var4.isHidden()) {
               return false;
            }

            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public final boolean isInLayout() {
      return this.v;
   }

   public final boolean isMenuVisible() {
      boolean var3 = this.L;
      boolean var2 = false;
      boolean var1 = var2;
      if (var3) {
         if (this.z != null) {
            if (cp.Y(this.C)) {
               return true;
            }

            var1 = var2;
         } else {
            var1 = true;
         }
      }

      return var1;
   }

   public final boolean isRemoving() {
      return this.r;
   }

   public final boolean isResumed() {
      return this.f >= 7;
   }

   public final boolean isStateSaved() {
      cp var1 = this.z;
      return var1 == null ? false : var1.V();
   }

   public final boolean isVisible() {
      if (this.isAdded() && !this.isHidden()) {
         View var1 = this.O;
         if (var1 != null && var1.getWindowToken() != null && this.O.getVisibility() == 0) {
            return true;
         }
      }

      return false;
   }

   public final LayoutInflater j(Bundle var1) {
      LayoutInflater var2 = this.onGetLayoutInflater(var1);
      this.V = var2;
      return var2;
   }

   final ArrayList k() {
      br var1 = this.R;
      if (var1 != null) {
         ArrayList var2 = var1.g;
         if (var2 != null) {
            return var2;
         }
      }

      return new ArrayList();
   }

   final ArrayList l() {
      br var1 = this.R;
      if (var1 != null) {
         ArrayList var2 = var1.h;
         if (var2 != null) {
            return var2;
         }
      }

      return new ArrayList();
   }

   final void m(boolean var1) {
      br var2 = this.R;
      if (var2 != null) {
         var2.s = false;
      }

      if (this.O != null) {
         ViewGroup var3 = this.N;
         if (var3 != null) {
            cp var4 = this.z;
            if (var4 != null) {
               dl var5 = dl.b(var3, var4);
               var5.e();
               if (var1) {
                  this.A.d.post(new bl(var5, 4, (byte[])null));
               } else {
                  var5.c();
               }

               Handler var6 = this.S;
               if (var6 != null) {
                  var6.removeCallbacks(this.T);
                  this.S = null;
                  return;
               }
            }
         }
      }

   }

   public final void n() {
      this.A();
      this.mPreviousWho = this.k;
      this.k = UUID.randomUUID().toString();
      this.q = false;
      this.r = false;
      this.u = false;
      this.v = false;
      this.w = false;
      this.y = 0;
      this.z = null;
      this.B = new cp();
      this.A = null;
      this.D = 0;
      this.E = 0;
      this.F = null;
      this.G = false;
      this.H = false;
   }

   public final void o() {
      Bundle var1 = this.g;
      if (var1 != null) {
         var1 = var1.getBundle("savedInstanceState");
      } else {
         var1 = null;
      }

      this.onViewCreated(this.O, var1);
      this.B.A(2);
   }

   @Deprecated
   public void onActivityCreated(Bundle var1) {
      this.M = true;
   }

   @Deprecated
   public void onActivityResult(int var1, int var2, Intent var3) {
      if (cp.S(2)) {
         StringBuilder var4 = new StringBuilder();
         var4.append("Fragment ");
         var4.append(this);
         var4.append(" received the following in onActivityResult(): requestCode: ");
         var4.append(var1);
         var4.append(" resultCode: ");
         var4.append(var2);
         var4.append(" data: ");
         var4.append(var3);
      }

   }

   @Deprecated
   public final void onAttach(Activity var1) {
      this.M = true;
   }

   public void onAttach(Context var1) {
      this.M = true;
      cd var2 = this.A;
      Activity var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.b;
      }

      if (var3 != null) {
         this.M = true;
      }

   }

   @Deprecated
   public final void onAttachFragment(bv var1) {
   }

   public final void onConfigurationChanged(Configuration var1) {
      this.M = true;
   }

   public final boolean onContextItemSelected(MenuItem var1) {
      return false;
   }

   public void onCreate(Bundle var1) {
      this.M = true;
      this.p();
      cp var2 = this.B;
      if (var2.h <= 0) {
         var2.p();
      }
   }

   public final Animation onCreateAnimation(int var1, boolean var2, int var3) {
      return null;
   }

   public final Animator onCreateAnimator(int var1, boolean var2, int var3) {
      return null;
   }

   public final void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      this.requireActivity().onCreateContextMenu(var1, var2, var3);
   }

   @Deprecated
   public final void onCreateOptionsMenu(Menu var1, MenuInflater var2) {
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      int var4 = this.a;
      return var4 != 0 ? var1.inflate(var4, var2, false) : null;
   }

   public void onDestroy() {
      this.M = true;
   }

   @Deprecated
   public final void onDestroyOptionsMenu() {
   }

   public void onDestroyView() {
      this.M = true;
   }

   public void onDetach() {
      this.M = true;
   }

   public LayoutInflater onGetLayoutInflater(Bundle var1) {
      return this.getLayoutInflater(var1);
   }

   public final void onHiddenChanged(boolean var1) {
   }

   @Deprecated
   public final void onInflate(Activity var1, AttributeSet var2, Bundle var3) {
      this.M = true;
   }

   public final void onInflate(Context var1, AttributeSet var2, Bundle var3) {
      this.M = true;
      cd var4 = this.A;
      Activity var5;
      if (var4 == null) {
         var5 = null;
      } else {
         var5 = var4.b;
      }

      if (var5 != null) {
         this.M = true;
      }

   }

   public final void onLowMemory() {
      this.M = true;
   }

   public final void onMultiWindowModeChanged(boolean var1) {
   }

   @Deprecated
   public final boolean onOptionsItemSelected(MenuItem var1) {
      return false;
   }

   @Deprecated
   public final void onOptionsMenuClosed(Menu var1) {
   }

   public void onPause() {
      this.M = true;
   }

   public final void onPictureInPictureModeChanged(boolean var1) {
   }

   @Deprecated
   public final void onPrepareOptionsMenu(Menu var1) {
   }

   public final void onPrimaryNavigationFragmentChanged(boolean var1) {
   }

   @Deprecated
   public final void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
   }

   public void onResume() {
      this.M = true;
   }

   public void onSaveInstanceState(Bundle var1) {
   }

   public void onStart() {
      this.M = true;
   }

   public void onStop() {
      this.M = true;
   }

   public void onViewCreated(View var1, Bundle var2) {
   }

   public void onViewStateRestored(Bundle var1) {
      this.M = true;
   }

   public final void p() {
      Bundle var1 = this.g;
      if (var1 != null) {
         var1 = var1.getBundle("childFragmentManager");
         if (var1 != null) {
            this.B.J(var1);
            this.B.p();
         }
      }

   }

   public final void postponeEnterTransition() {
      this.i().s = true;
   }

   public final void postponeEnterTransition(long var1, TimeUnit var3) {
      this.i().s = true;
      Handler var4 = this.S;
      if (var4 != null) {
         var4.removeCallbacks(this.T);
      }

      cp var5 = this.z;
      if (var5 != null) {
         this.S = var5.i.d;
      } else {
         this.S = new Handler(Looper.getMainLooper());
      }

      this.S.removeCallbacks(this.T);
      this.S.postDelayed(this.T, var3.toMillis(var1));
   }

   public final void q(int var1, int var2, int var3, int var4) {
      int var6 = var1;
      int var5 = var2;
      int var7 = var3;
      if (this.R == null) {
         var6 = var1;
         var5 = var2;
         var7 = var3;
         if (var1 == 0) {
            var6 = 0;
            if (var2 == 0) {
               if (var3 == 0) {
                  if (var4 == 0) {
                     return;
                  }

                  var5 = 0;
                  var7 = 0;
               } else {
                  var5 = 0;
                  var7 = var3;
               }
            } else {
               var7 = var3;
               var5 = var2;
            }
         }
      }

      this.i().b = var6;
      this.i().c = var5;
      this.i().d = var7;
      this.i().e = var4;
   }

   public final void r(View var1) {
      this.i().r = var1;
   }

   public final pj registerForActivityResult(pr var1, pi var2) {
      return this.z(var1, new bp(this, 1), var2);
   }

   public final pj registerForActivityResult(pr var1, pn var2, pi var3) {
      return this.z(var1, new bp(var2, 0), var3);
   }

   public final void registerForContextMenu(View var1) {
      var1.setOnCreateContextMenuListener(this);
   }

   @Deprecated
   public final void requestPermissions(String[] var1, int var2) {
      if (this.A != null) {
         cp var3 = this.getParentFragmentManager();
         if (var3.o != null) {
            cm var4 = new cm(this.k, var2);
            var3.p.addLast(var4);
            var3.o.b(var1);
         }

      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to Activity"));
      }
   }

   public final by requireActivity() {
      by var1 = this.getActivity();
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to an activity."));
      }
   }

   public final Bundle requireArguments() {
      Bundle var1 = this.l;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " does not have any arguments."));
      }
   }

   public final Context requireContext() {
      Context var1 = this.getContext();
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to a context."));
      }
   }

   @Deprecated
   public final cp requireFragmentManager() {
      return this.getParentFragmentManager();
   }

   public final Object requireHost() {
      Object var1 = this.getHost();
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to a host."));
      }
   }

   public final bv requireParentFragment() {
      bv var1 = this.C;
      if (var1 == null) {
         if (this.getContext() == null) {
            throw new IllegalStateException(c.aF(this, "Fragment ", " is not attached to any Fragment or host"));
         } else {
            StringBuilder var2 = new StringBuilder();
            var2.append("Fragment ");
            var2.append(this);
            var2.append(" is not a child Fragment, it is directly attached to ");
            var2.append(this.getContext());
            throw new IllegalStateException(var2.toString());
         }
      } else {
         return var1;
      }
   }

   public final View requireView() {
      View var1 = this.O;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
      }
   }

   final void s(int var1) {
      if (this.R != null || var1 != 0) {
         this.i();
         this.R.f = var1;
      }
   }

   public final void setAllowEnterTransitionOverlap(boolean var1) {
      this.i().p = var1;
   }

   public final void setAllowReturnTransitionOverlap(boolean var1) {
      this.i().o = var1;
   }

   public final void setArguments(Bundle var1) {
      cp var2 = this.z;
      if (var2 != null && var2.V()) {
         throw new IllegalStateException("Fragment already added and state has been saved");
      } else {
         this.l = var1;
      }
   }

   public final void setEnterSharedElementCallback$ar$class_merging(cbg var1) {
      this.i().t = var1;
   }

   public final void setEnterTransition(Object var1) {
      this.i().i = var1;
   }

   public final void setExitSharedElementCallback$ar$class_merging(cbg var1) {
      this.i().u = var1;
   }

   public final void setExitTransition(Object var1) {
      this.i().k = var1;
   }

   @Deprecated
   public final void setHasOptionsMenu(boolean var1) {
      if (this.K != var1) {
         this.K = var1;
         if (this.isAdded() && !this.isHidden()) {
            this.A.e();
         }
      }

   }

   public final void setInitialSavedState(bu var1) {
      if (this.z == null) {
         Object var3 = null;
         Bundle var2 = (Bundle)var3;
         if (var1 != null) {
            var2 = var1.a;
            if (var2 == null) {
               var2 = (Bundle)var3;
            }
         }

         this.g = var2;
      } else {
         throw new IllegalStateException("Fragment already added");
      }
   }

   public final void setMenuVisibility(boolean var1) {
      if (this.L != var1) {
         this.L = var1;
         if (this.K && this.isAdded() && !this.isHidden()) {
            this.A.e();
         }
      }

   }

   public final void setReenterTransition(Object var1) {
      this.i().l = var1;
   }

   @Deprecated
   public final void setRetainInstance(boolean var1) {
      ckx var2 = new ckx(this);
      ckr.d(var2);
      ckq var3 = ckr.b(this);
      if (var3.b.contains(ckp.f) && ckr.e(var3, this.getClass(), var2.getClass())) {
         ckr.c(var3, var2);
      }

      this.I = var1;
      cp var4 = this.z;
      if (var4 != null) {
         if (var1) {
            var4.u.a(this);
         } else {
            var4.u.e(this);
         }
      } else {
         this.J = true;
      }
   }

   public final void setReturnTransition(Object var1) {
      this.i().j = var1;
   }

   public final void setSharedElementEnterTransition(Object var1) {
      this.i().m = var1;
   }

   public final void setSharedElementReturnTransition(Object var1) {
      this.i().n = var1;
   }

   @Deprecated
   public final void setTargetFragment(bv var1, int var2) {
      if (var1 != null) {
         cky var4 = new cky(this, var1, var2);
         ckr.d(var4);
         ckq var3 = ckr.b(this);
         if (var3.b.contains(ckp.h) && ckr.e(var3, this.getClass(), var4.getClass())) {
            ckr.c(var3, var4);
         }
      }

      cp var6 = this.z;
      cp var5;
      if (var1 != null) {
         var5 = var1.z;
      } else {
         var5 = null;
      }

      if (var6 != null && var5 != null && var6 != var5) {
         throw new IllegalArgumentException(c.aF(var1, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
      } else {
         for(bv var7 = var1; var7 != null; var7 = var7.d(false)) {
            if (var7.equals(this)) {
               StringBuilder var8 = new StringBuilder();
               var8.append("Setting ");
               var8.append(var1);
               var8.append(RbaSbznIXS.fONboSquEv);
               var8.append(this);
               var8.append(" would create a target cycle");
               throw new IllegalArgumentException(var8.toString());
            }
         }

         label60: {
            if (var1 == null) {
               this.n = null;
            } else {
               if (this.z == null || var1.z == null) {
                  this.n = null;
                  this.m = var1;
                  break label60;
               }

               this.n = var1.k;
            }

            this.m = null;
         }

         this.o = var2;
      }
   }

   @Deprecated
   public final void setUserVisibleHint(boolean var1) {
      ckz var5 = new ckz(this, var1);
      ckr.d(var5);
      ckq var4 = ckr.b(this);
      if (var4.b.contains(ckp.g) && ckr.e(var4, this.getClass(), var5.getClass())) {
         ckr.c(var4, var5);
      }

      if (!this.Q && var1 && this.f < 5) {
         cp var6 = this.z;
         if (var6 != null && this.isAdded() && this.W) {
            var6.ae(var6.ad(this));
         }
      }

      this.Q = var1;
      int var2 = this.f;
      boolean var3 = false;
      if (var2 < 5 && !var1) {
         var3 = true;
      }

      this.P = var3;
      if (this.g != null) {
         this.j = var1;
      }

   }

   public final boolean shouldShowRequestPermissionRationale(String var1) {
      cd var2 = this.A;
      return var2 != null ? cbi.a(((bx)var2).a, var1) : false;
   }

   public final void startActivity(Intent var1) {
      cd var2 = this.A;
      if (var2 != null) {
         var2.h(var1, -1, (Bundle)null);
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", wAtBWCNpqMjxj.tPkgKmeu));
      }
   }

   public final void startActivity(Intent var1, Bundle var2) {
      cd var3 = this.A;
      if (var3 != null) {
         var3.h(var1, -1, var2);
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to Activity"));
      }
   }

   @Deprecated
   public final void startActivityForResult(Intent var1, int var2) {
      if (this.A != null) {
         cp var4 = this.getParentFragmentManager();
         if (var4.m != null) {
            cm var3 = new cm(this.k, var2);
            var4.p.addLast(var3);
            var4.m.b(var1);
         } else {
            var4.i.h(var1, var2, (Bundle)null);
         }
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to Activity"));
      }
   }

   @Deprecated
   public final void startActivityForResult(Intent var1, int var2, Bundle var3) {
      if (this.A != null) {
         cp var5 = this.getParentFragmentManager();
         if (var5.m != null) {
            cm var4 = new cm(this.k, var2);
            var5.p.addLast(var4);
            if (var3 != null) {
               var1.putExtra(xKbMW.luiQIhESQIBOb, var3);
            }

            var5.m.b(var1);
         } else {
            var5.i.h(var1, var2, var3);
         }
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to Activity"));
      }
   }

   @Deprecated
   public final void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7) {
      Intent var8 = var3;
      if (this.A != null) {
         if (cp.S(2)) {
            StringBuilder var9 = new StringBuilder();
            var9.append("Fragment ");
            var9.append(this);
            var9.append(" received the following in startIntentSenderForResult() requestCode: ");
            var9.append(var2);
            var9.append(" IntentSender: ");
            var9.append(var1);
            var9.append(" fillInIntent: ");
            var9.append(var3);
            var9.append(" options: ");
            var9.append(var7);
         }

         cp var16 = this.getParentFragmentManager();
         if (var16.n != null) {
            var3 = var3;
            if (var7 != null) {
               var3 = var8;
               if (var8 == null) {
                  var3 = new Intent();
                  var3.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
               }

               if (cp.S(2)) {
                  StringBuilder var15 = new StringBuilder();
                  var15.append("ActivityOptions ");
                  var15.append(var7);
                  var15.append(" were added to fillInIntent ");
                  var15.append(var3);
                  var15.append(" for fragment ");
                  var15.append(this);
               }

               var3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", var7);
            }

            pp var10 = new pp(var1);
            var10.a = var3;
            var10.b(var5, var4);
            pq var11 = var10.a();
            cm var12 = new cm(this.k, var2);
            var16.p.addLast(var12);
            if (cp.S(2)) {
               StringBuilder var13 = new StringBuilder();
               var13.append("Fragment ");
               var13.append(this);
               var13.append("is launching an IntentSender for result ");
            }

            var16.n.b(var11);
         } else {
            cd var14 = var16.i;
            if (var2 == -1) {
               cbg.c(var14.b, var1, -1, var3, var4, var5, var6, var7);
            } else {
               throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
         }
      } else {
         throw new IllegalStateException(c.aF(this, "Fragment ", " not attached to Activity"));
      }
   }

   public final void startPostponedEnterTransition() {
      if (this.R != null && this.i().s) {
         if (this.A == null) {
            this.i().s = false;
         } else if (Looper.myLooper() != this.A.d.getLooper()) {
            this.A.d.postAtFrontOfQueue(new bl(this, 3, (byte[])null));
         } else {
            this.m(true);
         }
      }
   }

   final void t(boolean var1) {
      if (this.R != null) {
         this.i().a = var1;
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append(this.getClass().getSimpleName());
      var1.append("{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append("} (");
      var1.append(this.k);
      if (this.D != 0) {
         var1.append(" id=0x");
         var1.append(Integer.toHexString(this.D));
      }

      if (this.F != null) {
         var1.append(" tag=");
         var1.append(this.F);
      }

      var1.append(")");
      return var1.toString();
   }

   final void u(ArrayList var1, ArrayList var2) {
      this.i();
      br var3 = this.R;
      var3.g = var1;
      var3.h = var2;
   }

   public final void unregisterForContextMenu(View var1) {
      var1.setOnCreateContextMenuListener((OnCreateContextMenuListener)null);
   }

   final boolean v() {
      br var1 = this.R;
      return var1 == null ? false : var1.a;
   }

   public final boolean w() {
      return this.y > 0;
   }

   final cbg x() {
      br var1 = this.R;
      return var1 == null ? null : var1.t;
   }

   final cbg y() {
      br var1 = this.R;
      return var1 == null ? null : var1.u;
   }
}
