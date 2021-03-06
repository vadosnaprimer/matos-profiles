package javax.microedition.amms.control;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakemidp.jsr234.EffectControlImplem")
@ClassDone
public interface EffectControl extends javax.microedition.media.Control{
// Fields
    public static final int SCOPE_LIVE_ONLY = 1;
    public static final int SCOPE_RECORD_ONLY = 2;
    public static final int SCOPE_LIVE_AND_RECORD = 3;
// Methods
    public abstract void setEnabled(boolean arg1);
    public abstract boolean isEnabled();
    public abstract void setScope(int arg1)
		throws javax.microedition.media.MediaException;
    public abstract int getScope();
    public abstract void setEnforced(boolean arg1);
    public abstract boolean isEnforced();
    public abstract void setPreset(String arg1);
    public abstract String getPreset();
    public abstract String[] getPresetNames();
}
