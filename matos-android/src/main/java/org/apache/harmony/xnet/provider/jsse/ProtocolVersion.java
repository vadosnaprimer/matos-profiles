package org.apache.harmony.xnet.provider.jsse;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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


public class ProtocolVersion
{
  // Fields

  public static final java.lang.String [] supportedProtocols = null;

  public static final ProtocolVersion SSLv3 = null;

  public static final ProtocolVersion TLSv1 = null;

  public final java.lang.String name = (java.lang.String) null;

  public final byte [] version = (byte []) null;

  // Constructors

  private ProtocolVersion(java.lang.String arg1, byte [] arg2){
  }
  // Methods

  public static boolean isSupported(byte [] arg1){
    return false;
  }
  public static boolean isSupported(java.lang.String arg1){
    return false;
  }
  public static ProtocolVersion getByName(java.lang.String arg1){
    return (ProtocolVersion) null;
  }
  public static ProtocolVersion getByVersion(byte [] arg1){
    return (ProtocolVersion) null;
  }
  public static ProtocolVersion getLatestVersion(java.lang.String [] arg1){
    return (ProtocolVersion) null;
  }
}
