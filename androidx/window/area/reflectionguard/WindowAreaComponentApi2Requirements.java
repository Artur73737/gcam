package androidx.window.area.reflectionguard;

import android.app.Activity;
import androidx.window.extensions.core.util.function.Consumer;

public interface WindowAreaComponentApi2Requirements {
   void addRearDisplayStatusListener(Consumer var1);

   void endRearDisplaySession();

   void removeRearDisplayStatusListener(Consumer var1);

   void startRearDisplaySession(Activity var1, Consumer var2);
}
