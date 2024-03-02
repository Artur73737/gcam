package com.google.android.libraries.vision.visionkit.pipeline;

import java.util.List;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public class PipelineException extends Exception {
   private static final String ROOT_CAUSE_DELIMITER = "#vk ";
   private final .ohd statusCode;
   private final String statusMessage;
   private final .ohi visionkitStatus;

   public PipelineException(int var1, String var2) {
      String var4 = .ohd.values()[var1].r;
      StringBuilder var3 = new StringBuilder();
      var3.append(var4);
      var3.append(DzzpnVggahPIX.iRMugihgB);
      var3.append(var2);
      super(var3.toString());
      this.statusCode = .ohd.values()[var1];
      this.statusMessage = var2;
      this.visionkitStatus = null;
   }

   private PipelineException(.ohi var1) {
      String var2 = .ohd.values()[var1.a].r;
      String var3 = var1.b;
      StringBuilder var4 = new StringBuilder();
      var4.append(var2);
      var4.append(": ");
      var4.append(var3);
      super(var4.toString());
      this.statusCode = .ohd.values()[var1.a];
      this.statusMessage = var1.b;
      this.visionkitStatus = var1;
   }

   PipelineException(byte[] var1) {
      .qfc var2 = .qfc.a;
      .qfn var3 = .qfn.Q(.ohi.d, var1, 0, var1.length, var2);
      .qfn.af(var3);
      this((.ohi)var3);
   }

   public List getComponentStatuses() {
      .ohi var2 = this.visionkitStatus;
      if (var2 != null) {
         return var2.c;
      } else {
         int var1 = .oyz.d;
         return .pby.a;
      }
   }

   public .otw getRootCauseMessage() {
      String var1 = this.statusMessage;
      String var2 = DzzpnVggahPIX.ESFdtzbhtMiYbmy;
      return (.otw)(var1.contains(var2) ? .otw.j((String).osh.H(.ouk.c(var2).f(this.statusMessage))) : .ote.a);
   }

   public .ohd getStatusCode() {
      return this.statusCode;
   }

   public String getStatusMessage() {
      return this.statusMessage;
   }
}
