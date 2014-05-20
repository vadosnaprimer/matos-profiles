package javax.microedition.pim;

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

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr075.EventImplem")
public interface Event extends javax.microedition.pim.PIMItem{
// Fields
    public static final int ALARM = 100;
    public static final int CLASS = 101;
    public static final int END = 102;
    public static final int LOCATION = 103;
    public static final int NOTE = 104;
    public static final int REVISION = 105;
    public static final int START = 106;
    public static final int SUMMARY = 107;
    public static final int UID = 108;
    public static final int CLASS_CONFIDENTIAL = 200;
    public static final int CLASS_PRIVATE = 201;
    public static final int CLASS_PUBLIC = 202;
// Methods
    public abstract javax.microedition.pim.RepeatRule getRepeat();
    public abstract void setRepeat(javax.microedition.pim.RepeatRule arg1);
}
