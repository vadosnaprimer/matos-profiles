package javax.microedition.media.protocol;

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
import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public abstract class DataSource extends Object implements javax.microedition.media.Controllable{
	@ArgsRule(value="DataSource",pos={0,1})
    public DataSource(String a0){}
    public String getLocator(){ return "" + "DataSource.";}
    public abstract String getContentType();
    public abstract void connect() throws java.io.IOException;
    public abstract void disconnect();
    public abstract void start() throws java.io.IOException;
    public abstract void stop() throws java.io.IOException;
    public abstract SourceStream[] getStreams();
}

