/*
 * Copyright 2019 Paralelni Polis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.paralelnipolis.obcanka.core.debug;

public class CommandDescription {
    public int caseNumber = -1;
    public int cla;
    public int ins;
    public int p1;
    public int p2;
    public int responseLenExpected;
    public int requestDataLen;
    public byte[] requestData;
    public String textDescription = "";
    public String textInterpretation ="";
}