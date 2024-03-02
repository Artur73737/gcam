package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
   public final .xo a;
   public final List b;
   public boolean c;
   public int d;
   private final Handler e;
   private int f;
   private boolean g;
   private final Runnable h;

   public PreferenceGroup(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public PreferenceGroup(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, (byte[])null);
   }

   public PreferenceGroup(Context var1, AttributeSet var2, int var3, byte[] var4) {
      super(var1, var2, var3, 0);
      this.a = new .xo();
      this.e = new Handler(Looper.getMainLooper());
      this.c = true;
      this.f = 0;
      this.g = false;
      this.d = Integer.MAX_VALUE;
      this.h = new .nj(this, 17, (byte[])null);
      this.b = new ArrayList();
      TypedArray var5 = var1.obtainStyledAttributes(var2, .cqk.i, var3, 0);
      this.c = .cbo.l(var5, 2, 2, true);
      if (var5.hasValue(1)) {
         this.ah(.cbo.o(var5, 1, 1));
      }

      var5.recycle();
   }

   public final void A(Bundle var1) {
      super.A(var1);
      int var3 = this.k();

      for(int var2 = 0; var2 < var3; ++var2) {
         this.o(var2).A(var1);
      }

   }

   public final void B(boolean var1) {
      super.B(var1);
      int var3 = this.k();

      for(int var2 = 0; var2 < var3; ++var2) {
         this.o(var2).ac(var1);
      }

   }

   public final void D() {
      super.I();
      this.g = true;
      int var2 = this.k();

      for(int var1 = 0; var1 < var2; ++var1) {
         this.o(var1).D();
      }

   }

   public final void F() {
      super.V();
      int var1 = 0;
      this.g = false;

      for(int var2 = this.k(); var1 < var2; ++var1) {
         this.o(var1).F();
      }

   }

   public final void ag() {
      synchronized(this){}

      label202: {
         Throwable var10000;
         boolean var10001;
         label197: {
            int var1;
            List var2;
            try {
               var2 = this.b;
               var1 = var2.size() - 1;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label197;
            }

            while(true) {
               if (var1 < 0) {
                  try {
                     break label202;
                  } catch (Throwable var20) {
                     var10000 = var20;
                     var10001 = false;
                     break;
                  }
               }

               try {
                  this.aj((Preference)var2.get(0));
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break;
               }

               --var1;
            }
         }

         while(true) {
            Throwable var23 = var10000;

            try {
               throw var23;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               continue;
            }
         }
      }

      this.C();
   }

   public final void ah(int var1) {
      if (var1 != Integer.MAX_VALUE && !this.Y()) {
         Log.e("PreferenceGroup", String.valueOf(this.getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
      }

      this.d = var1;
   }

   public boolean ai() {
      return true;
   }

   public final boolean aj(Preference var1) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label456: {
         try {
            var1.V();
            if (var1.C == this) {
               var1.y((PreferenceGroup)null);
            }
         } catch (Throwable var59) {
            var10000 = var59;
            var10001 = false;
            break label456;
         }

         boolean var2;
         try {
            var2 = this.b.remove(var1);
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label456;
         }

         if (var2) {
            String var3;
            try {
               var3 = var1.r;
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label456;
            }

            if (var3 != null) {
               try {
                  this.a.put(var3, var1.eP());
                  this.e.removeCallbacks(this.h);
                  this.e.post(this.h);
               } catch (Throwable var56) {
                  var10000 = var56;
                  var10001 = false;
                  break label456;
               }
            }

            try {
               if (this.g) {
                  var1.F();
               }
            } catch (Throwable var55) {
               var10000 = var55;
               var10001 = false;
               break label456;
            }
         }

         label437:
         try {
            return var2;
         } catch (Throwable var54) {
            var10000 = var54;
            var10001 = false;
            break label437;
         }
      }

      while(true) {
         Throwable var60 = var10000;

         try {
            throw var60;
         } catch (Throwable var53) {
            var10000 = var53;
            var10001 = false;
            continue;
         }
      }
   }

   public final void ak(Preference param1) {
      // $FF: Couldn't be decompiled
   }

   protected final Parcelable e() {
      return new .cqb(super.e(), this.d);
   }

   protected final void g(Parcelable var1) {
      if (!var1.getClass().equals(.cqb.class)) {
         super.g(var1);
      } else {
         .cqb var2 = (.cqb)var1;
         this.d = var2.a;
         super.g(var2.getSuperState());
      }
   }

   public final int k() {
      return this.b.size();
   }

   public final Preference l(CharSequence var1) {
      if (var1 != null) {
         if (TextUtils.equals(super.r, var1)) {
            return this;
         } else {
            int var3 = this.k();

            for(int var2 = 0; var2 < var3; ++var2) {
               Preference var4 = this.o(var2);
               if (TextUtils.equals(var4.r, var1)) {
                  return var4;
               }

               if (var4 instanceof PreferenceGroup) {
                  var4 = ((PreferenceGroup)var4).l(var1);
                  if (var4 != null) {
                     return var4;
                  }
               }
            }

            return null;
         }
      } else {
         IllegalArgumentException var5 = new IllegalArgumentException("Key cannot be null");
         throw var5;
      }
   }

   public final Preference o(int var1) {
      return (Preference)this.b.get(var1);
   }

   public final void z(Bundle var1) {
      super.z(var1);
      int var3 = this.k();

      for(int var2 = 0; var2 < var3; ++var2) {
         this.o(var2).z(var1);
      }

   }
}
