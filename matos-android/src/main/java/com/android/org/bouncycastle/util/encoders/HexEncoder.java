package com.android.org.bouncycastle.util.encoders;

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


public class HexEncoder
  implements Encoder
{
  // Fields

  protected final byte [] encodingTable = (byte []) null;

  protected final byte [] decodingTable = (byte []) null;

  // Constructors

  public HexEncoder(){
  }
  // Methods

  public int decode(byte [] arg1, int arg2, int arg3, java.io.OutputStream arg4) throws java.io.IOException{
    return 0;
  }
  public int decode(java.lang.String arg1, java.io.OutputStream arg2) throws java.io.IOException{
    return 0;
  }
  public int encode(byte [] arg1, int arg2, int arg3, java.io.OutputStream arg4) throws java.io.IOException{
    return 0;
  }
  protected void initialiseDecodingTable(){
  }
}
