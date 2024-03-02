package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
   public final .ih a(Context var1, AttributeSet var2) {
      return new .ooz(var1, var2);
   }

   public final AppCompatButton b(Context var1, AttributeSet var2) {
      return new MaterialButton(var1, var2);
   }

   public final .ij c(Context var1, AttributeSet var2) {
      return new .oju(var1, var2);
   }

   public final .it d(Context var1, AttributeSet var2) {
      return new .omy(var1, var2);
   }

   public final .jq e(Context var1, AttributeSet var2) {
      return new .opc(var1, var2);
   }
}
