import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import java.util.function.Consumer;

public class hhb extends eh {
   private int r;
   private ot s;
   public final hfx y = new hfx();
   protected final hdp z = new hdp();

   private final void n() {
      --this.r;
   }

   private final void o() {
      int var1 = this.r++;
      if (var1 == 0) {
         this.y.b(new gmm(5));
      }

   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      return (Boolean)this.y.a(new hfv(0), false) ? true : super.dispatchKeyEvent(var1);
   }

   public final boolean dispatchTouchEvent(MotionEvent var1) {
      return (Boolean)this.y.a(new hfr(var1), false) ? true : super.dispatchTouchEvent(var1);
   }

   public final void finish() {
      this.y.b(gmm.h);
      super.finish();
   }

   public final void onActionModeFinished(ActionMode var1) {
      this.y.b(gmm.e);
      super.onActionModeFinished(var1);
   }

   public final void onActionModeStarted(ActionMode var1) {
      this.y.b(gmm.g);
      super.onActionModeStarted(var1);
   }

   protected final void onActivityResult(int var1, int var2, Intent var3) {
      this.y.b(new hgi(var1, var2));
      super.onActivityResult(var1, var2, var3);
   }

   public final void onAttachedToWindow() {
      hfx var2 = this.y;
      hfq var1 = hfq.a;
      var2.d(var1);
      var2.d = var1;
      super.onAttachedToWindow();
   }

   public final void onConfigurationChanged(Configuration var1) {
      this.y.b(new ewy(var1, 18));
      super.onConfigurationChanged(var1);
   }

   public final boolean onContextItemSelected(MenuItem var1) {
      return (Boolean)this.y.a(new hfv(3), false);
   }

   protected void onCreate(Bundle var1) {
      this.z.f();
      hfx var3 = this.y;
      hfw var2 = new hfw(var3, var1, 2);
      var3.d(var2);
      var3.h = var2;
      super.onCreate(var1);
      this.z.e();
      this.s = new hha(this);
      super.g.b(this.s);
   }

   public final void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      super.onCreateContextMenu(var1, var2, var3);
      this.y.b(new gmm(12));
   }

   public final boolean onCreateOptionsMenu(Menu var1) {
      return (Boolean)this.y.a(new hfv(5), false) ? true : super.onCreateOptionsMenu(var1);
   }

   protected void onDestroy() {
      this.z.h();
      hfx var1 = this.y;
      var1.c(var1.b);
      var1.c(var1.a);
      var1.c(var1.k);
      var1.c(var1.h);
      var1.b(gmm.i);
      super.onDestroy();
      this.z.g();
   }

   public final void onDetachedFromWindow() {
      hfx var1 = this.y;
      var1.c(var1.d);
      var1.b(gmm.d);
      super.onDetachedFromWindow();
   }

   public final void onGetDirectActions(CancellationSignal var1, Consumer var2) {
      this.y.b(new gmm(10));
   }

   public final boolean onKeyDown(int var1, KeyEvent var2) {
      return (Boolean)this.y.a(new hft(var1, var2), false) ? true : super.onKeyDown(var1, var2);
   }

   public final boolean onKeyUp(int var1, KeyEvent var2) {
      return (Boolean)this.y.a(new hfu(var1), false) ? true : super.onKeyUp(var1, var2);
   }

   public final void onLowMemory() {
      this.y.b(gmm.j);
      super.onLowMemory();
   }

   protected void onNewIntent(Intent var1) {
      this.y.b(new ewy(var1, 17));
      super.onNewIntent(var1);
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      return (Boolean)this.y.a(new hfv(4), false) ? true : super.onOptionsItemSelected(var1);
   }

   protected void onPause() {
      this.z.j();
      hfx var1 = this.y;
      var1.c(var1.c);
      var1.c(var1.j);
      var1.b(gmm.l);
      super.onPause();
      this.z.i();
   }

   public final void onPerformDirectAction(String var1, Bundle var2, CancellationSignal var3, Consumer var4) {
      this.y.b(new gmm(6));
   }

   protected final void onPostCreate(Bundle var1) {
      hfx var2 = this.y;
      hfw var3 = new hfw(var2, var1, 0);
      var2.d(var3);
      var2.a = var3;
      super.onPostCreate(var1);
   }

   protected final void onPostResume() {
      hfx var2 = this.y;
      hfq var1 = hfq.b;
      var2.d(var1);
      var2.c = var1;
      super.onPostResume();
   }

   public final boolean onPrepareOptionsMenu(Menu var1) {
      return (Boolean)this.y.a(new hfv(2), false) ? true : super.onPrepareOptionsMenu(var1);
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      this.y.b(new hfs(var1, var2, var3));
      super.onRequestPermissionsResult(var1, var2, var3);
   }

   protected final void onRestoreInstanceState(Bundle var1) {
      hfx var3 = this.y;
      hfw var2 = new hfw(var3, var1, 1);
      var3.d(var2);
      var3.b = var2;
      super.onRestoreInstanceState(var1);
   }

   protected void onResume() {
      this.z.l();
      hfx var1 = this.y;
      hfq var2 = hfq.f;
      var1.d(var2);
      var1.j = var2;
      super.onResume();
      this.z.k();
   }

   protected final void onSaveInstanceState(Bundle var1) {
      hfx var2 = this.y;
      hgg var3 = new hgg(var1);
      var2.d(var3);
      var2.k = var3;
      super.onSaveInstanceState(var1);
   }

   protected void onStart() {
      this.z.n();
      hfx var1 = this.y;
      hfq var2 = hfq.g;
      var1.d(var2);
      var1.i = var2;
      super.onStart();
      this.z.m();
      ot var3 = this.s;
      var3.getClass();
      var3.d(true);
   }

   protected void onStop() {
      this.z.p();
      hfx var1 = this.y;
      var1.c(var1.i);
      var1.b(gmm.k);
      super.onStop();
      this.z.o();
   }

   public final void onUserInteraction() {
      this.y.b(gmm.c);
      super.onUserInteraction();
   }

   protected final void onUserLeaveHint() {
      this.y.b(gmm.f);
      super.onUserLeaveHint();
   }

   public final void onWindowFocusChanged(boolean var1) {
      this.y.b(new jnw(var1, 1));
      super.onWindowFocusChanged(var1);
   }

   public final void startActivity(Intent var1) {
      this.o();
      super.startActivity(var1);
      this.n();
   }

   public final void startActivity(Intent var1, Bundle var2) {
      this.o();
      super.startActivity(var1, var2);
      this.n();
   }

   public final void startActivityForResult(Intent var1, int var2) {
      this.o();
      super.startActivityForResult(var1, var2);
      this.n();
   }

   public final void startActivityForResult(Intent var1, int var2, Bundle var3) {
      this.o();
      super.startActivityForResult(var1, var2, var3);
      this.n();
   }

   public final void startActivityFromFragment(Fragment var1, Intent var2, int var3) {
      this.o();
      super.startActivityFromFragment(var1, var2, var3);
      this.n();
   }

   public final void startActivityFromFragment(Fragment var1, Intent var2, int var3, Bundle var4) {
      this.o();
      super.startActivityFromFragment(var1, var2, var3, var4);
      this.n();
   }
}
