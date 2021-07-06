package com.controlj.experiment.bacnet.definitions;

import com.controlj.green.addonsupport.bacnet.data.BACnetObjectIdentifier;
import com.controlj.green.addonsupport.bacnet.data.BACnetObjectType;
import com.controlj.green.addonsupport.bacnet.data.BACnetString;
import com.controlj.green.addonsupport.bacnet.property.BACnetPropertyIdentifiers;
import com.controlj.green.addonsupport.bacnet.property.BACnetPropertyTypes;
import com.controlj.green.addonsupport.bacnet.property.PropertyDefinition;
import org.jetbrains.annotations.NotNull;

import static com.controlj.green.addonsupport.bacnet.property.BACnetPropertyTypes.createDefinition;

public class _DefaultObjectDefinition {

    /**<!----- objectName ----------------------------------------------------->
     Defines the Object_Name property for the Schedule Object Type.
     <!----------------------------------------------------------------------->*/
    @NotNull public static final PropertyDefinition<BACnetString> objectName =
            createDefinition(BACnetPropertyTypes.string, BACnetPropertyIdentifiers.objectName);

    /**<!----- objectType ----------------------------------------------------->
     Defines the Object_Type property for the Schedule Object Type.
     <!----------------------------------------------------------------------->*/
    @NotNull
    public static final PropertyDefinition<BACnetObjectType> objectType =
            createDefinition(BACnetPropertyTypes.objectType, BACnetPropertyIdentifiers.objectType);

    /**<!----- objectIdentifier ----------------------------------------------->
     Defines the Object_Identifier property for the Schedule Object Type.
     <!----------------------------------------------------------------------->*/
    @NotNull public static final PropertyDefinition<BACnetObjectIdentifier> objectIdentifier =
            createDefinition(BACnetPropertyTypes.objectIdentifier, BACnetPropertyIdentifiers.objectIdentifier);
}
