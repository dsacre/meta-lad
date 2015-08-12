SUMMARY = "Sratom is a library for serialising LV2 atoms to/from RDF, particularly the Turtle syntax."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=394d0c1b7157c45525c00dbf16afbe51"

DEPENDS = "lv2 serd sord"

SRC_URI = "http://download.drobilla.net/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "5cf28520418779bf41fb14a40fbb20ad"
SRC_URI[sha256sum] = "a4b9beaeaedc4f651beb15cd1cfedff905b0726a9010548483475ad97d941220"

inherit waf
