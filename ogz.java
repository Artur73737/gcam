import java.nio.ByteBuffer;

public interface ogz {
   void a();

   void close(long var1, long var3, long var5, long var7);

   boolean disableSubpipeline(long var1, String var3);

   boolean enableSubpipeline(long var1, String var3);

   long initialize(byte[] var1, long var2, long var4, long var6, long var8);

   long initializeFrameBufferReleaseCallback(long var1);

   long initializeFrameManager();

   long initializeResultsCallback();

   boolean receiveYuvFrame(long var1, long var3, ByteBuffer var5, ByteBuffer var6, ByteBuffer var7, int var8, int var9, int var10, int var11, int var12, int var13);

   void resetSchedulingOptimizerOptions(long var1, byte[] var3);

   void start(long var1);

   boolean stop(long var1);

   void waitUntilIdle(long var1);
}
