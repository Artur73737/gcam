import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.ViewGroup.LayoutParams;

public class eh extends by {
   private el r;

   public eh() {
      this.getSavedStateRegistry().b("androidx:appcompat", new cf(this, 2, (byte[])null));
      this.k(new eg(this, 0));
   }

   private final void n() {
      car.d(this.getWindow().getDecorView(), this);
      car.b(this.getWindow().getDecorView(), this);
      cbu.f(this.getWindow().getDecorView(), this);
      gf.c(this.getWindow().getDecorView(), this);
   }

   public final void addContentView(View var1, LayoutParams var2) {
      this.n();
      this.i().d(var1, var2);
   }

   protected final void attachBaseContext(Context var1) {
      fd var6 = (fd)this.i();
      var6.C = true;
      int var2 = var6.r(var1, var6.q());
      if (fd.n(var1) && el.n(var1) && !el.c) {
         el.a.execute(new bl(var1, 6));
      }

      Object var13;
      label150: {
         boolean var3 = fd.g;
         Configuration var5 = null;
         Configuration var4;
         if (var3 && var1 instanceof ContextThemeWrapper) {
            label151: {
               var4 = var6.P(var1, var2, (Configuration)null, false);

               try {
                  ((ContextThemeWrapper)var1).applyOverrideConfiguration(var4);
               } catch (IllegalStateException var11) {
                  break label151;
               }

               var13 = var1;
               break label150;
            }
         }

         if (var1 instanceof pv) {
            label152: {
               var4 = var6.P(var1, var2, (Configuration)null, false);

               try {
                  ((pv)var1).a(var4);
               } catch (IllegalStateException var10) {
                  break label152;
               }

               var13 = var1;
               break label150;
            }
         }

         var13 = var1;
         if (fd.f) {
            label153: {
               var4 = new Configuration();
               var4.uiMode = -1;
               var4.fontScale = 0.0F;
               Configuration var7 = er.b(var1, var4).getResources().getConfiguration();
               Configuration var8 = var1.getResources().getConfiguration();
               var7.uiMode = var8.uiMode;
               var4 = var5;
               if (!var7.equals(var8)) {
                  var5 = new Configuration();
                  var5.fontScale = 0.0F;
                  var4 = var5;
                  if (var8 != null) {
                     if (var7.diff(var8) == 0) {
                        var4 = var5;
                     } else {
                        if (var7.fontScale != var8.fontScale) {
                           var5.fontScale = var8.fontScale;
                        }

                        if (var7.mcc != var8.mcc) {
                           var5.mcc = var8.mcc;
                        }

                        if (var7.mnc != var8.mnc) {
                           var5.mnc = var8.mnc;
                        }

                        et.b(var7, var8, var5);
                        if (var7.touchscreen != var8.touchscreen) {
                           var5.touchscreen = var8.touchscreen;
                        }

                        if (var7.keyboard != var8.keyboard) {
                           var5.keyboard = var8.keyboard;
                        }

                        if (var7.keyboardHidden != var8.keyboardHidden) {
                           var5.keyboardHidden = var8.keyboardHidden;
                        }

                        if (var7.navigation != var8.navigation) {
                           var5.navigation = var8.navigation;
                        }

                        if (var7.navigationHidden != var8.navigationHidden) {
                           var5.navigationHidden = var8.navigationHidden;
                        }

                        if (var7.orientation != var8.orientation) {
                           var5.orientation = var8.orientation;
                        }

                        if ((var7.screenLayout & 15) != (var8.screenLayout & 15)) {
                           var5.screenLayout |= var8.screenLayout & 15;
                        }

                        if ((var7.screenLayout & 192) != (var8.screenLayout & 192)) {
                           var5.screenLayout |= var8.screenLayout & 192;
                        }

                        if ((var7.screenLayout & 48) != (var8.screenLayout & 48)) {
                           var5.screenLayout |= var8.screenLayout & 48;
                        }

                        if ((var7.screenLayout & 768) != (var8.screenLayout & 768)) {
                           var5.screenLayout |= var8.screenLayout & 768;
                        }

                        if ((var7.colorMode & 3) != (var8.colorMode & 3)) {
                           var5.colorMode |= var8.colorMode & 3;
                        }

                        if ((var7.colorMode & 12) != (var8.colorMode & 12)) {
                           var5.colorMode |= var8.colorMode & 12;
                        }

                        if ((var7.uiMode & 15) != (var8.uiMode & 15)) {
                           var5.uiMode |= var8.uiMode & 15;
                        }

                        if ((var7.uiMode & 48) != (var8.uiMode & 48)) {
                           var5.uiMode |= var8.uiMode & 48;
                        }

                        if (var7.screenWidthDp != var8.screenWidthDp) {
                           var5.screenWidthDp = var8.screenWidthDp;
                        }

                        if (var7.screenHeightDp != var8.screenHeightDp) {
                           var5.screenHeightDp = var8.screenHeightDp;
                        }

                        if (var7.smallestScreenWidthDp != var8.smallestScreenWidthDp) {
                           var5.smallestScreenWidthDp = var8.smallestScreenWidthDp;
                        }

                        var4 = var5;
                        if (var7.densityDpi != var8.densityDpi) {
                           var5.densityDpi = var8.densityDpi;
                           var4 = var5;
                        }
                     }
                  }
               }

               var5 = var6.P(var1, var2, var4, true);
               var13 = new pv(var1, 2132083692);
               ((pv)var13).a(var5);

               Theme var12;
               try {
                  var12 = var1.getTheme();
               } catch (NullPointerException var9) {
                  break label153;
               }

               if (var12 != null) {
                  cdd.a(((pv)var13).getTheme());
               }
            }
         }
      }

      super.attachBaseContext((Context)var13);
   }

   public final void closeOptionsMenu() {
      dx var1 = this.h();
      if (this.getWindow().hasFeature(0) && (var1 == null || !var1.k())) {
         super.closeOptionsMenu();
      }

   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      dx var3 = this.h();
      return var2 == 82 && var3 != null && var3.o(var1) ? true : super.dispatchKeyEvent(var1);
   }

   public final View findViewById(int var1) {
      return this.i().c(var1);
   }

   public final MenuInflater getMenuInflater() {
      fd var2 = (fd)this.i();
      if (var2.m == null) {
         var2.C();
         dx var1 = var2.l;
         Context var3;
         if (var1 != null) {
            var3 = var1.b();
         } else {
            var3 = var2.i;
         }

         var2.m = new gc(var3);
      }

      return var2.m;
   }

   public final dx h() {
      return this.i().b();
   }

   public final el i() {
      if (this.r == null) {
         int var1 = el.b;
         this.r = new fd(this, (Window)null, this);
      }

      return this.r;
   }

   public final void invalidateOptionsMenu() {
      this.i().f();
   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      fd var3 = (fd)this.i();
      if (var3.w && var3.t) {
         dx var2 = var3.b();
         if (var2 != null) {
            var2.q();
         }
      }

      im.d().e(var3.i);
      var3.E = new Configuration(var3.i.getResources().getConfiguration());
      var3.O(false);
   }

   public final void onContentChanged() {
   }

   protected void onDestroy() {
      super.onDestroy();
      this.i().g();
   }

   public final boolean onMenuItemSelected(int var1, MenuItem var2) {
      boolean var4 = super.onMenuItemSelected(var1, var2);
      boolean var3 = true;
      if (var4) {
         return true;
      } else {
         dx var5 = this.h();
         if (var2.getItemId() == 16908332 && var5 != null && (var5.a() & 4) != 0) {
            Intent var11 = cav.a(this);
            if (var11 == null) {
               var3 = false;
            } else if (cbm.c(this, var11)) {
               cce var7 = new cce(this);
               Intent var14 = cav.a(this);
               var11 = var14;
               if (var14 == null) {
                  var11 = cav.a(this);
               }

               if (var11 != null) {
                  label85: {
                     ComponentName var6 = var11.getComponent();
                     ComponentName var15 = var6;
                     if (var6 == null) {
                        var15 = var11.resolveActivity(var7.b.getPackageManager());
                     }

                     var1 = var7.a.size();

                     NameNotFoundException var10000;
                     label57: {
                        boolean var10001;
                        try {
                           var14 = cav.b(var7.b, var15);
                        } catch (NameNotFoundException var10) {
                           var10000 = var10;
                           var10001 = false;
                           break label57;
                        }

                        while(true) {
                           if (var14 == null) {
                              var7.a.add(var11);
                              break label85;
                           }

                           try {
                              var7.a.add(var1, var14);
                              var14 = cav.b(var7.b, var14.getComponent());
                           } catch (NameNotFoundException var9) {
                              var10000 = var9;
                              var10001 = false;
                              break;
                           }
                        }
                     }

                     NameNotFoundException var12 = var10000;
                     Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                     throw new IllegalArgumentException(var12);
                  }
               }

               if (var7.a.isEmpty()) {
                  throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
               }

               Intent[] var13 = (Intent[])var7.a.toArray(new Intent[0]);
               var13[0] = (new Intent(var13[0])).addFlags(268484608);
               ccf.a(var7.b, var13, (Bundle)null);

               try {
                  cbg.a(this);
               } catch (IllegalStateException var8) {
                  this.finish();
               }
            } else {
               cbm.b(this, var11);
            }

            return var3;
         } else {
            return false;
         }
      }
   }

   protected void onPostCreate(Bundle var1) {
      super.onPostCreate(var1);
      ((fd)this.i()).B();
   }

   protected void onPostResume() {
      super.onPostResume();
      dx var1 = ((fd)this.i()).b();
      if (var1 != null) {
         var1.h(true);
      }

   }

   protected void onStart() {
      super.onStart();
      ((fd)this.i()).O(true);
   }

   protected void onStop() {
      super.onStop();
      this.i().h();
   }

   protected final void onTitleChanged(CharSequence var1, int var2) {
      super.onTitleChanged(var1, var2);
      this.i().m(var1);
   }

   public final void openOptionsMenu() {
      dx var1 = this.h();
      if (this.getWindow().hasFeature(0) && (var1 == null || !var1.p())) {
         super.openOptionsMenu();
      }

   }

   public final void setContentView(int var1) {
      this.n();
      this.i().j(var1);
   }

   public final void setContentView(View var1) {
      this.n();
      this.i().k(var1);
   }

   public final void setContentView(View var1, LayoutParams var2) {
      this.n();
      this.i().l(var1, var2);
   }

   public final void setTheme(int var1) {
      super.setTheme(var1);
      ((fd)this.i()).F = var1;
   }
}
