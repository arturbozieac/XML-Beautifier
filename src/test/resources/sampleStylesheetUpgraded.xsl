<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0">
    <xsl:output omit-xml-declaration="yes" indent="yes"/>

    <!-- Template de intrare /* face match pe orice node pe care il gaseste -->
    <xsl:template match="/*">
        <html>
            <head>
                <title>in progress personal-schema</title>
                <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
                <style type="text/css">
                    .SchemaHeader {
                        font-family: Segoe UI;
                        font-size: 11pt;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    .SchemaName {
                        font-family: Segoe UI;
                        font-size: 11pt;
                        font-weight: bold;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    .Description {
                        font-family: Segoe UI;
                        font-size: 10pt;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    .Name {
                        font-family: Segoe UI;
                        font-size: 8pt;
                        font-weight: bold;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    .StaticName {
                        font-family: Segoe UI;
                        font-size: 8pt;
                        font-style: italic;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    .FileName {
                        font-family: Segoe UI;
                        font-size: 8pt;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    .DetailName {
                        font-family: Segoe UI;
                        font-size: 8pt;
                        color: #4f4d4d;
                    }</style>
                <style type="text/css">
                    .DetailValue {
                        font-family: Segoe UI;
                        font-size: 8pt;
                        color: #000000;
                    }</style>
                <style type="text/css">
                    pre {
                        margin-top: 0;
                        margin-bottom: 0;
                    }</style>
                <style type="text/css">
                    .table-no-border {
                        line-height: 100%;
                    }</style>
                <style type="text/css">
                    .table-border {
                        line-height: 100%;
                        border-style: solid;
                        border-left-color: #ECE9D8;
                        border-top-color: #ECE9D8;
                        border-right-color: #ACA899;
                        border-bottom-color: #ACA899;
                    }</style>
                <style type="text/css">
                    .table-borderwithoutoutline {
                        line-height: 100%;
                        border-style: solid;
                        border-width: 0px;
                    }</style>
                <style type="text/css">
                    .td-border {
                        border-style: solid;
                        border-width: 1px;
                        border-left-color: #ACA899;
                        border-top-color: #ACA899;
                        border-right-color: #ECE9D8;
                        border-bottom-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-left {
                        border-style: solid;
                        border-left-width: 0px;
                        border-top-color: #ACA899;
                        border-right-color: #ECE9D8;
                        border-bottom-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-top-left {
                        border-style: solid;
                        border-left-width: 0px;
                        border-top-width: 0px;
                        border-right-color: #ECE9D8;
                        border-bottom-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-top {
                        border-style: solid;
                        border-top-width: 0px;
                        border-left-color: #ACA899;
                        border-right-color: #ECE9D8;
                        border-bottom-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-top-right {
                        border-style: solid;
                        border-top-width: 0px;
                        border-left-color: #ACA899;
                        border-top-color: #ACA899;
                        border-right-width: 0px;
                        border-bottom-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-right {
                        border-style: solid;
                        border-right-width: 0px;
                        border-left-color: #ACA899;
                        border-top-color: #ACA899;
                        border-bottom-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-bottom-right {
                        border-style: solid;
                        border-left-color: #ACA899;
                        border-top-color: #ACA899;
                        border-right-width: 0px;
                        border-bottom-width: 0px;
                    }</style>
                <style type="text/css">
                    .td-border-bottom {
                        border-style: solid;
                        border-bottom-width: 0px;
                        border-left-color: #ACA899;
                        border-top-color: #ACA899;
                        border-right-color: #ECE9D8;
                    }</style>
                <style type="text/css">
                    .td-border-bottom-left {
                        border-style: solid;
                        border-left-width: 0px;
                        border-bottom-width: 0px;
                        border-right-color: #ECE9D8;
                        border-top-color: #ACA899;
                    }</style>
                <style type="text/css">
                    .td-border-left-single {
                        border-style: solid;
                        border-left-width: 0px;
                        border-top-width: 0px;
                        border-right-color: #ECE9D8;
                        border-bottom-width: 0px;
                    }</style>
                <style type="text/css">
                    .td-border-right-single {
                        border-style: solid;
                        border-left-color: #ACA899;
                        border-top-width: 0px;
                        border-right-width: 0px;
                        border-bottom-width: 0px;
                    }</style>
                <style type="text/css">
                    .td-border-single {
                        border-style: solid;
                        border-left-color: #ACA899;
                        border-top-width: 0px;
                        border-right-color: #ECE9D8;
                        border-bottom-width: 0px;
                    }</style>
            </head>
            <body>
                <xsl:for-each select="JSONType">
                    <xsl:call-template name="JSONSchema">
                        <xsl:with-param name="typeNode" select="current()"/>
                    </xsl:call-template>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>

    <!-- Template pentru <JSONSchema> -->
    <xsl:template name="JSONSchema">
        <!-- Anchor to this schema element -->
        <xsl:param name="typeNode"/>
        <a name="{substring($typeNode/@id,2)}"/>
        <span class="Description">Schema Element </span>
        <a href="{$typeNode/@id}">
            <span class="Name">
                <xsl:value-of select="substring-after(./@id, '/')" separator=""/>
            </span>
        </a>
        <!-- Tabel pentru componentele JSONSchema -->
        <table class="table-border" width="100%" cellspacing="0" cellpadding="5" border="1">
            <thead>
                <tr>
                    <!-- Aplicam template-urile pentru toate tag-urile gasite in JSONSchema -->
                    <xsl:apply-templates> </xsl:apply-templates>
                </tr>
            </thead>
        </table>
        <br/>
    </xsl:template>

    <!-- Template pentru stilizarea titlului -->
    <xsl:template match="JSONType/title">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Title</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Name">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea descrierii -->
    <xsl:template match="JSONType/description">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Description</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului type -->
    <xsl:template match="JSONType/type">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Type</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului pattern -->
    <xsl:template match="JSONType/pattern">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Pattern</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului minLength -->
    <xsl:template match="JSONType/minlength">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Min Length</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului maxLength -->
    <xsl:template match="JSONType/maxlength">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Max Length</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului examples -->
    <xsl:template match="JSONType/examples">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Examples</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="./item"/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului additional properties -->
    <xsl:template match="JSONType/additionalProperties">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Additional Properties</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="./@value"/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului uniqueItems -->
    <xsl:template match="JSONType/uniqueItems">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Unique Items</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului properties -->
    <xsl:template match="JSONType/properties">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">properties</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <table class="table-no-border" cellspacing="0" cellpadding="0">
                    <tr>
                        <td align="left" valign="top" style="background-color:#80b1ff;">
                            <span class="DetailName">Name</span>
                            <span class="DetailName"> </span>
                        </td>
                        <td align="left" valign="top" style="background-color:#80b1ff;">
                            <span class="DetailName">Occurrence</span>
                        </td>
                    </tr>
                    <tr>
                        <td align="left" valign="top" style="background-color:#80b1ff;">

                            <!-- Iteram prin toate proprietatile -->
                            <xsl:for-each select="*">
                                <!-- Cream hyperlink catre schemele proprietatilor -->
                                <a href="{current()/@ref}">
                                    <span class="Name">
                                        <xsl:value-of select="local-name()"/>
                                        <br/>
                                    </span>
                                </a>
                            </xsl:for-each>

                            <span class="DetailValue"/>
                        </td>
                        <td align="left" valign="top" style="background-color:#80b1ff;">
                            <span class="DetailValue">
                                <xsl:for-each select="*">
                                    <!-- Setam valorile pentru coloana required -->
                                    <xsl:variable name="required" select="./@required"/>
                                    <xsl:value-of select="
                                            if ($required = 'true') then
                                                'Required'
                                            else
                                                'Optional'"/>
                                    <br/>
                                </xsl:for-each>
                            </span>
                        </td>
                    </tr>
                </table>
            </td>


        </tr>
    </xsl:template>
    
    <!-- Template pentru stilizarea field-ului items -->
    <xsl:template match="JSONType/items">
        <tr>
            <td class="td-border" align="right" valign="top"
                style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Array Items</span>
            </td>
            <td class="td-border" align="left" valign="top"
                style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:variable name="verifyItems" select="./@ref"/>
                    <xsl:choose>
                        <xsl:when test="(not($verifyItems))">
                            <a>Empty items</a>
                        </xsl:when>
                        <xsl:otherwise>
                            <a href="{current()/@ref}"> Items elements </a>
                        </xsl:otherwise>
                    </xsl:choose>
                </span>
            </td>
        </tr>
    </xsl:template>

    <!-- Template pentru stilizarea field-ului source code -->
    <xsl:template match="JSONType/sourceCode" priority="999">
        <tr>
            <td class="td-border" align="right" valign="top" style="width:10%;background-color:#80b1ff;">
                <span class="DetailName">Source code</span>
            </td>
            <td class="td-border" align="left" valign="top" style="width:90%;background-color:#80b1ff;">
                <span class="Title">
                    <xsl:value-of select="."/>
                </span>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
