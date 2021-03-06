package org.apache.xalan.processor;

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


public class ProcessorInclude
  extends XSLTElementProcessor{
  // Constructors

  public ProcessorInclude(){
    super();
  }
  // Methods

  protected void parse(StylesheetHandler arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5) throws org.xml.sax.SAXException{
  }
  public void startElement(StylesheetHandler arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5) throws org.xml.sax.SAXException{
  }
  protected int getStylesheetType(){
    return 0;
  }
  protected java.lang.String getStylesheetInclErr(){
    return (java.lang.String) null;
  }
  public java.lang.String getHref(){
    return (java.lang.String) null;
  }
  public void setHref(java.lang.String arg1){
  }
  protected javax.xml.transform.Source processSource(StylesheetHandler arg1, javax.xml.transform.Source arg2){
    return (javax.xml.transform.Source) null;
  }
}
