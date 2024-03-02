package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.Phone-IA;

public class Barcode$Phone implements Parcelable {
   public static final Creator CREATOR = new .mak(19);
   public static final int FAX = 3;
   public static final int HOME = 2;
   public static final int MOBILE = 4;
   public static final int UNKNOWN = 0;
   public static final int WORK = 1;
   public String number;
   public int type;

   public Barcode$Phone() {
   }

   private Barcode$Phone(Parcel var1) {
      this.type = var1.readInt();
      this.number = var1.readString();
   }

   // $FF: synthetic method
   public Barcode$Phone(Parcel var1, Phone-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.type);
      var1.writeString(this.number);
   }
}
