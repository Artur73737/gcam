package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;

public final class CircularProgressIndicator extends .olw {
   public CircularProgressIndicator(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public CircularProgressIndicator(Context var1, AttributeSet var2) {
      this(var1, var2, 2130968899);
   }

   public CircularProgressIndicator(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3, 2132084822);
      Context var5 = this.getContext();
      .ome var4 = (.ome)this.a;
      this.setIndeterminateDrawable(new .omn(var5, var4, new .oly(var4), new .omd(var4)));
      var1 = this.getContext();
      .ome var6 = (.ome)this.a;
      this.setProgressDrawable(new .omg(var1, var6, new .oly(var6)));
   }
}
