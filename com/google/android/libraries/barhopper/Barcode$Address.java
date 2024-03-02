package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.Address-IA;

public class Barcode$Address implements Parcelable {
   public static final Creator CREATOR = new .mak(9);
   public static final int HOME = 2;
   public static final int UNKNOWN = 0;
   public static final int WORK = 1;
   public String[] addressLines;
   public int type;

   public Barcode$Address() {
   }

   private Barcode$Address(Parcel var1) {
      this.type = var1.readInt();
      this.addressLines = var1.createStringArray();
   }

   // $FF: synthetic method
   public Barcode$Address(Parcel var1, Address-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.type);
      var1.writeStringArray(this.addressLines);
   }
}
