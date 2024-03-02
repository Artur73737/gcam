import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qus(
   b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager",
   c = "VirtualCameraManager.kt",
   d = "connectPendingRequestOpens",
   e = {289}
)
public final class uv extends quq {
   public Object a;
   public int b;
   public Iterator c;
   public uj d;
   public ArrayList e;
   final nwu f;
   public nwu g;

   public uv(nwu var1, que var2) {
      super(var2);
      this.f = var1;
   }

   public final Object b(Object var1) {
      this.a = var1;
      this.b |= Integer.MIN_VALUE;
      return this.f.v((List)null, this);
   }
}
