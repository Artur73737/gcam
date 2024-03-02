import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class au implements Parcelable {
   public static final Creator CREATOR = new av(1);
   final int[] a;
   final ArrayList b;
   final int[] c;
   final int[] d;
   final int e;
   final String f;
   final int g;
   final int h;
   final CharSequence i;
   final int j;
   final CharSequence k;
   final ArrayList l;
   final ArrayList m;
   final boolean n;

   public au(Parcel var1) {
      this.a = var1.createIntArray();
      this.b = var1.createStringArrayList();
      this.c = var1.createIntArray();
      this.d = var1.createIntArray();
      this.e = var1.readInt();
      this.f = var1.readString();
      this.g = var1.readInt();
      this.h = var1.readInt();
      this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.j = var1.readInt();
      this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.l = var1.createStringArrayList();
      this.m = var1.createStringArrayList();
      boolean var2;
      if (var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.n = var2;
   }

   public au(at var1) {
      int var4 = var1.d.size();
      this.a = new int[var4 * 6];
      if (var1.j) {
         this.b = new ArrayList(var4);
         this.c = new int[var4];
         this.d = new int[var4];
         int var2 = 0;

         for(int var3 = 0; var2 < var4; ++var3) {
            cv var8 = (cv)var1.d.get(var2);
            int[] var7 = this.a;
            int var5 = var3 + 1;
            var7[var3] = var8.a;
            ArrayList var9 = this.b;
            bv var11 = var8.b;
            String var12;
            if (var11 != null) {
               var12 = var11.k;
            } else {
               var12 = null;
            }

            var9.add(var12);
            var7 = this.a;
            var3 = var5 + 1;
            var7[var5] = var8.c;
            int var6 = var3 + 1;
            var7[var3] = var8.d;
            var5 = var6 + 1;
            var7[var6] = var8.e;
            var3 = var5 + 1;
            var7[var5] = var8.f;
            var7[var3] = var8.g;
            this.c[var2] = var8.h.ordinal();
            this.d[var2] = var8.i.ordinal();
            ++var2;
         }

         this.e = var1.i;
         this.f = var1.l;
         this.g = var1.c;
         this.h = var1.m;
         this.i = var1.n;
         this.j = var1.o;
         this.k = var1.p;
         this.l = var1.q;
         this.m = var1.r;
         this.n = var1.s;
      } else {
         IllegalStateException var10 = new IllegalStateException("Not on back stack");
         throw var10;
      }
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeIntArray(this.a);
      var1.writeStringList(this.b);
      var1.writeIntArray(this.c);
      var1.writeIntArray(this.d);
      var1.writeInt(this.e);
      var1.writeString(this.f);
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      TextUtils.writeToParcel(this.i, var1, 0);
      var1.writeInt(this.j);
      TextUtils.writeToParcel(this.k, var1, 0);
      var1.writeStringList(this.l);
      var1.writeStringList(this.m);
      var1.writeInt(this.n);
   }
}
