import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;

public interface jas extends AutoCloseable {
   jbb a();

   void b(Bitmap var1, ShotMetadata var2);

   void c();

   boolean d(HardwareBuffer var1, HardwareBuffer var2, ShotMetadata var3);

   boolean e();

   void f(HardwareBuffer var1, ShotMetadata var2, boolean var3, boolean var4, String var5, jbb var6, jqk var7, Rectiface$RectifaceCallback var8, InterleavedWriteViewU8 var9);

   void g(InterleavedWriteViewU8 var1, ShotMetadata var2, boolean var3, boolean var4, String var5, jbb var6, jqk var7, Rectiface$RectifaceCallback var8, InterleavedWriteViewU8 var9);

   InterleavedImageU8 h(HardwareBuffer var1);
}
