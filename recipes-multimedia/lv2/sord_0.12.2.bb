SUMMARY = "Sord is a lightweight C library for storing RDF data in memory."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f6de02da791b5def4aa51ea92a6fc94"

DEPENDS = "serd libpcre"

SRC_URI = "http://download.drobilla.net/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "55d5866650b92ab64eda08fcc73aa425"
SRC_URI[sha256sum] = "bd0538d37de5e782023a7261d8ee9d83a792a12eeea7d94dec7a93dd9cda0767"

inherit waf
