package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction implements Parcelable {
   public static final Creator CREATOR = new .av(14);
   private final String a;
   private final CharSequence b;
   private final int c;
   private final Bundle d;

   public PlaybackStateCompat$CustomAction(Parcel var1) {
      this.a = var1.readString();
      this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.c = var1.readInt();
      this.d = var1.readBundle(.dq.class.getClassLoader());
   }

   public final int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Action:mName='");
      var1.append(this.b);
      var1.append(", mIcon=");
      var1.append(this.c);
      var1.append(", mExtras=");
      var1.append(this.d);
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      TextUtils.writeToParcel(this.b, var1, var2);
      var1.writeInt(this.c);
      var1.writeBundle(this.d);
   }
}
