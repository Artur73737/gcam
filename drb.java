import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class drb extends by {
   private lnq r;

   private final lnq h() {
      if (this.r == null) {
         this.r = new lnq(new AmbientModeSupport$AmbientController(this));
      }

      return this.r;
   }

   public final void onBackPressed() {
      super.onBackPressed();
      if (this.fv().a() == 0) {
         this.finishAfterTransition();
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      lnq var2 = this.h();
      View var5 = this.getLayoutInflater().inflate(2131623998, (ViewGroup)null, false);
      if (var5 instanceof CoordinatorLayout) {
         CoordinatorLayout var3 = (CoordinatorLayout)var5;
      }

      var2.c = (CollapsingToolbarLayout)var5.findViewById(2131427566);
      var2.d = (AppBarLayout)var5.findViewById(2131427435);
      Object var8 = var2.c;
      if (var8 != null) {
         olb var4 = ((CollapsingToolbarLayout)var8).a;
         var4.F = 1.1F;
         var4.G = 3;
         drc var9 = drc.a;
         if (var4.H != var9) {
            var4.H = var9;
            var4.g(true);
         }
      }

      var8 = var2.d;
      if (var8 != null) {
         cbc var10 = (cbc)((AppBarLayout)var8).getLayoutParams();
         AppBarLayout$Behavior var11 = new AppBarLayout$Behavior();
         var11.c = new oik();
         var10.b(var11);
      }

      var2.a = (FrameLayout)var5.findViewById(2131427577);
      var2.b = (Toolbar)var5.findViewById(2131427382);
      var8 = var2.e;
      Object var6 = var2.b;
      AmbientModeSupport$AmbientController var12 = (AmbientModeSupport$AmbientController)var8;
      ((by)var12.a).setActionBar((Toolbar)var6);
      ActionBar var7 = ((by)var12.a).getActionBar();
      if (var7 != null) {
         var7.setDisplayHomeAsUpEnabled(true);
         var7.setHomeButtonEnabled(true);
         var7.setDisplayShowTitleEnabled(true);
      }

      super.setContentView(var5);
   }

   public final boolean onNavigateUp() {
      if (this.fv().a() > 0) {
         this.fv().W();
      }

      if (this.fv().a() == 0) {
         this.finishAfterTransition();
      }

      return true;
   }

   public final void setContentView(int var1) {
      lnq var2 = this.r;
      Object var3;
      if (var2 == null) {
         var3 = (ViewGroup)this.findViewById(2131427577);
      } else {
         var3 = var2.a;
      }

      if (var3 != null) {
         ((ViewGroup)var3).removeAllViews();
      }

      LayoutInflater.from(this).inflate(var1, (ViewGroup)var3);
   }

   public final void setContentView(View var1) {
      lnq var2 = this.r;
      Object var3;
      if (var2 == null) {
         var3 = (ViewGroup)this.findViewById(2131427577);
      } else {
         var3 = var2.a;
      }

      if (var3 != null) {
         ((ViewGroup)var3).addView(var1);
      }

   }

   public final void setContentView(View var1, LayoutParams var2) {
      lnq var3 = this.r;
      Object var4;
      if (var3 == null) {
         var4 = (ViewGroup)this.findViewById(2131427577);
      } else {
         var4 = var3.a;
      }

      if (var4 != null) {
         ((ViewGroup)var4).addView(var1, var2);
      }

   }

   public final void setTitle(int var1) {
      this.setTitle(this.getText(var1));
   }

   public final void setTitle(CharSequence var1) {
      lnq var2 = this.h();
      Object var3 = var2.c;
      if (var3 != null) {
         ((CollapsingToolbarLayout)var3).e(var1);
      } else {
         ((by)((AmbientModeSupport$AmbientController)var2.e).a).setTitle(var1);
      }
   }
}
