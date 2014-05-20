package com.android.org.bouncycastle.asn1.x509;

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
public abstract class X509NameEntryConverter
{
  // Constructors

  public X509NameEntryConverter(){
  }
  // Methods

  public abstract com.android.org.bouncycastle.asn1.DERObject getConvertedValue(com.android.org.bouncycastle.asn1.DERObjectIdentifier arg1, java.lang.String arg2);
  protected com.android.org.bouncycastle.asn1.DERObject convertHexEncoded(java.lang.String arg1, int arg2) throws java.io.IOException{
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  protected boolean canBePrintable(java.lang.String arg1){
    return false;
  }
}