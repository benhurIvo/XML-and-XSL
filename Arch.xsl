<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : Arch.xsl
    Created on : November 14, 2016, 2:35 PM
    Author     : benhur
    Description:
        Purpose of transformation follows.
-->
<!DOCTYPE stylesheet [
  <!ENTITY sep "<xsl:text>;</xsl:text>">
  <!ENTITY cr "<xsl:text>
</xsl:text>">
]>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    
    <xsl:output method="text"/>
    
    <xsl:template match="/">      
Unit Name&sep;Type&sep;Time

<xsl:for-each select="TAXONOMY/AREA/UNITS/UNIT">
    
<xsl:value-of select="UNIT_NAME"/>
&sep;
<xsl:value-of select="@TYPE"/>
&sep;
<xsl:value-of select="TIME"/>
&cr;
       </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>
