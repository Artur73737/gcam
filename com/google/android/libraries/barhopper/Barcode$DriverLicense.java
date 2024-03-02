package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.DriverLicense-IA;

public class Barcode$DriverLicense implements Parcelable {
   public static final Creator CREATOR = new .mak(14);
   public String addressCity;
   public String addressState;
   public String addressStreet;
   public String addressZip;
   public String birthDate;
   public String documentType;
   public String expiryDate;
   public String firstName;
   public String gender;
   public String issueDate;
   public String issuingCountry;
   public String lastName;
   public String licenseNumber;
   public String middleName;

   public Barcode$DriverLicense() {
   }

   private Barcode$DriverLicense(Parcel var1) {
      this.documentType = var1.readString();
      this.firstName = var1.readString();
      this.middleName = var1.readString();
      this.lastName = var1.readString();
      this.gender = var1.readString();
      this.addressStreet = var1.readString();
      this.addressCity = var1.readString();
      this.addressState = var1.readString();
      this.addressZip = var1.readString();
      this.licenseNumber = var1.readString();
      this.issueDate = var1.readString();
      this.expiryDate = var1.readString();
      this.birthDate = var1.readString();
      this.issuingCountry = var1.readString();
   }

   // $FF: synthetic method
   public Barcode$DriverLicense(Parcel var1, DriverLicense-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.documentType);
      var1.writeString(this.firstName);
      var1.writeString(this.middleName);
      var1.writeString(this.lastName);
      var1.writeString(this.gender);
      var1.writeString(this.addressStreet);
      var1.writeString(this.addressCity);
      var1.writeString(this.addressState);
      var1.writeString(this.addressZip);
      var1.writeString(this.licenseNumber);
      var1.writeString(this.issueDate);
      var1.writeString(this.expiryDate);
      var1.writeString(this.birthDate);
      var1.writeString(this.issuingCountry);
   }
}
