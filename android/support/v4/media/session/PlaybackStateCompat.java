package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;
import org.brotli.wrapper.dec.Hm.CLzmcq;

public final class PlaybackStateCompat implements Parcelable {
   public static final Creator CREATOR = new .av(13);
   final int a;
   final long b;
   final long c;
   final float d;
   final long e;
   final int f;
   final CharSequence g;
   final long h;
   final List i;
   final long j;
   final Bundle k;

   public PlaybackStateCompat(Parcel var1) {
      this.a = var1.readInt();
      this.b = var1.readLong();
      this.d = var1.readFloat();
      this.h = var1.readLong();
      this.c = var1.readLong();
      this.e = var1.readLong();
      this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.i = var1.createTypedArrayList(PlaybackStateCompat$CustomAction.CREATOR);
      this.j = var1.readLong();
      this.k = var1.readBundle(.dq.class.getClassLoader());
      this.f = var1.readInt();
   }

   public final int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("PlaybackState {");
      var1.append("state=");
      var1.append(this.a);
      var1.append(", position=");
      var1.append(this.b);
      var1.append(", buffered position=");
      var1.append(this.c);
      var1.append(", speed=");
      var1.append(this.d);
      var1.append(", updated=");
      var1.append(this.h);
      var1.append(CLzmcq.IPSNS);
      var1.append(this.e);
      var1.append(", error code=");
      var1.append(this.f);
      var1.append(", error message=");
      var1.append(this.g);
      var1.append(", custom actions=");
      var1.append(this.i);
      var1.append(", active item id=");
      var1.append(this.j);
      var1.append("}");
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      var1.writeLong(this.b);
      var1.writeFloat(this.d);
      var1.writeLong(this.h);
      var1.writeLong(this.c);
      var1.writeLong(this.e);
      TextUtils.writeToParcel(this.g, var1, var2);
      var1.writeTypedList(this.i);
      var1.writeLong(this.j);
      var1.writeBundle(this.k);
      var1.writeInt(this.f);
   }
}
