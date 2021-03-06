package javax.xml.transform.dom;

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


public class DOMSource
  implements javax.xml.transform.Source
{
  // Fields

  public static final java.lang.String FEATURE = "http://javax.xml.transform.dom.DOMSource/feature";

  // Constructors

  public DOMSource(){
  }
  public DOMSource(org.w3c.dom.Node arg1){
  }
  public DOMSource(org.w3c.dom.Node arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public void setSystemId(java.lang.String arg1){
  }
  public org.w3c.dom.Node getNode(){
    return (org.w3c.dom.Node) null;
  }
  public void setNode(org.w3c.dom.Node arg1){
  }
}
