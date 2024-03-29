package com.google.android.libraries.barhopper;

public class OnedRecognitionOptions {
   private int codabarMinCodeLength = 6;
   private int codabarMinConsistentLines = 2;
   private int code128MinCodeLength = 2;
   private int code128MinConsistentLines = 1;
   private int code39MinCodeLength = 2;
   private int code39MinConsistentLines = 2;
   private boolean code39UseCheckDigit = false;
   private boolean code39UseExtendedMode = false;
   private int code93MinCodeLength = 2;
   private int code93MinConsistentLines = 2;
   private int ean13UpcaMinConsistentLines = 1;
   private int ean8MinConsistentLines = 3;
   private int itfMinCodeLength = 6;
   private int itfMinConsistentLines = 3;
   private int upceMinConsistentLines = 3;

   public int getCodabarMinCodeLength() {
      return this.codabarMinCodeLength;
   }

   public int getCodabarMinConsistentLines() {
      return this.codabarMinConsistentLines;
   }

   public int getCode128MinCodeLength() {
      return this.code128MinCodeLength;
   }

   public int getCode128MinConsistentLines() {
      return this.code128MinConsistentLines;
   }

   public int getCode39MinCodeLength() {
      return this.code39MinCodeLength;
   }

   public int getCode39MinConsistentLines() {
      return this.code39MinConsistentLines;
   }

   public boolean getCode39UseCheckDigit() {
      return this.code39UseCheckDigit;
   }

   public boolean getCode39UseExtendedMode() {
      return this.code39UseExtendedMode;
   }

   public int getCode93MinCodeLength() {
      return this.code93MinCodeLength;
   }

   public int getCode93MinConsistentLines() {
      return this.code93MinConsistentLines;
   }

   public int getEan13UpcaMinConsistentLines() {
      return this.ean13UpcaMinConsistentLines;
   }

   public int getEan8MinConsistentLines() {
      return this.ean8MinConsistentLines;
   }

   public int getItfMinCodeLength() {
      return this.itfMinCodeLength;
   }

   public int getItfMinConsistentLines() {
      return this.itfMinConsistentLines;
   }

   public int getUpceMinConsistentLines() {
      return this.upceMinConsistentLines;
   }

   public OnedRecognitionOptions setCodabarMinCodeLength(int var1) {
      this.codabarMinCodeLength = var1;
      return this;
   }

   public OnedRecognitionOptions setCodabarMinConsistentLines(int var1) {
      this.codabarMinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setCode128MinCodeLength(int var1) {
      this.code128MinCodeLength = var1;
      return this;
   }

   public OnedRecognitionOptions setCode128MinConsistentLines(int var1) {
      this.code128MinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setCode39MinCodeLength(int var1) {
      this.code39MinCodeLength = var1;
      return this;
   }

   public OnedRecognitionOptions setCode39MinConsistentLines(int var1) {
      this.code39MinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setCode39UseCheckDigit(boolean var1) {
      this.code39UseCheckDigit = var1;
      return this;
   }

   public OnedRecognitionOptions setCode39UseExtendedMode(boolean var1) {
      this.code39UseExtendedMode = var1;
      return this;
   }

   public OnedRecognitionOptions setCode93MinCodeLength(int var1) {
      this.code93MinCodeLength = var1;
      return this;
   }

   public OnedRecognitionOptions setCode93MinConsistentLines(int var1) {
      this.code93MinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setEan13UpcaMinConsistentLines(int var1) {
      this.ean13UpcaMinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setEan8MinConsistentLines(int var1) {
      this.ean8MinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setItfMinCodeLength(int var1) {
      this.itfMinCodeLength = var1;
      return this;
   }

   public OnedRecognitionOptions setItfMinConsistentLines(int var1) {
      this.itfMinConsistentLines = var1;
      return this;
   }

   public OnedRecognitionOptions setUpceMinConsistentLines(int var1) {
      this.upceMinConsistentLines = var1;
      return this;
   }
}
