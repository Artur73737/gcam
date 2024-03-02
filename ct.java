import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;

public final class ct implements Parcelable {
   public static final Creator CREATOR = new av(4);
   public final String a;
   public final String b;
   public final boolean c;
   public final int d;
   public final int e;
   public final String f;
   public final boolean g;
   public final boolean h;
   public final boolean i;
   public final boolean j;
   public final int k;
   public final String l;
   public final int m;
   public final boolean n;

   public ct(Parcel var1) {
      this.a = var1.readString();
      this.b = var1.readString();
      int var2 = var1.readInt();
      boolean var4 = true;
      boolean var3;
      if (var2 != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.c = var3;
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readString();
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.g = var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.h = var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.i = var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.j = var3;
      this.k = var1.readInt();
      this.l = var1.readString();
      this.m = var1.readInt();
      if (var1.readInt() != 0) {
         var3 = var4;
      } else {
         var3 = false;
      }

      this.n = var3;
   }

   public ct(bv var1) {
      this.a = var1.getClass().getName();
      this.b = var1.k;
      this.c = var1.u;
      this.d = var1.D;
      this.e = var1.E;
      this.f = var1.F;
      this.g = var1.I;
      this.h = var1.r;
      this.i = var1.H;
      this.j = var1.G;
      this.k = var1.X.ordinal();
      this.l = var1.n;
      this.m = var1.o;
      this.n = var1.Q;
   }

   public final int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(NgAyRSYlmLoD.hlSPr);
      var2.append(this.a);
      var2.append(" (");
      var2.append(this.b);
      var2.append(")}:");
      if (this.c) {
         var2.append(" fromLayout");
      }

      if (this.e != 0) {
         var2.append(" id=0x");
         var2.append(Integer.toHexString(this.e));
      }

      String var1 = this.f;
      if (var1 != null && !var1.isEmpty()) {
         var2.append(" tag=");
         var2.append(this.f);
      }

      if (this.g) {
         var2.append(" retainInstance");
      }

      if (this.h) {
         var2.append(" removing");
      }

      if (this.i) {
         var2.append(NgAyRSYlmLoD.hbyJWvcMbHxs);
      }

      if (this.j) {
         var2.append(" hidden");
      }

      if (this.l != null) {
         var2.append(" targetWho=");
         var2.append(this.l);
         var2.append(" targetRequestCode=");
         var2.append(this.m);
      }

      if (this.n) {
         var2.append(" userVisibleHint");
      }

      return var2.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      var1.writeString(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeString(this.f);
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      var1.writeInt(this.i);
      var1.writeInt(this.j);
      var1.writeInt(this.k);
      var1.writeString(this.l);
      var1.writeInt(this.m);
      var1.writeInt(this.n);
   }
}
