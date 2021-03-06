package gov.nist.javax.sip.stack;

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


public class SIPTransactionErrorEvent
  extends java.util.EventObject{
  // Fields

  public static final int TIMEOUT_ERROR = 1;

  public static final int TRANSPORT_ERROR = 2;

  public static final int TIMEOUT_RETRANSMIT = 3;

  // Constructors

  SIPTransactionErrorEvent(SIPTransaction arg1, int arg2){
    super((java.lang.Object) null);
  }
  // Methods

  public int getErrorID(){
    return 0;
  }
}
