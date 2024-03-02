import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public abstract class bno extends ViewGroup {
   private WeakReference a;
   private IBinder b;
   private ass c;
   private boolean d;
   private boolean e;

   public bno(Context var1) {
      var1.getClass();
      this(var1, (AttributeSet)null, 0, 6, (qwl)null);
   }

   public bno(Context var1, AttributeSet var2) {
      var1.getClass();
      this(var1, var2, 0, 4, (qwl)null);
   }

   public bno(Context var1, AttributeSet var2, int var3) {
      var1.getClass();
      super(var1, var2, var3);
      this.setClipChildren(false);
      this.setClipToPadding(false);
      this.addOnAttachStateChangeListener(new bpz(this, 0));
      AmbientMode$AmbientController var4 = new AmbientMode$AmbientController(this);
      ((ArrayList)cil.f(this).a).add(var4);
   }

   // $FF: synthetic method
   public bno(Context var1, AttributeSet var2, int var3, int var4, qwl var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 0;
      }

      this(var1, var2, var3);
   }

   private final void e() {
      if (!this.d) {
         StringBuilder var1 = new StringBuilder();
         var1.append("Cannot add views to ");
         var1.append(this.getClass().getSimpleName());
         var1.append("; only Compose content is supported");
         throw new UnsupportedOperationException(var1.toString());
      }
   }

   private final void f(ast var1) {
      ast var2 = var1;
      if (!g(var1)) {
         var2 = null;
      }

      if (var2 != null) {
         this.a = new WeakReference(var2);
      }

   }

   private static final boolean g(ast var0) {
      return !(var0 instanceof auo) || ((aui)((auo)var0).n.b()).compareTo(aui.b) > 0;
   }

   public abstract void a(asm var1, int var2);

   public final void addView(View var1) {
      this.e();
      super.addView(var1);
   }

   public final void addView(View var1, int var2) {
      this.e();
      super.addView(var1, var2);
   }

   public final void addView(View var1, int var2, int var3) {
      this.e();
      super.addView(var1, var2, var3);
   }

   public final void addView(View var1, int var2, LayoutParams var3) {
      this.e();
      super.addView(var1, var2, var3);
   }

   public final void addView(View var1, LayoutParams var2) {
      this.e();
      super.addView(var1, var2);
   }

   protected final boolean addViewInLayout(View var1, int var2, LayoutParams var3) {
      this.e();
      return super.addViewInLayout(var1, var2, var3);
   }

   protected final boolean addViewInLayout(View var1, int var2, LayoutParams var3, boolean var4) {
      this.e();
      return super.addViewInLayout(var1, var2, var3, var4);
   }

   public final void b() {
      ass var1 = this.c;
      if (var1 != null) {
         var1.b();
      }

      this.c = null;
      this.requestLayout();
   }

   public final void c() {
      // $FF: Couldn't be decompiled
   }

   protected boolean d() {
      return true;
   }

   public final boolean isTransitionGroup() {
      return !this.e || super.isTransitionGroup();
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      IBinder var1 = this.getWindowToken();
      if (this.b != var1) {
         this.b = var1;
         this.a = null;
      }

      if (this.d()) {
         this.c();
      }

   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      View var6 = this.getChildAt(0);
      if (var6 != null) {
         var6.layout(this.getPaddingLeft(), this.getPaddingTop(), var4 - var2 - this.getPaddingRight(), var5 - var3 - this.getPaddingBottom());
      }

   }

   protected final void onMeasure(int var1, int var2) {
      this.c();
      View var5 = this.getChildAt(0);
      if (var5 == null) {
         super.onMeasure(var1, var2);
      } else {
         int var4 = Math.max(0, MeasureSpec.getSize(var1) - this.getPaddingLeft() - this.getPaddingRight());
         int var3 = Math.max(0, MeasureSpec.getSize(var2) - this.getPaddingTop() - this.getPaddingBottom());
         var5.measure(MeasureSpec.makeMeasureSpec(var4, MeasureSpec.getMode(var1)), MeasureSpec.makeMeasureSpec(var3, MeasureSpec.getMode(var2)));
         this.setMeasuredDimension(var5.getMeasuredWidth() + this.getPaddingLeft() + this.getPaddingRight(), var5.getMeasuredHeight() + this.getPaddingTop() + this.getPaddingBottom());
      }
   }

   public final void onRtlPropertiesChanged(int var1) {
      View var2 = this.getChildAt(0);
      if (var2 != null) {
         var2.setLayoutDirection(var1);
      }
   }

   public final void setTransitionGroup(boolean var1) {
      super.setTransitionGroup(var1);
      this.e = true;
   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }
}
