package com.android.org.bouncycastle.crypto.params;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class DESParameters
  extends KeyParameter{
  // Fields

  public static final int DES_KEY_LENGTH = 8;

  // Constructors

  public DESParameters(byte [] arg1){
    super((byte []) null);
  }
  // Methods

  public static void setOddParity(byte [] arg1){
  }
  public static boolean isWeakKey(byte [] arg1, int arg2){
    return false;
  }
}
