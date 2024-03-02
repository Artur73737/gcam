package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.Email-IA;

public class Barcode$Email implements Parcelable {
   public static final Creator CREATOR = new .mak(15);
   public static final int HOME = 2;
   public static final int UNKNOWN = 0;
   public static final int WORK = 1;
   public String address;
   public String body;
   public String subject;
   public int type;

   public Barcode$Email() {
   }

   private Barcode$Email(Parcel var1) {
      this.type = var1.readInt();
      this.address = var1.readString();
      this.subject = var1.readString();
      this.body = var1.readString();
   }

   // $FF: synthetic method
   public Barcode$Email(Parcel var1, Email-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.type);
      var1.writeString(this.address);
      var1.writeString(this.subject);
      var1.writeString(this.body);
   }
}
