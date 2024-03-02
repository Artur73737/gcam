package com.google.mediapipe.framework;

public class PacketCreator {
   public final Graph a;

   public PacketCreator(Graph var1) {
      this.a = var1;
   }

   private void releaseWithSyncToken(long var1, TextureReleaseCallback var3) {
      var3.release(new GraphGlSyncToken(var1));
   }

   public native long nativeCreateGpuBuffer(long var1, int var3, int var4, int var5, TextureReleaseCallback var6);

   public native long nativeCreateProto(long var1, ProtoUtil$SerializedMessage var3);
}
