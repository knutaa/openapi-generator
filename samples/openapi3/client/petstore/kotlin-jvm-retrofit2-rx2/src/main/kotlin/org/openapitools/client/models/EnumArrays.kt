/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.google.gson.annotations.SerializedName
import java.io.Serializable
/**
 * 
 * @param justSymbol 
 * @param arrayEnum 
 */

data class EnumArrays (
    @SerializedName("just_symbol")
    val justSymbol: EnumArrays.JustSymbol? = null,
    @SerializedName("array_enum")
    val arrayEnum: kotlin.Array<EnumArrays.ArrayEnum>? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
    * 
    * Values: greaterThanEqual,dollar
    */
    
    enum class JustSymbol(val value: kotlin.String){
        @SerializedName(value = ">=") greaterThanEqual(">="),
        @SerializedName(value = "$") dollar("$");
    }
    /**
    * 
    * Values: fish,crab
    */
    
    enum class ArrayEnum(val value: kotlin.String){
        @SerializedName(value = "fish") fish("fish"),
        @SerializedName(value = "crab") crab("crab");
    }
}

