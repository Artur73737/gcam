import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

public class cqa extends bv {
   public cqg a;
   public final Handler af = new cpv(this, Looper.getMainLooper());
   private final cpw ag = new cpw(this);
   private int ah = 2131624160;
   private final Runnable ai = new nj(this, 16, (byte[])null);
   public RecyclerView b;
   public boolean c;
   public boolean d;

   public final void A(Preference var1) {
      Object var4 = this;

      boolean var2;
      for(var2 = false; !var2 && var4 != null; var4 = ((bv)var4).C) {
         if (var4 instanceof cpx) {
            var2 = ((cpx)var4).a();
         }
      }

      boolean var3 = var2;
      if (!var2) {
         var3 = var2;
         if (this.getContext() instanceof cpx) {
            var3 = ((cpx)this.getContext()).a();
         }
      }

      if (!var3 && (!(this.getActivity() instanceof cpx) || !((cpx)this.getActivity()).a())) {
         if (this.getParentFragmentManager().e("androidx.preference.PreferenceFragment.DIALOG") == null) {
            String var5;
            Object var6;
            Bundle var7;
            if (var1 instanceof EditTextPreference) {
               var5 = var1.r;
               var6 = new cpf();
               var7 = new Bundle(1);
               var7.putString("key", var5);
               ((bv)var6).setArguments(var7);
            } else if (var1 instanceof ListPreference) {
               var5 = var1.r;
               var6 = new cpj();
               var7 = new Bundle(1);
               var7.putString("key", var5);
               ((bv)var6).setArguments(var7);
            } else {
               if (!(var1 instanceof MultiSelectListPreference)) {
                  StringBuilder var9 = new StringBuilder();
                  var9.append("Cannot display dialog for an unknown Preference type: ");
                  var9.append(var1.getClass().getSimpleName());
                  var9.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                  throw new IllegalArgumentException(var9.toString());
               }

               String var8 = var1.r;
               var6 = new cpm();
               Bundle var10 = new Bundle(1);
               var10.putString("key", var8);
               ((bv)var6).setArguments(var10);
            }

            ((bv)var6).setTargetFragment(this, 0);
            ((bk)var6).c(this.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
         }
      }
   }

   public final boolean B(Preference var1) {
      if (var1.t == null) {
         return false;
      } else {
         Object var4 = this;

         boolean var2;
         for(var2 = false; !var2 && var4 != null; var4 = ((bv)var4).C) {
            if (var4 instanceof cpy) {
               var2 = ((cpy)var4).a();
            }
         }

         boolean var3 = var2;
         if (!var2) {
            var3 = var2;
            if (this.getContext() instanceof cpy) {
               var3 = ((cpy)this.getContext()).a();
            }
         }

         if (!var3 && (!(this.getActivity() instanceof cpy) || !((cpy)this.getActivity()).a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            cp var8 = this.getParentFragmentManager();
            Bundle var5 = var1.t();
            cc var6 = var8.h();
            this.requireActivity().getClassLoader();
            bv var7 = var6.b(var1.t);
            var7.setArguments(var5);
            var7.setTargetFragment(this, 0);
            cw var9 = var8.i();
            var9.q(((View)this.requireView().getParent()).getId(), var7);
            if (!var9.k) {
               throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }

            var9.j = true;
            var9.l = null;
            var9.g();
         }

         return true;
      }
   }

   public final Preference c(CharSequence var1) {
      cqg var2 = this.a;
      return var2 == null ? null : var2.e(var1);
   }

   public PreferenceScreen d() {
      throw null;
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      TypedValue var4 = new TypedValue();
      this.requireContext().getTheme().resolveAttribute(2130969931, var4, true);
      int var3 = var4.resourceId;
      int var2 = var3;
      if (var3 == 0) {
         var2 = 2132083236;
      }

      this.requireContext().getTheme().applyStyle(var2, false);
      cqg var5 = new cqg(this.requireContext());
      this.a = var5;
      var5.e = this;
      var1 = super.l;
      if (var1 != null) {
         var1.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
      }

   }

   public final View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      TypedArray var6 = this.requireContext().obtainStyledAttributes((AttributeSet)null, cqk.h, 2130969920, 0);
      this.ah = var6.getResourceId(0, this.ah);
      Drawable var12 = var6.getDrawable(1);
      int var4 = var6.getDimensionPixelSize(2, -1);
      boolean var5 = var6.getBoolean(3, true);
      var6.recycle();
      LayoutInflater var7 = var1.cloneInContext(this.requireContext());
      View var10 = var7.inflate(this.ah, var2, false);
      View var8 = var10.findViewById(16908351);
      if (!(var8 instanceof ViewGroup)) {
         throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
      } else {
         RecyclerView var9;
         ViewGroup var13;
         label32: {
            var13 = (ViewGroup)var8;
            if (this.requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
               var9 = (RecyclerView)var13.findViewById(2131428087);
               if (var9 != null) {
                  break label32;
               }
            }

            var9 = (RecyclerView)var7.inflate(2131624162, var13, false);
            this.requireContext();
            var9.ad(new LinearLayoutManager());
            var9.aa(new cqi(var9));
         }

         if (var9 != null) {
            this.b = var9;
            var9.ay(this.ag);
            cpw var11 = this.ag;
            if (var12 != null) {
               var11.b = var12.getIntrinsicHeight();
            } else {
               var11.b = 0;
            }

            var11.a = var12;
            var11.d.b.J();
            if (var4 != -1) {
               var11 = this.ag;
               var11.b = var4;
               var11.d.b.J();
            }

            this.ag.c = var5;
            if (this.b.getParent() == null) {
               var13.addView(this.b);
            }

            this.af.post(this.ai);
            return var10;
         } else {
            throw new RuntimeException("Could not create RecyclerView");
         }
      }
   }

   public final void onDestroyView() {
      this.af.removeCallbacks(this.ai);
      this.af.removeMessages(1);
      if (this.c) {
         this.b.ab((lq)null);
         PreferenceScreen var1 = this.d();
         if (var1 != null) {
            var1.F();
         }
      }

      this.b = null;
      super.onDestroyView();
   }

   public final void onSaveInstanceState(Bundle var1) {
      PreferenceScreen var3 = this.d();
      if (var3 != null) {
         Bundle var2 = new Bundle();
         var3.A(var2);
         var1.putBundle("android:preferences", var2);
      }

   }

   public final void onStart() {
      super.onStart();
      cqg var1 = this.a;
      var1.c = this;
      var1.d = this;
   }

   public final void onStop() {
      super.onStop();
      cqg var1 = this.a;
      var1.c = null;
      var1.d = null;
   }

   public final void onViewCreated(View var1, Bundle var2) {
      if (var2 != null) {
         var2 = var2.getBundle("android:preferences");
         if (var2 != null) {
            PreferenceScreen var3 = this.d();
            if (var3 != null) {
               var3.z(var2);
            }
         }
      }

      if (this.c) {
         this.z();
      }

      this.d = true;
   }

   final void z() {
      PreferenceScreen var1 = this.d();
      if (var1 != null) {
         this.b.ab(new cqe(var1));
         var1.D();
      }

   }
}
