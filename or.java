import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class or extends dn implements cmc, cnm, clr, cry, pd, po, cco, ccp, dh, di, cfl {
   private cnj a;
   private final CopyOnWriteArrayList b;
   private boolean c;
   private boolean d;
   private gfv e;
   final pf f = new pf();
   public final pc g;
   public final pn h;
   public final CopyOnWriteArrayList i;
   public final CopyOnWriteArrayList j;
   public final CopyOnWriteArrayList k;
   public final CopyOnWriteArrayList l;
   final oq m;
   public final clx n;
   final ebo o;
   final ebo p;
   public final ve q = new ve(new nj(this, 3));

   public or() {
      clx var1 = new clx(this);
      this.n = var1;
      ebo var2 = cbt.d(this);
      this.o = var2;
      this.g = new pc(new nj(this, 4, (byte[])null));
      oq var3 = new oq(this);
      this.m = var3;
      this.p = new ebo(var3);
      new AtomicInteger();
      this.h = new pn(this);
      this.b = new CopyOnWriteArrayList();
      this.i = new CopyOnWriteArrayList();
      this.j = new CopyOnWriteArrayList();
      this.k = new CopyOnWriteArrayList();
      this.l = new CopyOnWriteArrayList();
      this.c = false;
      this.d = false;
      var1.a(new oo(this, 0));
      var1.a(new oo(this, 2));
      var1.a(new oo(this, 3));
      var2.g();
      cnb.c(this);
      this.getSavedStateRegistry().b("android:support:activity-result", new cf(this, 3));
      this.k(new eg(this, 2));
   }

   // $FF: synthetic method
   public static void j(or var0) {
      var0.onBackPressed();
   }

   public void addContentView(View var1, LayoutParams var2) {
      this.m();
      this.m.a(this.getWindow().getDecorView());
      super.addContentView(var1, var2);
   }

   public final pn c() {
      throw null;
   }

   public final void d(cew var1) {
      this.b.add(var1);
   }

   public final void f(cew var1) {
      this.b.remove(var1);
   }

   public final cnp getDefaultViewModelCreationExtras() {
      cnr var1 = new cnr();
      if (this.getApplication() != null) {
         var1.b(cni.b, this.getApplication());
      }

      var1.b(cnb.a, this);
      var1.b(cnb.b, this);
      if (this.getIntent() != null && this.getIntent().getExtras() != null) {
         var1.b(cnb.c, this.getIntent().getExtras());
      }

      return var1;
   }

   public final cnj getDefaultViewModelProviderFactory() {
      if (this.a == null) {
         Application var2 = this.getApplication();
         Bundle var1;
         if (this.getIntent() != null) {
            var1 = this.getIntent().getExtras();
         } else {
            var1 = null;
         }

         this.a = new cne(var2, this, var1);
      }

      return this.a;
   }

   public final clx getLifecycle() {
      return this.n;
   }

   public final crx getSavedStateRegistry() {
      return (crx)this.o.b;
   }

   public final gfv getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging() {
      if (this.getApplication() != null) {
         this.l();
         return this.e;
      } else {
         throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
      }
   }

   public final void k(pg var1) {
      pf var2 = this.f;
      if (var2.b != null) {
         var1.a();
      }

      var2.a.add(var1);
   }

   final void l() {
      if (this.e == null) {
         pde var1 = (pde)this.getLastNonConfigurationInstance();
         if (var1 != null) {
            this.e = (gfv)var1.a;
         }

         if (this.e == null) {
            this.e = new gfv((byte[])null, (byte[])null, (byte[])null, (byte[])null);
         }
      }

   }

   public final void m() {
      car.d(this.getWindow().getDecorView(), this);
      car.b(this.getWindow().getDecorView(), this);
      cbu.f(this.getWindow().getDecorView(), this);
      gf.c(this.getWindow().getDecorView(), this);
      View var1 = this.getWindow().getDecorView();
      var1.getClass();
      var1.setTag(2131428089, this);
   }

   @Deprecated
   protected void onActivityResult(int var1, int var2, Intent var3) {
      if (!this.h.e(var1, var2, var3)) {
         super.onActivityResult(var1, var2, var3);
      }

   }

   @Deprecated
   public void onBackPressed() {
      this.g.c();
   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         ((cew)var2.next()).accept(var1);
      }

   }

   protected void onCreate(Bundle var1) {
      this.o.h(var1);
      pf var3 = this.f;
      var3.b = this;
      Iterator var4 = var3.a.iterator();

      while(var4.hasNext()) {
         ((pg)var4.next()).a();
      }

      super.onCreate(var1);
      cmv.a(this);
      int var2 = cdz.a;
      this.g.d(op.a(this));
   }

   public final boolean onCreatePanelMenu(int var1, Menu var2) {
      if (var1 == 0) {
         super.onCreatePanelMenu(0, var2);
         this.q.g(var2, this.getMenuInflater());
      }

      return true;
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         return var1 == 0 ? this.q.i(var2) : false;
      }
   }

   public final void onMultiWindowModeChanged(boolean var1) {
      if (!this.c) {
         Iterator var2 = this.k.iterator();

         while(var2.hasNext()) {
            ((cew)var2.next()).accept(new ntg(var1));
         }

      }
   }

   public final void onMultiWindowModeChanged(boolean var1, Configuration var2) {
      this.c = true;

      try {
         super.onMultiWindowModeChanged(var1, var2);
      } finally {
         this.c = false;
      }

      Iterator var5 = this.k.iterator();

      while(var5.hasNext()) {
         ((cew)var5.next()).accept(new ntg(var1));
      }

   }

   protected void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      Iterator var2 = this.j.iterator();

      while(var2.hasNext()) {
         ((cew)var2.next()).accept(var1);
      }

   }

   public final void onPanelClosed(int var1, Menu var2) {
      Iterator var3 = ((CopyOnWriteArrayList)this.q.a).iterator();

      while(var3.hasNext()) {
         ((cp)((AmbientMode$AmbientController)var3.next()).a).u(var2);
      }

      super.onPanelClosed(var1, var2);
   }

   public final void onPictureInPictureModeChanged(boolean var1) {
      if (!this.d) {
         Iterator var2 = this.l.iterator();

         while(var2.hasNext()) {
            ((cew)var2.next()).accept(new ntg(var1));
         }

      }
   }

   public final void onPictureInPictureModeChanged(boolean var1, Configuration var2) {
      this.d = true;

      try {
         super.onPictureInPictureModeChanged(var1, var2);
      } finally {
         this.d = false;
      }

      Iterator var5 = this.l.iterator();

      while(var5.hasNext()) {
         ((cew)var5.next()).accept(new ntg(var1));
      }

   }

   public final boolean onPreparePanel(int var1, View var2, Menu var3) {
      if (var1 == 0) {
         super.onPreparePanel(0, var2, var3);
         this.q.h(var3);
      }

      return true;
   }

   @Deprecated
   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      if (!this.h.e(var1, -1, (new Intent()).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", var2).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", var3))) {
         super.onRequestPermissionsResult(var1, var2, var3);
      }

   }

   public final Object onRetainNonConfigurationInstance() {
      gfv var2 = this.e;
      Object var1 = var2;
      if (var2 == null) {
         pde var3 = (pde)this.getLastNonConfigurationInstance();
         var1 = var2;
         if (var3 != null) {
            var1 = var3.a;
         }
      }

      if (var1 == null) {
         return null;
      } else {
         pde var4 = new pde();
         var4.a = var1;
         return var4;
      }
   }

   protected void onSaveInstanceState(Bundle var1) {
      clx var2 = this.n;
      if (var2 instanceof clx) {
         var2.d(clw.c);
      }

      super.onSaveInstanceState(var1);
      this.o.i(var1);
   }

   public final void onTrimMemory(int var1) {
      super.onTrimMemory(var1);
      Iterator var2 = this.i.iterator();

      while(var2.hasNext()) {
         ((cew)var2.next()).accept(var1);
      }

   }

   public final void reportFullyDrawn() {
      // $FF: Couldn't be decompiled
   }

   public void setContentView(int var1) {
      this.m();
      this.m.a(this.getWindow().getDecorView());
      super.setContentView(var1);
   }

   public void setContentView(View var1) {
      this.m();
      this.m.a(this.getWindow().getDecorView());
      super.setContentView(var1);
   }

   public void setContentView(View var1, LayoutParams var2) {
      this.m();
      this.m.a(this.getWindow().getDecorView());
      super.setContentView(var1, var2);
   }
}
