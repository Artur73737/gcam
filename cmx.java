import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class cmx {
   public static final Class[] a;
   public final Map b;
   public final Map c;
   public final Map d;
   public final Map e;
   public final crw f;

   static {
      a = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
   }

   public cmx() {
      this.b = new LinkedHashMap();
      this.c = new LinkedHashMap();
      this.d = new LinkedHashMap();
      this.e = new LinkedHashMap();
      this.f = new cmw(this);
   }

   public cmx(Map var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      this.b = var2;
      this.c = new LinkedHashMap();
      this.d = new LinkedHashMap();
      this.e = new LinkedHashMap();
      this.f = new cmw(this);
      var2.putAll(var1);
   }
}
