import android.graphics.Bitmap;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;

public interface gqd {
   float getCaptureProgress();

   Bitmap getPreview(int var1);

   Texture getPreviewAsTexture();

   void getTrackerStats(TrackerStats var1);

   void release();

   void setMetaData(float var1, int var2, boolean var3, int var4, boolean var5);

   void startCapture();

   int stopCapture(String var1);

   boolean trackTexture(float[] var1, float[] var2);
}
