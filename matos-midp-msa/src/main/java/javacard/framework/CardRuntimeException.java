package javacard.framework;

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
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class CardRuntimeException extends java.lang.RuntimeException{
// Fields
// Methods
    public  CardRuntimeException(short reason){
        return;
    }
    public short getReason(){
        return 0;
    }
    public void setReason(short reason){
        return;
    }
    public static void throwIt(short reason)
		throws javacard.framework.CardRuntimeException{
        return;
    }
// Default constructor
    public CardRuntimeException(){ super(); }
}
