import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;

public abstract class cpu extends bk implements OnClickListener {
   private DialogPreference af;
   private CharSequence ag;
   private CharSequence ah;
   private CharSequence ai;
   public int aj;
   private CharSequence ak;
   private int al;
   private BitmapDrawable am;

   public abstract void A(boolean var1);

   protected boolean B() {
      return false;
   }

   public final DialogPreference D() {
      if (this.af == null) {
         String var1 = this.requireArguments().getString("key");
         this.af = (DialogPreference)((cqa)this.getTargetFragment()).c(var1);
      }

      return this.af;
   }

   public final Dialog d() {
      this.aj = -2;
      ee var4 = new ee(this.requireContext());
      var4.i(this.ag);
      var4.d(this.am);
      var4.h(this.ah, this);
      var4.f(this.ai, this);
      this.requireContext();
      int var1 = this.al;
      View var2 = null;
      if (var1 != 0) {
         LayoutInflater var3 = super.V;
         LayoutInflater var5 = var3;
         if (var3 == null) {
            var5 = this.j((Bundle)null);
         }

         var2 = var5.inflate(var1, (ViewGroup)null);
      }

      if (var2 != null) {
         this.z(var2);
         var4.j(var2);
      } else {
         var4.e(this.ak);
      }

      this.eQ(var4);
      ef var6 = var4.b();
      if (this.B()) {
         cpt.a(var6.getWindow());
      }

      return var6;
   }

   protected void eQ(ee var1) {
   }

   public final void onClick(DialogInterface var1, int var2) {
      this.aj = var2;
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      bv var2 = this.getTargetFragment();
      if (var2 instanceof cqa) {
         cqa var7 = (cqa)var2;
         String var3 = this.requireArguments().getString("key");
         if (var1 == null) {
            DialogPreference var5 = (DialogPreference)var7.c(var3);
            this.af = var5;
            this.ag = var5.a;
            this.ah = var5.d;
            this.ai = var5.e;
            this.ak = var5.b;
            this.al = var5.f;
            Drawable var8 = var5.c;
            if (var8 != null && !(var8 instanceof BitmapDrawable)) {
               Bitmap var9 = Bitmap.createBitmap(var8.getIntrinsicWidth(), var8.getIntrinsicHeight(), Config.ARGB_8888);
               Canvas var6 = new Canvas(var9);
               var8.setBounds(0, 0, var6.getWidth(), var6.getHeight());
               var8.draw(var6);
               this.am = new BitmapDrawable(this.getResources(), var9);
            } else {
               this.am = (BitmapDrawable)var8;
            }
         } else {
            this.ag = var1.getCharSequence("PreferenceDialogFragment.title");
            this.ah = var1.getCharSequence("PreferenceDialogFragment.positiveText");
            this.ai = var1.getCharSequence("PreferenceDialogFragment.negativeText");
            this.ak = var1.getCharSequence("PreferenceDialogFragment.message");
            this.al = var1.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap var4 = (Bitmap)var1.getParcelable("PreferenceDialogFragment.icon");
            if (var4 != null) {
               this.am = new BitmapDrawable(this.getResources(), var4);
            }

         }
      } else {
         throw new IllegalStateException("Target fragment must implement TargetFragment interface");
      }
   }

   public final void onDismiss(DialogInterface var1) {
      super.onDismiss(var1);
      boolean var2;
      if (this.aj == -1) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.A(var2);
   }

   public void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putCharSequence("PreferenceDialogFragment.title", this.ag);
      var1.putCharSequence("PreferenceDialogFragment.positiveText", this.ah);
      var1.putCharSequence("PreferenceDialogFragment.negativeText", this.ai);
      var1.putCharSequence("PreferenceDialogFragment.message", this.ak);
      var1.putInt("PreferenceDialogFragment.layout", this.al);
      BitmapDrawable var2 = this.am;
      if (var2 != null) {
         var1.putParcelable("PreferenceDialogFragment.icon", var2.getBitmap());
      }

   }

   protected void z(View var1) {
      View var4 = var1.findViewById(16908299);
      if (var4 != null) {
         CharSequence var5 = this.ak;
         byte var2;
         if (!TextUtils.isEmpty(var5)) {
            boolean var3 = var4 instanceof TextView;
            var2 = 0;
            if (var3) {
               ((TextView)var4).setText(var5);
            }
         } else {
            var2 = 8;
         }

         if (var4.getVisibility() != var2) {
            var4.setVisibility(var2);
         }
      }

   }
}
