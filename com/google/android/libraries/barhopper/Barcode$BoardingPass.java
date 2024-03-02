package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.BoardingPass-IA;

public class Barcode$BoardingPass implements Parcelable {
   public static final Creator CREATOR = new .mak(10);
   public Barcode$FlightSegment[] flightSegment;
   public String passengerName;

   public Barcode$BoardingPass() {
   }

   private Barcode$BoardingPass(Parcel var1) {
      this.passengerName = var1.readString();
      this.flightSegment = (Barcode$FlightSegment[])var1.createTypedArray(Barcode$FlightSegment.CREATOR);
   }

   // $FF: synthetic method
   public Barcode$BoardingPass(Parcel var1, BoardingPass-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.passengerName);
      var1.writeTypedArray(this.flightSegment, 0);
   }
}
