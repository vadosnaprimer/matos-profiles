package org.apache.xalan.templates;

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


public class ElemLiteralResult
  extends ElemUse{
  // Classes

  public class LiteralElementAttributes
    implements org.w3c.dom.NamedNodeMap
  {
    // Fields

    // Constructors

    public LiteralElementAttributes(){
    }
    // Methods

    public int getLength(){
      return 0;
    }
    public org.w3c.dom.Node item(int arg1){
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node getNamedItem(java.lang.String arg1){
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node getNamedItemNS(java.lang.String arg1, java.lang.String arg2){
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node removeNamedItem(java.lang.String arg1) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node removeNamedItemNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node setNamedItem(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node setNamedItemNS(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
  }
  public class Attribute
    implements org.w3c.dom.Attr
  {
    // Fields

    // Constructors

    public Attribute(AVT arg1, org.w3c.dom.Element arg2){
    }
    // Methods

    public java.lang.String getName(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("value")
    public java.lang.String getValue(){
      return (java.lang.String) null;
    }
    public void setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg1) throws org.w3c.dom.DOMException{
    }
    public boolean isSupported(java.lang.String arg1, java.lang.String arg2){
      return false;
    }
    public void normalize(){
    }
    public org.w3c.dom.NamedNodeMap getAttributes(){
      return (org.w3c.dom.NamedNodeMap) null;
    }
    public java.lang.String getLocalName(){
      return (java.lang.String) null;
    }
    public org.w3c.dom.Node getNextSibling(){
      return (org.w3c.dom.Node) null;
    }
    public java.lang.String getNodeName(){
      return (java.lang.String) null;
    }
    public short getNodeType(){
      return (short) 0;
    }
    public org.w3c.dom.Node getParentNode(){
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node removeChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node appendChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node getLastChild(){
      return (org.w3c.dom.Node) null;
    }
    public boolean hasChildNodes(){
      return false;
    }
    public org.w3c.dom.NodeList getChildNodes(){
      return (org.w3c.dom.NodeList) null;
    }
    public org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Document getOwnerDocument(){
      return (org.w3c.dom.Document) null;
    }
    public org.w3c.dom.Node getPreviousSibling(){
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.Node getFirstChild(){
      return (org.w3c.dom.Node) null;
    }
    public java.lang.Object getUserData(java.lang.String arg1){
      return (java.lang.Object) null;
    }
    public org.w3c.dom.Element getOwnerElement(){
      return (org.w3c.dom.Element) null;
    }
    public java.lang.String getNamespaceURI(){
      return (java.lang.String) null;
    }
    public java.lang.String getNodeValue() throws org.w3c.dom.DOMException{
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("prefix")
    public java.lang.String getPrefix(){
      return (java.lang.String) null;
    }
    public boolean hasAttributes(){
      return false;
    }
    public org.w3c.dom.Node cloneNode(boolean arg1){
      return (org.w3c.dom.Node) null;
    }
    public void setNodeValue(java.lang.String arg1) throws org.w3c.dom.DOMException{
    }
    public boolean getSpecified(){
      return false;
    }
    public void setPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("prefix") java.lang.String arg1) throws org.w3c.dom.DOMException{
    }
    public java.lang.Object setUserData(java.lang.String arg1, java.lang.Object arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.w3c.dom.UserDataHandler arg3){
      return (java.lang.Object) null;
    }
    public java.lang.Object getFeature(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.Object) null;
    }
    public boolean isEqualNode(org.w3c.dom.Node arg1){
      return false;
    }
    public java.lang.String lookupNamespaceURI(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public boolean isDefaultNamespace(java.lang.String arg1){
      return false;
    }
    public java.lang.String lookupPrefix(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public boolean isSameNode(org.w3c.dom.Node arg1){
      return false;
    }
    public void setTextContent(@com.francetelecom.rd.stubs.annotation.FieldSet("textContent") java.lang.String arg1) throws org.w3c.dom.DOMException{
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("textContent")
    public java.lang.String getTextContent() throws org.w3c.dom.DOMException{
      return (java.lang.String) null;
    }
    public short compareDocumentPosition(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
      return (short) 0;
    }
    public java.lang.String getBaseURI(){
      return (java.lang.String) null;
    }
    public org.w3c.dom.TypeInfo getSchemaTypeInfo(){
      return (org.w3c.dom.TypeInfo) null;
    }
    public boolean isId(){
      return false;
    }
  }
  // Constructors

  public ElemLiteralResult(){
    super();
  }
  // Methods

  protected boolean accept(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
    return false;
  }
  public org.w3c.dom.NamedNodeMap getAttributes(){
    return (org.w3c.dom.NamedNodeMap) null;
  }
  public java.lang.String getAttribute(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public void setVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("version") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("version")
  public java.lang.String getVersion(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("localName")
  public java.lang.String getLocalName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("namespace")
  public java.lang.String getNamespace(){
    return (java.lang.String) null;
  }
  public void setNamespace(@com.francetelecom.rd.stubs.annotation.FieldSet("namespace") java.lang.String arg1){
  }
  public void setLocalName(@com.francetelecom.rd.stubs.annotation.FieldSet("localName") java.lang.String arg1){
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void setXmlSpace(AVT arg1){
  }
  public boolean containsExcludeResultPrefix(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void resolvePrefixTables() throws javax.xml.transform.TransformerException{
  }
  protected void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  public java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public java.lang.String getAttributeNS(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public boolean containsExtensionElementURI(java.lang.String arg1){
    return false;
  }
  public void setRawName(@com.francetelecom.rd.stubs.annotation.FieldSet("rawName") java.lang.String arg1){
  }
  public void setIsLiteralResultAsStylesheet(boolean arg1){
  }
  public boolean getIsLiteralResultAsStylesheet(){
    return false;
  }
  public void addLiteralResultAttribute(AVT arg1){
  }
  public void addLiteralResultAttribute(java.lang.String arg1){
  }
  public void throwDOMException(short arg1, java.lang.String arg2){
  }
  public AVT getLiteralResultAttributeNS(java.lang.String arg1, java.lang.String arg2){
    return (AVT) null;
  }
  public AVT getLiteralResultAttribute(java.lang.String arg1){
    return (AVT) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("rawName")
  public java.lang.String getRawName(){
    return (java.lang.String) null;
  }
  public void setExtensionElementPrefixes(org.apache.xml.utils.StringVector arg1){
  }
  public java.lang.String getExtensionElementPrefix(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (java.lang.String) null;
  }
  public int getExtensionElementPrefixCount(){
    return 0;
  }
  public void setExcludeResultPrefixes(org.apache.xml.utils.StringVector arg1){
  }
  public java.util.Iterator enumerateLiteralResultAttributes(){
    return (java.util.Iterator) null;
  }
}
