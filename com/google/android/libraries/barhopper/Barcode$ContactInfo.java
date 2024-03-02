package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.ContactInfo-IA;

public class Barcode$ContactInfo implements Parcelable {
   public static final Creator CREATOR = new .mak(13);
   public Barcode$Address[] addresses;
   public Barcode$Email[] emails;
   public Barcode$PersonName name;
   public String note;
   public String organization;
   public Barcode$Phone[] phones;
   public String title;
   public String[] urls;

   public Barcode$ContactInfo() {
   }

   private Barcode$ContactInfo(Parcel var1) {
      this.name = (Barcode$PersonName)var1.readParcelable(Barcode$PersonName.class.getClassLoader());
      this.organization = var1.readString();
      this.title = var1.readString();
      this.phones = (Barcode$Phone[])var1.createTypedArray(Barcode$Phone.CREATOR);
      this.emails = (Barcode$Email[])var1.createTypedArray(Barcode$Email.CREATOR);
      this.urls = var1.createStringArray();
      this.addresses = (Barcode$Address[])var1.createTypedArray(Barcode$Address.CREATOR);
      this.note = var1.readString();
   }

   // $FF: synthetic method
   public Barcode$ContactInfo(Parcel var1, ContactInfo-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.name, 0);
      var1.writeString(this.organization);
      var1.writeString(this.title);
      var1.writeTypedArray(this.phones, 0);
      var1.writeTypedArray(this.emails, 0);
      var1.writeStringArray(this.urls);
      var1.writeTypedArray(this.addresses, 0);
      var1.writeString(this.note);
   }
}
