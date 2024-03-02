package com.google.mediapipe.framework;

public class MediaPipeException extends RuntimeException {
   MediaPipeException(int var1, byte[] var2) {
      String var5 = new String(var2, .otn.a);
      String var3 = .qdq.values()[var1].s;
      StringBuilder var4 = new StringBuilder();
      var4.append(var3);
      var4.append(": ");
      var4.append(var5);
      super(var4.toString());
      .qdq var6 = .qdq.values()[var1];
   }
}
