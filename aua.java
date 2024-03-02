import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class aua implements ClassLoaderCreator {
   public final aub a(Parcel var1, ClassLoader var2) {
      var1.getClass();
      ClassLoader var4 = var2;
      if (var2 == null) {
         var4 = this.getClass().getClassLoader();
      }

      Object var6 = var1.readValue(var4);
      int var3 = var1.readInt();
      aup var5;
      switch(var3) {
      case 0:
         var5 = aup.b;
         break;
      case 1:
         var5 = aup.c;
         break;
      case 2:
         var5 = aup.a;
         break;
      default:
         throw new IllegalStateException(c.aK(var3, "Unsupported MutableState policy ", " was restored"));
      }

      return new aub(var6, var5);
   }

   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      return new aub[var1];
   }
}
