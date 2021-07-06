/*
 * Copyright (c) 2010 Automated Logic Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.controlj.experiment.bacnet.definitions;

import com.controlj.green.addonsupport.bacnet.data.BACnetObjectIdentifier;
import com.controlj.green.addonsupport.bacnet.data.BACnetObjectType;
import com.controlj.green.addonsupport.bacnet.data.BACnetReal;
import com.controlj.green.addonsupport.bacnet.data.BACnetString;
import com.controlj.green.addonsupport.bacnet.object.BACnetObjectTypes;
import com.controlj.green.addonsupport.bacnet.object.ObjectType;
import com.controlj.green.addonsupport.bacnet.property.BACnetPropertyIdentifiers;
import com.controlj.green.addonsupport.bacnet.property.BACnetPropertyTypes;
import com.controlj.green.addonsupport.bacnet.property.PropertyDefinition;
import org.jetbrains.annotations.NotNull;

import static com.controlj.green.addonsupport.bacnet.property.BACnetPropertyTypes.createDefinition;

public class AnalogInputDefinition extends _DefaultObjectDefinition {
    /**<!----- objectIdentifier ----------------------------------------------->
       The ObjectType for this definition, e.g. {@link BACnetObjectTypes#schedule}.
    <!----------------------------------------------------------------------->*/
    @NotNull public static final ObjectType type = BACnetObjectTypes.schedule;

    /**<!----- presentValue --------------------------------------------------->
       Defines the Present_Value property for the Schedule Object Type.
    <!----------------------------------------------------------------------->*/
    @NotNull public static final PropertyDefinition<BACnetReal> presentValue =
          createDefinition(BACnetPropertyTypes.real, BACnetPropertyIdentifiers.presentValue);

}
