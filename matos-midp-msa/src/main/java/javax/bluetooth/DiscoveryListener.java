package javax.bluetooth;

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

import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public interface DiscoveryListener{
// Fields
    public static final int INQUIRY_COMPLETED = 0;
    public static final int INQUIRY_TERMINATED = 5;
    public static final int INQUIRY_ERROR = 7;
    public static final int SERVICE_SEARCH_COMPLETED = 1;
    public static final int SERVICE_SEARCH_TERMINATED = 2;
    public static final int SERVICE_SEARCH_ERROR = 3;
    public static final int SERVICE_SEARCH_NO_RECORDS = 4;
    public static final int SERVICE_SEARCH_DEVICE_NOT_REACHABLE = 6;
// Methods
    @CallBack("discovery")
    public abstract void deviceDiscovered(javax.bluetooth.RemoteDevice arg1, javax.bluetooth.DeviceClass arg2);
    @CallBack("discoveryService")
    public abstract void servicesDiscovered(int arg1, javax.bluetooth.ServiceRecord[] arg2);
    @CallBack("discoveryService")
    public abstract void serviceSearchCompleted(int arg1, int arg2);
    @CallBack({"discovery", "discoveryService"})
    public abstract void inquiryCompleted(int arg1);
}
